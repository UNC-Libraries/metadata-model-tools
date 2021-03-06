/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package crosswalk.diagram.part;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.mozilla.universalchardet.UniversalDetector;

/**
 * @author Gregory Jansen
 * 
 */
public class DelimitedFileDataSourceWizardPage extends WizardPage implements
		IWizardPage {

	private static List<String> charsets = new ArrayList<String>();
	
	static {
		for(String key : Charset.availableCharsets().keySet()) {
			charsets.add(key);
		}
	}

	private UniversalDetector detector = new UniversalDetector(null);

	// the label used to display selected dir/file.
	Text fileText;
	protected String filePath;

	Combo charsetCombo;
	protected String charset;

	Text sampleText = null;

	String fileFilterPath = System.getProperty("user.home");

	/**
	 * @param pageName
	 */
	protected DelimitedFileDataSourceWizardPage(String pageName) {
		super(pageName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets
	 * .Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);

    	this.setTitle("Select Text File");
    	this.setMessage("Choose your delimited text file.");
    	
		// top level group
		Composite topLevel = new Composite(parent, SWT.NONE);
		topLevel.setLayout(new GridLayout(3, false));
		// this.setMessage("Select the type of data source to crosswalk.",
		// DialogPage.INFORMATION);

		Label fileL = new Label(topLevel, SWT.None);
		fileL.setText("Delimited Text File");
		fileText = new Text(topLevel, SWT.SINGLE | SWT.READ_ONLY | SWT.BORDER);
		fileText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		fileText.setEditable(false);
		Button fileButton = new Button(topLevel, SWT.PUSH);
		fileButton.setText("Browse..");
		fileButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(getShell(), SWT.OPEN);
				// dialog.setFilterNames(new String[] { "Batch Files",
				// "All Files (*.*)" });
				// dialog.setFilterExtensions(new String[] { "*.bat", "*.*" });
				// // platform specific wild cards
				dialog.setFilterPath(fileFilterPath);
				// dialog.setFileName("fred.bat");
				String filestr = dialog.open();
				if (filestr != null) {
					File file = new File(filestr);
					fileText.setText(file.getName());
					fileFilterPath = file.getParent();
					filePath = file.getAbsolutePath();
					detectEncoding();
					refreshSampleText();
					updatePage();
				}
			}
		});
		Label encodingL = new Label(topLevel, SWT.None);
		encodingL.setText("Character Set");
		charsetCombo = new Combo(topLevel, SWT.DROP_DOWN | SWT.READ_ONLY);
		charsetCombo.setItems(charsets.toArray(new String[] {}));
		charsetCombo.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 2, 1));
		charsetCombo.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				charset = charsetCombo.getItem(charsetCombo.getSelectionIndex());
				refreshSampleText();
				updatePage();
			}

		});

		// show multiple lines from the file whenever fields change
		// update file path and encoding

		Label lsample = new Label(topLevel, SWT.None);
		lsample.setText("Text Preview");
		lsample.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		sampleText = new Text(topLevel, SWT.MULTI | SWT.READ_ONLY | SWT.BORDER
				| SWT.V_SCROLL | SWT.H_SCROLL);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = 3;
		sampleText.setLayoutData(gd);
		// sampleText.setEditable(false);
		setControl(topLevel);
	}

	private void updatePage() {
		setPageComplete(filePath != null && charset != null);
	}

	/**
     *
     */
	protected void refreshSampleText() {
		if (filePath != null && charset != null) {
			BufferedReader sr = null;
			try {
				sr = new BufferedReader(new InputStreamReader(
						new FileInputStream(filePath), charset));
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < 15; i++) {
					String line = sr.readLine();
					if(line == null) break;
					sb.append(line);
					sb.append("\n");
				}
				sampleText.setText(sb.toString());
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (sr != null) {
					try {
						sr.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	/**
     *
     */
	protected void detectEncoding() {
		// maybe use a spinner during detection..
		java.io.FileInputStream fis = null;
		try {
			byte[] buf = new byte[4096];
			fis = new java.io.FileInputStream(filePath);
			int nread;
			while ((nread = fis.read(buf)) > 0 && !detector.isDone()) {
				detector.handleData(buf, 0, nread);
			}
			detector.dataEnd();
			String encoding = detector.getDetectedCharset();
			detector.reset();
			int index = this.charsets.indexOf(encoding);
			if(index == -1) {
				index = this.charsets.indexOf(Charset.defaultCharset().name());
			}
			this.charsetCombo.select(index);
			this.charset = this.charsets.get(index);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public String getFilePath() {
		return this.filePath;
	}

	@Override
	public boolean canFlipToNextPage() {
		return (filePath != null && charset != null);
	}

	@Override
	public IWizardPage getNextPage() {
		return ((CrosswalkCreationWizard) this.getWizard()).delimitedFileDelimitersPage;
	}

}

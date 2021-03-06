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
package crosswalk.impl;

import crosswalk.*;
import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import crosswalk.CrossWalk;
import crosswalk.CrosswalkFactory;
import crosswalk.CrosswalkPackage;
import crosswalk.CurrentDate;
import crosswalk.CurrentUsername;
import crosswalk.DataException;
import crosswalk.DataField;
import crosswalk.DateInputField;
import crosswalk.DatePrecision;
import crosswalk.DateRecognizer;
import crosswalk.DateToISO8601StringConversion;
import crosswalk.DelimitedFile;
import crosswalk.Dictionary;
import crosswalk.EditingContainer;
import crosswalk.FieldWidth;
import crosswalk.Form;
import crosswalk.InputField;
import crosswalk.MappedAttribute;
import crosswalk.MappedElement;
import crosswalk.MetadataBlock;
import crosswalk.OriginalNameRecordMatcher;
import crosswalk.Paragraph;
import crosswalk.RecordMatches;
import crosswalk.RecordOutOfRangeException;
import crosswalk.TabbedDataField;
import crosswalk.Text;
import crosswalk.TextInputField;
import crosswalk.TextInputType;
import crosswalk.TrimWhitespace;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class CrosswalkFactoryImpl extends EFactoryImpl implements CrosswalkFactory {

    /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
	 * @generated
	 */
    public static CrosswalkFactory init() {
		try {
			CrosswalkFactory theCrosswalkFactory = (CrosswalkFactory)EPackage.Registry.INSTANCE.getEFactory("http://lib.unc.edu/schemas/crosswalk"); 
			if (theCrosswalkFactory != null) {
				return theCrosswalkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CrosswalkFactoryImpl();
	}

    /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
	 * @generated
	 */
    public CrosswalkFactoryImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CrosswalkPackage.TABBED_DATA_FIELD: return createTabbedDataField();
			case CrosswalkPackage.TRIM_WHITESPACE: return createTrimWhitespace();
			case CrosswalkPackage.CURRENT_USERNAME: return createCurrentUsername();
			case CrosswalkPackage.CURRENT_DATE: return createCurrentDate();
			case CrosswalkPackage.CROSS_WALK: return createCrossWalk();
			case CrosswalkPackage.DATA_FIELD: return createDataField();
			case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER: return createOriginalNameRecordMatcher();
			case CrosswalkPackage.DATE_RECOGNIZER: return createDateRecognizer();
			case CrosswalkPackage.TEXT: return createText();
			case CrosswalkPackage.DELIMITED_FILE: return createDelimitedFile();
			case CrosswalkPackage.MAPPED_ELEMENT: return createMappedElement();
			case CrosswalkPackage.MAPPED_ATTRIBUTE: return createMappedAttribute();
			case CrosswalkPackage.DATE_TO_ISO8601_STRING_CONVERSION: return createDateToISO8601StringConversion();
			case CrosswalkPackage.DICTIONARY: return createDictionary();
			case CrosswalkPackage.METADATA_BLOCK: return createMetadataBlock();
			case CrosswalkPackage.INPUT_FIELD: return createInputField();
			case CrosswalkPackage.TEXT_INPUT_FIELD: return createTextInputField();
			case CrosswalkPackage.EMAIL_INPUT_FIELD: return createEmailInputField();
			case CrosswalkPackage.EDITING_CONTAINER: return createEditingContainer();
			case CrosswalkPackage.FORM: return createForm();
			case CrosswalkPackage.MAJOR_BLOCK: return createMajorBlock();
			case CrosswalkPackage.MAJOR_ENTRY: return createMajorEntry();
			case CrosswalkPackage.FILE_BLOCK: return createFileBlock();
			case CrosswalkPackage.PARAGRAPH: return createParagraph();
			case CrosswalkPackage.DATE_INPUT_FIELD: return createDateInputField();
			case CrosswalkPackage.OUTPUT_PROFILE: return createOutputProfile();
			case CrosswalkPackage.DATE_TO_XML_GREGORIAN_CALENDER_CONVERSION: return createDateToXMLGregorianCalenderConversion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CrosswalkPackage.DATE_PRECISION:
				return createDatePrecisionFromString(eDataType, initialValue);
			case CrosswalkPackage.FIELD_WIDTH:
				return createFieldWidthFromString(eDataType, initialValue);
			case CrosswalkPackage.TEXT_INPUT_TYPE:
				return createTextInputTypeFromString(eDataType, initialValue);
			case CrosswalkPackage.OUTPUT_METADATA_SECTIONS:
				return createOutputMetadataSectionsFromString(eDataType, initialValue);
			case CrosswalkPackage.DATA_EXCEPTION:
				return createDataExceptionFromString(eDataType, initialValue);
			case CrosswalkPackage.RECORD_MATCHES:
				return createRecordMatchesFromString(eDataType, initialValue);
			case CrosswalkPackage.RECORD_OUT_OF_RANGE_EXCEPTION:
				return createRecordOutOfRangeExceptionFromString(eDataType, initialValue);
			case CrosswalkPackage.URI:
				return createURIFromString(eDataType, initialValue);
			case CrosswalkPackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			case CrosswalkPackage.CLAZZ:
				return createClazzFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CrosswalkPackage.DATE_PRECISION:
				return convertDatePrecisionToString(eDataType, instanceValue);
			case CrosswalkPackage.FIELD_WIDTH:
				return convertFieldWidthToString(eDataType, instanceValue);
			case CrosswalkPackage.TEXT_INPUT_TYPE:
				return convertTextInputTypeToString(eDataType, instanceValue);
			case CrosswalkPackage.OUTPUT_METADATA_SECTIONS:
				return convertOutputMetadataSectionsToString(eDataType, instanceValue);
			case CrosswalkPackage.DATA_EXCEPTION:
				return convertDataExceptionToString(eDataType, instanceValue);
			case CrosswalkPackage.RECORD_MATCHES:
				return convertRecordMatchesToString(eDataType, instanceValue);
			case CrosswalkPackage.RECORD_OUT_OF_RANGE_EXCEPTION:
				return convertRecordOutOfRangeExceptionToString(eDataType, instanceValue);
			case CrosswalkPackage.URI:
				return convertURIToString(eDataType, instanceValue);
			case CrosswalkPackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			case CrosswalkPackage.CLAZZ:
				return convertClazzToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public TabbedDataField createTabbedDataField() {
		TabbedDataFieldImpl tabbedDataField = new TabbedDataFieldImpl();
		return tabbedDataField;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public TrimWhitespace createTrimWhitespace() {
		TrimWhitespaceImpl trimWhitespace = new TrimWhitespaceImpl();
		return trimWhitespace;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentUsername createCurrentUsername() {
		CurrentUsernameImpl currentUsername = new CurrentUsernameImpl();
		return currentUsername;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentDate createCurrentDate() {
		CurrentDateImpl currentDate = new CurrentDateImpl();
		return currentDate;
	}

				/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public CrossWalk createCrossWalk() {
		CrossWalkImpl crossWalk = new CrossWalkImpl();
		return crossWalk;
	}

    /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public DataField createDataField() {
		DataFieldImpl dataField = new DataFieldImpl();
		return dataField;
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public OriginalNameRecordMatcher createOriginalNameRecordMatcher() {
		OriginalNameRecordMatcherImpl originalNameRecordMatcher = new OriginalNameRecordMatcherImpl();
		return originalNameRecordMatcher;
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public DateRecognizer createDateRecognizer() {
		DateRecognizerImpl dateRecognizer = new DateRecognizerImpl();
		return dateRecognizer;
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public DelimitedFile createDelimitedFile() {
		DelimitedFileImpl delimitedFile = new DelimitedFileImpl();
		return delimitedFile;
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public MappedElement createMappedElement() {
		MappedElementImpl mappedElement = new MappedElementImpl();
		return mappedElement;
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public MappedAttribute createMappedAttribute() {
		MappedAttributeImpl mappedAttribute = new MappedAttributeImpl();
		return mappedAttribute;
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public DateToISO8601StringConversion createDateToISO8601StringConversion() {
		DateToISO8601StringConversionImpl dateToISO8601StringConversion = new DateToISO8601StringConversionImpl();
		return dateToISO8601StringConversion;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dictionary createDictionary() {
		DictionaryImpl dictionary = new DictionaryImpl();
		return dictionary;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataBlock createMetadataBlock() {
		MetadataBlockImpl metadataBlock = new MetadataBlockImpl();
		return metadataBlock;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <F> InputField<F> createInputField() {
		InputFieldImpl<F> inputField = new InputFieldImpl<F>();
		return inputField;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInputField createTextInputField() {
		TextInputFieldImpl textInputField = new TextInputFieldImpl();
		return textInputField;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmailInputField createEmailInputField() {
		EmailInputFieldImpl emailInputField = new EmailInputFieldImpl();
		return emailInputField;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditingContainer createEditingContainer() {
		EditingContainerImpl editingContainer = new EditingContainerImpl();
		return editingContainer;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MajorBlock createMajorBlock() {
		MajorBlockImpl majorBlock = new MajorBlockImpl();
		return majorBlock;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MajorEntry createMajorEntry() {
		MajorEntryImpl majorEntry = new MajorEntryImpl();
		return majorEntry;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileBlock createFileBlock() {
		FileBlockImpl fileBlock = new FileBlockImpl();
		return fileBlock;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph createParagraph() {
		ParagraphImpl paragraph = new ParagraphImpl();
		return paragraph;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateInputField createDateInputField() {
		DateInputFieldImpl dateInputField = new DateInputFieldImpl();
		return dateInputField;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputProfile createOutputProfile() {
		OutputProfileImpl outputProfile = new OutputProfileImpl();
		return outputProfile;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateToXMLGregorianCalenderConversion createDateToXMLGregorianCalenderConversion() {
		DateToXMLGregorianCalenderConversionImpl dateToXMLGregorianCalenderConversion = new DateToXMLGregorianCalenderConversionImpl();
		return dateToXMLGregorianCalenderConversion;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatePrecision createDatePrecisionFromString(EDataType eDataType, String initialValue) {
		DatePrecision result = DatePrecision.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatePrecisionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldWidth createFieldWidthFromString(EDataType eDataType, String initialValue) {
		FieldWidth result = FieldWidth.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFieldWidthToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInputType createTextInputTypeFromString(EDataType eDataType, String initialValue) {
		TextInputType result = TextInputType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextInputTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputMetadataSections createOutputMetadataSectionsFromString(EDataType eDataType, String initialValue) {
		OutputMetadataSections result = OutputMetadataSections.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutputMetadataSectionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public DataException createDataExceptionFromString(EDataType eDataType, String initialValue) {
		return (DataException)super.createFromString(eDataType, initialValue);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public String convertDataExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public IFile createIFileFromString(EDataType eDataType, String initialValue) {
	IFile result = null;
	try {
	    URI pathToFile = new URI(initialValue);
	    ResourcesPlugin.getPlugin();
	    IFile[] files = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocationURI(pathToFile);
	    // FIXME okay if File via wrong project?
	    if (files.length > 0) {
		result = files[0];
	    }
	} catch (URISyntaxException ignored) {
	}
	if (result == null) {
	    result = (IFile) super.createFromString(eDataType, initialValue);
	}
	return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public String convertIFileToString(EDataType eDataType, Object instanceValue) {
	String result = null;
	if (instanceValue == null) {
	    return "";
	}
	IFile f = (IFile) instanceValue;
	result = f.getLocationURI().toASCIIString();
	if (result == null) {
	    result = super.convertToString(eDataType, instanceValue);
	}
	return result;
    }

    /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @SuppressWarnings("unchecked")
        public RecordMatches createRecordMatchesFromString(EDataType eDataType, String initialValue) {
		return (RecordMatches)super.createFromString(eDataType, initialValue);
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String convertRecordMatchesToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public RecordOutOfRangeException createRecordOutOfRangeExceptionFromString(EDataType eDataType, String initialValue) {
		return (RecordOutOfRangeException)super.createFromString(eDataType, initialValue);
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String convertRecordOutOfRangeExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createURIFromString(EDataType eDataType, String initialValue) {
		return (URI)super.createFromString(eDataType, initialValue);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURIToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Throwable createExceptionFromString(EDataType eDataType, String initialValue) {
		return (Throwable)super.createFromString(eDataType, initialValue);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class createClazzFromString(EDataType eDataType, String initialValue) {
		return (Class)super.createFromString(eDataType, initialValue);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClazzToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public CrosswalkPackage getCrosswalkPackage() {
		return (CrosswalkPackage)getEPackage();
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
    @Deprecated
    public static CrosswalkPackage getPackage() {
		return CrosswalkPackage.eINSTANCE;
	}

}

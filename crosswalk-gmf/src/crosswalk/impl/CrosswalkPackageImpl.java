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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import crosswalk.ContextProvider;
import crosswalk.ConversionStrategy;
import crosswalk.CrossWalk;
import crosswalk.CrosswalkFactory;
import crosswalk.CrosswalkPackage;
import crosswalk.CurrentDate;
import crosswalk.CurrentUsername;
import crosswalk.DataException;
import crosswalk.DataField;
import crosswalk.DataSource;
import crosswalk.DateInputField;
import crosswalk.DatePrecision;
import crosswalk.DateRecognizer;
import crosswalk.DateToISO8601StringConversion;
import crosswalk.DateToXMLGregorianCalenderConversion;
import crosswalk.DelimitedFile;
import crosswalk.Dictionary;
import crosswalk.Editable;
import crosswalk.EditingContainer;
import crosswalk.EmailInputField;
import crosswalk.FieldWidth;
import crosswalk.FileBlock;
import crosswalk.Form;
import crosswalk.FormElement;
import crosswalk.Input;
import crosswalk.InputField;
import crosswalk.MajorBlock;
import crosswalk.MajorEntry;
import crosswalk.MappedAttribute;
import crosswalk.MappedElement;
import crosswalk.MappingContainer;
import crosswalk.MetadataBlock;
import crosswalk.OriginalNameRecordMatcher;
import crosswalk.Output;
import crosswalk.OutputElement;
import crosswalk.OutputMetadataSections;
import crosswalk.OutputProfile;
import crosswalk.Paragraph;
import crosswalk.RecordMatcherStrategy;
import crosswalk.RecordMatches;
import crosswalk.RecordOutOfRangeException;
import crosswalk.TabbedDataField;
import crosswalk.Text;
import crosswalk.TextInputField;
import crosswalk.TextInputType;
import crosswalk.TrimWhitespace;
import crosswalk.WalkWidget;
import edu.unc.lib.schemas.acl.AclPackage;
import gov.loc.mods.mods.MODSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CrosswalkPackageImpl extends EPackageImpl implements CrosswalkPackage {

    public List<EClass> getDataSourceImplementations() {
	List<EClass> dataSourceTypes = new ArrayList<EClass>();
	EClass dataSourceType = getDataSource();
	for(EClassifier c : getEClassifiers()) {
	    if(c instanceof EClass) {
		EClass clazz = (EClass)c;
		if(clazz.getEAllSuperTypes().contains(dataSourceType)) {
		    if(!clazz.isAbstract()) {
			dataSourceTypes.add(clazz);
		    }
		}
	    }
	}
	return dataSourceTypes;
    }

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass tabbedDataFieldEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass trimWhitespaceEClass = null;

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentUsernameEClass = null;

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentDateEClass = null;

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass crossWalkEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass outputElementEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass walkWidgetEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass dataSourceEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass dataFieldEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass outputEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass inputEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass recordMatcherStrategyEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass originalNameRecordMatcherEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass dateRecognizerEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass textEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass delimitedFileEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass mappedElementEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass mappedAttributeEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass conversionStrategyEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass dateToISO8601StringConversionEClass = null;

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dictionaryEClass = null;

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataBlockEClass = null;

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputFieldEClass = null;

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textInputFieldEClass = null;

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emailInputFieldEClass = null;

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextProviderEClass = null;

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingContainerEClass = null;

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editingContainerEClass = null;

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editableEClass = null;

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formEClass = null;

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass majorBlockEClass = null;

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass majorEntryEClass = null;

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formElementEClass = null;

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileBlockEClass = null;

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paragraphEClass = null;

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateInputFieldEClass = null;

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputProfileEClass = null;

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateToXMLGregorianCalenderConversionEClass = null;

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum datePrecisionEEnum = null;

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fieldWidthEEnum = null;

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textInputTypeEEnum = null;

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum outputMetadataSectionsEEnum = null;

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EDataType dataExceptionEDataType = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EDataType recordMatchesEDataType = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EDataType recordOutOfRangeExceptionEDataType = null;

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriEDataType = null;

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exceptionEDataType = null;

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType clazzEDataType = null;

								/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see crosswalk.CrosswalkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
        private CrosswalkPackageImpl() {
		super(eNS_URI, CrosswalkFactory.eINSTANCE);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private static boolean isInited = false;

        /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CrosswalkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
        public static CrosswalkPackage init() {
		if (isInited) return (CrosswalkPackage)EPackage.Registry.INSTANCE.getEPackage(CrosswalkPackage.eNS_URI);

		// Obtain or create and register package
		CrosswalkPackageImpl theCrosswalkPackage = (CrosswalkPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CrosswalkPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CrosswalkPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCrosswalkPackage.createPackageContents();

		// Initialize created meta-data
		theCrosswalkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCrosswalkPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CrosswalkPackage.eNS_URI, theCrosswalkPackage);
		return theCrosswalkPackage;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getTabbedDataField() {
		return tabbedDataFieldEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EAttribute getTabbedDataField_ColumnNumber() {
		return (EAttribute)tabbedDataFieldEClass.getEStructuralFeatures().get(0);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getTrimWhitespace() {
		return trimWhitespaceEClass;
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrentUsername() {
		return currentUsernameEClass;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrentDate() {
		return currentDateEClass;
	}

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getCrossWalk() {
		return crossWalkEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getCrossWalk_DataSource() {
		return (EReference)crossWalkEClass.getEStructuralFeatures().get(0);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getOutputElement() {
		return outputElementEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getOutputElement_Walk() {
		return (EReference)outputElementEClass.getEStructuralFeatures().get(0);
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputElement_Exception() {
		return (EAttribute)outputElementEClass.getEStructuralFeatures().get(1);
	}

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getWalkWidget() {
		return walkWidgetEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getWalkWidget_Walk() {
		return (EReference)walkWidgetEClass.getEStructuralFeatures().get(0);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getDataSource() {
		return dataSourceEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getDataSource_Walk() {
		return (EReference)dataSourceEClass.getEStructuralFeatures().get(0);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getDataSource_Fields() {
		return (EReference)dataSourceEClass.getEStructuralFeatures().get(1);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getDataField() {
		return dataFieldEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getDataField_Source() {
		return (EReference)dataFieldEClass.getEStructuralFeatures().get(0);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EAttribute getDataField_Label() {
		return (EAttribute)dataFieldEClass.getEStructuralFeatures().get(1);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getOutput() {
		return outputEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getInput() {
		return inputEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getInput_Output() {
		return (EReference)inputEClass.getEStructuralFeatures().get(0);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getRecordMatcherStrategy() {
		return recordMatcherStrategyEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getOriginalNameRecordMatcher() {
		return originalNameRecordMatcherEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EAttribute getOriginalNameRecordMatcher_CaseSensitive() {
		return (EAttribute)originalNameRecordMatcherEClass.getEStructuralFeatures().get(0);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EAttribute getOriginalNameRecordMatcher_IncludeFileExtension() {
		return (EAttribute)originalNameRecordMatcherEClass.getEStructuralFeatures().get(1);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EAttribute getOriginalNameRecordMatcher_BaseFolder() {
		return (EAttribute)originalNameRecordMatcherEClass.getEStructuralFeatures().get(2);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getDateRecognizer() {
		return dateRecognizerEClass;
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateRecognizer_Formats() {
		return (EAttribute)dateRecognizerEClass.getEStructuralFeatures().get(0);
	}

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getText() {
		return textEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EAttribute getText_Value() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getDelimitedFile() {
		return delimitedFileEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EAttribute getDelimitedFile_SourceFile() {
		return (EAttribute)delimitedFileEClass.getEStructuralFeatures().get(0);
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelimitedFile_FirstDataRow() {
		return (EAttribute)delimitedFileEClass.getEStructuralFeatures().get(1);
	}

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EAttribute getDelimitedFile_HeaderRow() {
		return (EAttribute)delimitedFileEClass.getEStructuralFeatures().get(2);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EAttribute getDelimitedFile_TextEncoding() {
		return (EAttribute)delimitedFileEClass.getEStructuralFeatures().get(3);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EAttribute getDelimitedFile_FieldDelimiter() {
		return (EAttribute)delimitedFileEClass.getEStructuralFeatures().get(4);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EAttribute getDelimitedFile_TextDelimiter() {
		return (EAttribute)delimitedFileEClass.getEStructuralFeatures().get(5);
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelimitedFile_LastDataRow() {
		return (EAttribute)delimitedFileEClass.getEStructuralFeatures().get(6);
	}

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getMappedElement() {
		return mappedElementEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getMappedElement_ChildElements() {
		return (EReference)mappedElementEClass.getEStructuralFeatures().get(0);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getMappedElement_Attributes() {
		return (EReference)mappedElementEClass.getEStructuralFeatures().get(1);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getMappedElement_MappedFeature() {
		return (EReference)mappedElementEClass.getEStructuralFeatures().get(2);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getMappedElement_Parent() {
		return (EReference)mappedElementEClass.getEStructuralFeatures().get(3);
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappedElement_GeneratedFeature() {
		return (EReference)mappedElementEClass.getEStructuralFeatures().get(4);
	}

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getMappedAttribute() {
		return mappedAttributeEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getMappedAttribute_MappedFeature() {
		return (EReference)mappedAttributeEClass.getEStructuralFeatures().get(0);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getMappedAttribute_ConversionStrategy() {
		return (EReference)mappedAttributeEClass.getEStructuralFeatures().get(1);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EAttribute getMappedAttribute_DefaultValue() {
		return (EAttribute)mappedAttributeEClass.getEStructuralFeatures().get(2);
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappedAttribute_Required() {
		return (EAttribute)mappedAttributeEClass.getEStructuralFeatures().get(3);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappedAttribute_OmittedWhenBlank() {
		return (EAttribute)mappedAttributeEClass.getEStructuralFeatures().get(4);
	}

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getConversionStrategy() {
		return conversionStrategyEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getDateToISO8601StringConversion() {
		return dateToISO8601StringConversionEClass;
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDictionary() {
		return dictionaryEClass;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDictionary_Name() {
		return (EAttribute)dictionaryEClass.getEStructuralFeatures().get(0);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDictionary_Blocks() {
		return (EReference)dictionaryEClass.getEStructuralFeatures().get(1);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDictionary_Description() {
		return (EAttribute)dictionaryEClass.getEStructuralFeatures().get(2);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadataBlock() {
		return metadataBlockEClass;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadataBlock_Name() {
		return (EAttribute)metadataBlockEClass.getEStructuralFeatures().get(0);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadataBlock_Description() {
		return (EAttribute)metadataBlockEClass.getEStructuralFeatures().get(1);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataBlock_Ports() {
		return (EReference)metadataBlockEClass.getEStructuralFeatures().get(2);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadataBlock_Required() {
		return (EAttribute)metadataBlockEClass.getEStructuralFeatures().get(3);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadataBlock_MaxRepeat() {
		return (EAttribute)metadataBlockEClass.getEStructuralFeatures().get(4);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputField() {
		return inputFieldEClass;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputField_Label() {
		return (EAttribute)inputFieldEClass.getEStructuralFeatures().get(0);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputField_Usage() {
		return (EAttribute)inputFieldEClass.getEStructuralFeatures().get(1);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputField_Required() {
		return (EAttribute)inputFieldEClass.getEStructuralFeatures().get(2);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputField_EnteredValue() {
		return (EAttribute)inputFieldEClass.getEStructuralFeatures().get(3);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextInputField() {
		return textInputFieldEClass;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputField_Width() {
		return (EAttribute)textInputFieldEClass.getEStructuralFeatures().get(0);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputField_MaxCharacters() {
		return (EAttribute)textInputFieldEClass.getEStructuralFeatures().get(1);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputField_VocabularyURL() {
		return (EAttribute)textInputFieldEClass.getEStructuralFeatures().get(2);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputField_AllowFreeText() {
		return (EAttribute)textInputFieldEClass.getEStructuralFeatures().get(3);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputField_ValidValues() {
		return (EAttribute)textInputFieldEClass.getEStructuralFeatures().get(4);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputField_Type() {
		return (EAttribute)textInputFieldEClass.getEStructuralFeatures().get(5);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmailInputField() {
		return emailInputFieldEClass;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmailInputField_ProvidesEmailDepositNoticeTo() {
		return (EAttribute)emailInputFieldEClass.getEStructuralFeatures().get(0);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextProvider() {
		return contextProviderEClass;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextProvider_OutputProfiles() {
		return (EReference)contextProviderEClass.getEStructuralFeatures().get(0);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextProvider_CurrentUser() {
		return (EAttribute)contextProviderEClass.getEStructuralFeatures().get(1);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingContainer() {
		return mappingContainerEClass;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingContainer_Widgets() {
		return (EReference)mappingContainerEClass.getEStructuralFeatures().get(0);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingContainer_Elements() {
		return (EReference)mappingContainerEClass.getEStructuralFeatures().get(1);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingContainer_Exceptions() {
		return (EAttribute)mappingContainerEClass.getEStructuralFeatures().get(2);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEditingContainer() {
		return editingContainerEClass;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditingContainer_Model() {
		return (EReference)editingContainerEClass.getEStructuralFeatures().get(0);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEditable() {
		return editableEClass;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForm() {
		return formEClass;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForm_Elements() {
		return (EReference)formEClass.getEStructuralFeatures().get(0);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Title() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(1);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Description() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(2);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_EmailDepositNoticeTo() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(3);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_DepositContainerId() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(4);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_AuthorizedGroups() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(5);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_ReviewBeforePublication() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(6);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_PromptForMultipleSubmissions() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(7);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_CanAddSupplementalFiles() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(8);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_ContactName() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(9);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_ContactEmail() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(10);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Logo() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(11);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Agreement() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(12);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMajorBlock() {
		return majorBlockEClass;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMajorBlock_Label() {
		return (EAttribute)majorBlockEClass.getEStructuralFeatures().get(0);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMajorBlock_SelectedMajorIndex() {
		return (EAttribute)majorBlockEClass.getEStructuralFeatures().get(1);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMajorBlock_MajorEntries() {
		return (EReference)majorBlockEClass.getEStructuralFeatures().get(2);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMajorBlock_NameElement() {
		return (EReference)majorBlockEClass.getEStructuralFeatures().get(3);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMajorEntry() {
		return majorEntryEClass;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMajorEntry_Name() {
		return (EAttribute)majorEntryEClass.getEStructuralFeatures().get(0);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMajorEntry_ObserverGroups() {
		return (EAttribute)majorEntryEClass.getEStructuralFeatures().get(1);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMajorEntry_ReviewerGroups() {
		return (EAttribute)majorEntryEClass.getEStructuralFeatures().get(2);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMajorEntry_EmailDepositNoticeTo() {
		return (EAttribute)majorEntryEClass.getEStructuralFeatures().get(3);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormElement() {
		return formElementEClass;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileBlock() {
		return fileBlockEClass;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileBlock_Usage() {
		return (EAttribute)fileBlockEClass.getEStructuralFeatures().get(0);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileBlock_Label() {
		return (EAttribute)fileBlockEClass.getEStructuralFeatures().get(1);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileBlock_DefaultAccess() {
		return (EAttribute)fileBlockEClass.getEStructuralFeatures().get(2);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileBlock_CopyGrantsHavingRoles() {
		return (EAttribute)fileBlockEClass.getEStructuralFeatures().get(3);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParagraph() {
		return paragraphEClass;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraph_Heading() {
		return (EAttribute)paragraphEClass.getEStructuralFeatures().get(0);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraph_Text() {
		return (EAttribute)paragraphEClass.getEStructuralFeatures().get(1);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateInputField() {
		return dateInputFieldEClass;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateInputField_DatePrecision() {
		return (EAttribute)dateInputFieldEClass.getEStructuralFeatures().get(0);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateInputField_BlankDefaultDate() {
		return (EAttribute)dateInputFieldEClass.getEStructuralFeatures().get(1);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputProfile() {
		return outputProfileEClass;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputProfile_ParentMappedFeature() {
		return (EReference)outputProfileEClass.getEStructuralFeatures().get(0);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputProfile_MetadataSection() {
		return (EAttribute)outputProfileEClass.getEStructuralFeatures().get(6);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateToXMLGregorianCalenderConversion() {
		return dateToXMLGregorianCalenderConversionEClass;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputProfile_StartMappingAtChildren() {
		return (EAttribute)outputProfileEClass.getEStructuralFeatures().get(1);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputProfile_Name() {
		return (EAttribute)outputProfileEClass.getEStructuralFeatures().get(2);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputProfile_Description() {
		return (EAttribute)outputProfileEClass.getEStructuralFeatures().get(3);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputProfile_MetadataLabel() {
		return (EAttribute)outputProfileEClass.getEStructuralFeatures().get(4);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputProfile_MetadataType() {
		return (EAttribute)outputProfileEClass.getEStructuralFeatures().get(5);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatePrecision() {
		return datePrecisionEEnum;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFieldWidth() {
		return fieldWidthEEnum;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextInputType() {
		return textInputTypeEEnum;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOutputMetadataSections() {
		return outputMetadataSectionsEEnum;
	}

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EDataType getDataException() {
		return dataExceptionEDataType;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EDataType getRecordMatches() {
		return recordMatchesEDataType;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EDataType getRecordOutOfRangeException() {
		return recordOutOfRangeExceptionEDataType;
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getURI() {
		return uriEDataType;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getException() {
		return exceptionEDataType;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getClazz() {
		return clazzEDataType;
	}

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CrosswalkFactory getCrosswalkFactory() {
		return (CrosswalkFactory)getEFactoryInstance();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private boolean isCreated = false;

        /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tabbedDataFieldEClass = createEClass(TABBED_DATA_FIELD);
		createEAttribute(tabbedDataFieldEClass, TABBED_DATA_FIELD__COLUMN_NUMBER);

		trimWhitespaceEClass = createEClass(TRIM_WHITESPACE);

		currentUsernameEClass = createEClass(CURRENT_USERNAME);

		currentDateEClass = createEClass(CURRENT_DATE);

		crossWalkEClass = createEClass(CROSS_WALK);
		createEReference(crossWalkEClass, CROSS_WALK__DATA_SOURCE);

		outputElementEClass = createEClass(OUTPUT_ELEMENT);
		createEReference(outputElementEClass, OUTPUT_ELEMENT__WALK);
		createEAttribute(outputElementEClass, OUTPUT_ELEMENT__EXCEPTION);

		walkWidgetEClass = createEClass(WALK_WIDGET);
		createEReference(walkWidgetEClass, WALK_WIDGET__WALK);

		dataSourceEClass = createEClass(DATA_SOURCE);
		createEReference(dataSourceEClass, DATA_SOURCE__WALK);
		createEReference(dataSourceEClass, DATA_SOURCE__FIELDS);

		dataFieldEClass = createEClass(DATA_FIELD);
		createEReference(dataFieldEClass, DATA_FIELD__SOURCE);
		createEAttribute(dataFieldEClass, DATA_FIELD__LABEL);

		outputEClass = createEClass(OUTPUT);

		inputEClass = createEClass(INPUT);
		createEReference(inputEClass, INPUT__OUTPUT);

		recordMatcherStrategyEClass = createEClass(RECORD_MATCHER_STRATEGY);

		originalNameRecordMatcherEClass = createEClass(ORIGINAL_NAME_RECORD_MATCHER);
		createEAttribute(originalNameRecordMatcherEClass, ORIGINAL_NAME_RECORD_MATCHER__CASE_SENSITIVE);
		createEAttribute(originalNameRecordMatcherEClass, ORIGINAL_NAME_RECORD_MATCHER__INCLUDE_FILE_EXTENSION);
		createEAttribute(originalNameRecordMatcherEClass, ORIGINAL_NAME_RECORD_MATCHER__BASE_FOLDER);

		dateRecognizerEClass = createEClass(DATE_RECOGNIZER);
		createEAttribute(dateRecognizerEClass, DATE_RECOGNIZER__FORMATS);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__VALUE);

		delimitedFileEClass = createEClass(DELIMITED_FILE);
		createEAttribute(delimitedFileEClass, DELIMITED_FILE__SOURCE_FILE);
		createEAttribute(delimitedFileEClass, DELIMITED_FILE__FIRST_DATA_ROW);
		createEAttribute(delimitedFileEClass, DELIMITED_FILE__HEADER_ROW);
		createEAttribute(delimitedFileEClass, DELIMITED_FILE__TEXT_ENCODING);
		createEAttribute(delimitedFileEClass, DELIMITED_FILE__FIELD_DELIMITER);
		createEAttribute(delimitedFileEClass, DELIMITED_FILE__TEXT_DELIMITER);
		createEAttribute(delimitedFileEClass, DELIMITED_FILE__LAST_DATA_ROW);

		mappedElementEClass = createEClass(MAPPED_ELEMENT);
		createEReference(mappedElementEClass, MAPPED_ELEMENT__CHILD_ELEMENTS);
		createEReference(mappedElementEClass, MAPPED_ELEMENT__ATTRIBUTES);
		createEReference(mappedElementEClass, MAPPED_ELEMENT__MAPPED_FEATURE);
		createEReference(mappedElementEClass, MAPPED_ELEMENT__PARENT);
		createEReference(mappedElementEClass, MAPPED_ELEMENT__GENERATED_FEATURE);

		mappedAttributeEClass = createEClass(MAPPED_ATTRIBUTE);
		createEReference(mappedAttributeEClass, MAPPED_ATTRIBUTE__MAPPED_FEATURE);
		createEReference(mappedAttributeEClass, MAPPED_ATTRIBUTE__CONVERSION_STRATEGY);
		createEAttribute(mappedAttributeEClass, MAPPED_ATTRIBUTE__DEFAULT_VALUE);
		createEAttribute(mappedAttributeEClass, MAPPED_ATTRIBUTE__REQUIRED);
		createEAttribute(mappedAttributeEClass, MAPPED_ATTRIBUTE__OMITTED_WHEN_BLANK);

		conversionStrategyEClass = createEClass(CONVERSION_STRATEGY);

		dateToISO8601StringConversionEClass = createEClass(DATE_TO_ISO8601_STRING_CONVERSION);

		dictionaryEClass = createEClass(DICTIONARY);
		createEAttribute(dictionaryEClass, DICTIONARY__NAME);
		createEReference(dictionaryEClass, DICTIONARY__BLOCKS);
		createEAttribute(dictionaryEClass, DICTIONARY__DESCRIPTION);

		metadataBlockEClass = createEClass(METADATA_BLOCK);
		createEAttribute(metadataBlockEClass, METADATA_BLOCK__NAME);
		createEAttribute(metadataBlockEClass, METADATA_BLOCK__DESCRIPTION);
		createEReference(metadataBlockEClass, METADATA_BLOCK__PORTS);
		createEAttribute(metadataBlockEClass, METADATA_BLOCK__REQUIRED);
		createEAttribute(metadataBlockEClass, METADATA_BLOCK__MAX_REPEAT);

		inputFieldEClass = createEClass(INPUT_FIELD);
		createEAttribute(inputFieldEClass, INPUT_FIELD__LABEL);
		createEAttribute(inputFieldEClass, INPUT_FIELD__USAGE);
		createEAttribute(inputFieldEClass, INPUT_FIELD__REQUIRED);
		createEAttribute(inputFieldEClass, INPUT_FIELD__ENTERED_VALUE);

		textInputFieldEClass = createEClass(TEXT_INPUT_FIELD);
		createEAttribute(textInputFieldEClass, TEXT_INPUT_FIELD__WIDTH);
		createEAttribute(textInputFieldEClass, TEXT_INPUT_FIELD__MAX_CHARACTERS);
		createEAttribute(textInputFieldEClass, TEXT_INPUT_FIELD__VOCABULARY_URL);
		createEAttribute(textInputFieldEClass, TEXT_INPUT_FIELD__ALLOW_FREE_TEXT);
		createEAttribute(textInputFieldEClass, TEXT_INPUT_FIELD__VALID_VALUES);
		createEAttribute(textInputFieldEClass, TEXT_INPUT_FIELD__TYPE);

		emailInputFieldEClass = createEClass(EMAIL_INPUT_FIELD);
		createEAttribute(emailInputFieldEClass, EMAIL_INPUT_FIELD__PROVIDES_EMAIL_DEPOSIT_NOTICE_TO);

		contextProviderEClass = createEClass(CONTEXT_PROVIDER);
		createEReference(contextProviderEClass, CONTEXT_PROVIDER__OUTPUT_PROFILES);
		createEAttribute(contextProviderEClass, CONTEXT_PROVIDER__CURRENT_USER);

		mappingContainerEClass = createEClass(MAPPING_CONTAINER);
		createEReference(mappingContainerEClass, MAPPING_CONTAINER__WIDGETS);
		createEReference(mappingContainerEClass, MAPPING_CONTAINER__ELEMENTS);
		createEAttribute(mappingContainerEClass, MAPPING_CONTAINER__EXCEPTIONS);

		editingContainerEClass = createEClass(EDITING_CONTAINER);
		createEReference(editingContainerEClass, EDITING_CONTAINER__MODEL);

		editableEClass = createEClass(EDITABLE);

		formEClass = createEClass(FORM);
		createEReference(formEClass, FORM__ELEMENTS);
		createEAttribute(formEClass, FORM__TITLE);
		createEAttribute(formEClass, FORM__DESCRIPTION);
		createEAttribute(formEClass, FORM__EMAIL_DEPOSIT_NOTICE_TO);
		createEAttribute(formEClass, FORM__DEPOSIT_CONTAINER_ID);
		createEAttribute(formEClass, FORM__AUTHORIZED_GROUPS);
		createEAttribute(formEClass, FORM__REVIEW_BEFORE_PUBLICATION);
		createEAttribute(formEClass, FORM__PROMPT_FOR_MULTIPLE_SUBMISSIONS);
		createEAttribute(formEClass, FORM__CAN_ADD_SUPPLEMENTAL_FILES);
		createEAttribute(formEClass, FORM__CONTACT_NAME);
		createEAttribute(formEClass, FORM__CONTACT_EMAIL);
		createEAttribute(formEClass, FORM__LOGO);
		createEAttribute(formEClass, FORM__AGREEMENT);

		majorBlockEClass = createEClass(MAJOR_BLOCK);
		createEAttribute(majorBlockEClass, MAJOR_BLOCK__LABEL);
		createEAttribute(majorBlockEClass, MAJOR_BLOCK__SELECTED_MAJOR_INDEX);
		createEReference(majorBlockEClass, MAJOR_BLOCK__MAJOR_ENTRIES);
		createEReference(majorBlockEClass, MAJOR_BLOCK__NAME_ELEMENT);

		majorEntryEClass = createEClass(MAJOR_ENTRY);
		createEAttribute(majorEntryEClass, MAJOR_ENTRY__NAME);
		createEAttribute(majorEntryEClass, MAJOR_ENTRY__OBSERVER_GROUPS);
		createEAttribute(majorEntryEClass, MAJOR_ENTRY__REVIEWER_GROUPS);
		createEAttribute(majorEntryEClass, MAJOR_ENTRY__EMAIL_DEPOSIT_NOTICE_TO);

		formElementEClass = createEClass(FORM_ELEMENT);

		fileBlockEClass = createEClass(FILE_BLOCK);
		createEAttribute(fileBlockEClass, FILE_BLOCK__USAGE);
		createEAttribute(fileBlockEClass, FILE_BLOCK__LABEL);
		createEAttribute(fileBlockEClass, FILE_BLOCK__DEFAULT_ACCESS);
		createEAttribute(fileBlockEClass, FILE_BLOCK__COPY_GRANTS_HAVING_ROLES);

		paragraphEClass = createEClass(PARAGRAPH);
		createEAttribute(paragraphEClass, PARAGRAPH__HEADING);
		createEAttribute(paragraphEClass, PARAGRAPH__TEXT);

		dateInputFieldEClass = createEClass(DATE_INPUT_FIELD);
		createEAttribute(dateInputFieldEClass, DATE_INPUT_FIELD__DATE_PRECISION);
		createEAttribute(dateInputFieldEClass, DATE_INPUT_FIELD__BLANK_DEFAULT_DATE);

		outputProfileEClass = createEClass(OUTPUT_PROFILE);
		createEReference(outputProfileEClass, OUTPUT_PROFILE__PARENT_MAPPED_FEATURE);
		createEAttribute(outputProfileEClass, OUTPUT_PROFILE__START_MAPPING_AT_CHILDREN);
		createEAttribute(outputProfileEClass, OUTPUT_PROFILE__NAME);
		createEAttribute(outputProfileEClass, OUTPUT_PROFILE__DESCRIPTION);
		createEAttribute(outputProfileEClass, OUTPUT_PROFILE__METADATA_LABEL);
		createEAttribute(outputProfileEClass, OUTPUT_PROFILE__METADATA_TYPE);
		createEAttribute(outputProfileEClass, OUTPUT_PROFILE__METADATA_SECTION);

		dateToXMLGregorianCalenderConversionEClass = createEClass(DATE_TO_XML_GREGORIAN_CALENDER_CONVERSION);

		// Create enums
		datePrecisionEEnum = createEEnum(DATE_PRECISION);
		fieldWidthEEnum = createEEnum(FIELD_WIDTH);
		textInputTypeEEnum = createEEnum(TEXT_INPUT_TYPE);
		outputMetadataSectionsEEnum = createEEnum(OUTPUT_METADATA_SECTIONS);

		// Create data types
		dataExceptionEDataType = createEDataType(DATA_EXCEPTION);
		recordMatchesEDataType = createEDataType(RECORD_MATCHES);
		recordOutOfRangeExceptionEDataType = createEDataType(RECORD_OUT_OF_RANGE_EXCEPTION);
		uriEDataType = createEDataType(URI);
		exceptionEDataType = createEDataType(EXCEPTION);
		clazzEDataType = createEDataType(CLAZZ);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private boolean isInitialized = false;

        /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		ETypeParameter inputFieldEClass_F = addETypeParameter(inputFieldEClass, "F");

		// Set bounds for type parameters

		// Add supertypes to classes
		tabbedDataFieldEClass.getESuperTypes().add(this.getDataField());
		trimWhitespaceEClass.getESuperTypes().add(this.getWalkWidget());
		trimWhitespaceEClass.getESuperTypes().add(this.getOutput());
		trimWhitespaceEClass.getESuperTypes().add(this.getInput());
		currentUsernameEClass.getESuperTypes().add(this.getWalkWidget());
		currentUsernameEClass.getESuperTypes().add(this.getOutput());
		currentDateEClass.getESuperTypes().add(this.getWalkWidget());
		currentDateEClass.getESuperTypes().add(this.getOutput());
		crossWalkEClass.getESuperTypes().add(this.getContextProvider());
		crossWalkEClass.getESuperTypes().add(this.getMappingContainer());
		crossWalkEClass.getESuperTypes().add(this.getEditable());
		dataFieldEClass.getESuperTypes().add(this.getOutput());
		recordMatcherStrategyEClass.getESuperTypes().add(this.getWalkWidget());
		originalNameRecordMatcherEClass.getESuperTypes().add(this.getRecordMatcherStrategy());
		originalNameRecordMatcherEClass.getESuperTypes().add(this.getInput());
		dateRecognizerEClass.getESuperTypes().add(this.getWalkWidget());
		dateRecognizerEClass.getESuperTypes().add(this.getOutput());
		dateRecognizerEClass.getESuperTypes().add(this.getInput());
		textEClass.getESuperTypes().add(this.getOutput());
		textEClass.getESuperTypes().add(this.getWalkWidget());
		delimitedFileEClass.getESuperTypes().add(this.getDataSource());
		mappedElementEClass.getESuperTypes().add(this.getOutputElement());
		mappedAttributeEClass.getESuperTypes().add(this.getOutputElement());
		mappedAttributeEClass.getESuperTypes().add(this.getInput());
		dateToISO8601StringConversionEClass.getESuperTypes().add(this.getConversionStrategy());
		dictionaryEClass.getESuperTypes().add(this.getContextProvider());
		dictionaryEClass.getESuperTypes().add(this.getEditable());
		metadataBlockEClass.getESuperTypes().add(this.getOutputElement());
		metadataBlockEClass.getESuperTypes().add(this.getMappingContainer());
		metadataBlockEClass.getESuperTypes().add(this.getFormElement());
		inputFieldEClass.getESuperTypes().add(this.getOutput());
		inputFieldEClass.getESuperTypes().add(this.getInput());
		EGenericType g1 = createEGenericType(this.getInputField());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		textInputFieldEClass.getEGenericSuperTypes().add(g1);
		emailInputFieldEClass.getESuperTypes().add(this.getTextInputField());
		mappingContainerEClass.getESuperTypes().add(this.getContextProvider());
		formEClass.getESuperTypes().add(this.getEditable());
		formEClass.getESuperTypes().add(this.getContextProvider());
		majorBlockEClass.getESuperTypes().add(this.getFormElement());
		fileBlockEClass.getESuperTypes().add(this.getMetadataBlock());
		paragraphEClass.getESuperTypes().add(this.getFormElement());
		g1 = createEGenericType(this.getInputField());
		g2 = createEGenericType(ecorePackage.getEDate());
		g1.getETypeArguments().add(g2);
		dateInputFieldEClass.getEGenericSuperTypes().add(g1);
		dateToXMLGregorianCalenderConversionEClass.getESuperTypes().add(this.getConversionStrategy());

		// Initialize classes and features; add operations and parameters
		initEClass(tabbedDataFieldEClass, TabbedDataField.class, "TabbedDataField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTabbedDataField_ColumnNumber(), ecorePackage.getEInt(), "ColumnNumber", "1", 1, 1, TabbedDataField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trimWhitespaceEClass, TrimWhitespace.class, "TrimWhitespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(currentUsernameEClass, CurrentUsername.class, "CurrentUsername", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(currentDateEClass, CurrentDate.class, "CurrentDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(crossWalkEClass, CrossWalk.class, "CrossWalk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCrossWalk_DataSource(), this.getDataSource(), this.getDataSource_Walk(), "DataSource", null, 1, 1, CrossWalk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputElementEClass, OutputElement.class, "OutputElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputElement_Walk(), this.getMappingContainer(), this.getMappingContainer_Elements(), "Walk", null, 0, 1, OutputElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputElement_Exception(), this.getException(), "exception", null, 0, 1, OutputElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(outputElementEClass, null, "updateRecord", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "record", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(walkWidgetEClass, WalkWidget.class, "WalkWidget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWalkWidget_Walk(), this.getMappingContainer(), this.getMappingContainer_Widgets(), "Walk", null, 1, 1, WalkWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSourceEClass, DataSource.class, "DataSource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSource_Walk(), this.getCrossWalk(), this.getCrossWalk_DataSource(), "Walk", null, 1, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSource_Fields(), this.getDataField(), this.getDataField_Source(), "fields", null, 0, -1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(dataSourceEClass, null, "GoToExample", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDataException());
		addEException(op, this.getRecordOutOfRangeException());

		op = addEOperation(dataSourceEClass, null, "NextRecord", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDataException());
		addEException(op, this.getRecordOutOfRangeException());

		op = addEOperation(dataSourceEClass, null, "Reset", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDataException());

		addEOperation(dataSourceEClass, ecorePackage.getEString(), "getRecordID", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSourceEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSourceEClass, ecorePackage.getEString(), "getFieldValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataField(), "field", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSourceEClass, null, "initializeDataFields", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDataException());

		initEClass(dataFieldEClass, DataField.class, "DataField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataField_Source(), this.getDataSource(), this.getDataSource_Fields(), "source", null, 0, 1, DataField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataField_Label(), ecorePackage.getEString(), "label", null, 0, 1, DataField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(outputEClass, ecorePackage.getEJavaObject(), "getResult", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDataException());

		addEOperation(outputEClass, this.getClazz(), "getOutputType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInput_Output(), this.getOutput(), null, "Output", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(inputEClass, this.getClazz(), "getInputType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(recordMatcherStrategyEClass, RecordMatcherStrategy.class, "RecordMatcherStrategy", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(recordMatcherStrategyEClass, this.getRecordMatches(), "getMatches", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(recordMatcherStrategyEClass, null, "run", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDataException());

		initEClass(originalNameRecordMatcherEClass, OriginalNameRecordMatcher.class, "OriginalNameRecordMatcher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOriginalNameRecordMatcher_CaseSensitive(), ecorePackage.getEBoolean(), "caseSensitive", "false", 1, 1, OriginalNameRecordMatcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOriginalNameRecordMatcher_IncludeFileExtension(), ecorePackage.getEBoolean(), "includeFileExtension", "false", 1, 1, OriginalNameRecordMatcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOriginalNameRecordMatcher_BaseFolder(), ecorePackage.getEString(), "baseFolder", null, 0, 1, OriginalNameRecordMatcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateRecognizerEClass, DateRecognizer.class, "DateRecognizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateRecognizer_Formats(), ecorePackage.getEString(), "Formats", "yy-MM-dd", 1, -1, DateRecognizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Value(), ecorePackage.getEString(), "Value", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delimitedFileEClass, DelimitedFile.class, "DelimitedFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelimitedFile_SourceFile(), this.getURI(), "SourceFile", null, 1, 1, DelimitedFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelimitedFile_FirstDataRow(), ecorePackage.getEInt(), "firstDataRow", "1", 1, 1, DelimitedFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelimitedFile_HeaderRow(), ecorePackage.getEBoolean(), "headerRow", "true", 0, 1, DelimitedFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelimitedFile_TextEncoding(), ecorePackage.getEString(), "textEncoding", "utf-8", 1, 1, DelimitedFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelimitedFile_FieldDelimiter(), ecorePackage.getEChar(), "fieldDelimiter", ",", 1, 1, DelimitedFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelimitedFile_TextDelimiter(), ecorePackage.getEChar(), "textDelimiter", "\"", 0, 1, DelimitedFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelimitedFile_LastDataRow(), ecorePackage.getEInt(), "lastDataRow", "1", 0, 1, DelimitedFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(delimitedFileEClass, null, "GoToRecord", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "RowNumber", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDataException());
		addEException(op, this.getRecordOutOfRangeException());

		initEClass(mappedElementEClass, MappedElement.class, "MappedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappedElement_ChildElements(), this.getMappedElement(), this.getMappedElement_Parent(), "childElements", null, 0, -1, MappedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappedElement_Attributes(), this.getMappedAttribute(), null, "attributes", null, 0, -1, MappedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappedElement_MappedFeature(), ecorePackage.getEReference(), null, "mappedFeature", null, 1, 1, MappedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappedElement_Parent(), this.getMappedElement(), this.getMappedElement_ChildElements(), "parent", null, 0, 1, MappedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappedElement_GeneratedFeature(), ecorePackage.getEObject(), null, "generatedFeature", null, 0, 1, MappedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappedAttributeEClass, MappedAttribute.class, "MappedAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappedAttribute_MappedFeature(), ecorePackage.getEAttribute(), null, "mappedFeature", null, 1, 1, MappedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappedAttribute_ConversionStrategy(), this.getConversionStrategy(), null, "conversionStrategy", null, 0, 1, MappedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMappedAttribute_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, MappedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMappedAttribute_Required(), ecorePackage.getEBoolean(), "required", "false", 1, 1, MappedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMappedAttribute_OmittedWhenBlank(), ecorePackage.getEBoolean(), "omittedWhenBlank", "true", 1, 1, MappedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conversionStrategyEClass, ConversionStrategy.class, "ConversionStrategy", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(conversionStrategyEClass, ecorePackage.getEJavaObject(), "convert", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "input", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(conversionStrategyEClass, this.getClazz(), "getInputType", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(conversionStrategyEClass, this.getClazz(), "getOutputType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dateToISO8601StringConversionEClass, DateToISO8601StringConversion.class, "DateToISO8601StringConversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dictionaryEClass, Dictionary.class, "Dictionary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDictionary_Name(), ecorePackage.getEString(), "name", null, 1, 1, Dictionary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDictionary_Blocks(), this.getMetadataBlock(), null, "blocks", null, 0, -1, Dictionary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDictionary_Description(), ecorePackage.getEString(), "description", null, 1, 1, Dictionary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadataBlockEClass, MetadataBlock.class, "MetadataBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetadataBlock_Name(), ecorePackage.getEString(), "name", null, 1, 1, MetadataBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadataBlock_Description(), ecorePackage.getEString(), "description", null, 0, 1, MetadataBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getInputField());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getMetadataBlock_Ports(), g1, null, "ports", null, 0, -1, MetadataBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadataBlock_Required(), ecorePackage.getEBoolean(), "required", "false", 1, 1, MetadataBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadataBlock_MaxRepeat(), ecorePackage.getEInt(), "maxRepeat", "1", 1, 1, MetadataBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputFieldEClass, InputField.class, "InputField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputField_Label(), ecorePackage.getEString(), "label", null, 1, 1, InputField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputField_Usage(), ecorePackage.getEString(), "usage", null, 0, 1, InputField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputField_Required(), ecorePackage.getEBoolean(), "required", "false", 1, 1, InputField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(inputFieldEClass_F);
		initEAttribute(getInputField_EnteredValue(), g1, "enteredValue", null, 0, 1, InputField.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textInputFieldEClass, TextInputField.class, "TextInputField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextInputField_Width(), this.getFieldWidth(), "width", "Normal", 1, 1, TextInputField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInputField_MaxCharacters(), ecorePackage.getEIntegerObject(), "maxCharacters", null, 0, 1, TextInputField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInputField_VocabularyURL(), ecorePackage.getEString(), "vocabularyURL", null, 0, 1, TextInputField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInputField_AllowFreeText(), ecorePackage.getEBoolean(), "allowFreeText", "true", 1, 1, TextInputField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInputField_ValidValues(), ecorePackage.getEString(), "validValues", null, 0, -1, TextInputField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInputField_Type(), this.getTextInputType(), "type", "SingleLine", 1, 1, TextInputField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emailInputFieldEClass, EmailInputField.class, "EmailInputField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmailInputField_ProvidesEmailDepositNoticeTo(), ecorePackage.getEBoolean(), "providesEmailDepositNoticeTo", "false", 1, 1, EmailInputField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextProviderEClass, ContextProvider.class, "ContextProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextProvider_OutputProfiles(), this.getOutputProfile(), null, "outputProfiles", null, 0, -1, ContextProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextProvider_CurrentUser(), ecorePackage.getEString(), "currentUser", null, 0, 1, ContextProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingContainerEClass, MappingContainer.class, "MappingContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingContainer_Widgets(), this.getWalkWidget(), this.getWalkWidget_Walk(), "widgets", null, 0, -1, MappingContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMappingContainer_Elements(), this.getOutputElement(), this.getOutputElement_Walk(), "elements", null, 0, -1, MappingContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMappingContainer_Exceptions(), this.getException(), "exceptions", null, 0, -1, MappingContainer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(editingContainerEClass, EditingContainer.class, "EditingContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEditingContainer_Model(), this.getEditable(), null, "model", null, 1, 1, EditingContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(editableEClass, Editable.class, "Editable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForm_Elements(), this.getFormElement(), null, "elements", null, 0, -1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Title(), ecorePackage.getEString(), "title", null, 1, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Description(), ecorePackage.getEString(), "description", null, 1, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_EmailDepositNoticeTo(), ecorePackage.getEString(), "emailDepositNoticeTo", null, 0, -1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_DepositContainerId(), ecorePackage.getEString(), "depositContainerId", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_AuthorizedGroups(), ecorePackage.getEString(), "authorizedGroups", "public", 0, -1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_ReviewBeforePublication(), ecorePackage.getEBoolean(), "reviewBeforePublication", "true", 1, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_PromptForMultipleSubmissions(), ecorePackage.getEBoolean(), "promptForMultipleSubmissions", "false", 1, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_CanAddSupplementalFiles(), ecorePackage.getEBoolean(), "canAddSupplementalFiles", "false", 1, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_ContactName(), ecorePackage.getEString(), "contactName", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_ContactEmail(), ecorePackage.getEString(), "contactEmail", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Logo(), this.getURI(), "logo", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Agreement(), ecorePackage.getEString(), "agreement", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(majorBlockEClass, MajorBlock.class, "MajorBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMajorBlock_Label(), ecorePackage.getEString(), "label", null, 1, 1, MajorBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMajorBlock_SelectedMajorIndex(), ecorePackage.getEInt(), "selectedMajorIndex", "-1", 1, 1, MajorBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMajorBlock_MajorEntries(), this.getMajorEntry(), null, "majorEntries", null, 1, -1, MajorBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMajorBlock_NameElement(), this.getMappedElement(), null, "nameElement", null, 1, 1, MajorBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(majorBlockEClass, this.getMajorEntry(), "getSelectedMajor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(majorEntryEClass, MajorEntry.class, "MajorEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMajorEntry_Name(), ecorePackage.getEString(), "name", null, 0, 1, MajorEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMajorEntry_ObserverGroups(), ecorePackage.getEString(), "observerGroups", null, 0, -1, MajorEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMajorEntry_ReviewerGroups(), ecorePackage.getEString(), "reviewerGroups", null, 0, -1, MajorEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMajorEntry_EmailDepositNoticeTo(), ecorePackage.getEString(), "emailDepositNoticeTo", null, 0, -1, MajorEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formElementEClass, FormElement.class, "FormElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileBlockEClass, FileBlock.class, "FileBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileBlock_Usage(), ecorePackage.getEString(), "usage", null, 0, 1, FileBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileBlock_Label(), ecorePackage.getEString(), "label", null, 0, 1, FileBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileBlock_DefaultAccess(), ecorePackage.getEBoolean(), "defaultAccess", "false", 1, 1, FileBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileBlock_CopyGrantsHavingRoles(), ecorePackage.getEString(), "copyGrantsHavingRoles", "", 0, -1, FileBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paragraphEClass, Paragraph.class, "Paragraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParagraph_Heading(), ecorePackage.getEString(), "heading", null, 0, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraph_Text(), ecorePackage.getEString(), "text", null, 1, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateInputFieldEClass, DateInputField.class, "DateInputField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateInputField_DatePrecision(), this.getDatePrecision(), "datePrecision", "Day", 1, 1, DateInputField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateInputField_BlankDefaultDate(), ecorePackage.getEBoolean(), "blankDefaultDate", "false", 1, 1, DateInputField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputProfileEClass, OutputProfile.class, "OutputProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputProfile_ParentMappedFeature(), ecorePackage.getEReference(), null, "parentMappedFeature", null, 1, 1, OutputProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputProfile_StartMappingAtChildren(), ecorePackage.getEBoolean(), "startMappingAtChildren", "true", 1, 1, OutputProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputProfile_Name(), ecorePackage.getEString(), "name", "Profile Name", 1, 1, OutputProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputProfile_Description(), ecorePackage.getEString(), "description", "Description", 1, 1, OutputProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputProfile_MetadataLabel(), ecorePackage.getEString(), "metadataLabel", null, 1, 1, OutputProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputProfile_MetadataType(), ecorePackage.getEString(), "metadataType", "OTHER", 1, 1, OutputProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputProfile_MetadataSection(), this.getOutputMetadataSections(), "metadataSection", null, 1, 1, OutputProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateToXMLGregorianCalenderConversionEClass, DateToXMLGregorianCalenderConversion.class, "DateToXMLGregorianCalenderConversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(datePrecisionEEnum, DatePrecision.class, "DatePrecision");
		addEEnumLiteral(datePrecisionEEnum, DatePrecision.YEAR);
		addEEnumLiteral(datePrecisionEEnum, DatePrecision.MONTH);
		addEEnumLiteral(datePrecisionEEnum, DatePrecision.DAY);
		addEEnumLiteral(datePrecisionEEnum, DatePrecision.HOUR);
		addEEnumLiteral(datePrecisionEEnum, DatePrecision.MINUTE);
		addEEnumLiteral(datePrecisionEEnum, DatePrecision.SECOND);

		initEEnum(fieldWidthEEnum, FieldWidth.class, "FieldWidth");
		addEEnumLiteral(fieldWidthEEnum, FieldWidth.SHORT);
		addEEnumLiteral(fieldWidthEEnum, FieldWidth.NORMAL);
		addEEnumLiteral(fieldWidthEEnum, FieldWidth.LONG);
		addEEnumLiteral(fieldWidthEEnum, FieldWidth.FULL_LINE);

		initEEnum(textInputTypeEEnum, TextInputType.class, "TextInputType");
		addEEnumLiteral(textInputTypeEEnum, TextInputType.SINGLE_LINE);
		addEEnumLiteral(textInputTypeEEnum, TextInputType.MULTIPLE_LINES);

		initEEnum(outputMetadataSectionsEEnum, OutputMetadataSections.class, "OutputMetadataSections");
		addEEnumLiteral(outputMetadataSectionsEEnum, OutputMetadataSections.RIGHTS_MD);
		addEEnumLiteral(outputMetadataSectionsEEnum, OutputMetadataSections.DMD_SEC);
		addEEnumLiteral(outputMetadataSectionsEEnum, OutputMetadataSections.TECH_MD);
		addEEnumLiteral(outputMetadataSectionsEEnum, OutputMetadataSections.DIGIPROV_MD);
		addEEnumLiteral(outputMetadataSectionsEEnum, OutputMetadataSections.SOURCE_MD);

		// Initialize data types
		initEDataType(dataExceptionEDataType, DataException.class, "DataException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(recordMatchesEDataType, RecordMatches.class, "RecordMatches", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(recordOutOfRangeExceptionEDataType, RecordOutOfRangeException.class, "RecordOutOfRangeException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uriEDataType, java.net.URI.class, "URI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exceptionEDataType, Throwable.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(clazzEDataType, Class.class, "Clazz", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// org.eclipse.help.contexts
		createOrgAnnotations();
	}

								/**
	 * Initializes the annotations for <b>org.eclipse.help.contexts</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrgAnnotations() {
		String source = "org.eclipse.help.contexts";		
		addAnnotation
		  (getDateRecognizer_Formats(), 
		   source, 
		   new String[] {
			 "contextID", "crosswalk-gmf.DateRecognizer_Formats"
		   });
	}

} //CrosswalkPackageImpl

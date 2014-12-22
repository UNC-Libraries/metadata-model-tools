/**
 */
package crosswalk;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Major Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.MajorBlock#getLabel <em>Label</em>}</li>
 *   <li>{@link crosswalk.MajorBlock#getSelectedMajorIndex <em>Selected Major Index</em>}</li>
 *   <li>{@link crosswalk.MajorBlock#getMajorEntries <em>Major Entries</em>}</li>
 *   <li>{@link crosswalk.MajorBlock#getNameElement <em>Name Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getMajorBlock()
 * @model
 * @generated
 */
public interface MajorBlock extends FormElement {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see crosswalk.CrosswalkPackage#getMajorBlock_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link crosswalk.MajorBlock#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Selected Major Index</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Major Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Major Index</em>' attribute.
	 * @see #setSelectedMajorIndex(int)
	 * @see crosswalk.CrosswalkPackage#getMajorBlock_SelectedMajorIndex()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getSelectedMajorIndex();

	/**
	 * Sets the value of the '{@link crosswalk.MajorBlock#getSelectedMajorIndex <em>Selected Major Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Major Index</em>' attribute.
	 * @see #getSelectedMajorIndex()
	 * @generated
	 */
	void setSelectedMajorIndex(int value);

	/**
	 * Returns the value of the '<em><b>Major Entries</b></em>' reference list.
	 * The list contents are of type {@link crosswalk.MajorEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Major Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Major Entries</em>' reference list.
	 * @see crosswalk.CrosswalkPackage#getMajorBlock_MajorEntries()
	 * @model required="true"
	 * @generated
	 */
	EList<MajorEntry> getMajorEntries();

	/**
	 * Returns the value of the '<em><b>Name Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Element</em>' reference.
	 * @see #setNameElement(MappedElement)
	 * @see crosswalk.CrosswalkPackage#getMajorBlock_NameElement()
	 * @model required="true"
	 * @generated
	 */
	MappedElement getNameElement();

	/**
	 * Sets the value of the '{@link crosswalk.MajorBlock#getNameElement <em>Name Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Element</em>' reference.
	 * @see #getNameElement()
	 * @generated
	 */
	void setNameElement(MappedElement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	MajorEntry getSelectedMajor();

} // MajorBlock

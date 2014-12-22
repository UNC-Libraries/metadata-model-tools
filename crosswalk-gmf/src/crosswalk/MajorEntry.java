/**
 */
package crosswalk;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Major Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.MajorEntry#getName <em>Name</em>}</li>
 *   <li>{@link crosswalk.MajorEntry#getObserverGroups <em>Observer Groups</em>}</li>
 *   <li>{@link crosswalk.MajorEntry#getReviewerGroups <em>Reviewer Groups</em>}</li>
 *   <li>{@link crosswalk.MajorEntry#getEmailDepositNoticeTo <em>Email Deposit Notice To</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getMajorEntry()
 * @model
 * @generated
 */
public interface MajorEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see crosswalk.CrosswalkPackage#getMajorEntry_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link crosswalk.MajorEntry#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Observer Groups</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observer Groups</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observer Groups</em>' attribute list.
	 * @see crosswalk.CrosswalkPackage#getMajorEntry_ObserverGroups()
	 * @model
	 * @generated
	 */
	EList<String> getObserverGroups();

	/**
	 * Returns the value of the '<em><b>Reviewer Groups</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reviewer Groups</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reviewer Groups</em>' attribute list.
	 * @see crosswalk.CrosswalkPackage#getMajorEntry_ReviewerGroups()
	 * @model
	 * @generated
	 */
	EList<String> getReviewerGroups();

	/**
	 * Returns the value of the '<em><b>Email Deposit Notice To</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Deposit Notice To</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Deposit Notice To</em>' attribute list.
	 * @see crosswalk.CrosswalkPackage#getMajorEntry_EmailDepositNoticeTo()
	 * @model
	 * @generated
	 */
	EList<String> getEmailDepositNoticeTo();

} // MajorEntry

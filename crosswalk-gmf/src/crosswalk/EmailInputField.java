/**
 */
package crosswalk;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Email Input Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.EmailInputField#isProvidesEmailDepositNoticeTo <em>Provides Email Deposit Notice To</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getEmailInputField()
 * @model superTypes="crosswalk.InputField<org.eclipse.emf.ecore.EString>"
 * @generated
 */
public interface EmailInputField extends InputField<String> {
	/**
	 * Returns the value of the '<em><b>Provides Email Deposit Notice To</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides Email Deposit Notice To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides Email Deposit Notice To</em>' attribute.
	 * @see #setProvidesEmailDepositNoticeTo(boolean)
	 * @see crosswalk.CrosswalkPackage#getEmailInputField_ProvidesEmailDepositNoticeTo()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isProvidesEmailDepositNoticeTo();

	/**
	 * Sets the value of the '{@link crosswalk.EmailInputField#isProvidesEmailDepositNoticeTo <em>Provides Email Deposit Notice To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provides Email Deposit Notice To</em>' attribute.
	 * @see #isProvidesEmailDepositNoticeTo()
	 * @generated
	 */
	void setProvidesEmailDepositNoticeTo(boolean value);

} // EmailInputField

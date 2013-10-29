/**
 */
package crosswalk.impl;

import crosswalk.CrosswalkPackage;
import crosswalk.MajorBlock;
import crosswalk.MajorEntry;

import crosswalk.MappedElement;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Major Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.MajorBlockImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link crosswalk.impl.MajorBlockImpl#getSelectedMajorIndex <em>Selected Major Index</em>}</li>
 *   <li>{@link crosswalk.impl.MajorBlockImpl#getMajorEntries <em>Major Entries</em>}</li>
 *   <li>{@link crosswalk.impl.MajorBlockImpl#getNameElement <em>Name Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MajorBlockImpl extends EObjectImpl implements MajorBlock {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelectedMajorIndex() <em>Selected Major Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedMajorIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int SELECTED_MAJOR_INDEX_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getSelectedMajorIndex() <em>Selected Major Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedMajorIndex()
	 * @generated
	 * @ordered
	 */
	protected int selectedMajorIndex = SELECTED_MAJOR_INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMajorEntries() <em>Major Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<MajorEntry> majorEntries;

	/**
	 * The cached value of the '{@link #getNameElement() <em>Name Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameElement()
	 * @generated
	 * @ordered
	 */
	protected MappedElement nameElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MajorBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrosswalkPackage.Literals.MAJOR_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAJOR_BLOCK__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSelectedMajorIndex() {
		return selectedMajorIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedMajorIndex(int newSelectedMajorIndex) {
		int oldSelectedMajorIndex = selectedMajorIndex;
		selectedMajorIndex = newSelectedMajorIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAJOR_BLOCK__SELECTED_MAJOR_INDEX, oldSelectedMajorIndex, selectedMajorIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MajorEntry> getMajorEntries() {
		if (majorEntries == null) {
			majorEntries = new EObjectResolvingEList<MajorEntry>(MajorEntry.class, this, CrosswalkPackage.MAJOR_BLOCK__MAJOR_ENTRIES);
		}
		return majorEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappedElement getNameElement() {
		if (nameElement != null && nameElement.eIsProxy()) {
			InternalEObject oldNameElement = (InternalEObject)nameElement;
			nameElement = (MappedElement)eResolveProxy(oldNameElement);
			if (nameElement != oldNameElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CrosswalkPackage.MAJOR_BLOCK__NAME_ELEMENT, oldNameElement, nameElement));
			}
		}
		return nameElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappedElement basicGetNameElement() {
		return nameElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameElement(MappedElement newNameElement) {
		MappedElement oldNameElement = nameElement;
		nameElement = newNameElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAJOR_BLOCK__NAME_ELEMENT, oldNameElement, nameElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MajorEntry getSelectedMajor() {
		int index = this.getSelectedMajorIndex();
		if (index >= 0 && index < this.getMajorEntries().size()) {
			return this.getMajorEntries().get(index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CrosswalkPackage.MAJOR_BLOCK__LABEL:
				return getLabel();
			case CrosswalkPackage.MAJOR_BLOCK__SELECTED_MAJOR_INDEX:
				return getSelectedMajorIndex();
			case CrosswalkPackage.MAJOR_BLOCK__MAJOR_ENTRIES:
				return getMajorEntries();
			case CrosswalkPackage.MAJOR_BLOCK__NAME_ELEMENT:
				if (resolve) return getNameElement();
				return basicGetNameElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CrosswalkPackage.MAJOR_BLOCK__LABEL:
				setLabel((String)newValue);
				return;
			case CrosswalkPackage.MAJOR_BLOCK__SELECTED_MAJOR_INDEX:
				setSelectedMajorIndex((Integer)newValue);
				return;
			case CrosswalkPackage.MAJOR_BLOCK__MAJOR_ENTRIES:
				getMajorEntries().clear();
				getMajorEntries().addAll((Collection<? extends MajorEntry>)newValue);
				return;
			case CrosswalkPackage.MAJOR_BLOCK__NAME_ELEMENT:
				setNameElement((MappedElement)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CrosswalkPackage.MAJOR_BLOCK__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CrosswalkPackage.MAJOR_BLOCK__SELECTED_MAJOR_INDEX:
				setSelectedMajorIndex(SELECTED_MAJOR_INDEX_EDEFAULT);
				return;
			case CrosswalkPackage.MAJOR_BLOCK__MAJOR_ENTRIES:
				getMajorEntries().clear();
				return;
			case CrosswalkPackage.MAJOR_BLOCK__NAME_ELEMENT:
				setNameElement((MappedElement)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CrosswalkPackage.MAJOR_BLOCK__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CrosswalkPackage.MAJOR_BLOCK__SELECTED_MAJOR_INDEX:
				return selectedMajorIndex != SELECTED_MAJOR_INDEX_EDEFAULT;
			case CrosswalkPackage.MAJOR_BLOCK__MAJOR_ENTRIES:
				return majorEntries != null && !majorEntries.isEmpty();
			case CrosswalkPackage.MAJOR_BLOCK__NAME_ELEMENT:
				return nameElement != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (label: ");
		result.append(label);
		result.append(", selectedMajorIndex: ");
		result.append(selectedMajorIndex);
		result.append(')');
		return result.toString();
	}

} //MajorBlockImpl

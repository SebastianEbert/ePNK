/**
 * This file is part of the ePNK project (Petri Net Kernel for eclipse). The ePNK
 * is platform for Petri net tools based on the PNML transfer format. Its
 * main idea is to provide generic Petri net types which can be easily plugged
 * in and a simple generic GMF editor, that can be used for graphically editing
 * nets of any plugged in type. Additional functionality can be plugged in.
 * 
 * Note that this project is still in an experimental phase, and is also used
 * as a case study for EMF/GMF based Model-based Software Engineering.
 * 
 * Copyright (C) 2010 Ekkart Kindler, eki@imm.dtu.dk
 * The license under which this software will be distributed is still to be decided -
 * it will probably be the EPL.
 *
 * $Id$
 */
package org.pnml.tools.epnk.pnmlcoremodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.pnml.tools.epnk.pnmlcoremodel.Graphics;
import org.pnml.tools.epnk.pnmlcoremodel.Label;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.pnmlcoremodel.ToolInfo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.LabelImpl#getToolspecific <em>Toolspecific</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.LabelImpl#getGraphics <em>Graphics</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.LabelImpl#getUnknown <em>Unknown</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LabelImpl extends EObjectImpl implements Label {
	/**
	 * The cached value of the '{@link #getToolspecific() <em>Toolspecific</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolspecific()
	 * @generated
	 * @ordered
	 */
	protected EList<ToolInfo> toolspecific;

	/**
	 * The cached value of the '{@link #getGraphics() <em>Graphics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphics()
	 * @generated
	 * @ordered
	 */
	protected Graphics graphics;

	/**
	 * The cached value of the '{@link #getUnknown() <em>Unknown</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknown()
	 * @generated
	 * @ordered
	 */
	protected EList<AnyType> unknown;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PnmlcoremodelPackage.Literals.LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToolInfo> getToolspecific() {
		if (toolspecific == null) {
			toolspecific = new EObjectContainmentEList<ToolInfo>(ToolInfo.class, this, PnmlcoremodelPackage.LABEL__TOOLSPECIFIC);
		}
		return toolspecific;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graphics getGraphics() {
		return graphics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphics(Graphics newGraphics, NotificationChain msgs) {
		Graphics oldGraphics = graphics;
		graphics = newGraphics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.LABEL__GRAPHICS, oldGraphics, newGraphics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphics(Graphics newGraphics) {
		if (newGraphics != graphics) {
			NotificationChain msgs = null;
			if (graphics != null)
				msgs = ((InternalEObject)graphics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PnmlcoremodelPackage.LABEL__GRAPHICS, null, msgs);
			if (newGraphics != null)
				msgs = ((InternalEObject)newGraphics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PnmlcoremodelPackage.LABEL__GRAPHICS, null, msgs);
			msgs = basicSetGraphics(newGraphics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.LABEL__GRAPHICS, newGraphics, newGraphics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnyType> getUnknown() {
		if (unknown == null) {
			unknown = new EObjectContainmentEList<AnyType>(AnyType.class, this, PnmlcoremodelPackage.LABEL__UNKNOWN);
		}
		return unknown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PnmlcoremodelPackage.LABEL__TOOLSPECIFIC:
				return ((InternalEList<?>)getToolspecific()).basicRemove(otherEnd, msgs);
			case PnmlcoremodelPackage.LABEL__GRAPHICS:
				return basicSetGraphics(null, msgs);
			case PnmlcoremodelPackage.LABEL__UNKNOWN:
				return ((InternalEList<?>)getUnknown()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PnmlcoremodelPackage.LABEL__TOOLSPECIFIC:
				return getToolspecific();
			case PnmlcoremodelPackage.LABEL__GRAPHICS:
				return getGraphics();
			case PnmlcoremodelPackage.LABEL__UNKNOWN:
				return getUnknown();
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
			case PnmlcoremodelPackage.LABEL__TOOLSPECIFIC:
				getToolspecific().clear();
				getToolspecific().addAll((Collection<? extends ToolInfo>)newValue);
				return;
			case PnmlcoremodelPackage.LABEL__GRAPHICS:
				setGraphics((Graphics)newValue);
				return;
			case PnmlcoremodelPackage.LABEL__UNKNOWN:
				getUnknown().clear();
				getUnknown().addAll((Collection<? extends AnyType>)newValue);
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
			case PnmlcoremodelPackage.LABEL__TOOLSPECIFIC:
				getToolspecific().clear();
				return;
			case PnmlcoremodelPackage.LABEL__GRAPHICS:
				setGraphics((Graphics)null);
				return;
			case PnmlcoremodelPackage.LABEL__UNKNOWN:
				getUnknown().clear();
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
			case PnmlcoremodelPackage.LABEL__TOOLSPECIFIC:
				return toolspecific != null && !toolspecific.isEmpty();
			case PnmlcoremodelPackage.LABEL__GRAPHICS:
				return graphics != null;
			case PnmlcoremodelPackage.LABEL__UNKNOWN:
				return unknown != null && !unknown.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LabelImpl

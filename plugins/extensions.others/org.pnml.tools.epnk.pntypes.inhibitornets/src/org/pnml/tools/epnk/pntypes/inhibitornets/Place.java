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
 */
package org.pnml.tools.epnk.pntypes.inhibitornets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.inhibitornets.Place#getMarking <em>Marking</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pntypes.inhibitornets.InhibitornetsPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends org.pnml.tools.epnk.pnmlcoremodel.Place {
	/**
	 * Returns the value of the '<em><b>Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marking</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marking</em>' containment reference.
	 * @see #setMarking(Marking)
	 * @see org.pnml.tools.epnk.pntypes.inhibitornets.InhibitornetsPackage#getPlace_Marking()
	 * @model containment="true"
	 * @generated
	 */
	Marking getMarking();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.inhibitornets.Place#getMarking <em>Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marking</em>' containment reference.
	 * @see #getMarking()
	 * @generated
	 */
	void setMarking(Marking value);

} // Place

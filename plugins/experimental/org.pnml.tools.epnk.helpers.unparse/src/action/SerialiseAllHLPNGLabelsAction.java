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
package action;

import org.pnml.tools.epnk.actions.framework.jobs.AbstractEPNKAction;
import org.pnml.tools.epnk.actions.framework.jobs.AbstractEPNKJob;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPN;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNG;

public class SerialiseAllHLPNGLabelsAction extends AbstractEPNKAction {

	@Override
	public boolean isEnabled(PetriNet petrinet) {
		if (petrinet instanceof HLPN) {
			PetriNetType type = petrinet.getType();
			return type instanceof HLPNG;
		}
		return false;
	}
	
	@Override
	protected AbstractEPNKJob createJob(PetriNet petrinet, String defaultInput) {
		return new SerialiseAllHLPNGLabelsJob(petrinet,defaultInput);
	}
	
}

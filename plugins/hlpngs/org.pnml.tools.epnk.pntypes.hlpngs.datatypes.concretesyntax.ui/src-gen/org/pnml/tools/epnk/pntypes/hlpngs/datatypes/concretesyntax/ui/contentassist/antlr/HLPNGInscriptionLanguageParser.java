/*
* generated by Xtext
*/
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.services.HLPNGInscriptionLanguageGrammarAccess;

public class HLPNGInscriptionLanguageParser extends AbstractContentAssistParser {
	
	@Inject
	private HLPNGInscriptionLanguageGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.ui.contentassist.antlr.internal.InternalHLPNGInscriptionLanguageParser createParser() {
		org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.ui.contentassist.antlr.internal.InternalHLPNGInscriptionLanguageParser result = new org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.ui.contentassist.antlr.internal.InternalHLPNGInscriptionLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDocumentAccess().getAlternatives(), "rule__Document__Alternatives");
					put(grammarAccess.getDeclarationsAccess().getAlternatives_1(), "rule__Declarations__Alternatives_1");
					put(grammarAccess.getDeclarationAccess().getAlternatives(), "rule__Declaration__Alternatives");
					put(grammarAccess.getSortDeclAccess().getAlternatives(), "rule__SortDecl__Alternatives");
					put(grammarAccess.getSortAccess().getAlternatives(), "rule__Sort__Alternatives");
					put(grammarAccess.getTerm1Access().getAlternatives_1(), "rule__Term1__Alternatives_1");
					put(grammarAccess.getTerm3Access().getAlternatives_1(), "rule__Term3__Alternatives_1");
					put(grammarAccess.getTerm4Access().getAlternatives_1(), "rule__Term4__Alternatives_1");
					put(grammarAccess.getTerm5Access().getAlternatives_1(), "rule__Term5__Alternatives_1");
					put(grammarAccess.getTerm7Access().getAlternatives_1(), "rule__Term7__Alternatives_1");
					put(grammarAccess.getTerm8Access().getAlternatives_1(), "rule__Term8__Alternatives_1");
					put(grammarAccess.getTerm9Access().getAlternatives(), "rule__Term9__Alternatives");
					put(grammarAccess.getTerm10Access().getAlternatives(), "rule__Term10__Alternatives");
					put(grammarAccess.getTerm10Access().getAlternatives_4_2(), "rule__Term10__Alternatives_4_2");
					put(grammarAccess.getOtherBuiltInOperatorAccess().getAlternatives(), "rule__OtherBuiltInOperator__Alternatives");
					put(grammarAccess.getBuiltInSortAccess().getAlternatives(), "rule__BuiltInSort__Alternatives");
					put(grammarAccess.getBuiltInConstAccess().getAlternatives(), "rule__BuiltInConst__Alternatives");
					put(grammarAccess.getMultisetConstantAccess().getAlternatives(), "rule__MultisetConstant__Alternatives");
					put(grammarAccess.getBooleanConstantAccess().getAlternatives_1(), "rule__BooleanConstant__Alternatives_1");
					put(grammarAccess.getNumberAccess().getAlternatives(), "rule__Number__Alternatives");
					put(grammarAccess.getCyclicEnumsBuiltInOperatorAccess().getAlternatives(), "rule__CyclicEnumsBuiltInOperator__Alternatives");
					put(grammarAccess.getStringsBuiltInOperatorAccess().getAlternatives(), "rule__StringsBuiltInOperator__Alternatives");
					put(grammarAccess.getListsBuiltInOperatorAccess().getAlternatives(), "rule__ListsBuiltInOperator__Alternatives");
					put(grammarAccess.getDocumentAccess().getGroup_0(), "rule__Document__Group_0__0");
					put(grammarAccess.getDocumentAccess().getGroup_1(), "rule__Document__Group_1__0");
					put(grammarAccess.getDeclarationsAccess().getGroup(), "rule__Declarations__Group__0");
					put(grammarAccess.getDeclarationsAccess().getGroup_1_0(), "rule__Declarations__Group_1_0__0");
					put(grammarAccess.getDeclarationsAccess().getGroup_1_0_2(), "rule__Declarations__Group_1_0_2__0");
					put(grammarAccess.getDeclarationsAccess().getGroup_1_1(), "rule__Declarations__Group_1_1__0");
					put(grammarAccess.getDeclarationsAccess().getGroup_1_1_2(), "rule__Declarations__Group_1_1_2__0");
					put(grammarAccess.getDeclarationsAccess().getGroup_1_2(), "rule__Declarations__Group_1_2__0");
					put(grammarAccess.getDeclarationsAccess().getGroup_1_2_2(), "rule__Declarations__Group_1_2_2__0");
					put(grammarAccess.getDeclarationsAccess().getGroup_1_3(), "rule__Declarations__Group_1_3__0");
					put(grammarAccess.getDeclarationsAccess().getGroup_1_3_2(), "rule__Declarations__Group_1_3_2__0");
					put(grammarAccess.getDeclarationsAccess().getGroup_1_4(), "rule__Declarations__Group_1_4__0");
					put(grammarAccess.getDeclarationsAccess().getGroup_1_4_2(), "rule__Declarations__Group_1_4_2__0");
					put(grammarAccess.getVariableDeclAccess().getGroup(), "rule__VariableDecl__Group__0");
					put(grammarAccess.getNamedSortAccess().getGroup(), "rule__NamedSort__Group__0");
					put(grammarAccess.getNamedOperatorAccess().getGroup(), "rule__NamedOperator__Group__0");
					put(grammarAccess.getNamedOperatorAccess().getGroup_2(), "rule__NamedOperator__Group_2__0");
					put(grammarAccess.getNamedOperatorAccess().getGroup_2_1(), "rule__NamedOperator__Group_2_1__0");
					put(grammarAccess.getMultiSetSortAccess().getGroup(), "rule__MultiSetSort__Group__0");
					put(grammarAccess.getProductSortAccess().getGroup(), "rule__ProductSort__Group__0");
					put(grammarAccess.getProductSortAccess().getGroup_2(), "rule__ProductSort__Group_2__0");
					put(grammarAccess.getProductSortAccess().getGroup_2_1(), "rule__ProductSort__Group_2_1__0");
					put(grammarAccess.getTerm1Access().getGroup(), "rule__Term1__Group__0");
					put(grammarAccess.getTerm1Access().getGroup_1_0(), "rule__Term1__Group_1_0__0");
					put(grammarAccess.getTerm1Access().getGroup_1_1(), "rule__Term1__Group_1_1__0");
					put(grammarAccess.getTerm2Access().getGroup(), "rule__Term2__Group__0");
					put(grammarAccess.getTerm2Access().getGroup_1(), "rule__Term2__Group_1__0");
					put(grammarAccess.getTerm3Access().getGroup(), "rule__Term3__Group__0");
					put(grammarAccess.getTerm3Access().getGroup_1_0(), "rule__Term3__Group_1_0__0");
					put(grammarAccess.getTerm3Access().getGroup_1_1(), "rule__Term3__Group_1_1__0");
					put(grammarAccess.getTerm3Access().getGroup_1_2(), "rule__Term3__Group_1_2__0");
					put(grammarAccess.getTerm3Access().getGroup_1_3(), "rule__Term3__Group_1_3__0");
					put(grammarAccess.getTerm3Access().getGroup_1_4(), "rule__Term3__Group_1_4__0");
					put(grammarAccess.getTerm3Access().getGroup_1_5(), "rule__Term3__Group_1_5__0");
					put(grammarAccess.getTerm3Access().getGroup_1_6(), "rule__Term3__Group_1_6__0");
					put(grammarAccess.getTerm3Access().getGroup_1_7(), "rule__Term3__Group_1_7__0");
					put(grammarAccess.getTerm3Access().getGroup_1_8(), "rule__Term3__Group_1_8__0");
					put(grammarAccess.getTerm3Access().getGroup_1_9(), "rule__Term3__Group_1_9__0");
					put(grammarAccess.getTerm3Access().getGroup_1_10(), "rule__Term3__Group_1_10__0");
					put(grammarAccess.getTerm3Access().getGroup_1_11(), "rule__Term3__Group_1_11__0");
					put(grammarAccess.getTerm3Access().getGroup_1_12(), "rule__Term3__Group_1_12__0");
					put(grammarAccess.getTerm3Access().getGroup_1_13(), "rule__Term3__Group_1_13__0");
					put(grammarAccess.getTerm3Access().getGroup_1_14(), "rule__Term3__Group_1_14__0");
					put(grammarAccess.getTerm4Access().getGroup(), "rule__Term4__Group__0");
					put(grammarAccess.getTerm4Access().getGroup_1_0(), "rule__Term4__Group_1_0__0");
					put(grammarAccess.getTerm4Access().getGroup_1_1(), "rule__Term4__Group_1_1__0");
					put(grammarAccess.getTerm5Access().getGroup(), "rule__Term5__Group__0");
					put(grammarAccess.getTerm5Access().getGroup_1_0(), "rule__Term5__Group_1_0__0");
					put(grammarAccess.getTerm5Access().getGroup_1_1(), "rule__Term5__Group_1_1__0");
					put(grammarAccess.getTerm6Access().getGroup(), "rule__Term6__Group__0");
					put(grammarAccess.getTerm6Access().getGroup_1(), "rule__Term6__Group_1__0");
					put(grammarAccess.getTerm7Access().getGroup(), "rule__Term7__Group__0");
					put(grammarAccess.getTerm7Access().getGroup_1_0(), "rule__Term7__Group_1_0__0");
					put(grammarAccess.getTerm7Access().getGroup_1_1(), "rule__Term7__Group_1_1__0");
					put(grammarAccess.getTerm8Access().getGroup(), "rule__Term8__Group__0");
					put(grammarAccess.getTerm8Access().getGroup_1_0(), "rule__Term8__Group_1_0__0");
					put(grammarAccess.getTerm8Access().getGroup_1_1(), "rule__Term8__Group_1_1__0");
					put(grammarAccess.getTerm8Access().getGroup_1_2(), "rule__Term8__Group_1_2__0");
					put(grammarAccess.getTerm8Access().getGroup_1_3(), "rule__Term8__Group_1_3__0");
					put(grammarAccess.getTerm9Access().getGroup_0(), "rule__Term9__Group_0__0");
					put(grammarAccess.getTerm10Access().getGroup_4(), "rule__Term10__Group_4__0");
					put(grammarAccess.getTerm10Access().getGroup_4_2_1(), "rule__Term10__Group_4_2_1__0");
					put(grammarAccess.getTerm10Access().getGroup_4_2_1_3(), "rule__Term10__Group_4_2_1_3__0");
					put(grammarAccess.getUserOperatorAccess().getGroup(), "rule__UserOperator__Group__0");
					put(grammarAccess.getUserOperatorAccess().getGroup_2(), "rule__UserOperator__Group_2__0");
					put(grammarAccess.getUserOperatorAccess().getGroup_2_1(), "rule__UserOperator__Group_2_1__0");
					put(grammarAccess.getOtherBuiltInOperatorAccess().getGroup_0(), "rule__OtherBuiltInOperator__Group_0__0");
					put(grammarAccess.getOtherBuiltInOperatorAccess().getGroup_1(), "rule__OtherBuiltInOperator__Group_1__0");
					put(grammarAccess.getMultisetConstantAccess().getGroup_0(), "rule__MultisetConstant__Group_0__0");
					put(grammarAccess.getMultisetConstantAccess().getGroup_1(), "rule__MultisetConstant__Group_1__0");
					put(grammarAccess.getDotAccess().getGroup(), "rule__Dot__Group__0");
					put(grammarAccess.getDotConstantAccess().getGroup(), "rule__DotConstant__Group__0");
					put(grammarAccess.getBooleanAccess().getGroup(), "rule__Boolean__Group__0");
					put(grammarAccess.getBooleanConstantAccess().getGroup(), "rule__BooleanConstant__Group__0");
					put(grammarAccess.getNumberAccess().getGroup_0(), "rule__Number__Group_0__0");
					put(grammarAccess.getNumberAccess().getGroup_1(), "rule__Number__Group_1__0");
					put(grammarAccess.getNumberAccess().getGroup_2(), "rule__Number__Group_2__0");
					put(grammarAccess.getNumberConstantAccess().getGroup(), "rule__NumberConstant__Group__0");
					put(grammarAccess.getNumberConstantAccess().getGroup_2(), "rule__NumberConstant__Group_2__0");
					put(grammarAccess.getFiniteEnumerationAccess().getGroup(), "rule__FiniteEnumeration__Group__0");
					put(grammarAccess.getFiniteEnumerationAccess().getGroup_3(), "rule__FiniteEnumeration__Group_3__0");
					put(grammarAccess.getCyclicEnumerationAccess().getGroup(), "rule__CyclicEnumeration__Group__0");
					put(grammarAccess.getCyclicEnumerationAccess().getGroup_3(), "rule__CyclicEnumeration__Group_3__0");
					put(grammarAccess.getCyclicEnumsBuiltInOperatorAccess().getGroup_0(), "rule__CyclicEnumsBuiltInOperator__Group_0__0");
					put(grammarAccess.getCyclicEnumsBuiltInOperatorAccess().getGroup_1(), "rule__CyclicEnumsBuiltInOperator__Group_1__0");
					put(grammarAccess.getFiniteIntRangeAccess().getGroup(), "rule__FiniteIntRange__Group__0");
					put(grammarAccess.getFiniteIntRangeConstantAccess().getGroup(), "rule__FiniteIntRangeConstant__Group__0");
					put(grammarAccess.getPartitionAccess().getGroup(), "rule__Partition__Group__0");
					put(grammarAccess.getPartitionAccess().getGroup_6(), "rule__Partition__Group_6__0");
					put(grammarAccess.getPartitionElementAccess().getGroup(), "rule__PartitionElement__Group__0");
					put(grammarAccess.getPartitionElementAccess().getGroup_3(), "rule__PartitionElement__Group_3__0");
					put(grammarAccess.getPartitionsBuiltInOperatorAccess().getGroup(), "rule__PartitionsBuiltInOperator__Group__0");
					put(grammarAccess.getStringSortAccess().getGroup(), "rule__StringSort__Group__0");
					put(grammarAccess.getStringsBuiltInOperatorAccess().getGroup_0(), "rule__StringsBuiltInOperator__Group_0__0");
					put(grammarAccess.getStringsBuiltInOperatorAccess().getGroup_1(), "rule__StringsBuiltInOperator__Group_1__0");
					put(grammarAccess.getStringsBuiltInOperatorAccess().getGroup_2(), "rule__StringsBuiltInOperator__Group_2__0");
					put(grammarAccess.getListSortAccess().getGroup(), "rule__ListSort__Group__0");
					put(grammarAccess.getListsBuiltInOperatorAccess().getGroup_0(), "rule__ListsBuiltInOperator__Group_0__0");
					put(grammarAccess.getListsBuiltInOperatorAccess().getGroup_1(), "rule__ListsBuiltInOperator__Group_1__0");
					put(grammarAccess.getListsBuiltInOperatorAccess().getGroup_2(), "rule__ListsBuiltInOperator__Group_2__0");
					put(grammarAccess.getListsBuiltInOperatorAccess().getGroup_3(), "rule__ListsBuiltInOperator__Group_3__0");
					put(grammarAccess.getListsBuiltInOperatorAccess().getGroup_4(), "rule__ListsBuiltInOperator__Group_4__0");
					put(grammarAccess.getListsBuiltInOperatorAccess().getGroup_5(), "rule__ListsBuiltInOperator__Group_5__0");
					put(grammarAccess.getListsBuiltInOperatorAccess().getGroup_5_5(), "rule__ListsBuiltInOperator__Group_5_5__0");
					put(grammarAccess.getListsBuiltInOperatorAccess().getGroup_5_5_1(), "rule__ListsBuiltInOperator__Group_5_5_1__0");
					put(grammarAccess.getListConstantAccess().getGroup(), "rule__ListConstant__Group__0");
					put(grammarAccess.getArbitraryOperatorAccess().getGroup(), "rule__ArbitraryOperator__Group__0");
					put(grammarAccess.getArbitraryOperatorAccess().getGroup_2(), "rule__ArbitraryOperator__Group_2__0");
					put(grammarAccess.getArbitraryOperatorAccess().getGroup_2_1(), "rule__ArbitraryOperator__Group_2_1__0");
					put(grammarAccess.getDocumentAccess().getDeclarationsAssignment_0_0(), "rule__Document__DeclarationsAssignment_0_0");
					put(grammarAccess.getDocumentAccess().getTermAssignment_1_0(), "rule__Document__TermAssignment_1_0");
					put(grammarAccess.getDeclarationsAccess().getDeclarationAssignment_1_0_1(), "rule__Declarations__DeclarationAssignment_1_0_1");
					put(grammarAccess.getDeclarationsAccess().getDeclarationAssignment_1_0_2_1(), "rule__Declarations__DeclarationAssignment_1_0_2_1");
					put(grammarAccess.getDeclarationsAccess().getDeclarationAssignment_1_1_1(), "rule__Declarations__DeclarationAssignment_1_1_1");
					put(grammarAccess.getDeclarationsAccess().getDeclarationAssignment_1_1_2_1(), "rule__Declarations__DeclarationAssignment_1_1_2_1");
					put(grammarAccess.getDeclarationsAccess().getDeclarationAssignment_1_2_1(), "rule__Declarations__DeclarationAssignment_1_2_1");
					put(grammarAccess.getDeclarationsAccess().getDeclarationAssignment_1_2_2_1(), "rule__Declarations__DeclarationAssignment_1_2_2_1");
					put(grammarAccess.getDeclarationsAccess().getDeclarationAssignment_1_3_1(), "rule__Declarations__DeclarationAssignment_1_3_1");
					put(grammarAccess.getDeclarationsAccess().getDeclarationAssignment_1_3_2_1(), "rule__Declarations__DeclarationAssignment_1_3_2_1");
					put(grammarAccess.getDeclarationsAccess().getDeclarationAssignment_1_4_1(), "rule__Declarations__DeclarationAssignment_1_4_1");
					put(grammarAccess.getDeclarationsAccess().getDeclarationAssignment_1_4_2_1(), "rule__Declarations__DeclarationAssignment_1_4_2_1");
					put(grammarAccess.getVariableDeclAccess().getNameAssignment_0(), "rule__VariableDecl__NameAssignment_0");
					put(grammarAccess.getVariableDeclAccess().getSortAssignment_2(), "rule__VariableDecl__SortAssignment_2");
					put(grammarAccess.getNamedSortAccess().getNameAssignment_0(), "rule__NamedSort__NameAssignment_0");
					put(grammarAccess.getNamedSortAccess().getDefAssignment_2(), "rule__NamedSort__DefAssignment_2");
					put(grammarAccess.getNamedOperatorAccess().getNameAssignment_0(), "rule__NamedOperator__NameAssignment_0");
					put(grammarAccess.getNamedOperatorAccess().getParametersAssignment_2_0(), "rule__NamedOperator__ParametersAssignment_2_0");
					put(grammarAccess.getNamedOperatorAccess().getParametersAssignment_2_1_1(), "rule__NamedOperator__ParametersAssignment_2_1_1");
					put(grammarAccess.getNamedOperatorAccess().getDefAssignment_5(), "rule__NamedOperator__DefAssignment_5");
					put(grammarAccess.getMultiSetSortAccess().getBasisAssignment_2(), "rule__MultiSetSort__BasisAssignment_2");
					put(grammarAccess.getProductSortAccess().getElementSortAssignment_2_0(), "rule__ProductSort__ElementSortAssignment_2_0");
					put(grammarAccess.getProductSortAccess().getElementSortAssignment_2_1_1(), "rule__ProductSort__ElementSortAssignment_2_1_1");
					put(grammarAccess.getUserSortAccess().getNameAssignment(), "rule__UserSort__NameAssignment");
					put(grammarAccess.getTerm1Access().getSubtermAssignment_1_0_2(), "rule__Term1__SubtermAssignment_1_0_2");
					put(grammarAccess.getTerm1Access().getSubtermAssignment_1_1_2(), "rule__Term1__SubtermAssignment_1_1_2");
					put(grammarAccess.getTerm2Access().getSubtermAssignment_1_2(), "rule__Term2__SubtermAssignment_1_2");
					put(grammarAccess.getTerm3Access().getSubtermAssignment_1_0_2(), "rule__Term3__SubtermAssignment_1_0_2");
					put(grammarAccess.getTerm3Access().getSubtermAssignment_1_1_2(), "rule__Term3__SubtermAssignment_1_1_2");
					put(grammarAccess.getTerm3Access().getSubtermAssignment_1_2_2(), "rule__Term3__SubtermAssignment_1_2_2");
					put(grammarAccess.getTerm3Access().getSubtermAssignment_1_3_2(), "rule__Term3__SubtermAssignment_1_3_2");
					put(grammarAccess.getTerm3Access().getSubtermAssignment_1_4_2(), "rule__Term3__SubtermAssignment_1_4_2");
					put(grammarAccess.getTerm3Access().getSubtermAssignment_1_5_2(), "rule__Term3__SubtermAssignment_1_5_2");
					put(grammarAccess.getTerm3Access().getSubtermAssignment_1_6_2(), "rule__Term3__SubtermAssignment_1_6_2");
					put(grammarAccess.getTerm3Access().getSubtermAssignment_1_7_2(), "rule__Term3__SubtermAssignment_1_7_2");
					put(grammarAccess.getTerm3Access().getSubtermAssignment_1_8_2(), "rule__Term3__SubtermAssignment_1_8_2");
					put(grammarAccess.getTerm3Access().getSubtermAssignment_1_9_2(), "rule__Term3__SubtermAssignment_1_9_2");
					put(grammarAccess.getTerm3Access().getSubtermAssignment_1_10_2(), "rule__Term3__SubtermAssignment_1_10_2");
					put(grammarAccess.getTerm3Access().getSubtermAssignment_1_11_2(), "rule__Term3__SubtermAssignment_1_11_2");
					put(grammarAccess.getTerm3Access().getSubtermAssignment_1_12_2(), "rule__Term3__SubtermAssignment_1_12_2");
					put(grammarAccess.getTerm3Access().getSubtermAssignment_1_13_2(), "rule__Term3__SubtermAssignment_1_13_2");
					put(grammarAccess.getTerm3Access().getSubtermAssignment_1_14_2(), "rule__Term3__SubtermAssignment_1_14_2");
					put(grammarAccess.getTerm4Access().getSubtermAssignment_1_0_2(), "rule__Term4__SubtermAssignment_1_0_2");
					put(grammarAccess.getTerm4Access().getSubtermAssignment_1_1_2(), "rule__Term4__SubtermAssignment_1_1_2");
					put(grammarAccess.getTerm5Access().getSubtermAssignment_1_0_2(), "rule__Term5__SubtermAssignment_1_0_2");
					put(grammarAccess.getTerm5Access().getSubtermAssignment_1_1_2(), "rule__Term5__SubtermAssignment_1_1_2");
					put(grammarAccess.getTerm6Access().getSubtermAssignment_1_2(), "rule__Term6__SubtermAssignment_1_2");
					put(grammarAccess.getTerm7Access().getSubtermAssignment_1_0_2(), "rule__Term7__SubtermAssignment_1_0_2");
					put(grammarAccess.getTerm7Access().getSubtermAssignment_1_1_2(), "rule__Term7__SubtermAssignment_1_1_2");
					put(grammarAccess.getTerm8Access().getSubtermAssignment_1_0_2(), "rule__Term8__SubtermAssignment_1_0_2");
					put(grammarAccess.getTerm8Access().getSubtermAssignment_1_1_2(), "rule__Term8__SubtermAssignment_1_1_2");
					put(grammarAccess.getTerm8Access().getSubtermAssignment_1_2_2(), "rule__Term8__SubtermAssignment_1_2_2");
					put(grammarAccess.getTerm8Access().getSubtermAssignment_1_3_2(), "rule__Term8__SubtermAssignment_1_3_2");
					put(grammarAccess.getTerm9Access().getSubtermAssignment_0_2(), "rule__Term9__SubtermAssignment_0_2");
					put(grammarAccess.getTerm10Access().getSubtermAssignment_4_2_1_2(), "rule__Term10__SubtermAssignment_4_2_1_2");
					put(grammarAccess.getTerm10Access().getSubtermAssignment_4_2_1_3_1(), "rule__Term10__SubtermAssignment_4_2_1_3_1");
					put(grammarAccess.getVariableAccess().getNameAssignment(), "rule__Variable__NameAssignment");
					put(grammarAccess.getUserOperatorAccess().getNameAssignment_0(), "rule__UserOperator__NameAssignment_0");
					put(grammarAccess.getUserOperatorAccess().getSubtermAssignment_2_0(), "rule__UserOperator__SubtermAssignment_2_0");
					put(grammarAccess.getUserOperatorAccess().getSubtermAssignment_2_1_1(), "rule__UserOperator__SubtermAssignment_2_1_1");
					put(grammarAccess.getOtherBuiltInOperatorAccess().getSubtermAssignment_0_2(), "rule__OtherBuiltInOperator__SubtermAssignment_0_2");
					put(grammarAccess.getOtherBuiltInOperatorAccess().getSubtermAssignment_1_2(), "rule__OtherBuiltInOperator__SubtermAssignment_1_2");
					put(grammarAccess.getOtherBuiltInOperatorAccess().getSubtermAssignment_1_4(), "rule__OtherBuiltInOperator__SubtermAssignment_1_4");
					put(grammarAccess.getMultisetConstantAccess().getRefsortAssignment_0_3(), "rule__MultisetConstant__RefsortAssignment_0_3");
					put(grammarAccess.getMultisetConstantAccess().getRefsortAssignment_1_3(), "rule__MultisetConstant__RefsortAssignment_1_3");
					put(grammarAccess.getBooleanConstantAccess().getValueAssignment_1_0(), "rule__BooleanConstant__ValueAssignment_1_0");
					put(grammarAccess.getNumberConstantAccess().getValueAssignment_1(), "rule__NumberConstant__ValueAssignment_1");
					put(grammarAccess.getNumberConstantAccess().getTypeAssignment_2_1(), "rule__NumberConstant__TypeAssignment_2_1");
					put(grammarAccess.getFiniteEnumerationAccess().getElementsAssignment_2(), "rule__FiniteEnumeration__ElementsAssignment_2");
					put(grammarAccess.getFiniteEnumerationAccess().getElementsAssignment_3_1(), "rule__FiniteEnumeration__ElementsAssignment_3_1");
					put(grammarAccess.getFEConstantAccess().getNameAssignment(), "rule__FEConstant__NameAssignment");
					put(grammarAccess.getCyclicEnumerationAccess().getElementsAssignment_2(), "rule__CyclicEnumeration__ElementsAssignment_2");
					put(grammarAccess.getCyclicEnumerationAccess().getElementsAssignment_3_1(), "rule__CyclicEnumeration__ElementsAssignment_3_1");
					put(grammarAccess.getCyclicEnumsBuiltInOperatorAccess().getSubtermAssignment_0_3(), "rule__CyclicEnumsBuiltInOperator__SubtermAssignment_0_3");
					put(grammarAccess.getCyclicEnumsBuiltInOperatorAccess().getSubtermAssignment_1_3(), "rule__CyclicEnumsBuiltInOperator__SubtermAssignment_1_3");
					put(grammarAccess.getFiniteIntRangeAccess().getStartAssignment_1(), "rule__FiniteIntRange__StartAssignment_1");
					put(grammarAccess.getFiniteIntRangeAccess().getEndAssignment_3(), "rule__FiniteIntRange__EndAssignment_3");
					put(grammarAccess.getFiniteIntRangeConstantAccess().getValueAssignment_0(), "rule__FiniteIntRangeConstant__ValueAssignment_0");
					put(grammarAccess.getFiniteIntRangeConstantAccess().getRangeAssignment_1(), "rule__FiniteIntRangeConstant__RangeAssignment_1");
					put(grammarAccess.getPartitionAccess().getDefAssignment_1(), "rule__Partition__DefAssignment_1");
					put(grammarAccess.getPartitionAccess().getNameAssignment_3(), "rule__Partition__NameAssignment_3");
					put(grammarAccess.getPartitionAccess().getPartitionElementsAssignment_5(), "rule__Partition__PartitionElementsAssignment_5");
					put(grammarAccess.getPartitionAccess().getPartitionElementsAssignment_6_1(), "rule__Partition__PartitionElementsAssignment_6_1");
					put(grammarAccess.getPartitionElementAccess().getNameAssignment_0(), "rule__PartitionElement__NameAssignment_0");
					put(grammarAccess.getPartitionElementAccess().getPartitionelementconstantAssignment_2(), "rule__PartitionElement__PartitionelementconstantAssignment_2");
					put(grammarAccess.getPartitionElementAccess().getPartitionelementconstantAssignment_3_1(), "rule__PartitionElement__PartitionelementconstantAssignment_3_1");
					put(grammarAccess.getPartitionsBuiltInOperatorAccess().getNameAssignment_3(), "rule__PartitionsBuiltInOperator__NameAssignment_3");
					put(grammarAccess.getPartitionsBuiltInOperatorAccess().getSubtermAssignment_5(), "rule__PartitionsBuiltInOperator__SubtermAssignment_5");
					put(grammarAccess.getStringsBuiltInOperatorAccess().getSubtermAssignment_0_3(), "rule__StringsBuiltInOperator__SubtermAssignment_0_3");
					put(grammarAccess.getStringsBuiltInOperatorAccess().getSubtermAssignment_0_5(), "rule__StringsBuiltInOperator__SubtermAssignment_0_5");
					put(grammarAccess.getStringsBuiltInOperatorAccess().getSubtermAssignment_1_3(), "rule__StringsBuiltInOperator__SubtermAssignment_1_3");
					put(grammarAccess.getStringsBuiltInOperatorAccess().getStartAssignment_2_3(), "rule__StringsBuiltInOperator__StartAssignment_2_3");
					put(grammarAccess.getStringsBuiltInOperatorAccess().getLengthAssignment_2_5(), "rule__StringsBuiltInOperator__LengthAssignment_2_5");
					put(grammarAccess.getStringsBuiltInOperatorAccess().getSubtermAssignment_2_7(), "rule__StringsBuiltInOperator__SubtermAssignment_2_7");
					put(grammarAccess.getStringConstantAccess().getValueAssignment(), "rule__StringConstant__ValueAssignment");
					put(grammarAccess.getListSortAccess().getBasisAssignment_2(), "rule__ListSort__BasisAssignment_2");
					put(grammarAccess.getListsBuiltInOperatorAccess().getSubtermAssignment_0_3(), "rule__ListsBuiltInOperator__SubtermAssignment_0_3");
					put(grammarAccess.getListsBuiltInOperatorAccess().getSubtermAssignment_0_5(), "rule__ListsBuiltInOperator__SubtermAssignment_0_5");
					put(grammarAccess.getListsBuiltInOperatorAccess().getSubtermAssignment_1_3(), "rule__ListsBuiltInOperator__SubtermAssignment_1_3");
					put(grammarAccess.getListsBuiltInOperatorAccess().getSubtermAssignment_1_5(), "rule__ListsBuiltInOperator__SubtermAssignment_1_5");
					put(grammarAccess.getListsBuiltInOperatorAccess().getSubtermAssignment_2_3(), "rule__ListsBuiltInOperator__SubtermAssignment_2_3");
					put(grammarAccess.getListsBuiltInOperatorAccess().getStartAssignment_3_3(), "rule__ListsBuiltInOperator__StartAssignment_3_3");
					put(grammarAccess.getListsBuiltInOperatorAccess().getLengthAssignment_3_5(), "rule__ListsBuiltInOperator__LengthAssignment_3_5");
					put(grammarAccess.getListsBuiltInOperatorAccess().getSubtermAssignment_3_7(), "rule__ListsBuiltInOperator__SubtermAssignment_3_7");
					put(grammarAccess.getListsBuiltInOperatorAccess().getIndexAssignment_4_3(), "rule__ListsBuiltInOperator__IndexAssignment_4_3");
					put(grammarAccess.getListsBuiltInOperatorAccess().getSubtermAssignment_4_5(), "rule__ListsBuiltInOperator__SubtermAssignment_4_5");
					put(grammarAccess.getListsBuiltInOperatorAccess().getRefsortAssignment_5_3(), "rule__ListsBuiltInOperator__RefsortAssignment_5_3");
					put(grammarAccess.getListsBuiltInOperatorAccess().getSubtermAssignment_5_5_0(), "rule__ListsBuiltInOperator__SubtermAssignment_5_5_0");
					put(grammarAccess.getListsBuiltInOperatorAccess().getSubtermAssignment_5_5_1_1(), "rule__ListsBuiltInOperator__SubtermAssignment_5_5_1_1");
					put(grammarAccess.getListConstantAccess().getRefsortAssignment_2(), "rule__ListConstant__RefsortAssignment_2");
					put(grammarAccess.getArbitrarySortAccess().getNameAssignment(), "rule__ArbitrarySort__NameAssignment");
					put(grammarAccess.getArbitraryOperatorAccess().getNameAssignment_0(), "rule__ArbitraryOperator__NameAssignment_0");
					put(grammarAccess.getArbitraryOperatorAccess().getInputAssignment_2_0(), "rule__ArbitraryOperator__InputAssignment_2_0");
					put(grammarAccess.getArbitraryOperatorAccess().getInputAssignment_2_1_1(), "rule__ArbitraryOperator__InputAssignment_2_1_1");
					put(grammarAccess.getArbitraryOperatorAccess().getOutputAssignment_4(), "rule__ArbitraryOperator__OutputAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.ui.contentassist.antlr.internal.InternalHLPNGInscriptionLanguageParser typedParser = (org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.ui.contentassist.antlr.internal.InternalHLPNGInscriptionLanguageParser) parser;
			typedParser.entryRuleDocument();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public HLPNGInscriptionLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(HLPNGInscriptionLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

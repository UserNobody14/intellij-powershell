// This is a generated file. Not intended for manual editing.
package com.intellij.plugin.powershell.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.plugin.powershell.psi.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PwShellScriptBlockImplGen extends PwShellPsiElementImpl implements PwShellScriptBlock {

  public PwShellScriptBlockImplGen(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PwShellVisitor visitor) {
    visitor.visitScriptBlock(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PwShellVisitor) accept((PwShellVisitor) visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PwShellCommandArgument> getCommandArgumentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PwShellCommandArgument.class);
  }

  @Override
  @NotNull
  public List<PwShellDataStatement> getDataStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PwShellDataStatement.class);
  }

  @Override
  @NotNull
  public List<PwShellExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PwShellExpression.class);
  }

  @Override
  @NotNull
  public List<PwShellFlowControlStatement> getFlowControlStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PwShellFlowControlStatement.class);
  }

  @Override
  @NotNull
  public List<PwShellFunctionStatement> getFunctionStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PwShellFunctionStatement.class);
  }

  @Override
  @NotNull
  public List<PwShellInlinescriptStatement> getInlinescriptStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PwShellInlinescriptStatement.class);
  }

  @Override
  @NotNull
  public List<PwShellParallelStatement> getParallelStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PwShellParallelStatement.class);
  }

  @Override
  @NotNull
  public List<PwShellPipeline> getPipelineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PwShellPipeline.class);
  }

  @Override
  @NotNull
  public List<PwShellSep> getSepList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PwShellSep.class);
  }

  @Override
  @NotNull
  public List<PwShellSequenceStatement> getSequenceStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PwShellSequenceStatement.class);
  }

  @Override
  @NotNull
  public List<PwShellSimpleName> getSimpleNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PwShellSimpleName.class);
  }

  @Override
  @NotNull
  public List<PwShellStatementBlock> getStatementBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PwShellStatementBlock.class);
  }

  @Override
  @NotNull
  public List<PwShellTrapStatement> getTrapStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PwShellTrapStatement.class);
  }

  @Override
  @NotNull
  public List<PwShellTryStatement> getTryStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PwShellTryStatement.class);
  }

  @Override
  @NotNull
  public List<PwShellTypeLiteral> getTypeLiteralList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PwShellTypeLiteral.class);
  }

  @Override
  @NotNull
  public List<PwShellTypeName> getTypeNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PwShellTypeName.class);
  }

  @Override
  @NotNull
  public List<PwShellVariable> getVariableList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PwShellVariable.class);
  }

  @Override
  @NotNull
  public List<PwShellWhileStatement> getWhileStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PwShellWhileStatement.class);
  }

}

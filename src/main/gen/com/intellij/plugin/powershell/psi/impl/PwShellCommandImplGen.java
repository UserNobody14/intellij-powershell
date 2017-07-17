// This is a generated file. Not intended for manual editing.
package com.intellij.plugin.powershell.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.plugin.powershell.psi.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PwShellCommandImplGen extends PwShellPsiElementImpl implements PwShellCommand {

  public PwShellCommandImplGen(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PwShellVisitor visitor) {
    visitor.visitCommand(this);
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
  @Nullable
  public PwShellCommandName getCommandName() {
    return findChildByClass(PwShellCommandName.class);
  }

  @Override
  @NotNull
  public List<PwShellCommandParameter> getCommandParameterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PwShellCommandParameter.class);
  }

  @Override
  @NotNull
  public List<PwShellExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PwShellExpression.class);
  }

}

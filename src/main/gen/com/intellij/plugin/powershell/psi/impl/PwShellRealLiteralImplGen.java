// This is a generated file. Not intended for manual editing.
package com.intellij.plugin.powershell.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.plugin.powershell.psi.PwShellRealLiteral;
import com.intellij.plugin.powershell.psi.PwShellVisitor;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

import static com.intellij.plugin.powershell.psi.PowerShellTypes.DIGITS;

public class PwShellRealLiteralImplGen extends PwShellPsiElementImpl implements PwShellRealLiteral {

  public PwShellRealLiteralImplGen(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PwShellVisitor visitor) {
    visitor.visitRealLiteral(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PwShellVisitor) accept((PwShellVisitor) visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getDigits() {
    return findNotNullChildByType(DIGITS);
  }

}

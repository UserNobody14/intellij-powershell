// This is a generated file. Not intended for manual editing.
package com.intellij.plugin.powershell.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PowerShellPathExpression extends PowerShellExpression {

  @Nullable
  PowerShellPathExpression getPathExpression();

  @NotNull
  List<PowerShellPathItem> getPathItemList();

}

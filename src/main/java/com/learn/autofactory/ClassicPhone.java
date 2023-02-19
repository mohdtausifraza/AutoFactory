package com.learn.autofactory;

import com.google.auto.factory.AutoFactory;
import com.google.auto.factory.Provided;

public class ClassicPhone {
  private final String dialpad;
  private final String ringer;
  private String otherParts;

  @AutoFactory
  public ClassicPhone(@Provided String dialpad, @Provided String ringer){
    this.dialpad = dialpad;
    this.ringer =ringer;
  }

  @AutoFactory
  public ClassicPhone(String otherParts){
    this("default Dialpad", "defaultRinger");
    this.otherParts = otherParts;
  }
}

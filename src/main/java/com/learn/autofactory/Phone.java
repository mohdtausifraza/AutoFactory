package com.learn.autofactory;

import com.google.auto.factory.AutoFactory;
import com.google.auto.factory.Provided;
import javax.inject.Named;

@AutoFactory(className = "SamsungFactory",
    allowSubclasses = true,
    implementing = CustomStorage.class)
public class Phone {
  private final Camera camera;
  private final String otherParts;

  //@AutoFactory
  public Phone(@Provided @Named("sony") Camera camera, String otherParts){
    this.camera = camera;
    this.otherParts = otherParts;
  }

  public Phone(int romSize){
    this(new Camera(), "DefaultOtherParts");
  }
}

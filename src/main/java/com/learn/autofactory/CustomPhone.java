package com.learn.autofactory;

import com.google.auto.factory.AutoFactory;

@AutoFactory(extending = AbstractFactory.class)
public class CustomPhone {
  private final String band;

  public CustomPhone(String band){
    this.band = band;
  }
}

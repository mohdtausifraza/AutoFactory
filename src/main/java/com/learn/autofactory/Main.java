package com.learn.autofactory;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

  public static void main(String[] args) {
    System.out.println("Creating Phone Object Using AutoFactory");
//    SamsungFactory phoneFactory = new SamsungFactory(
//        () -> new Camera()
//    );
    Injector injector = Guice.createInjector(new SonyCameraModule());
    SamsungFactory injectedFactory = injector.getInstance(SamsungFactory.class);
    Phone xperia = injectedFactory.create("xperia");
  }
}
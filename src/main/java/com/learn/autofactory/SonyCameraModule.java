package com.learn.autofactory;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import javax.inject.Named;

public class SonyCameraModule extends AbstractModule {

  @Named("sony")
  @Provides
  Camera cameraProvider(){
    return new Camera();
  }
}

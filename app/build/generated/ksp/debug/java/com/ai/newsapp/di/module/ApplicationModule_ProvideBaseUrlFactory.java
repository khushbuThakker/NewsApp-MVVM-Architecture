package com.ai.newsapp.di.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata("com.ai.newsapp.di.BaseUrl")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class ApplicationModule_ProvideBaseUrlFactory implements Factory<String> {
  private final ApplicationModule module;

  private ApplicationModule_ProvideBaseUrlFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideBaseUrl(module);
  }

  public static ApplicationModule_ProvideBaseUrlFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideBaseUrlFactory(module);
  }

  public static String provideBaseUrl(ApplicationModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideBaseUrl());
  }
}

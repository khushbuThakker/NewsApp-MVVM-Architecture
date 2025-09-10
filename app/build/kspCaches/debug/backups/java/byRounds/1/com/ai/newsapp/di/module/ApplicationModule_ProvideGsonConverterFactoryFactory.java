package com.ai.newsapp.di.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import retrofit2.converter.gson.GsonConverterFactory;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
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
public final class ApplicationModule_ProvideGsonConverterFactoryFactory implements Factory<GsonConverterFactory> {
  private final ApplicationModule module;

  private ApplicationModule_ProvideGsonConverterFactoryFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public GsonConverterFactory get() {
    return provideGsonConverterFactory(module);
  }

  public static ApplicationModule_ProvideGsonConverterFactoryFactory create(
      ApplicationModule module) {
    return new ApplicationModule_ProvideGsonConverterFactoryFactory(module);
  }

  public static GsonConverterFactory provideGsonConverterFactory(ApplicationModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideGsonConverterFactory());
  }
}

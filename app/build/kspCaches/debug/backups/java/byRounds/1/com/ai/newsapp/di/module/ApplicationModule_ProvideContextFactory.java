package com.ai.newsapp.di.module;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata("com.ai.newsapp.di.ApplicationContext")
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
public final class ApplicationModule_ProvideContextFactory implements Factory<Context> {
  private final ApplicationModule module;

  private ApplicationModule_ProvideContextFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return provideContext(module);
  }

  public static ApplicationModule_ProvideContextFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideContextFactory(module);
  }

  public static Context provideContext(ApplicationModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideContext());
  }
}

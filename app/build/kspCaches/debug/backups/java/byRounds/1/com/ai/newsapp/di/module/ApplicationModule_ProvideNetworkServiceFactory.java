package com.ai.newsapp.di.module;

import com.ai.newsapp.data.service.NetworkService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import retrofit2.converter.gson.GsonConverterFactory;

@ScopeMetadata("javax.inject.Singleton")
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
public final class ApplicationModule_ProvideNetworkServiceFactory implements Factory<NetworkService> {
  private final ApplicationModule module;

  private final Provider<String> baseUrlProvider;

  private final Provider<GsonConverterFactory> gsonConverterFactoryProvider;

  private ApplicationModule_ProvideNetworkServiceFactory(ApplicationModule module,
      Provider<String> baseUrlProvider,
      Provider<GsonConverterFactory> gsonConverterFactoryProvider) {
    this.module = module;
    this.baseUrlProvider = baseUrlProvider;
    this.gsonConverterFactoryProvider = gsonConverterFactoryProvider;
  }

  @Override
  public NetworkService get() {
    return provideNetworkService(module, baseUrlProvider.get(), gsonConverterFactoryProvider.get());
  }

  public static ApplicationModule_ProvideNetworkServiceFactory create(ApplicationModule module,
      Provider<String> baseUrlProvider,
      Provider<GsonConverterFactory> gsonConverterFactoryProvider) {
    return new ApplicationModule_ProvideNetworkServiceFactory(module, baseUrlProvider, gsonConverterFactoryProvider);
  }

  public static NetworkService provideNetworkService(ApplicationModule instance, String baseUrl,
      GsonConverterFactory gsonConverterFactory) {
    return Preconditions.checkNotNullFromProvides(instance.provideNetworkService(baseUrl, gsonConverterFactory));
  }
}

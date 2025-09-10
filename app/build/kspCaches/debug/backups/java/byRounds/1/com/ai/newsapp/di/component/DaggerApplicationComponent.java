package com.ai.newsapp.di.component;

import android.content.Context;
import com.ai.newsapp.NewsAppApplication;
import com.ai.newsapp.data.datasource.TopHeadlineDataSource;
import com.ai.newsapp.data.service.NetworkService;
import com.ai.newsapp.di.module.ApplicationModule;
import com.ai.newsapp.di.module.ApplicationModule_ProvideBaseUrlFactory;
import com.ai.newsapp.di.module.ApplicationModule_ProvideContextFactory;
import com.ai.newsapp.di.module.ApplicationModule_ProvideGsonConverterFactoryFactory;
import com.ai.newsapp.di.module.ApplicationModule_ProvideNetworkServiceFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import javax.annotation.processing.Generated;
import retrofit2.converter.gson.GsonConverterFactory;

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
public final class DaggerApplicationComponent {
  private DaggerApplicationComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationModule applicationModule;

    private Builder() {
    }

    public Builder applicationModule(ApplicationModule applicationModule) {
      this.applicationModule = Preconditions.checkNotNull(applicationModule);
      return this;
    }

    public ApplicationComponent build() {
      Preconditions.checkBuilderRequirement(applicationModule, ApplicationModule.class);
      return new ApplicationComponentImpl(applicationModule);
    }
  }

  private static final class ApplicationComponentImpl implements ApplicationComponent {
    private final ApplicationModule applicationModule;

    private final ApplicationComponentImpl applicationComponentImpl = this;

    Provider<String> provideBaseUrlProvider;

    Provider<GsonConverterFactory> provideGsonConverterFactoryProvider;

    Provider<NetworkService> provideNetworkServiceProvider;

    ApplicationComponentImpl(ApplicationModule applicationModuleParam) {
      this.applicationModule = applicationModuleParam;
      initialize(applicationModuleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationModule applicationModuleParam) {
      this.provideBaseUrlProvider = ApplicationModule_ProvideBaseUrlFactory.create(applicationModuleParam);
      this.provideGsonConverterFactoryProvider = DoubleCheck.provider(ApplicationModule_ProvideGsonConverterFactoryFactory.create(applicationModuleParam));
      this.provideNetworkServiceProvider = DoubleCheck.provider(ApplicationModule_ProvideNetworkServiceFactory.create(applicationModuleParam, provideBaseUrlProvider, provideGsonConverterFactoryProvider));
    }

    @Override
    public void inject(NewsAppApplication application) {
    }

    @Override
    public Context getContext() {
      return ApplicationModule_ProvideContextFactory.provideContext(applicationModule);
    }

    @Override
    public NetworkService getNetworkService() {
      return provideNetworkServiceProvider.get();
    }

    @Override
    public TopHeadlineDataSource getTopHeadlineRepository() {
      return new TopHeadlineDataSource(provideNetworkServiceProvider.get());
    }
  }
}

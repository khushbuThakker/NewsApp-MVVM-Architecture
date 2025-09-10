package com.ai.newsapp.data.datasource;

import com.ai.newsapp.data.service.NetworkService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
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
public final class TopHeadlineDataSource_Factory implements Factory<TopHeadlineDataSource> {
  private final Provider<NetworkService> networkServiceProvider;

  private TopHeadlineDataSource_Factory(Provider<NetworkService> networkServiceProvider) {
    this.networkServiceProvider = networkServiceProvider;
  }

  @Override
  public TopHeadlineDataSource get() {
    return newInstance(networkServiceProvider.get());
  }

  public static TopHeadlineDataSource_Factory create(
      Provider<NetworkService> networkServiceProvider) {
    return new TopHeadlineDataSource_Factory(networkServiceProvider);
  }

  public static TopHeadlineDataSource newInstance(NetworkService networkService) {
    return new TopHeadlineDataSource(networkService);
  }
}

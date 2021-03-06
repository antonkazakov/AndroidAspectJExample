package com.archinamon.example.dagger;

import android.content.Context;
import com.archinamon.example.BuildConfig;
import com.archinamon.example.MyApplication;
import com.squareup.picasso.Picasso;
import dagger.Module;
import dagger.Provides;

/**
 * Here it provides the dependencies those are used in the whole scope of your MyApp
 */
@Module
public class MyAppScopeModule {

    @Provides
    Picasso providesPicasso(@ForApplication Context context) {
        Picasso picasso = Picasso.with(context);

        // some app-wide common settings
        picasso.setDebugging(BuildConfig.DEBUG);

        return picasso;
    }
}
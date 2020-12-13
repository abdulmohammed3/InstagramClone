package com.example.myapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Q34koVrrvETM0f5xXIPyaCTft7O3REVTfiN5o6Ct")
                .clientKey("dwGOJIo16KLZu5CR8jbTTHXYTuIvUXDEumLHJZC0")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

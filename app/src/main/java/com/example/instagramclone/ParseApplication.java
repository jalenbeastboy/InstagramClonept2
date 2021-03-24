package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("N4cx6BGRGpqZxFh3817ap9lcHLpMBozRTeZr3Gn5")
                .clientKey("Kh1arHeOkVuyuGTxM2Dx4hT0vgBo6SsbZJcC3w85")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

package io.supercharge.identitytest;

import android.app.Application;

import de.identity.identityvideo.sdk.IdentityVideoSDK;

public class TestApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        IdentityVideoSDK.initialize(this);
        IdentityVideoSDK.setMode(IdentityVideoSDK.Mode.STAGING);
    }
}

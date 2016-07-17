package testing.fcm;

import android.app.Application;

import com.batch.android.Batch;
import com.batch.android.Config;

/**
 * Created by shroof on 6/30/16.
 */
public class MyApp extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        Batch.Push.setGCMSenderId("607513766055");

        // TODO : switch to live Batch Api Key before shipping
        Batch.setConfig(new Config("DEV577512598AF04334F5AE797D35A")); // devloppement
        // Batch.setConfig(new Config("577512598902319CAB911B4B8A28AA")); // live
    }
}
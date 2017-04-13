package com.example.iuliia.firebasenotify;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
public class MyFBMessageService extends FirebaseMessagingService {

    String TAG = "firebasenotify";

    public MyFBMessageService() {
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage){
        Log.d(TAG, "Test Notification Title: " + remoteMessage.getNotification().getTitle());
        Log.d(TAG, "Test Notification Message: "+ remoteMessage.getNotification().getBody());
    }
}

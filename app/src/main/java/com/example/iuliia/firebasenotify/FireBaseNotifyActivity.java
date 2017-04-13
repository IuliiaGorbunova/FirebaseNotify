package com.example.iuliia.firebasenotify;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FireBaseNotifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_base_notify);
        Bundle customData =getIntent().getExtras();
        if(customData != null) {
            TextView textView = (TextView)
                    findViewById(R.id.myTextView);
            textView.setText(customData.getString("MyKey1"));
        }


    }
}

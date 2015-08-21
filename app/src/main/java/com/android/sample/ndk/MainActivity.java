package com.android.sample.ndk;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    public native String getNDKMsg();

    static {
        System.loadLibrary("ndkSample");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView ndkText = (TextView)findViewById(R.id.ndk_text);
        ndkText.setText(getNDKMsg());

    }


}

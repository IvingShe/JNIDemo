package com.iving.myjniapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("JNIStubTest");
    }

    private TextView mTvContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvContent = this.findViewById(R.id.tv_Content);
        //todo  从JNI接口中获取数据显示
        JNIStub jniStub = new JNIStub();
        mTvContent.setText(jniStub.getDataFromJni());

    }
}

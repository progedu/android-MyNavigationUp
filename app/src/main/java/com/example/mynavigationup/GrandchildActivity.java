package com.example.mynavigationup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GrandchildActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grandchild);
    }

    public void moveWebView(View view) {
        startActivity(new Intent(this, WebViewActivity.class));
    }

}
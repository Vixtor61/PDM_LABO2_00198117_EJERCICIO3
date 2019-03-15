package com.example.a3panels;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int color;
    private LinearLayout mLinearLayout;
    private Button btn_1,btn_2,btn_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main) ;
        mLinearLayout = findViewById(R.id.ll);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);


    }
    @Override
    public void onClick(View v){
        int viewId = v.getId();
        Log.i("id",viewId+" ");
        switch (viewId){
            case R.id.btn_1:

                Toast.makeText(MainActivity.this,"btn_1",Toast.LENGTH_LONG).show();

                break;
            case R.id.btn_2:
                Toast.makeText(MainActivity.this,"btn_2",Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_3:
                Toast.makeText(MainActivity.this,"btn_3",Toast.LENGTH_LONG).show();
                break;
        }
    }

}

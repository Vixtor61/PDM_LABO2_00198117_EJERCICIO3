package com.example.a3panels;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int color;
    ArrayList<Integer> r = new ArrayList<Integer>();
    ArrayList<Integer> g = new ArrayList<Integer>();
    ArrayList<Integer> b = new ArrayList<Integer>();
    //private LinearLayout mLinearLayout;
    private Button btn_1,btn_2,btn_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addColors();
        //mLinearLayout = findViewById(R.id.ll);
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



                Log.d("color","daskl");
                //btn_1.setBackgroundColor(Color.parseColor(retrurnNewColor(1)));
                btn_1.setBackgroundColor(getResources().getColor(getColorFromList(1)));
                //Toast.makeText(MainActivity.this,color,Toast.LENGTH_LONG).show();

                break;
            case R.id.btn_2:

                btn_2.setBackgroundColor(getResources().getColor(getColorFromList(2)));
                //btn_2.setBackgroundColor(Color.parseColor(retrurnNewColor(2)));
                //Toast.makeText(MainActivity.this,"btn_2",Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_3:
                btn_3.setBackgroundColor(getResources().getColor(getColorFromList(3)));
                //btn_3.setBackgroundColor(Color.parseColor(retrurnNewColor(3)));
                //Toast.makeText(MainActivity.this,"btn_3",Toast.LENGTH_LONG).show();
                break;
        }
    }
    public String retrurnNewColor(int opt){
        String color;

        int pos1 = (int)(Math.random() * 15);
        int pos2 = (int)(Math.random() * 15);

        String hex = Integer.toHexString(pos1) + Integer.toHexString(pos2);

        switch (opt){

            case 1:

                color = "#"+hex+"0000";
                return color;
            case 2:

                color = "#00" + hex+"00";
                return color;
            case 3:

                color = "#0000"+hex;
                return color;
        }

        return "#ff00ff";
    }
    public int getColorFromList(int opt){
        int result = 0;
        int rand = (int) (Math.random()*6);
        switch (opt){
            case 1:
                result = r.get(rand);
                break;
            case 2:
                result = g.get(rand);
                break;
            case 3:
                result = b.get(rand);
                break;
        }
        return result;
    }
    public void addColors(){
        r.add(R.color.color1);
        r.add(R.color.color2);
        r.add(R.color.color3);
        r.add(R.color.color4);
        r.add(R.color.color5);
        r.add(R.color.color6);
        g.add(R.color.color12);
        g.add(R.color.color22);
        g.add(R.color.color32);
        g.add(R.color.color42);
        g.add(R.color.color52);
        g.add(R.color.color62);
        b.add(R.color.color13);
        b.add(R.color.color23);
        b.add(R.color.color33);
        b.add(R.color.color43);
        b.add(R.color.color53);
        b.add(R.color.color63);
    }

}

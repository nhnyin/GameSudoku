package com.example.sudoku;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

//public class Gamelevels extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.gamelevels);
//
//        Window w= getWindow();
//        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        Button button_back= (Button) findViewById(R.id.button_back);
//        button_back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent intent=new Intent(Gamelevels.this,MainActivity.class);
//                    startActivity(intent);finish();
//                }catch (Exception e){
//
//            }}
//        });
//        TextView textView1 = (TextView) findViewById(R.id.textView1);
//        textView1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent intent=new Intent(Gamelevels.this,level1.class);
//                    startActivity(intent);finish();
//                }catch (Exception e){
//
//                }}
//        });
//        TextView textView2 = (TextView) findViewById(R.id.textView2);
//        textView2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent intent=new Intent(Gamelevels.this,level2.class);
//                    startActivity(intent);finish();
//                }catch (Exception e){
//
//                }}
//        });
//        TextView textView3 = (TextView) findViewById(R.id.textView3);
//        textView3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent intent=new Intent(Gamelevels.this,level3.class);
//                    startActivity(intent);finish();
//                }catch (Exception e){
//
//                }}
//        });
//        TextView textView4 = (TextView) findViewById(R.id.textView4);
//        textView4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent intent=new Intent(Gamelevels.this,level4.class);
//                    startActivity(intent);finish();
//                }catch (Exception e){
//
//                }}
//        });
//        TextView textView5 = (TextView) findViewById(R.id.textView5);
//        textView5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent intent=new Intent(Gamelevels.this,level5.class);
//                    startActivity(intent);finish();
//                }catch (Exception e){
//
//                }}
//        });
//        TextView textView6 = (TextView) findViewById(R.id.textView6);
//        textView6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent intent=new Intent(Gamelevels.this,level6.class);
//                    startActivity(intent);finish();
//                }catch (Exception e){
//
//                }}
//        });
//        TextView textView7 = (TextView) findViewById(R.id.textView7);
//        textView7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent intent=new Intent(Gamelevels.this,level7.class);
//                    startActivity(intent);finish();
//                }catch (Exception e){
//
//                }}
//        });
//        TextView textView8 = (TextView) findViewById(R.id.textView8);
//        textView8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent intent=new Intent(Gamelevels.this,level8.class);
//                    startActivity(intent);finish();
//                }catch (Exception e){
//
//                }}
//        });
//        TextView textView9 = (TextView) findViewById(R.id.textView9);
//        textView9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent intent=new Intent(Gamelevels.this,level9.class);
//                    startActivity(intent);finish();
//                }catch (Exception e){
//
//                }}
//        });
//        TextView textView10 = (TextView) findViewById(R.id.textView10);
//        textView10.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent intent=new Intent(Gamelevels.this,level10.class);
//                    startActivity(intent);finish();
//                }catch (Exception e){
//
//                }}
//        });
//        TextView textView11 = (TextView) findViewById(R.id.textView11);
//        textView11.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent intent=new Intent(Gamelevels.this,level11.class);
//                    startActivity(intent);finish();
//                }catch (Exception e){
//
//                }}
//        });
//        TextView textView12 = (TextView) findViewById(R.id.textView12);
//        textView12.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent intent=new Intent(Gamelevels.this,level12.class);
//                    startActivity(intent);finish();
//                }catch (Exception e){
//
//                }}
//        });
//        TextView textView13 = (TextView) findViewById(R.id.textView13);
//        textView13.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent intent=new Intent(Gamelevels.this,level13.class);
//                    startActivity(intent);finish();
//                }catch (Exception e){
//
//                }}
//        });
//        TextView textView14 = (TextView) findViewById(R.id.textView14);
//        textView14.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent intent=new Intent(Gamelevels.this,level14.class);
//                    startActivity(intent);finish();
//                }catch (Exception e){
//
//                }}
//        });
//        TextView textView15 = (TextView) findViewById(R.id.textView15);
//        textView15.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent intent=new Intent(Gamelevels.this,level15.class);
//                    startActivity(intent);finish();
//                }catch (Exception e){
//
//                }}
//        });
//        TextView textView16 = (TextView) findViewById(R.id.textView16);
//        textView16.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent intent=new Intent(Gamelevels.this,level16.class);
//                    startActivity(intent);finish();
//                }catch (Exception e){
//
//                }}
//        });
//        TextView textView17 = (TextView) findViewById(R.id.textView17);
//        textView17.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent intent=new Intent(Gamelevels.this,level17.class);
//                    startActivity(intent);finish();
//                }catch (Exception e){
//
//                }}
//        });
//        TextView textView18 = (TextView) findViewById(R.id.textView18);
//        textView18.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent intent=new Intent(Gamelevels.this,level18.class);
//                    startActivity(intent);finish();
//                }catch (Exception e){
//
//                }}
//        });
//        TextView textView19 = (TextView) findViewById(R.id.textView19);
//        textView19.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent intent=new Intent(Gamelevels.this,level19.class);
//                    startActivity(intent);finish();
//                }catch (Exception e){
//
//                }}
//        });
//        TextView textView20 = (TextView) findViewById(R.id.textView20);
//        textView20.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent intent=new Intent(Gamelevels.this,level20.class);
//                    startActivity(intent);finish();
//                }catch (Exception e){
//
//                }}
//        });
//        TextView textView21 = (TextView) findViewById(R.id.textView21);
//        textView21.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent intent=new Intent(Gamelevels.this,level21.class);
//                    startActivity(intent);finish();
//                }catch (Exception e){
//
//                }}
//        });
//
//
//    }
//
//
//@Override
//    public void onBackPressed (){
//    try {
//        Intent intent=new Intent(Gamelevels.this,MainActivity.class);
//        startActivity(intent);finish();
//    }catch (Exception e){
//
//    }
//}
//
//}



public class Gamelevels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevels);

        SharedPreferences save =getSharedPreferences("Save",MODE_PRIVATE);
        final int level = save.getInt("Level",1);

        Window w= getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Button button_back= (Button) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent=new Intent(Gamelevels.this,MainActivity.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }}
        });
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(level>=1){
                    Intent intent=new Intent(Gamelevels.this,level1.class);
                    startActivity(intent);finish();}
                }catch (Exception e){

                }}
        });
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(level>=2){
                    Intent intent=new Intent(Gamelevels.this,level2.class);
                    startActivity(intent);finish();}
                }catch (Exception e){

                }}
        });
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {if(level>=3){
                    Intent intent=new Intent(Gamelevels.this,level3.class);
                    startActivity(intent);finish();}
                }catch (Exception e){

                }}
        });
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(level>=4){
                    Intent intent=new Intent(Gamelevels.this,level4.class);
                    startActivity(intent);finish();}
                }catch (Exception e){

                }}
        });
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {if(level>=5){
                    Intent intent=new Intent(Gamelevels.this,level5.class);
                    startActivity(intent);finish();}
                }catch (Exception e){

                }}
        });
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {if(level>=6){
                    Intent intent=new Intent(Gamelevels.this,level6.class);
                    startActivity(intent);finish();}
                }catch (Exception e){

                }}
        });
        TextView textView7 = (TextView) findViewById(R.id.textView7);
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {if(level>=7){
                    Intent intent=new Intent(Gamelevels.this,level7.class);
                    startActivity(intent);finish();}
                }catch (Exception e){

                }}
        });
        TextView textView8 = (TextView) findViewById(R.id.textView8);
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {if(level>=8){
                    Intent intent=new Intent(Gamelevels.this,level8.class);
                    startActivity(intent);finish();}
                }catch (Exception e){

                }}
        });
        TextView textView9 = (TextView) findViewById(R.id.textView9);
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {if(level>=9){
                    Intent intent=new Intent(Gamelevels.this,level9.class);
                    startActivity(intent);finish();}
                }catch (Exception e){

                }}
        });
        TextView textView10 = (TextView) findViewById(R.id.textView10);
        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {if(level>=10){
                    Intent intent=new Intent(Gamelevels.this,level10.class);
                    startActivity(intent);finish();}
                }catch (Exception e){

                }}
        });
        TextView textView11 = (TextView) findViewById(R.id.textView11);
        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {if(level>=11){
                    Intent intent=new Intent(Gamelevels.this,level11.class);
                    startActivity(intent);finish();}
                }catch (Exception e){

                }}
        });
        TextView textView12 = (TextView) findViewById(R.id.textView12);
        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {if(level>=12){
                    Intent intent=new Intent(Gamelevels.this,level12.class);
                    startActivity(intent);finish();}
                }catch (Exception e){

                }}
        });
        TextView textView13 = (TextView) findViewById(R.id.textView13);
        textView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {if(level>=13){
                    Intent intent=new Intent(Gamelevels.this,level13.class);
                    startActivity(intent);finish();}
                }catch (Exception e){

                }}
        });
        TextView textView14 = (TextView) findViewById(R.id.textView14);
        textView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {if(level>=14){
                    Intent intent=new Intent(Gamelevels.this,level14.class);
                    startActivity(intent);finish();}
                }catch (Exception e){

                }}
        });
        TextView textView15 = (TextView) findViewById(R.id.textView15);
        textView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {if(level>=15){
                    Intent intent=new Intent(Gamelevels.this,level15.class);
                    startActivity(intent);finish();}
                }catch (Exception e){

                }}
        });
        TextView textView16 = (TextView) findViewById(R.id.textView16);
        textView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {if(level>=16){
                    Intent intent=new Intent(Gamelevels.this,level16.class);
                    startActivity(intent);finish();}
                }catch (Exception e){

                }}
        });
        TextView textView17 = (TextView) findViewById(R.id.textView17);
        textView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {if(level>=17){
                    Intent intent=new Intent(Gamelevels.this,level17.class);
                    startActivity(intent);finish();}
                }catch (Exception e){

                }}
        });
        TextView textView18 = (TextView) findViewById(R.id.textView18);
        textView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {if(level>=18){
                    Intent intent=new Intent(Gamelevels.this,level18.class);
                    startActivity(intent);finish();}
                }catch (Exception e){

                }}
        });
        TextView textView19 = (TextView) findViewById(R.id.textView19);
        textView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {if(level>=19){
                    Intent intent=new Intent(Gamelevels.this,level19.class);
                    startActivity(intent);finish();}
                }catch (Exception e){

                }}
        });
        TextView textView20 = (TextView) findViewById(R.id.textView20);
        textView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {if(level>=20){
                    Intent intent=new Intent(Gamelevels.this,level20.class);
                    startActivity(intent);finish();}
                }catch (Exception e){

                }}
        });
        TextView textView21 = (TextView) findViewById(R.id.textView21);
        textView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {if(level>=21){
                    Intent intent=new Intent(Gamelevels.this,level21.class);
                    startActivity(intent);finish();}
                }catch (Exception e){

                }}
        });
        final int [] x ={
                R.id.textView1,
                R.id.textView2,
                R.id.textView3,
                R.id.textView4,
                R.id.textView5,
                R.id.textView6,
                R.id.textView7,
                R.id.textView8,
                R.id.textView9,
                R.id.textView10,
                R.id.textView11,
                R.id.textView12,
                R.id.textView13,
                R.id.textView14,
                R.id.textView15,
                R.id.textView16,
                R.id.textView17,
                R.id.textView18,
                R.id.textView19,
                R.id.textView20,
                R.id.textView21,
        };

        for(int i=1;i<level;i++){
            TextView tv =findViewById(x[i]);
            tv.setText(""+(i+1) );
        }

    }


    @Override
    public void onBackPressed (){
        try {
            Intent intent=new Intent(Gamelevels.this,MainActivity.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
    }

}
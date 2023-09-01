package com.example.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.backup.SharedPreferencesBackupHelper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class level1 extends AppCompatActivity {


    String i="1";int b=1,c=2;private Toast backToast;
    Dialog dialog;
    Dialog dialogEnd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
        Window w= getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Button button_level= (Button) findViewById(R.id.button_level);
        button_level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent=new Intent(level1.this,Gamelevels.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }}
        });
        //вызов диалог окна
        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.preview1lvl);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(false);
        TextView button_close=(TextView)dialog.findViewById(R.id.button_close);
        button_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent=new Intent(level1.this,Gamelevels.class);
                    startActivity(intent);finish();
                }catch (Exception e){}
                dialog.dismiss();
            }
        });
        Button buttoncontinue=(Button)dialog.findViewById(R.id.buttoncontinue);
        buttoncontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
            }
        });
        dialog.show();
        dialogEnd = new Dialog(this);
        TextView textView5 = (TextView) findViewById(R.id.textView5);

        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i=String.valueOf(b++);textView5.setText(i);

                Button button_proverka= (Button) findViewById(R.id.button_proverka);
                button_proverka.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        if(b==6){dialogEnd.requestWindowFeature(Window.FEATURE_NO_TITLE);
                            dialogEnd.setContentView(R.layout.preview1lvlend);
                            dialogEnd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                            dialogEnd.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                                    WindowManager.LayoutParams.MATCH_PARENT);
                            dialogEnd.setCancelable(false);
                            TextView button_close1=(TextView)dialogEnd.findViewById(R.id.button_close1);
                            button_close1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    try {
                                        Intent intent=new Intent(level1.this,Gamelevels.class);
                                        startActivity(intent);finish();
                                    }catch (Exception e){}
                                    dialogEnd.dismiss();
                                }
                            });
                            Button buttoncontinue1=(Button)dialogEnd.findViewById(R.id.buttoncontinue1);
                            buttoncontinue1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent=new Intent(level1.this,level2.class);
                                    startActivity(intent);finish();
                                    dialogEnd.dismiss();
                                }
                            });
                            SharedPreferences save =getSharedPreferences("Save",MODE_PRIVATE);
                            final int level = save.getInt("Level",1);
                            if(level>1){}else {SharedPreferences.Editor editor=save.edit();
                                editor.putInt("Level",2);
                                editor.commit();}
                            dialogEnd.show();
                        }else {backToast= Toast.makeText(getBaseContext(),"Исправь ошибки и попробуй ещё раз",Toast.LENGTH_SHORT);
                        backToast.show();}


                    }
                });


                if(b==10){i="1";b=1;}

                }
        });
    }


    @Override
    public void onBackPressed (){
        try {
            Intent intent=new Intent(level1.this,Gamelevels.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
    }

}
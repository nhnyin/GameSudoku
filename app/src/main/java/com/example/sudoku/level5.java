package com.example.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
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

public class level5 extends AppCompatActivity {


    String i="1";int b=1,b1=1,b2=1,b3=1,b4=1,b5=1,b6=1,b7=1,b8=1,b9=1,b10=1,b11=1,b12=1,b13=1,b14=1,b15=1,b16=1,b17=1,b18=1,b19=1,b20=1,b21=1,
            p1=0,p2=0,p3=0,p4=0,p5=0,p6=0,p7=0,p8=0,p9=0,p10=0,p11=0,p12=0,p13=0,p14=0,p15=0,p16=0,p17=0,p18=0,p19=0,p20=0,p21=0,p22=0;
    private Toast backToast;private
    Dialog dialog;
    Dialog dialogEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5);
        Window w= getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Button button_level= (Button) findViewById(R.id.button_level);
        button_level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent=new Intent(level5.this,Gamelevels.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }}
        });
        //вызов диалог окна
        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.preview5lvl);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(false);
        TextView button_close=(TextView)dialog.findViewById(R.id.button_close);
        button_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent=new Intent(level5.this,Gamelevels.class);
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
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b++);textView1.setText(i);
                if(b==7){p1=7;}else{p1=0;}
                if(b==10){i="1";b=1;}else{}
            }
        });
        TextView textView11 = (TextView) findViewById(R.id.textView11);
        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b1++);textView11.setText(i);
                if(b1==4){p2=4;}else{p2=0;}
                if(b1==10){i="1";b1=1;}else{}
            }
        });
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b2++);textView4.setText(i);
                if(b2==5){p3=5;}else{p3=0;}
                if(b2==10){i="1";b2=1;}else{}
            }
        });
        TextView textView13 = (TextView) findViewById(R.id.textView13);
        textView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b3++);textView13.setText(i);
                if(b3==7){p4=7;}else{p4=0;}
                if(b3==10){i="1";b3=1;}else{}
            }
        });
        TextView textView21 = (TextView) findViewById(R.id.textView21);
        textView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b4++);textView21.setText(i);
                if(b4==6){p5=6;}else{p5=0;}
                if(b4==10){i="1";b4=1;}else{}
            }
        });
        TextView textView23 = (TextView) findViewById(R.id.textView23);
        textView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b5++);textView23.setText(i);
                if(b5==8){p6=8;}else{p6=0;}
                if(b5==10){i="1";b5=1;}else{}
            }
        });
        TextView textView25 = (TextView) findViewById(R.id.textView25);
        textView25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b6++);textView25.setText(i);
                if(b6==2){p7=2;}else{p7=0;}
                if(b6==10){i="1";b6=1;}else{}
            }
        });
        TextView textView26 = (TextView) findViewById(R.id.textView26);
        textView26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b7++);textView26.setText(i);
                if(b7==3){p8=3;}else{p8=0;}
                if(b7==10){i="1";b7=1;}else{}
            }
        });
        TextView textView29 = (TextView) findViewById(R.id.textView29);
        textView29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b8++);textView29.setText(i);
                if(b8==2){p9=2;}else{p9=0;}
                if(b8==10){i="1";b8=1;}else{}
            }
        });
        TextView textView34 = (TextView) findViewById(R.id.textView34);
        textView34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b9++);textView34.setText(i);
                if(b9==4){p10=4;}else{p10=0;}
                if(b9==10){i="1";b9=1;}else{}
            }
        });

        TextView textView38 = (TextView) findViewById(R.id.textView38);
        textView38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b10++);textView38.setText(i);
                if(b10==7){p11=7;}else{p11=0;}
                if(b10==10){i="1";b10=1;}else{}
            }
        });
        TextView textView39 = (TextView) findViewById(R.id.textView39);
        textView39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b11++);textView39.setText(i);
                if(b11==10){p12=10;}else{p12=0;}
                if(b11==10){i="1";b11=1;}else{}
            }
        });
        TextView textView40 = (TextView) findViewById(R.id.textView40);
        textView40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b12++);textView40.setText(i);
                if(b12==8){p13=8;}else{p13=0;}
                if(b12==10){i="1";b12=1;}else{}
            }
        });
        TextView textView45 = (TextView) findViewById(R.id.textView45);
        textView45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b13++);textView45.setText(i);
                if(b13==3){p14=3;}else{p14=0;}
                if(b13==10){i="1";b13=1;}else{}
            }
        });
        TextView textView49 = (TextView) findViewById(R.id.textView49);
        textView49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b14++);textView49.setText(i);
                if(b14==10){p15=10;}else{p15=0;}
                if(b14==10){i="1";b14=1;}else{}
            }
        });
        TextView textView50 = (TextView) findViewById(R.id.textView50);
        textView50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b15++);textView50.setText(i);
                if(b15==3){p16=3;}else{p16=0;}
                if(b15==10){i="1";b15=1;}else{}
            }
        });
        TextView textView59 = (TextView) findViewById(R.id.textView59);
        textView59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b16++);textView59.setText(i);
                if(b16==5){p17=5;}else{p17=0;}
                if(b16==10){i="1";b16=1;}else{}
            }
        });
        TextView textView65 = (TextView) findViewById(R.id.textView65);
        textView65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b17++);textView65.setText(i);
                if(b17==6){p18=6;}else{p18=0;}
                if(b17==10){i="1";b17=1;}else{}
            }
        });

        TextView textView66 = (TextView) findViewById(R.id.textView66);
        textView66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b18++);textView66.setText(i);
                if(b18==4){p19=4;}else{p19=0;}
                if(b18==10){i="1";b18=1;}else{}
            }
        });

        TextView textView69 = (TextView) findViewById(R.id.textView69);
        textView69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b19++);textView69.setText(i);
                if(b19==7){p20=7;}else{p20=0;}
                if(b19==10){i="1";b19=1;}else{}
            }
        });
        TextView textView70 = (TextView) findViewById(R.id.textView70);
        textView70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b20++);textView70.setText(i);
                if(b20==9){p21=9;}else{p21=0;}
                if(b20==10){i="1";b20=1;}else{}
            }
        });
        TextView textView81 = (TextView) findViewById(R.id.textView81);
        textView81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b21++);textView81.setText(i);
                if(b21==5){p22=5;}else{p22=0;}
                if(b21==10){i="1";b21=1;}else{}
            }
        });

        dialogEnd = new Dialog(this);
        Button button_proverka= (Button) findViewById(R.id.button_proverka);
        button_proverka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(p1==7&&p2==4&&p3==5&&p4==7&&p5==6&&
                        p6==8&&p7==2&&p8==3&&p9==2&&p10==4&&p11==7&&p12==10
                        &&p13==8&&p14==3&&p15==10&&p16==3&&p17==5&&p18==6&&p19==4
                        &&p20==7&&p21==9&&p22==5){
                    dialogEnd.requestWindowFeature(Window.FEATURE_NO_TITLE);
                    dialogEnd.setContentView(R.layout.preview1lvlend);
                    dialogEnd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    dialogEnd.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                            WindowManager.LayoutParams.MATCH_PARENT);
                    dialogEnd.setCancelable(false);
                    TextView button_close1 = (TextView) dialogEnd.findViewById(R.id.button_close1);
                    button_close1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                Intent intent = new Intent(level5.this, Gamelevels.class);
                                startActivity(intent);
                                finish();
                            } catch (Exception e) {
                            }
                            dialogEnd.dismiss();
                        }
                    });
                    Button buttoncontinue1 = (Button) dialogEnd.findViewById(R.id.buttoncontinue1);
                    buttoncontinue1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(level5.this, level6.class);
                            startActivity(intent);
                            finish();
                            dialogEnd.dismiss();
                        }
                    });
                    SharedPreferences save =getSharedPreferences("Save",MODE_PRIVATE);
                    final int level = save.getInt("Level",1);
                    if(level>5){}else {SharedPreferences.Editor editor=save.edit();
                        editor.putInt("Level",6);
                        editor.commit();}
                    dialogEnd.show();
                }else{backToast= Toast.makeText(getBaseContext(),"Исправь ошибки и попробуй ещё раз",Toast.LENGTH_SHORT);
                    backToast.show();}}
        });

    }



    @Override
    public void onBackPressed (){
        try {
            Intent intent=new Intent(level5.this,Gamelevels.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
    }

}
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

public class level12 extends AppCompatActivity {


    String i="1";int b=1,b1=1,b2=1,b3=1,b4=1,b5=1,b6=1,b7=1,b8=1,b9=1,b10=1,
            b11=1,b12=1,b13=1,b14=1,b15=1,b16=1,b17=1,b18=1,b19=1,b20=1,
            b21=1,b22=1,b23=1,b24=1,b25=1,b26=1,b27=1,b28=1,b29=1,b30=1,b31=1,
            p1=0,p2=0,p3=0,p4=0,p5=0,p6=0,p7=0,p8=0,p9=0,p10=0,
            p11=0,p12=0,p13=0,p14=0,p15=0,p16=0,p17=0,p18=0,p19=0,p20=0,p21=0,
            p22=0,p23=0,p24=0,p25=0,p26=0,p27=0,p28=0,p29=0,p30=0,p31=0,p32=0;
    private Toast backToast;private
    Dialog dialog;
    Dialog dialogEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level12);
        Window w= getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Button button_level= (Button) findViewById(R.id.button_level);
        button_level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent=new Intent(level12.this,Gamelevels.class);
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
                    Intent intent=new Intent(level12.this,Gamelevels.class);
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
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b++);textView3.setText(i);
                if(b==6){p1=6;}else{p1=0;}
                if(b==10){i="1";b=1;}else{}
            }
        });
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b1++);textView6.setText(i);
                if(b1==7){p2=7;}else{p2=0;}
                if(b1==10){i="1";b1=1;}else{}
            }
        });
        TextView textView8 = (TextView) findViewById(R.id.textView8);
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b2++);textView8.setText(i);
                if(b2==3){p3=3;}else{p3=0;}
                if(b2==10){i="1";b2=1;}else{}
            }
        });
        TextView textView10 = (TextView) findViewById(R.id.textView10);
        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b3++);textView10.setText(i);
                if(b3==3){p4=3;}else{p4=0;}
                if(b3==10){i="1";b3=1;}else{}
            }
        });
        TextView textView14 = (TextView) findViewById(R.id.textView14);
        textView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b4++);textView14.setText(i);
                if(b4==6){p5=6;}else{p5=0;}
                if(b4==10){i="1";b4=1;}else{}
            }
        });
        TextView textView16 = (TextView) findViewById(R.id.textView16);
        textView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b5++);textView16.setText(i);
                if(b5==5){p6=5;}else{p6=0;}
                if(b5==10){i="1";b5=1;}else{}
            }
        });
        TextView textView21 = (TextView) findViewById(R.id.textView21);
        textView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b6++);textView21.setText(i);
                if(b6==8){p7=8;}else{p7=0;}
                if(b6==10){i="1";b6=1;}else{}
            }
        });
        TextView textView23 = (TextView) findViewById(R.id.textView23);
        textView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b7++);textView23.setText(i);
                if(b7==10){p8=10;}else{p8=0;}
                if(b7==10){i="1";b7=1;}else{}
            }
        });
        TextView textView24 = (TextView) findViewById(R.id.textView24);
        textView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b8++);textView24.setText(i);
                if(b8==4){p9=4;}else{p9=0;}
                if(b8==10){i="1";b8=1;}else{}
            }
        });
        TextView textView26 = (TextView) findViewById(R.id.textView26);
        textView26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b9++);textView26.setText(i);
                if(b9==6){p10=6;}else{p10=0;}
                if(b9==10){i="1";b9=1;}else{}
            }
        });

        TextView textView29 = (TextView) findViewById(R.id.textView29);
        textView29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b10++);textView29.setText(i);
                if(b10==7){p11=7;}else{p11=0;}
                if(b10==10){i="1";b10=1;}else{}
            }
        });
        TextView textView32 = (TextView) findViewById(R.id.textView32);
        textView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b11++);textView32.setText(i);
                if(b11==4){p12=4;}else{p12=0;}
                if(b11==10){i="1";b11=1;}else{}
            }
        });
        TextView textView35 = (TextView) findViewById(R.id.textView35);
        textView35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b12++);textView35.setText(i);
                if(b12==9){p13=9;}else{p13=0;}
                if(b12==10){i="1";b12=1;}else{}
            }
        });
        TextView textView37 = (TextView) findViewById(R.id.textView37);
        textView37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b13++);textView37.setText(i);
                if(b13==2){p14=2;}else{p14=0;}
                if(b13==10){i="1";b13=1;}else{}
            }
        });

        TextView textView38 = (TextView) findViewById(R.id.textView38);
        textView38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b14++);textView38.setText(i);
                if(b14==3){p15=3;}else{p15=0;}
                if(b14==10){i="1";b14=1;}else{}
            }
        });
        TextView textView44 = (TextView) findViewById(R.id.textView44);
        textView44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b15++);textView44.setText(i);
                if(b15==5){p16=5;}else{p16=0;}
                if(b15==10){i="1";b15=1;}else{}
            }
        });
        TextView textView45 = (TextView) findViewById(R.id.textView45);
        textView45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b16++);textView45.setText(i);
                if(b16==10){p17=10;}else{p17=0;}
                if(b16==10){i="1";b16=1;}else{}
            }
        });
        TextView textView49 = (TextView) findViewById(R.id.textView49);
        textView49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b17++);textView49.setText(i);
                if(b17==6){p18=6;}else{p18=0;}
                if(b17==10){i="1";b17=1;}else{}
            }
        });

        TextView textView50 = (TextView) findViewById(R.id.textView50);
        textView50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b18++);textView50.setText(i);
                if(b18==3){p19=3;}else{p19=0;}
                if(b18==10){i="1";b18=1;}else{}
            }
        });

        TextView textView52 = (TextView) findViewById(R.id.textView52);
        textView52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b19++);textView52.setText(i);
                if(b19==2){p20=2;}else{p20=0;}
                if(b19==10){i="1";b19=1;}else{}
            }
        });
        TextView textView65 = (TextView) findViewById(R.id.textView65);
        textView65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b20++);textView65.setText(i);
                if(b20==9){p21=9;}else{p21=0;}
                if(b20==10){i="1";b20=1;}else{}
            }
        });
        TextView textView68 = (TextView) findViewById(R.id.textView68);
        textView68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b21++);textView68.setText(i);
                if(b21==5){p22=5;}else{p22=0;}
                if(b21==10){i="1";b21=1;}else{}
            }
        });
        TextView textView72 = (TextView) findViewById(R.id.textView72);
        textView72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b22++);textView72.setText(i);
                if(b22==7){p23=7;}else{p23=0;}
                if(b22==10){i="1";b22=1;}else{}
            }
        });
        TextView textView73 = (TextView) findViewById(R.id.textView73);
        textView73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b23++);textView73.setText(i);
                if(b23==4){p24=4;}else{p24=0;}
                if(b23==10){i="1";b23=1;}else{}
            }
        });
        TextView textView74 = (TextView) findViewById(R.id.textView74);
        textView74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b24++);textView74.setText(i);
                if(b24==8){p25=8;}else{p25=0;}
                if(b24==10){i="1";b24=1;}else{}
            }
        });
        TextView textView75 = (TextView) findViewById(R.id.textView75);
        textView75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b25++);textView75.setText(i);
                if(b25==5){p26=5;}else{p26=0;}
                if(b25==10){i="1";b25=1;}else{}
            }
        });
        TextView textView76 = (TextView) findViewById(R.id.textView76);
        textView76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b26++);textView76.setText(i);
                if(b26==10){p27=10;}else{p27=0;}
                if(b26==10){i="1";b26=1;}else{}
            }
        });
        TextView textView78 = (TextView) findViewById(R.id.textView78);
        textView78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b27++);textView78.setText(i);
                if(b27==3){p28=3;}else{p28=0;}
                if(b27==10){i="1";b27=1;}else{}
            }
        });
        TextView textView79 = (TextView) findViewById(R.id.textView79);
        textView79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b28++);textView79.setText(i);
                if(b28==9){p29=9;}else{p29=0;}
                if(b28==10){i="1";b28=1;}else{}
            }
        });
        TextView textView80 = (TextView) findViewById(R.id.textView80);
        textView80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b29++);textView80.setText(i);
                if(b29==2){p30=2;}else{p30=0;}
                if(b29==10){i="1";b29=1;}else{}
            }
        });

        dialogEnd = new Dialog(this);
        Button button_proverka= (Button) findViewById(R.id.button_proverka);
        button_proverka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(p1==6&&p2==7&&p3==3&&p4==3&&p5==6&&
                        p6==5&&p7==8&&p8==10&&p9==4&&p10==6&&p11==7&&p12==4
                        &&p13==9&&p14==2&&p15==3&&p16==5&&p17==10&&p18==6&&p19==3
                        &&p20==2&&p21==9&&p22==5&&p23==7&&p24==4&&p25==8&&p26==5
                        &&p27==10&&p28==3&&p29==9&&p30==2){
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
                                Intent intent = new Intent(level12.this, Gamelevels.class);
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
                            Intent intent = new Intent(level12.this, level13.class);
                            startActivity(intent);
                            finish();
                            dialogEnd.dismiss();
                        }
                    });
                    SharedPreferences save =getSharedPreferences("Save",MODE_PRIVATE);
                    final int level = save.getInt("Level",1);
                    if(level>12){}else {SharedPreferences.Editor editor=save.edit();
                        editor.putInt("Level",13);
                        editor.commit();}
                    dialogEnd.show();
                }else{backToast= Toast.makeText(getBaseContext(),"Исправь ошибки и попробуй ещё раз",Toast.LENGTH_SHORT);
                    backToast.show();}}
        });

    }



    @Override
    public void onBackPressed (){
        try {
            Intent intent=new Intent(level12.this,Gamelevels.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
    }

}
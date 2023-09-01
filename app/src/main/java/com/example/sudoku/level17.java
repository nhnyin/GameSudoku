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

public class level17 extends AppCompatActivity {


    String i="1";int b=1,b1=1,b2=1,b3=1,b4=1,b5=1,b6=1,b7=1,b8=1,b9=1,b10=1,
            b11=1,b12=1,b13=1,b14=1,b15=1,b16=1,b17=1,b18=1,b19=1,b20=1,
            b21=1,b22=1,b23=1,b24=1,b25=1,b26=1,b27=1,b28=1,b29=1,b30=1,b31=1,
            b32=1,b33=1,b34=1,b35=1,b36=1,b37=1,b38=1,b39=1,b40=1,b41=1,b42=1,
            b43=1,b44=1,b45=1,b46=1,b47=1,b48=1,b49=1,b50=1,b51=1,b52=1,b53=1,
            b54=1,b55=1,b56=1,b57=1,b58=1,b59=1,b60=1,b61=1,b62=1,b63=1,b64=1,
            p1=0,p2=0,p3=0,p4=0,p5=0,p6=0,p7=0,p8=0,p9=0,p10=0,
            p11=0,p12=0,p13=0,p14=0,p15=0,p16=0,p17=0,p18=0,p19=0,p20=0,p21=0,
            p22=0,p23=0,p24=0,p25=0,p26=0,p27=0,p28=0,p29=0,p30=0,p31=0,p32=0,
            p33=0,p34=0,p35=0,p36=0,p37=0,p38=0,p39=0,p40=0,p41=0,p42=0,p43=0,
            p44=0,p45=0,p46=0,p47=0,p48=0,p49=0,p50=0,p51=0,p52=0,p53=0,p54=0,
            p55=0,p56=0,p57=0,p58=0,p59=0,p60=0,p61=0,p62=0,p63=0,p64=0,p65=0;
    private Toast backToast;private
    Dialog dialog;
    Dialog dialogEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level17);
        Window w= getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Button button_level= (Button) findViewById(R.id.button_level);
        button_level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent=new Intent(level17.this,Gamelevels.class);
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
                    Intent intent=new Intent(level17.this,Gamelevels.class);
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
                if(b==9){p1=9;}else{p1=0;}
                if(b==10){i="1";b=1;}else{}
            }
        });
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b1++);textView2.setText(i);
                if(b1==8){p2=8;}else{p2=0;}
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
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b3++);textView6.setText(i);
                if(b3==4){p4=4;}else{p4=0;}
                if(b3==10){i="1";b3=1;}else{}
            }
        });
        TextView textView8 = (TextView) findViewById(R.id.textView8);
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b4++);textView8.setText(i);
                if(b4==6){p5=6;}else{p5=0;}
                if(b4==10){i="1";b4=1;}else{}
            }
        });
        TextView textView9 = (TextView) findViewById(R.id.textView9);
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b5++);textView9.setText(i);
                if(b5==2){p6=2;}else{p6=0;}
                if(b5==10){i="1";b5=1;}else{}
            }
        });
        TextView textView10 = (TextView) findViewById(R.id.textView10);
        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b6++);textView10.setText(i);
                if(b6==4){p7=4;}else{p7=0;}
                if(b6==10){i="1";b6=1;}else{}
            }
        });
        TextView textView11 = (TextView) findViewById(R.id.textView11);
        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b7++);textView11.setText(i);
                if(b7==5){p8=5;}else{p8=0;}
                if(b7==10){i="1";b7=1;}else{}
            }
        });
        TextView textView12 = (TextView) findViewById(R.id.textView12);
        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b8++);textView12.setText(i);
                if(b8==6){p9=6;}else{p9=0;}
                if(b8==10){i="1";b8=1;}else{}
            }
        });
        TextView textView14 = (TextView) findViewById(R.id.textView14);
        textView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b9++);textView14.setText(i);
                if(b9==2){p10=2;}else{p10=0;}
                if(b9==10){i="1";b9=1;}else{}
            }
        });

        TextView textView16 = (TextView) findViewById(R.id.textView16);
        textView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b10++);textView16.setText(i);
                if(b10==10){p11=10;}else{p11=0;}
                if(b10==10){i="1";b10=1;}else{}
            }
        });
        TextView textView17 = (TextView) findViewById(R.id.textView17);
        textView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b11++);textView17.setText(i);
                if(b11==7){p12=7;}else{p12=0;}
                if(b11==10){i="1";b11=1;}else{}
            }
        });
        TextView textView18 = (TextView) findViewById(R.id.textView18);
        textView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b12++);textView18.setText(i);
                if(b12==9){p13=9;}else{p13=0;}
                if(b12==10){i="1";b12=1;}else{}
            }
        });
        TextView textView19 = (TextView) findViewById(R.id.textView19);
        textView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b13++);textView19.setText(i);
                if(b13==3){p14=3;}else{p14=0;}
                if(b13==10){i="1";b13=1;}else{}
            }
        });

        TextView textView21 = (TextView) findViewById(R.id.textView21);
        textView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b14++);textView21.setText(i);
                if(b14==2){p15=2;}else{p15=0;}
                if(b14==10){i="1";b14=1;}else{}
            }
        });
        TextView textView23 = (TextView) findViewById(R.id.textView23);
        textView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b15++);textView23.setText(i);
                if(b15==7){p16=7;}else{p16=0;}
                if(b15==10){i="1";b15=1;}else{}
            }
        });
        TextView textView25 = (TextView) findViewById(R.id.textView25);
        textView25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b16++);textView25.setText(i);
                if(b16==5){p17=5;}else{p17=0;}
                if(b16==10){i="1";b16=1;}else{}
            }
        });
        TextView textView27 = (TextView) findViewById(R.id.textView27);
        textView27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b17++);textView27.setText(i);
                if(b17==4){p18=4;}else{p18=0;}
                if(b17==10){i="1";b17=1;}else{}
            }
        });

        TextView textView29 = (TextView) findViewById(R.id.textView29);
        textView29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b18++);textView29.setText(i);
                if(b18==9){p19=9;}else{p19=0;}
                if(b18==10){i="1";b18=1;}else{}
            }
        });

        TextView textView30 = (TextView) findViewById(R.id.textView30);
        textView30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b19++);textView30.setText(i);
                if(b19==3){p20=3;}else{p20=0;}
                if(b19==10){i="1";b19=1;}else{}
            }
        });
        TextView textView31 = (TextView) findViewById(R.id.textView31);
        textView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b20++);textView31.setText(i);
                if(b20==2){p21=2;}else{p21=0;}
                if(b20==10){i="1";b20=1;}else{}
            }
        });
        TextView textView33 = (TextView) findViewById(R.id.textView33);
        textView33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b21++);textView33.setText(i);
                if(b21==6){p22=6;}else{p22=0;}
                if(b21==10){i="1";b21=1;}else{}
            }
        });
        TextView textView34 = (TextView) findViewById(R.id.textView34);
        textView34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b22++);textView34.setText(i);
                if(b22==8){p23=8;}else{p23=0;}
                if(b22==10){i="1";b22=1;}else{}
            }
        });
        TextView textView35 = (TextView) findViewById(R.id.textView35);
        textView35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b23++);textView35.setText(i);
                if(b23==5){p24=5;}else{p24=0;}
                if(b23==10){i="1";b23=1;}else{}
            }
        });
        TextView textView39 = (TextView) findViewById(R.id.textView39);
        textView39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b24++);textView39.setText(i);
                if(b24==5){p25=5;}else{p25=0;}
                if(b24==10){i="1";b24=1;}else{}
            }
        });
        TextView textView40 = (TextView) findViewById(R.id.textView40);
        textView40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b25++);textView40.setText(i);
                if(b25==9){p26=9;}else{p26=0;}
                if(b25==10){i="1";b25=1;}else{}
            }
        });
        TextView textView41 = (TextView) findViewById(R.id.textView41);
        textView41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b26++);textView41.setText(i);
                if(b26==3){p27=3;}else{p27=0;}
                if(b26==10){i="1";b26=1;}else{}
            }
        });
        TextView textView42 = (TextView) findViewById(R.id.textView42);
        textView42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b27++);textView42.setText(i);
                if(b27==7){p28=7;}else{p28=0;}
                if(b27==10){i="1";b27=1;}else{}
            }
        });
        TextView textView43 = (TextView) findViewById(R.id.textView43);
        textView43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b28++);textView43.setText(i);
                if(b28==4){p29=4;}else{p29=0;}
                if(b28==10){i="1";b28=1;}else{}
            }
        });
        TextView textView47 = (TextView) findViewById(R.id.textView47);
        textView47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b29++);textView47.setText(i);
                if(b29==7){p30=7;}else{p30=0;}
                if(b29==10){i="1";b29=1;}else{}
            }
        });//
        TextView textView48 = (TextView) findViewById(R.id.textView48);
        textView48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b30++);textView48.setText(i);
                if(b30==4){p31=4;}else{p31=0;}
                if(b30==10){i="1";b30=1;}else{}
            }
        });
        TextView textView49 = (TextView) findViewById(R.id.textView49);
        textView49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b31++);textView49.setText(i);
                if(b31==10){p32=10;}else{p32=0;}
                if(b31==10){i="1";b31=1;}else{}
            }
        });
        TextView textView51 = (TextView) findViewById(R.id.textView51);
        textView51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b32++);textView51.setText(i);
                if(b32==8){p33=8;}else{p33=0;}
                if(b32==10){i="1";b32=1;}else{}
            }
        });
        TextView textView52 = (TextView) findViewById(R.id.textView52);
        textView52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b33++);textView52.setText(i);
                if(b33==9){p34=9;}else{p34=0;}
                if(b33==10){i="1";b33=1;}else{}
            }
        });
        TextView textView53 = (TextView) findViewById(R.id.textView53);
        textView53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b34++);textView53.setText(i);
                if(b34==3){p35=3;}else{p35=0;}
                if(b34==10){i="1";b34=1;}else{}
            }
        });
        TextView textView55 = (TextView) findViewById(R.id.textView55);
        textView55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b35++);textView55.setText(i);
                if(b35==5){p36=5;}else{p36=0;}
                if(b35==10){i="1";b35=1;}else{}
            }
        });
        TextView textView57 = (TextView) findViewById(R.id.textView57);
        textView57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b36++);textView57.setText(i);
                if(b36==8){p37=8;}else{p37=0;}
                if(b36==10){i="1";b36=1;}else{}
            }
        });
        TextView textView59 = (TextView) findViewById(R.id.textView59);
        textView59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b37++);textView59.setText(i);
                if(b37==6){p38=6;}else{p38=0;}
                if(b37==10){i="1";b37=1;}else{}
            }
        });
        TextView textView61 = (TextView) findViewById(R.id.textView61);
        textView61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b38++);textView61.setText(i);
                if(b38==7){p39=7;}else{p39=0;}
                if(b38==10){i="1";b38=1;}else{}
            }
        });
        TextView textView63 = (TextView) findViewById(R.id.textView63);
        textView63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b39++);textView63.setText(i);
                if(b39==3){p40=3;}else{p40=0;}
                if(b39==10){i="1";b39=1;}else{}
            }
        });
        TextView textView64 = (TextView) findViewById(R.id.textView64);
        textView64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b40++);textView64.setText(i);
                if(b40==7){p41=7;}else{p41=0;}
                if(b40==10){i="1";b40=1;}else{}
            }
        });
        TextView textView65 = (TextView) findViewById(R.id.textView65);
        textView65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b41++);textView65.setText(i);
                if(b41==4){p42=4;}else{p42=0;}
                if(b41==10){i="1";b41=1;}else{}
            }
        });
        TextView textView66 = (TextView) findViewById(R.id.textView66);
        textView66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b42++);textView66.setText(i);
                if(b42==9){p43=9;}else{p43=0;}
                if(b42==10){i="1";b42=1;}else{}
            }
        });
        TextView textView68 = (TextView) findViewById(R.id.textView68);
        textView68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b43++);textView68.setText(i);
                if(b43==8){p44=8;}else{p44=0;}
                if(b43==10){i="1";b43=1;}else{}
            }
        });
        TextView textView70 = (TextView) findViewById(R.id.textView70);
        textView70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b44++);textView70.setText(i);
                if(b44==6){p45=6;}else{p45=0;}
                if(b44==10){i="1";b44=1;}else{}
            }
        });
        TextView textView71 = (TextView) findViewById(R.id.textView71);
        textView71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b45++);textView71.setText(i);
                if(b45==10){p46=10;}else{p46=0;}
                if(b45==10){i="1";b45=1;}else{}
            }
        });
        TextView textView72 = (TextView) findViewById(R.id.textView72);
        textView72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b46++);textView72.setText(i);
                if(b46==5){p47=5;}else{p47=0;}
                if(b46==10){i="1";b46=1;}else{}
            }
        });
        TextView textView73 = (TextView) findViewById(R.id.textView73);
        textView73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b47++);textView73.setText(i);
                if(b47==6){p48=6;}else{p48=0;}
                if(b47==10){i="1";b47=1;}else{}
            }
        });
        TextView textView74 = (TextView) findViewById(R.id.textView74);
        textView74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b48++);textView74.setText(i);
                if(b48==3){p49=3;}else{p49=0;}
                if(b48==10){i="1";b48=1;}else{}
            }
        });
        TextView textView76 = (TextView) findViewById(R.id.textView76);
        textView76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b49++);textView76.setText(i);
                if(b49==7){p50=7;}else{p50=0;}
                if(b49==10){i="1";b49=1;}else{}
            }
        });
        TextView textView78 = (TextView) findViewById(R.id.textView78);
        textView78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b50++);textView78.setText(i);
                if(b50==5){p51=5;}else{p51=0;}
                if(b50==10){i="1";b50=1;}else{}
            }
        });
        TextView textView80 = (TextView) findViewById(R.id.textView80);
        textView80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b51++);textView80.setText(i);
                if(b51==4){p52=4;}else{p52=0;}
                if(b51==10){i="1";b51=1;}else{}
            }
        });
        TextView textView81 = (TextView) findViewById(R.id.textView81);
        textView81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b52++);textView81.setText(i);
                if(b52==8){p53=8;}else{p53=0;}
                if(b52==10){i="1";b52=1;}else{}
            }
        });
        dialogEnd = new Dialog(this);
        Button button_proverka= (Button) findViewById(R.id.button_proverka);
        button_proverka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p1 == 9 && p2 == 8 && p3 == 5 && p4 == 4 && p5 == 6 &&
                        p6 == 2 && p7 == 4 && p8 == 5 && p9 == 6 && p10 == 2 && p11 == 10 && p12 == 7
                        && p13 == 9 && p14 == 3 && p15 == 2 && p16 == 7 && p17 == 5 && p18 == 4 && p19 == 9
                        && p20 == 3 && p21 == 2 && p22 == 6 && p23 == 8 && p24 == 5 && p25 == 5 && p26 == 9
                        && p27 == 3 && p28 == 7 && p29 == 4 && p30 == 7 && p31 == 4 && p32 == 10 && p33 == 8
                        && p34 == 9 && p35 == 3 && p36 == 5 && p37 == 8 && p38 == 6 && p39 == 7 && p40 == 3
                        && p41 == 7 && p42 == 4 && p43 == 9 && p44 == 8 && p45 == 6 && p46 == 10 && p47 == 5
                        && p48 == 6 && p49 == 3 && p50 == 7 && p51 == 5 && p52 == 4 && p53 == 8 ) {
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
                                Intent intent = new Intent(level17.this, Gamelevels.class);
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
                            Intent intent = new Intent(level17.this, level18.class);
                            startActivity(intent);
                            finish();
                            dialogEnd.dismiss();
                        }
                    });
                    SharedPreferences save =getSharedPreferences("Save",MODE_PRIVATE);
                    final int level = save.getInt("Level",1);
                    if(level>17){}else {SharedPreferences.Editor editor=save.edit();
                        editor.putInt("Level",18);
                        editor.commit();}
                    dialogEnd.show();
                } else {
                    backToast = Toast.makeText(getBaseContext(), "Исправь ошибки и попробуй ещё раз", Toast.LENGTH_SHORT);
                    backToast.show();
                }
            }
        });

    }



    @Override
    public void onBackPressed (){
        try {
            Intent intent=new Intent(level17.this,Gamelevels.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
    }

}
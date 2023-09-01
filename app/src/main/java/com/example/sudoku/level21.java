package com.example.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
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

public class level21 extends AppCompatActivity {


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
        setContentView(R.layout.activity_level21);
        Window w= getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Button button_level= (Button) findViewById(R.id.button_level);
        button_level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent=new Intent(level21.this,Gamelevels.class);
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
                    Intent intent=new Intent(level21.this,Gamelevels.class);
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
                if(b==3){p1=3;}else{p1=0;}
                if(b==10){i="1";b=1;}else{}
            }
        });
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b1++);textView2.setText(i);
                if(b1==4){p2=4;}else{p2=0;}
                if(b1==10){i="1";b1=1;}else{}
            }
        });
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b2++);textView3.setText(i);
                if(b2==9){p3=9;}else{p3=0;}
                if(b2==10){i="1";b2=1;}else{}
            }
        });
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b3++);textView4.setText(i);
                if(b3==10){p4=10;}else{p4=0;}
                if(b3==10){i="1";b3=1;}else{}
            }
        });
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b4++);textView6.setText(i);
                if(b4==6){p5=6;}else{p5=0;}
                if(b4==10){i="1";b4=1;}else{}
            }
        });
        TextView textView8 = (TextView) findViewById(R.id.textView8);
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b5++);textView8.setText(i);
                if(b5==2){p6=2;}else{p6=0;}
                if(b5==10){i="1";b5=1;}else{}
            }
        });
        TextView textView9 = (TextView) findViewById(R.id.textView9);
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b6++);textView9.setText(i);
                if(b6==5){p7=5;}else{p7=0;}
                if(b6==10){i="1";b6=1;}else{}
            }
        });
        TextView textView10 = (TextView) findViewById(R.id.textView10);
        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b7++);textView10.setText(i);
                if(b7==8){p8=8;}else{p8=0;}
                if(b7==10){i="1";b7=1;}else{}
            }
        });
        TextView textView13 = (TextView) findViewById(R.id.textView13);
        textView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b8++);textView13.setText(i);
                if(b8==5){p9=5;}else{p9=0;}
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

        TextView textView15 = (TextView) findViewById(R.id.textView15);
        textView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b10++);textView15.setText(i);
                if(b10==4){p11=4;}else{p11=0;}
                if(b10==10){i="1";b10=1;}else{}
            }
        });
        TextView textView16 = (TextView) findViewById(R.id.textView16);
        textView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b11++);textView16.setText(i);
                if(b11==7){p12=7;}else{p12=0;}
                if(b11==10){i="1";b11=1;}else{}
            }
        });
        TextView textView17 = (TextView) findViewById(R.id.textView17);
        textView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b12++);textView17.setText(i);
                if(b12==9){p13=9;}else{p13=0;}
                if(b12==10){i="1";b12=1;}else{}
            }
        });
        TextView textView18 = (TextView) findViewById(R.id.textView18);
        textView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b13++);textView18.setText(i);
                if(b13==3){p14=3;}else{p14=0;}
                if(b13==10){i="1";b13=1;}else{}
            }
        });

        TextView textView19 = (TextView) findViewById(R.id.textView19);
        textView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b14++);textView19.setText(i);
                if(b14==5){p15=5;}else{p15=0;}
                if(b14==10){i="1";b14=1;}else{}
            }
        });
        TextView textView21 = (TextView) findViewById(R.id.textView21);
        textView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b15++);textView21.setText(i);
                if(b15==7){p16=7;}else{p16=0;}
                if(b15==10){i="1";b15=1;}else{}
            }
        });
        TextView textView23 = (TextView) findViewById(R.id.textView23);
        textView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b16++);textView23.setText(i);
                if(b16==8){p17=8;}else{p17=0;}
                if(b16==10){i="1";b16=1;}else{}
            }
        });
        TextView textView24 = (TextView) findViewById(R.id.textView24);
        textView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b17++);textView24.setText(i);
                if(b17==9){p18=9;}else{p18=0;}
                if(b17==10){i="1";b17=1;}else{}
            }
        });

        TextView textView25 = (TextView) findViewById(R.id.textView25);
        textView25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b18++);textView25.setText(i);
                if(b18==10){p19=10;}else{p19=0;}
                if(b18==10){i="1";b18=1;}else{}
            }
        });

        TextView textView26 = (TextView) findViewById(R.id.textView26);
        textView26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b19++);textView26.setText(i);
                if(b19==6){p20=6;}else{p20=0;}
                if(b19==10){i="1";b19=1;}else{}
            }
        });
        TextView textView27 = (TextView) findViewById(R.id.textView27);
        textView27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b20++);textView27.setText(i);
                if(b20==4){p21=4;}else{p21=0;}
                if(b20==10){i="1";b20=1;}else{}
            }
        });
        TextView textView28 = (TextView) findViewById(R.id.textView28);
        textView28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b21++);textView28.setText(i);
                if(b21==10){p22=10;}else{p22=0;}
                if(b21==10){i="1";b21=1;}else{}
            }
        });
        TextView textView29 = (TextView) findViewById(R.id.textView29);
        textView29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b22++);textView29.setText(i);
                if(b22==5){p23=5;}else{p23=0;}
                if(b22==10){i="1";b22=1;}else{}
            }
        });

        TextView textView30 = (TextView) findViewById(R.id.textView30);
        textView30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b23++);textView30.setText(i);
                if(b23==6){p24=6;}else{p24=0;}
                if(b23==10){i="1";b23=1;}else{}
            }
        });
        TextView textView32 = (TextView) findViewById(R.id.textView32);
        textView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b24++);textView32.setText(i);
                if(b24==4){p25=4;}else{p25=0;}
                if(b24==10){i="1";b24=1;}else{}
            }
        });
        TextView textView33 = (TextView) findViewById(R.id.textView33);
        textView33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b25++);textView33.setText(i);
                if(b25==7){p26=7;}else{p26=0;}
                if(b25==10){i="1";b25=1;}else{}
            }
        });
        TextView textView34 = (TextView) findViewById(R.id.textView34);
        textView34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b26++);textView34.setText(i);
                if(b26==3){p27=3;}else{p27=0;}
                if(b26==10){i="1";b26=1;}else{}
            }
        });
        TextView textView35 = (TextView) findViewById(R.id.textView35);
        textView35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b27++);textView35.setText(i);
                if(b27==8){p28=8;}else{p28=0;}
                if(b27==10){i="1";b27=1;}else{}
            }
        });
        TextView textView36 = (TextView) findViewById(R.id.textView36);
        textView36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b28++);textView36.setText(i);
                if(b28==9){p29=9;}else{p29=0;}
                if(b28==10){i="1";b28=1;}else{}
            }
        });//
        TextView textView38 = (TextView) findViewById(R.id.textView38);
        textView38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b29++);textView38.setText(i);
                if(b29==9){p30=9;}else{p30=0;}
                if(b29==10){i="1";b29=1;}else{}
            }
        });
        TextView textView39 = (TextView) findViewById(R.id.textView39);
        textView39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b30++);textView39.setText(i);
                if(b30==8){p31=8;}else{p31=0;}
                if(b30==10){i="1";b30=1;}else{}
            }
        });
        TextView textView41 = (TextView) findViewById(R.id.textView41);
        textView41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b31++);textView41.setText(i);
                if(b31==3){p32=3;}else{p32=0;}
                if(b31==10){i="1";b31=1;}else{}
            }
        });
        TextView textView42 = (TextView) findViewById(R.id.textView42);
        textView42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b32++);textView42.setText(i);
                if(b32==5){p33=5;}else{p33=0;}
                if(b32==10){i="1";b32=1;}else{}
            }
        });
        TextView textView43 = (TextView) findViewById(R.id.textView43);
        textView43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b33++);textView43.setText(i);
                if(b33==2){p34=2;}else{p34=0;}
                if(b33==10){i="1";b33=1;}else{}
            }
        });
        TextView textView44 = (TextView) findViewById(R.id.textView44);
        textView44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b34++);textView44.setText(i);
                if(b34==4){p35=4;}else{p35=0;}
                if(b34==10){i="1";b34=1;}else{}
            }
        });
        TextView textView45 = (TextView) findViewById(R.id.textView45);
        textView45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b35++);textView45.setText(i);
                if(b35==10){p36=10;}else{p36=0;}
                if(b35==10){i="1";b35=1;}else{}
            }
        });
        TextView textView47 = (TextView) findViewById(R.id.textView47);
        textView47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b36++);textView47.setText(i);
                if(b36==3){p37=3;}else{p37=0;}
                if(b36==10){i="1";b36=1;}else{}
            }
        });
        TextView textView48 = (TextView) findViewById(R.id.textView48);
        textView48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b37++);textView48.setText(i);
                if(b37==2){p38=2;}else{p38=0;}
                if(b37==10){i="1";b37=1;}else{}
            }
        });
        TextView textView49 = (TextView) findViewById(R.id.textView49);
        textView49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b38++);textView49.setText(i);
                if(b38==9){p39=9;}else{p39=0;}
                if(b38==10){i="1";b38=1;}else{}
            }
        });
        TextView textView50 = (TextView) findViewById(R.id.textView50);
        textView50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b39++);textView50.setText(i);
                if(b39==10){p40=10;}else{p40=0;}
                if(b39==10){i="1";b39=1;}else{}
            }
        });
        TextView textView51 = (TextView) findViewById(R.id.textView51);
        textView51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b40++);textView51.setText(i);
                if(b40==8){p41=8;}else{p41=0;}
                if(b40==10){i="1";b40=1;}else{}
            }
        });
        TextView textView54 = (TextView) findViewById(R.id.textView54);
        textView54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b41++);textView54.setText(i);
                if(b41==6){p42=6;}else{p42=0;}
                if(b41==10){i="1";b41=1;}else{}
            }
        });
        TextView textView55 = (TextView) findViewById(R.id.textView55);
        textView55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b42++);textView55.setText(i);
                if(b42==2){p43=2;}else{p43=0;}
                if(b42==10){i="1";b42=1;}else{}
            }
        });
        TextView textView56 = (TextView) findViewById(R.id.textView56);
        textView56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b43++);textView56.setText(i);
                if(b43==7){p44=7;}else{p44=0;}
                if(b43==10){i="1";b43=1;}else{}
            }
        });
        TextView textView57 = (TextView) findViewById(R.id.textView57);
        textView57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b44++);textView57.setText(i);
                if(b44==3){p45=3;}else{p45=0;}
                if(b44==10){i="1";b44=1;}else{}
            }
        });
        TextView textView59 = (TextView) findViewById(R.id.textView59);
        textView59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b45++);textView59.setText(i);
                if(b45==6){p46=6;}else{p46=0;}
                if(b45==10){i="1";b45=1;}else{}
            }
        });
        TextView textView60 = (TextView) findViewById(R.id.textView60);
        textView60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b46++);textView60.setText(i);
                if(b46==10){p47=10;}else{p47=0;}
                if(b46==10){i="1";b46=1;}else{}
            }
        });
        TextView textView61 = (TextView) findViewById(R.id.textView61);
        textView61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b47++);textView61.setText(i);
                if(b47==9){p48=9;}else{p48=0;}
                if(b47==10){i="1";b47=1;}else{}
            }
        });
        TextView textView62 = (TextView) findViewById(R.id.textView62);
        textView62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b48++);textView62.setText(i);
                if(b48==5){p49=5;}else{p49=0;}
                if(b48==10){i="1";b48=1;}else{}
            }
        });
        TextView textView63 = (TextView) findViewById(R.id.textView63);
        textView63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b49++);textView63.setText(i);
                if(b49==8){p50=8;}else{p50=0;}
                if(b49==10){i="1";b49=1;}else{}
            }
        });
        TextView textView64 = (TextView) findViewById(R.id.textView64);
        textView64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b50++);textView64.setText(i);
                if(b50==6){p51=6;}else{p51=0;}
                if(b50==10){i="1";b50=1;}else{}
            }
        });
        TextView textView65 = (TextView) findViewById(R.id.textView65);
        textView65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b51++);textView65.setText(i);
                if(b51==8){p52=8;}else{p52=0;}
                if(b51==10){i="1";b51=1;}else{}
            }
        });
        TextView textView66 = (TextView) findViewById(R.id.textView66);
        textView66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b52++);textView66.setText(i);
                if(b52==5){p53=5;}else{p53=0;}
                if(b52==10){i="1";b52=1;}else{}
            }
        });
        TextView textView67 = (TextView) findViewById(R.id.textView67);
        textView67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b53++);textView67.setText(i);
                if(b53==7){p54=7;}else{p54=0;}
                if(b53==10){i="1";b53=1;}else{}
            }
        });
        TextView textView68 = (TextView) findViewById(R.id.textView68);
        textView68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b54++);textView68.setText(i);
                if(b54==9){p55=9;}else{p55=0;}
                if(b54==10){i="1";b54=1;}else{}
            }
        });
        TextView textView69 = (TextView) findViewById(R.id.textView69);
        textView69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b55++);textView69.setText(i);
                if(b55==3){p56=3;}else{p56=0;}
                if(b55==10){i="1";b55=1;}else{}
            }
        });
        TextView textView70 = (TextView) findViewById(R.id.textView70);
        textView70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b56++);textView70.setText(i);
                if(b56==4){p57=4;}else{p57=0;}
                if(b56==10){i="1";b56=1;}else{}
            }
        });
        TextView textView74 = (TextView) findViewById(R.id.textView74);
        textView74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b57++);textView74.setText(i);
                if(b57==10){p58=10;}else{p58=0;}
                if(b57==10){i="1";b57=1;}else{}
            }
        });
        TextView textView75 = (TextView) findViewById(R.id.textView75);
        textView75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b58++);textView75.setText(i);
                if(b58==4){p59=4;}else{p59=0;}
                if(b58==10){i="1";b58=1;}else{}
            }
        });
        TextView textView78 = (TextView) findViewById(R.id.textView78);
        textView78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b59++);textView78.setText(i);
                if(b59==2){p60=2;}else{p60=0;}
                if(b59==10){i="1";b59=1;}else{}
            }
        });
        TextView textView79 = (TextView) findViewById(R.id.textView79);
        textView79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b60++);textView79.setText(i);
                if(b60==6){p61=6;}else{p61=0;}
                if(b60==10){i="1";b60=1;}else{}
            }
        });
        TextView textView80 = (TextView) findViewById(R.id.textView80);
        textView80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b61++);textView80.setText(i);
                if(b61==3){p62=3;}else{p62=0;}
                if(b61==10){i="1";b61=1;}else{}
            }
        });
        TextView textView81 = (TextView) findViewById(R.id.textView81);
        textView81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b62++);textView81.setText(i);
                if(b62==7){p63=7;}else{p63=0;}
                if(b62==10){i="1";b62=1;}else{}
            }
        });
        TextView textView58 = (TextView) findViewById(R.id.textView58);
        textView58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b63++);textView58.setText(i);
                if(b63==4){p64=4;}else{p64=0;}
                if(b63==10){i="1";b63=1;}else{}
            }
        });
        dialogEnd = new Dialog(this);
        Button button_proverka= (Button) findViewById(R.id.button_proverka);
        button_proverka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p1 == 3 && p2 == 4 && p3 == 9 && p4 == 10 && p5 == 6 &&
                        p6 == 2 && p7 == 5 && p8 == 8 && p9 == 5 && p10 == 2 && p11 == 4 && p12 == 7
                        && p13 == 9 && p14 == 3 && p15 == 5 && p16 == 7 && p17 == 8 && p18 == 9 && p19 == 10
                        && p20 == 6 && p21 == 4 && p22 == 10 && p23 == 5 && p24 == 6 && p25 == 4 && p26 == 7
                        && p27 == 3 && p28 == 8 && p29 == 9 && p30 == 9 && p31 == 8 && p32 == 3 && p33 == 5
                        && p34 == 2 && p35 == 4 && p36 == 10 && p37 == 3 && p38 == 2 && p39 == 9 && p40 == 10
                        && p41 == 8 && p42 == 6 && p43 == 2 && p44 == 7 && p45 == 3 && p46 == 6 && p47 == 10
                        && p48 == 9 && p49 == 5 && p50 == 8 && p51 == 6 && p52 == 8 && p53 == 5 && p54 == 7
                        && p55 == 9 && p56 == 3 && p57 == 4 && p58 == 10 && p59 == 4 && p60 == 2 && p61 == 6
                        && p62 == 3 && p63 == 7 && p64 == 4) {
                    dialogEnd.requestWindowFeature(Window.FEATURE_NO_TITLE);
                    dialogEnd.setContentView(R.layout.preview1lvlendgame);
                    dialogEnd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    dialogEnd.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                            WindowManager.LayoutParams.MATCH_PARENT);
                    dialogEnd.setCancelable(false);
                    TextView button_close1 = (TextView) dialogEnd.findViewById(R.id.button_close1);
                    button_close1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                Intent intent = new Intent(level21.this, Gamelevels.class);
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
                            Intent intent = new Intent(level21.this, Gamelevels.class);
                            startActivity(intent);
                            finish();
                            dialogEnd.dismiss();
                        }
                    });
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
            Intent intent=new Intent(level21.this,Gamelevels.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
    }

}
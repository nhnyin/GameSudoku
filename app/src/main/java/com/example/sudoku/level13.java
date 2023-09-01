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

public class level13 extends AppCompatActivity {


    String i="1";int b=1,b1=1,b2=1,b3=1,b4=1,b5=1,b6=1,b7=1,b8=1,b9=1,b10=1,
            b11=1,b12=1,b13=1,b14=1,b15=1,b16=1,b17=1,b18=1,b19=1,b20=1,
            b21=1,b22=1,b23=1,b24=1,b25=1,b26=1,b27=1,b28=1,b29=1,b30=1,b31=1,
            b32=1,b33=1,b34=1,b35=1,b36=1,b37=1,b38=1,b39=1,b40=1,b41=1,b42=1,
            p1=0,p2=0,p3=0,p4=0,p5=0,p6=0,p7=0,p8=0,p9=0,p10=0,
            p11=0,p12=0,p13=0,p14=0,p15=0,p16=0,p17=0,p18=0,p19=0,p20=0,p21=0,
            p22=0,p23=0,p24=0,p25=0,p26=0,p27=0,p28=0,p29=0,p30=0,p31=0,p32=0,
            p33=0,p34=0,p35=0,p36=0,p37=0,p38=0,p39=0,p40=0,p41=0,p42=0,p43=0;
    private Toast backToast;private
    Dialog dialog;
    Dialog dialogEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level13);
        Window w= getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Button button_level= (Button) findViewById(R.id.button_level);
        button_level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent=new Intent(level13.this,Gamelevels.class);
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
                    Intent intent=new Intent(level13.this,Gamelevels.class);
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
                if(b==10){p1=10;}else{p1=0;}
                if(b==10){i="1";b=1;}else{}
            }
        });
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b1++);textView2.setText(i);
                if(b1==5){p2=5;}else{p2=0;}
                if(b1==10){i="1";b1=1;}else{}
            }
        });
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b2++);textView4.setText(i);
                if(b2==3){p3=3;}else{p3=0;}
                if(b2==10){i="1";b2=1;}else{}
            }
        });
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b3++);textView5.setText(i);
                if(b3==8){p4=8;}else{p4=0;}
                if(b3==10){i="1";b3=1;}else{}
            }
        });
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b4++);textView6.setText(i);
                if(b4==2){p5=2;}else{p5=0;}
                if(b4==10){i="1";b4=1;}else{}
            }
        });
        TextView textView8 = (TextView) findViewById(R.id.textView8);
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b5++);textView8.setText(i);
                if(b5==4){p6=4;}else{p6=0;}
                if(b5==10){i="1";b5=1;}else{}
            }
        });
        TextView textView9 = (TextView) findViewById(R.id.textView9);
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b6++);textView9.setText(i);
                if(b6==7){p7=7;}else{p7=0;}
                if(b6==10){i="1";b6=1;}else{}
            }
        });
        TextView textView13 = (TextView) findViewById(R.id.textView13);
        textView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b7++);textView13.setText(i);
                if(b7==4){p8=4;}else{p8=0;}
                if(b7==10){i="1";b7=1;}else{}
            }
        });
        TextView textView14 = (TextView) findViewById(R.id.textView14);
        textView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b8++);textView14.setText(i);
                if(b8==10){p9=10;}else{p9=0;}
                if(b8==10){i="1";b8=1;}else{}
            }
        });
        TextView textView20 = (TextView) findViewById(R.id.textView20);
        textView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b9++);textView20.setText(i);
                if(b9==4){p10=4;}else{p10=0;}
                if(b9==10){i="1";b9=1;}else{}
            }
        });

        TextView textView23 = (TextView) findViewById(R.id.textView23);
        textView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b10++);textView23.setText(i);
                if(b10==9){p11=9;}else{p11=0;}
                if(b10==10){i="1";b10=1;}else{}
            }
        });
        TextView textView24 = (TextView) findViewById(R.id.textView24);
        textView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b11++);textView24.setText(i);
                if(b11==5){p12=5;}else{p12=0;}
                if(b11==10){i="1";b11=1;}else{}
            }
        });
        TextView textView25 = (TextView) findViewById(R.id.textView25);
        textView25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b12++);textView25.setText(i);
                if(b12==6){p13=6;}else{p13=0;}
                if(b12==10){i="1";b12=1;}else{}
            }
        });
        TextView textView29 = (TextView) findViewById(R.id.textView29);
        textView29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b13++);textView29.setText(i);
                if(b13==6){p14=6;}else{p14=0;}
                if(b13==10){i="1";b13=1;}else{}
            }
        });

        TextView textView30 = (TextView) findViewById(R.id.textView30);
        textView30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b14++);textView30.setText(i);
                if(b14==9){p15=9;}else{p15=0;}
                if(b14==10){i="1";b14=1;}else{}
            }
        });
        TextView textView31 = (TextView) findViewById(R.id.textView31);
        textView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b15++);textView31.setText(i);
                if(b15==5){p16=5;}else{p16=0;}
                if(b15==10){i="1";b15=1;}else{}
            }
        });
        TextView textView32 = (TextView) findViewById(R.id.textView32);
        textView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b16++);textView32.setText(i);
                if(b16==7){p17=7;}else{p17=0;}
                if(b16==10){i="1";b16=1;}else{}
            }
        });
        TextView textView35 = (TextView) findViewById(R.id.textView35);
        textView35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b17++);textView35.setText(i);
                if(b17==10){p18=10;}else{p18=0;}
                if(b17==10){i="1";b17=1;}else{}
            }
        });

        TextView textView39 = (TextView) findViewById(R.id.textView39);
        textView39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b18++);textView39.setText(i);
                if(b18==5){p19=5;}else{p19=0;}
                if(b18==10){i="1";b18=1;}else{}
            }
        });

        TextView textView41 = (TextView) findViewById(R.id.textView41);
        textView41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b19++);textView41.setText(i);
                if(b19==4){p20=4;}else{p20=0;}
                if(b19==10){i="1";b19=1;}else{}
            }
        });
        TextView textView44 = (TextView) findViewById(R.id.textView44);
        textView44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b20++);textView44.setText(i);
                if(b20==6){p21=6;}else{p21=0;}
                if(b20==10){i="1";b20=1;}else{}
            }
        });
        TextView textView45 = (TextView) findViewById(R.id.textView45);
        textView45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b21++);textView45.setText(i);
                if(b21==3){p22=3;}else{p22=0;}
                if(b21==10){i="1";b21=1;}else{}
            }
        });
        TextView textView50 = (TextView) findViewById(R.id.textView50);
        textView50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b22++);textView50.setText(i);
                if(b22==3){p23=3;}else{p23=0;}
                if(b22==10){i="1";b22=1;}else{}
            }
        });
        TextView textView51 = (TextView) findViewById(R.id.textView51);
        textView51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b23++);textView51.setText(i);
                if(b23==10){p24=10;}else{p24=0;}
                if(b23==10){i="1";b23=1;}else{}
            }
        });
        TextView textView52 = (TextView) findViewById(R.id.textView52);
        textView52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b24++);textView52.setText(i);
                if(b24==7){p25=7;}else{p25=0;}
                if(b24==10){i="1";b24=1;}else{}
            }
        });
        TextView textView54 = (TextView) findViewById(R.id.textView54);
        textView54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b25++);textView54.setText(i);
                if(b25==9){p26=9;}else{p26=0;}
                if(b25==10){i="1";b25=1;}else{}
            }
        });
        TextView textView55 = (TextView) findViewById(R.id.textView55);
        textView55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b26++);textView55.setText(i);
                if(b26==5){p27=5;}else{p27=0;}
                if(b26==10){i="1";b26=1;}else{}
            }
        });
        TextView textView57 = (TextView) findViewById(R.id.textView57);
        textView57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b27++);textView57.setText(i);
                if(b27==8){p28=8;}else{p28=0;}
                if(b27==10){i="1";b27=1;}else{}
            }
        });
        TextView textView59 = (TextView) findViewById(R.id.textView59);
        textView59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b28++);textView59.setText(i);
                if(b28==6){p29=6;}else{p29=0;}
                if(b28==10){i="1";b28=1;}else{}
            }
        });
        TextView textView61 = (TextView) findViewById(R.id.textView61);
        textView61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b29++);textView61.setText(i);
                if(b29==2){p30=2;}else{p30=0;}
                if(b29==10){i="1";b29=1;}else{}
            }
        });//
        TextView textView62 = (TextView) findViewById(R.id.textView62);
        textView62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b30++);textView62.setText(i);
                if(b30==9){p31=9;}else{p31=0;}
                if(b30==10){i="1";b30=1;}else{}
            }
        });
        TextView textView63 = (TextView) findViewById(R.id.textView63);
        textView63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b31++);textView63.setText(i);
                if(b31==4){p32=4;}else{p32=0;}
                if(b31==10){i="1";b31=1;}else{}
            }
        });
        TextView textView65 = (TextView) findViewById(R.id.textView65);
        textView65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b32++);textView65.setText(i);
                if(b32==3){p33=3;}else{p33=0;}
                if(b32==10){i="1";b32=1;}else{}
            }
        });
        TextView textView67 = (TextView) findViewById(R.id.textView67);
        textView67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b33++);textView67.setText(i);
                if(b33==9){p34=9;}else{p34=0;}
                if(b33==10){i="1";b33=1;}else{}
            }
        });
        TextView textView69 = (TextView) findViewById(R.id.textView69);
        textView69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b34++);textView69.setText(i);
                if(b34==7){p35=7;}else{p35=0;}
                if(b34==10){i="1";b34=1;}else{}
            }
        });
        TextView textView72 = (TextView) findViewById(R.id.textView72);
        textView72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b35++);textView72.setText(i);
                if(b35==6){p36=6;}else{p36=0;}
                if(b35==10){i="1";b35=1;}else{}
            }
        });
        TextView textView75 = (TextView) findViewById(R.id.textView75);
        textView75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b36++);textView75.setText(i);
                if(b36==10){p37=10;}else{p37=0;}
                if(b36==10){i="1";b36=1;}else{}
            }
        });
        TextView textView77 = (TextView) findViewById(R.id.textView77);
        textView77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b37++);textView77.setText(i);
                if(b37==2){p38=2;}else{p38=0;}
                if(b37==10){i="1";b37=1;}else{}
            }
        });
        TextView textView78 = (TextView) findViewById(R.id.textView78);
        textView78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b38++);textView78.setText(i);
                if(b38==4){p39=4;}else{p39=0;}
                if(b38==10){i="1";b38=1;}else{}
            }
        });

        dialogEnd = new Dialog(this);
        Button button_proverka= (Button) findViewById(R.id.button_proverka);
        button_proverka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(p1==10&&p2==5&&p3==3&&p4==8&&p5==2&&
                        p6==4&&p7==7&&p8==4&&p9==10&&p10==4&&p11==9&&p12==5
                        &&p13==6&&p14==6&&p15==9&&p16==5&&p17==7&&p18==10&&p19==5
                        &&p20==4&&p21==6&&p22==3&&p23==3&&p24==10&&p25==7&&p26==9
                        &&p27==5&&p28==8&&p29==6&&p30==2&&p31==9&&p32==4&&p33==3
                        &&p34==9&&p35==7&&p36==6&&p37==10&&p38==2&&p39==4){
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
                                Intent intent = new Intent(level13.this, Gamelevels.class);
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
                            Intent intent = new Intent(level13.this, level14.class);
                            startActivity(intent);
                            finish();
                            dialogEnd.dismiss();
                        }
                    });
                    SharedPreferences save =getSharedPreferences("Save",MODE_PRIVATE);
                    final int level = save.getInt("Level",1);
                    if(level>13){}else {SharedPreferences.Editor editor=save.edit();
                        editor.putInt("Level",14);
                        editor.commit();}
                    dialogEnd.show();
                }else{backToast= Toast.makeText(getBaseContext(),"Исправь ошибки и попробуй ещё раз",Toast.LENGTH_SHORT);
                    backToast.show();}}
        });

    }



    @Override
    public void onBackPressed (){
        try {
            Intent intent=new Intent(level13.this,Gamelevels.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
    }

}
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

public class level6 extends AppCompatActivity {


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
        setContentView(R.layout.activity_level6);
        Window w= getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Button button_level= (Button) findViewById(R.id.button_level);
        button_level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent=new Intent(level6.this,Gamelevels.class);
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
                    Intent intent=new Intent(level6.this,Gamelevels.class);
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
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b++);textView2.setText(i);
                if(b==4){p1=4;}else{p1=0;}
                if(b==10){i="1";b=1;}else{}
            }
        });
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b1++);textView3.setText(i);
                if(b1==10){p2=10;}else{p2=0;}
                if(b1==10){i="1";b1=1;}else{}
            }
        });
//        TextView textView4 = (TextView) findViewById(R.id.textView4);
//        textView4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                i=String.valueOf(b2++);textView4.setText(i);
//                if(b2==10){p3=10;}else{p3=0;}
//                if(b2==10){i="1";b2=1;}else{}
//            }
//        });
        TextView textView12 = (TextView) findViewById(R.id.textView12);
        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b3++);textView12.setText(i);
                if(b3==9){p4=9;}else{p4=0;}
                if(b3==10){i="1";b3=1;}else{}
            }
        });
        TextView textView14 = (TextView) findViewById(R.id.textView14);
        textView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b4++);textView14.setText(i);
                if(b4==2){p5=2;}else{p5=0;}
                if(b4==10){i="1";b4=1;}else{}
            }
        });
        TextView textView17 = (TextView) findViewById(R.id.textView17);
        textView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b5++);textView17.setText(i);
                if(b5==7){p6=7;}else{p6=0;}
                if(b5==10){i="1";b5=1;}else{}
            }
        });
        TextView textView24 = (TextView) findViewById(R.id.textView24);
        textView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b6++);textView24.setText(i);
                if(b6==6){p7=6;}else{p7=0;}
                if(b6==10){i="1";b6=1;}else{}
            }
        });
        TextView textView27 = (TextView) findViewById(R.id.textView27);
        textView27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b7++);textView27.setText(i);
                if(b7==9){p8=9;}else{p8=0;}
                if(b7==10){i="1";b7=1;}else{}
            }
        });
        TextView textView30 = (TextView) findViewById(R.id.textView30);
        textView30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b8++);textView30.setText(i);
                if(b8==3){p9=3;}else{p9=0;}
                if(b8==10){i="1";b8=1;}else{}
            }
        });
        TextView textView38 = (TextView) findViewById(R.id.textView38);
        textView38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b9++);textView38.setText(i);
                if(b9==9){p10=9;}else{p10=0;}
                if(b9==10){i="1";b9=1;}else{}
            }
        });

        TextView textView41 = (TextView) findViewById(R.id.textView41);
        textView41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b10++);textView41.setText(i);
                if(b10==3){p11=3;}else{p11=0;}
                if(b10==10){i="1";b10=1;}else{}
            }
        });
        TextView textView42 = (TextView) findViewById(R.id.textView42);
        textView42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b11++);textView42.setText(i);
                if(b11==2){p12=2;}else{p12=0;}
                if(b11==10){i="1";b11=1;}else{}
            }
        });
        TextView textView53 = (TextView) findViewById(R.id.textView53);
        textView53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b12++);textView53.setText(i);
                if(b12==6){p13=6;}else{p13=0;}
                if(b12==10){i="1";b12=1;}else{}
            }
        });
//        TextView textView45 = (TextView) findViewById(R.id.textView45);
//        textView45.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                i=String.valueOf(b13++);textView45.setText(i);
//                if(b13==3){p14=3;}else{p14=0;}
//                if(b13==10){i="1";b13=1;}else{}
//            }
//        });

//        TextView textView49 = (TextView) findViewById(R.id.textView49);
//        textView49.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                i=String.valueOf(b14++);textView49.setText(i);
//                if(b14==10){p15=10;}else{p15=0;}
//                if(b14==10){i="1";b14=1;}else{}
//            }
//        });
//        TextView textView50 = (TextView) findViewById(R.id.textView50);
//        textView50.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                i=String.valueOf(b15++);textView50.setText(i);
//                if(b15==3){p16=3;}else{p16=0;}
//                if(b15==10){i="1";b15=1;}else{}
//            }
//        });
        TextView textView59 = (TextView) findViewById(R.id.textView59);
        textView59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b16++);textView59.setText(i);
                if(b16==9){p17=9;}else{p17=0;}
                if(b16==10){i="1";b16=1;}else{}
            }
        });
        TextView textView65 = (TextView) findViewById(R.id.textView65);
        textView65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b17++);textView65.setText(i);
                if(b17==2){p18=2;}else{p18=0;}
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
                if(b19==3){p20=3;}else{p20=0;}
                if(b19==10){i="1";b19=1;}else{}
            }
        });
        TextView textView70 = (TextView) findViewById(R.id.textView70);
        textView70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b20++);textView70.setText(i);
                if(b20==6){p21=6;}else{p21=0;}
                if(b20==10){i="1";b20=1;}else{}
            }
        });
        TextView textView81 = (TextView) findViewById(R.id.textView81);
        textView81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=String.valueOf(b21++);textView81.setText(i);
                if(b21==7){p22=7;}else{p22=0;}
                if(b21==10){i="1";b21=1;}else{}
            }
        });

        dialogEnd = new Dialog(this);
        Button button_proverka= (Button) findViewById(R.id.button_proverka);
        button_proverka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(p1==4&&p2==10&&p4==9&&p5==2&&
                        p6==7&&p7==6&&p8==9&&p9==3&&p10==9&&p11==3&&p12==2
                        &&p13==6&&p17==9&&p18==2&&p19==4
                        &&p20==3&&p21==6&&p22==7){
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
                                Intent intent = new Intent(level6.this, Gamelevels.class);
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
                            Intent intent = new Intent(level6.this, level7.class);
                            startActivity(intent);
                            finish();
                            dialogEnd.dismiss();
                        }
                    });
                    SharedPreferences save =getSharedPreferences("Save",MODE_PRIVATE);
                    final int level = save.getInt("Level",1);
                    if(level>6){}else {SharedPreferences.Editor editor=save.edit();
                        editor.putInt("Level",7);
                        editor.commit();}
                    dialogEnd.show();
                }else{backToast= Toast.makeText(getBaseContext(),"Исправь ошибки и попробуй ещё раз",Toast.LENGTH_SHORT);
                    backToast.show();}}
        });

    }



    @Override
    public void onBackPressed (){
        try {
            Intent intent=new Intent(level6.this,Gamelevels.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
    }

}
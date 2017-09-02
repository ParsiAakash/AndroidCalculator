package com.example.parsi.anuragcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button one,two,three,four,five,six,seven,eight,nine,zero,plus,sub,mul,div,dot,equal,clr;
    TextView res;
    EditText dis;
   boolean a,m,d,s;
    float n1,n2;
    String sn1="",sn2="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.four);
        five=(Button)findViewById(R.id.five);
        six=(Button)findViewById(R.id.six);
        seven=(Button)findViewById(R.id.seven);
        eight=(Button)findViewById(R.id.eight);
        nine=(Button)findViewById(R.id.nine);
        zero=(Button)findViewById(R.id.zero);
        plus=(Button)findViewById(R.id.plus);
        sub=(Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);
        dot=(Button)findViewById(R.id.dot);
        equal=(Button)findViewById(R.id.equal);
        clr=(Button)findViewById(R.id.clr);
        res=(TextView)findViewById(R.id.res);
        dis=(EditText)findViewById(R.id.dis);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dis.setText(dis.getText()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dis.setText(dis.getText()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dis.setText(dis.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dis.setText(dis.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dis.setText(dis.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dis.setText(dis.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dis.setText(dis.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dis.setText(dis.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dis.setText(dis.getText()+"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dis.setText(dis.getText()+"0");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dis.setText(dis.getText()+".");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tryin();
                a = true;
                if (dis.equals(""))
                {
                    dis.setText("");
                }
                else
                {
                    if(sn1.equals("")) {
                        sn1 = dis.getText().toString();
                        n1 = Float.parseFloat(sn1);
                    }
                    else if(!sn1.equals("") && sn2.equals(""))
                    {
                        sn2=dis.getText().toString();
                        n2=Float.parseFloat(sn2);
                        float f=n1+n2;
                        int i=(int)f;
                        if(f-i==0.0)
                        {
                            dis.setText(i+"");
                        }
                        else
                        {
                            dis.setText(f+"");
                        }
                        n1=n1+n2;
                        sn2="";
                    }
                    res.setText(dis.getText()+"+");
                    dis.setText("");
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tryin();
                s = true;
                if (dis.equals(""))
                {
                    dis.setText("");
                }
                else
                {
                    if(sn1.equals("")) {
                        sn1 = dis.getText().toString();
                        n1 = Float.parseFloat(sn1);
                    }
                    else if(!sn1.equals("") && sn2.equals(""))
                    {
                        sn2=dis.getText().toString();
                        n2=Float.parseFloat(sn2);
                        dis.setText(n1-n2+"");
                        n1=n1-n2;
                        sn2="";
                    }
                    res.setText(dis.getText()+"-");
                    dis.setText("");
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tryin();
                m = true;
                if (dis.equals(""))
                {
                    dis.setText("");
                }
                else
                {
                    if(sn1.equals("")) {
                        sn1 = dis.getText().toString();
                        n1 = Float.parseFloat(sn1);
                    }
                    else if(!sn1.equals("") && sn2.equals(""))
                    {
                        sn2=dis.getText().toString();
                        n2=Float.parseFloat(sn2);
                        dis.setText(n1*n2+"");
                        n1=n1*n2;
                        sn2="";
                    }
                    res.setText(dis.getText()+"*");
                    dis.setText("");
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tryin();
                d = true;
                if (dis.equals(""))
                {
                    dis.setText("");
                }
                else
                {
                    if(sn1.equals("")) {
                        sn1 = dis.getText().toString();
                        n1 = Float.parseFloat(sn1);
                    }
                    else if(!sn1.equals("") && sn2.equals(""))
                    {
                        sn2=dis.getText().toString();
                        n2=Float.parseFloat(sn2);
                        dis.setText(n1/n2+"");
                        n1=n1/n2;
                        sn2="";
                    }
                    res.setText(dis.getText()+"/");
                    dis.setText("");
                }
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dis.setText("");
                res.setText("");
                n1=0;
                n2=0;
                sn1="";
                sn2="";
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dis.setText(dis.getText()+".");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n2 = Float.parseFloat(dis.getText() + "");
                res.setText(res.getText().toString()+dis.getText().toString());
                if (a == true){
                    dis.setText(n1 + n2 +"");
                    sn1="";
                    res.setText("");
                    a=false;
                }
                if (s == true){
                    dis.setText(n1 - n2 +"");
                    sn1="";
                    res.setText("");
                    s=false;
                }

                if (m == true){
                    dis.setText(n1 * n2 +"");
                    sn1="";
                    res.setText("");
                    m=false;
                }

                if (d == true) {
                    dis.setText(n1 / n2 +"");
                    sn1="";
                    res.setText("");
                    d=false;

                }
            }
        });

    }
    void tryin()
    {
        n2 = Float.parseFloat(dis.getText() + "");
        res.setText(res.getText().toString()+dis.getText().toString());
        if (a == true){
            dis.setText(n1 + n2 +"");
            sn1="";
            res.setText("");
            a=false;
        }
        if (s == true){
            dis.setText(n1 - n2 +"");
            sn1="";
            res.setText("");
            s=false;
        }

        if (m == true){
            dis.setText(n1 * n2 +"");
            sn1="";
            res.setText("");
            m=false;
        }

        if (d == true) {
            dis.setText(n1 / n2 +"");
            sn1="";
            res.setText("");
            d=false;

        }
    }
}

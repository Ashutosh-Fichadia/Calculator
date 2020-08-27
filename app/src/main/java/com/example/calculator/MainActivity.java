package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {
    public EditText et;
    public EditText et2;
    public Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    double no1;
    double no2;
    double total;
    char operator;
    boolean sign=false;
    String data;
    char last ;
    char last1 ;
    boolean dec=false;
    boolean equans=false;
    BigInteger b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.et);
        et2 = (EditText) findViewById(R.id.et2);
        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        final Button btnPlus = (Button)findViewById(R.id.add);
        final Button btnMinus = (Button)findViewById(R.id.sub);
        final Button btnMultiply = (Button)findViewById(R.id.mul);
        final Button btnDivide = (Button)findViewById(R.id.div);
        final Button btnEquals = (Button)findViewById(R.id.equ);
        final Button btnClear = (Button)findViewById(R.id.clr);
        final ImageButton btnback = (ImageButton)findViewById(R.id.btnbackspace);

        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String str = et.getText().toString();
                if(str.contains("+")||str.contains("-")||str.contains("x")||str.contains("÷"))
                {
                    calc();
                }
                else
                {
                    et2.setText("");
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et.getText()!=null)
                {
                    String t = et.getText().toString();
                    t = t.substring(0,t.length()-1);
                    et.setText(t);
                }
                else
                {
                    btnback.setEnabled(false);
                }
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn0Text = btn0.getText().toString();
                if(equans==true)
                {
                    et.setText("");
                }
                else
                {

                }
                if(sign==true)
                {
                    String temp = no2+"";
                    if(no2==0.0)
                    {
                        String temp1 = btn0Text;
                        temp =  temp1;
                        no2 = Double.parseDouble(temp);
                    }
                    else
                    {
                        if (dec == true) {


                        }
                        else{
                            if(no2-(int)no2==0)
                            {
                                temp = (int)no2+"";
                            }
                            else
                            {

                            }
                        }
                        String temp1 = btn0Text;
                        temp = temp + temp1;
                        no2 = Double.parseDouble(temp);
                    }
                   no2 = Double.parseDouble(temp);
                }
                else
                {

                    no2= 0.0;
                }

                et.setText(et.getText() + btn0Text);
                equans=false;
            }

        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn1Text = btn1.getText().toString();
                if(equans==true)
                {
                    et.setText("");
                }
                else
                {

                }
                if(sign==true)
                {
                    String temp = no2+"";
                    if(no2==0.0)
                    {
                        String temp1 = btn1Text;
                        temp =  temp1;
                        no2 = Double.parseDouble(temp);
                    }
                    else
                    {
                        if (dec == true) {


                        }
                        else{
                            if(no2-(int)no2==0)
                            {
                                temp = (int)no2+"";
                            }
                            else
                            {

                            }
                        }
                       String temp1 = btn1Text;
                        temp = temp + temp1;
                        no2 = Double.parseDouble(temp);
                    }
                    no2 = Double.parseDouble(temp);
                }
                else
                {
                    no2= 0.0;
                }
                et.setText(et.getText() + btn1Text);
                equans=false;
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn2Text = btn2.getText().toString();
                if(equans==true)
                {
                    et.setText("");
                }
                else
                {

                }
                if(sign==true)
                {
                    String temp = no2+"";
                    if(no2==0.0)
                    {
                        String temp1 = btn2Text;
                        temp =  temp1;
                        no2 = Double.parseDouble(temp);
                    }
                    else
                    {
                        if (dec == true) {


                        }
                        else{
                            if(no2-(int)no2==0)
                            {
                                temp = (int)no2+"";
                            }
                            else
                            {

                            }
                        }
                        String temp1 = btn2Text;
                        temp = temp + temp1;
                        no2 = Double.parseDouble(temp);
                    }
                }
                else
                {
                    no2= 0.0;
                }
                et.setText(et.getText() + btn2Text);
                equans=false;
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn3Text = btn3.getText().toString();
                if(equans==true)
                {
                    et.setText("");
                }
                else
                {

                }
                if(sign==true)
                {
                    String temp = no2+"";
                    if(no2==0.0)
                    {
                        String temp1 = btn3Text;
                        temp =  temp1;
                        no2 = Double.parseDouble(temp);
                    }
                    else
                    {
                        if (dec == true) {


                        }
                        else{
                            if(no2-(int)no2==0)
                            {
                                temp = (int)no2+"";
                            }
                            else
                            {

                            }
                        }
                        String temp1 = btn3Text;
                        temp = temp + temp1;
                        no2 = Double.parseDouble(temp);
                    }

                }
                else
                {
                    no2= 0.0;
                }
                et.setText(et.getText() + btn3Text);
                equans=false;
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn4Text = btn4.getText().toString();
                if(equans==true)
                {
                    et.setText("");
                }
                else
                {

                }
                if(sign==true)
                {
                    String temp = no2+"";
                    if(no2==0.0)
                    {
                        String temp1 = btn4Text;
                        temp =  temp1;
                        no2 = Double.parseDouble(temp);
                    }
                    else
                    {
                        if (dec == true) {


                        }
                        else{
                            if(no2-(int)no2==0)
                            {
                                temp = (int)no2+"";
                            }
                            else
                            {

                            }
                        }
                        String temp1 = btn4Text;
                        temp = temp + temp1;
                        no2 = Double.parseDouble(temp);
                    }


                }
                else
                {
                    no2= 0.0;
                }
                et.setText(et.getText() + btn4Text);
                equans=false;
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn5Text = btn5.getText().toString();
                if(equans==true)
                {
                    et.setText("");
                }
                else
                {

                }
                if(sign==true)
                {
                    String temp = no2+"";
                    if(no2==0.0)
                    {
                        String temp1 = btn5Text;
                        temp =  temp1;
                        no2 = Double.parseDouble(temp);
                    }
                    else
                    {
                        if (dec == true) {


                        }
                        else{
                            if(no2-(int)no2==0)
                            {
                                temp = (int)no2+"";
                            }
                            else
                            {

                            }
                        }
                        String temp1 = btn5Text;
                        temp = temp + temp1;
                        no2 = Double.parseDouble(temp);
                    }
                }
                else
                {
                    no2= 0.0;
                }
                et.setText(et.getText() + btn5Text);
                equans=false;
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn6Text = btn6.getText().toString();
                if(equans==true)
                {
                    et.setText("");
                }
                else
                {

                }
                if(sign==true)
                {
                    String temp = no2+"";
                    if(no2==0.0)
                    {
                        String temp1 = btn6Text;
                        temp =  temp1;
                        no2 = Double.parseDouble(temp);
                    }
                    else
                    {
                        if (dec == true) {


                        }
                        else{
                            if(no2-(int)no2==0)
                            {
                                temp = (int)no2+"";
                            }
                            else
                            {

                            }
                        }
                        String temp1 = btn6Text;
                        temp = temp + temp1;
                        no2 = Double.parseDouble(temp);
                    }
                }
                else
                {
                    no2= 0.0;
                }
                et.setText(et.getText() + btn6Text);
                equans=false;
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn7Text = btn7.getText().toString();
                if(equans==true)
                {
                    et.setText("");
                }
                else
                {

                }
                if(sign==true)
                {
                    String temp = no2+"";
                    if(no2==0.0)
                    {
                        String temp1 = btn7Text;
                        temp =  temp1;
                        no2 = Double.parseDouble(temp);
                    }
                    else
                    {
                        if (dec == true) {


                        }
                        else{
                            if(no2-(int)no2==0)
                            {
                                temp = (int)no2+"";
                            }
                            else
                            {

                            }
                        }
                        String temp1 = btn7Text;
                        temp = temp + temp1;
                        no2 = Double.parseDouble(temp);
                    }
                }
                else
                {
                    no2= 0.0;
                }
                et.setText(et.getText() + btn7Text);
                equans=false;
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn8Text = btn8.getText().toString();
                if(equans==true)
                {
                    et.setText("");
                }
                else
                {

                }
                if(sign==true)
                {
                    String temp = no2+"";
                    if(no2==0.0)
                    {
                        String temp1 = btn8Text;
                        temp =  temp1;
                        no2 = Double.parseDouble(temp);
                    }
                    else
                    {
                        if (dec == true) {


                        }
                        else{
                            if(no2-(int)no2==0)
                            {
                                temp = (int)no2+"";
                            }
                            else
                            {

                            }
                        }
                        String temp1 = btn8Text;
                        temp = temp + temp1;
                        no2 = Double.parseDouble(temp);
                    }
                }
                else
                {
                    no2= 0.0;
                }
                et.setText(et.getText() + btn8Text);
                equans=false;
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn9Text = btn9.getText().toString();
                if(equans==true)
                {
                    et.setText("");
                }
                else
                {

                }
                if(sign==true)
                {
                    String temp = no2+"";
                    if(no2==0.0)
                    {
                        String temp1 = btn9Text;
                        temp =  temp1;
                        no2 = Double.parseDouble(temp);
                    }
                    else
                    {
                        if (dec == true) {


                        }
                        else{
                            if(no2-(int)no2==0)
                            {
                                temp = (int)no2+"";
                            }
                            else
                            {

                            }
                        }
                        String temp1 = btn9Text;
                        temp = temp + temp1;
                        no2 = Double.parseDouble(temp);
                    }
                }
                else
                {
                    no2= 0.0;
                }
                et.setText(et.getText() + btn9Text);
                equans=false;
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText("");
                no1=0.0;
                no2=0.0;
                equans = false;
                sign = false;
                dec = false;
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = '+';
                sign=true;
                if(et.getText()!=null)
                {

                     data = et.getText().toString();
                     last = data.charAt(data.length()-1);
                     last1 = checklast(last);

                    if(last1 == 'y')
                    {
                        data = data.substring(0,data.length()-1);
                        et.setText(data);
                        String add = "<font color='#00ff00'>+</font>";
                        et.setText(Html.fromHtml(et.getText() + add));
                    }
                    else
                    {
                        no1 = Double.parseDouble(et.getText().toString());
                        String add = "<font color='#00ff00'>+</font>";
                        et.setText(Html.fromHtml(et.getText() + add));
                    }


                    //no1 =  Double.parseDouble(et.getText().toString());
                    equans = false;
                }
                else
                {
                    et.setText("");
                }

            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = '-';
                sign=true;
                if(et.getText()!=null)
                {
                    data = et.getText().toString();
                    last = data.charAt(data.length()-1);
                    last1 = checklast(last);

                    if(last1 == 'y')
                    {
                        data = data.substring(0,data.length()-1);
                        et.setText(data);
                        String add = "<font color='#00ff00'>-</font>";
                        et.setText(Html.fromHtml(et.getText() + add));
                    }
                    else
                    {
                        no1 = Double.parseDouble(et.getText().toString());
                        String add = "<font color='#00ff00'>-</font>";
                        et.setText(Html.fromHtml(et.getText() + add));
                    }

                }
                else
                {
                    et.setText("");
                }
                equans = false;
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = 'x';
                sign=true;
                if(et.getText()!=null)
                {
                    data = et.getText().toString();
                    last = data.charAt(data.length()-1);
                    last1 = checklast(last);

                    if(last1 == 'y')
                    {
                        data = data.substring(0,data.length()-1);
                        et.setText(data);
                        String add = "<font color='#00ff00'>x</font>";
                        et.setText(Html.fromHtml(et.getText() + add));
                    }
                    else
                    {
                        no1 = Double.parseDouble(et.getText().toString());
                        String add = "<font color='#00ff00'>x</font>";
                        et.setText(Html.fromHtml(et.getText() + add));
                    }

                }
                else
                {
                    et.setText("");
                }
                equans = false;
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = '÷';
                sign=true;
                if(et.getText()!=null)
                {
                    data = et.getText().toString();
                    last = data.charAt(data.length()-1);
                    last1 = checklast(last);

                    if(last1 == 'y')
                    {
                        data = data.substring(0,data.length()-1);
                        et.setText(data);
                        String add = "<font color='#00ff00'>÷</font>";
                        et.setText(Html.fromHtml(et.getText() + add));
                    }
                    else
                    {
                        no1 = Double.parseDouble(et.getText().toString());
                        String add = "<font color='#00ff00'>÷</font>";
                        et.setText(Html.fromHtml(et.getText() + add));
                    }

                }
                else
                {
                    et.setText("");
                }
                equans = false;
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //String fans = calc();

                String curret=et.getText().toString();
                switch(operator) {
                    case '+':
                        total = no1 + no2;
                        break;
                    case '-':
                        total = no1 - no2;
                        break;
                    case 'x':
                        total = no1 * no2;
                        break;
                    case '÷':
                        total = no1 / no2;
                        break;
                }
                total =(double)Math.round(total * 10000000000d) / 10000000000d;



                et.setText(total+"");
                et.setHintTextColor(getResources().getColor(R.color.colorAccent));
                no1 = 0.0;
                no2 = 0.0;
                sign=false;
                et2.setText("");
                equans=true;
            }
        });
    }

    public char checklast(char c){
        if(c=='+'||c=='-'||c=='÷'||c=='x'||c=='%')
        {
            c = 'y';
        }
        else
        {
            c='n';
        }
        return c;
    }
    public void calc()
    {
        String curret=et.getText().toString();
        switch(operator) {
            case '+':
                total = no1 + no2;
                break;
            case '-':
                total = no1 - no2;
                break;
            case 'x':
                total = no1 * no2;
                break;
            case '÷':
                total = no1 / no2;
                break;
        }
        total =(double)Math.round(total * 10000000000d) / 10000000000d;



        et2.setText(total+"");
        et2.setHintTextColor(getResources().getColor(R.color.colorAccent));
    }

}
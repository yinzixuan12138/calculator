package com.example.yinzixuan.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int firstNumber=0;
    int Number=0;
    int sign=0;
    int Result=0;
    int Number1=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=(Button)findViewById(R.id.button);
        button1.setOnClickListener(new Click1());
        Button button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new Click2());
        Button button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(new Click3());
        Button button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(new Click4());
        Button button5=(Button)findViewById(R.id.button5);
        button5.setOnClickListener(new Click5());
        Button button6=(Button)findViewById(R.id.button6);
        button6.setOnClickListener(new Click6());
        Button button7=(Button)findViewById(R.id.button7);
        button7.setOnClickListener(new Click7());
        Button button8=(Button)findViewById(R.id.button8);
        button8.setOnClickListener(new Click8());
        Button button9=(Button)findViewById(R.id.button9);
        button9.setOnClickListener(new Click9());
        Button button0=(Button)findViewById(R.id.button10);
        button0.setOnClickListener(new Click0());
        Button buttonadd=(Button)findViewById(R.id.button11);
        buttonadd.setOnClickListener(new Clickadd());
        Button button_equal=(Button)findViewById(R.id.button12);
        button_equal.setOnClickListener(new Click_equal());
        Button Restart=(Button)findViewById(R.id.restart);
        Restart.setOnClickListener(new Click_Restart());
        Button button13=(Button)findViewById(R.id.button13);
        button13.setOnClickListener(new Click_button13());
        Button button14=(Button)findViewById(R.id.button14);
        button14.setOnClickListener(new Click_button14());
        Button button15=(Button)findViewById(R.id.button15);
        button15.setOnClickListener(new Click_button15());

        Button radiobutton2=(Button)findViewById(R.id.radioButton2);
        radiobutton2.setOnClickListener(new Click_radioButton2());
        Button radiobutton3=(Button)findViewById(R.id.radioButton);
        radiobutton3.setOnClickListener(new Click_radioButton3());

    }
    class Click1 implements View.OnClickListener{
        public void onClick(View v) {
            if (sign == 0) {
                EditText txt = (EditText) findViewById(R.id.editText);
                txt.setText(txt.getText() + "1");
                if (firstNumber == 0)
                    firstNumber = 1;
                else firstNumber = firstNumber * 10 + 1;
            }
            else {
                EditText txt = (EditText) findViewById(R.id.editText);
                txt.setText(txt.getText() + "1");
                if (Number == 0)
                    Number = 1;
                else Number = Number * 10 + 1;
            }
        }
    }

    class Click2 implements View.OnClickListener{
        public void onClick(View v){
            if(sign==0)
            {EditText txt=(EditText)findViewById(R.id.editText);
            txt.setText(txt.getText()+"2");
            if(firstNumber==0)
                firstNumber=2;
            else firstNumber=firstNumber*10+2;}
            else {
                EditText txt = (EditText) findViewById(R.id.editText);
                txt.setText(txt.getText() + "2");
                if (Number == 0)
                    Number = 2;
                else Number = Number * 10 +2;
            }
        }
    }

    class Click3 implements View.OnClickListener{
        public void onClick(View v){
            if(sign==0){
            EditText txt=(EditText)findViewById(R.id.editText);
            txt.setText(txt.getText()+"3");
            if(firstNumber==0)
                firstNumber=3;
            else firstNumber=firstNumber*10+3;}
            else {
                EditText txt = (EditText) findViewById(R.id.editText);
                txt.setText(txt.getText() + "3");
                if (Number == 0)
                    Number =3;
                else Number = Number * 10 + 3;
            }
        }
    }

    class Click4 implements View.OnClickListener{
        public void onClick(View v){
            if(sign==0){
            EditText txt=(EditText)findViewById(R.id.editText);
            txt.setText(txt.getText()+"4");
            if(firstNumber==0)
                firstNumber=4;
            else firstNumber=firstNumber*10+4;}
            else {
                EditText txt = (EditText) findViewById(R.id.editText);
                txt.setText(txt.getText() + "4");
                if (Number == 0)
                    Number = 4;
                else Number = Number * 10 + 4;
            }
        }
    }

    class Click5 implements View.OnClickListener{
        public void onClick(View v){
            if(sign==0){
            EditText txt=(EditText)findViewById(R.id.editText);
            txt.setText(txt.getText()+"5");
            if(firstNumber==0)
                firstNumber=5;
            else firstNumber=firstNumber*10+5;}
            else {
                EditText txt = (EditText) findViewById(R.id.editText);
                txt.setText(txt.getText() + "5");
                if (Number == 0)
                    Number = 5;
                else Number = Number * 10 + 5;
            }
        }
    }

    class Click6 implements View.OnClickListener{
        public void onClick(View v){
            if(sign==0){
            EditText txt=(EditText)findViewById(R.id.editText);
            txt.setText(txt.getText()+"6");
            if(firstNumber==0)
                firstNumber=6;
            else firstNumber=firstNumber*10+6;}
            else {
                EditText txt = (EditText) findViewById(R.id.editText);
                txt.setText(txt.getText() + "6");
                if (Number == 0)
                    Number = 6;
                else Number = Number * 10 + 6;
            }
        }
    }

    class Click7 implements View.OnClickListener{
        public void onClick(View v){
            if(sign==0){
            EditText txt=(EditText)findViewById(R.id.editText);
            txt.setText(txt.getText()+"7");
            if(firstNumber==0)
                firstNumber=7;
            else firstNumber=firstNumber*10+7;
        }
            else {
                EditText txt = (EditText) findViewById(R.id.editText);
                txt.setText(txt.getText() + "7");
                if (Number == 0)
                    Number = 7;
                else Number = Number * 10 + 7;
            }
        }
    }

    class Click8 implements View.OnClickListener{
        public void onClick(View v){
            if(sign==0){
            EditText txt=(EditText)findViewById(R.id.editText);
            txt.setText(txt.getText()+"8");
            if(firstNumber==0)
                firstNumber=8;
            else firstNumber=firstNumber*10+8;}
            else {
                EditText txt = (EditText) findViewById(R.id.editText);
                txt.setText(txt.getText() + "8");
                if (Number == 0)
                    Number = 8;
                else Number = Number * 10 + 8;
            }
        }
    }

    class Click9 implements View.OnClickListener{
        public void onClick(View v){
            if(sign==0){
            EditText txt=(EditText)findViewById(R.id.editText);
            txt.setText(txt.getText()+"9");
            if(firstNumber==0)
                firstNumber=9;
            else firstNumber=firstNumber*10+9;}
            else {
                EditText txt = (EditText) findViewById(R.id.editText);
                txt.setText(txt.getText() + "9");
                if (Number == 0)
                    Number = 9;
                else Number = Number * 10 + 9;
            }
        }
    }

    class Click0 implements View.OnClickListener{
        public void onClick(View v){
            if(sign==0){
            EditText txt=(EditText)findViewById(R.id.editText);
            txt.setText(txt.getText()+"0");
            if(firstNumber==0)
                firstNumber=0;
            else firstNumber=firstNumber*10+0;}
            else {
                EditText txt = (EditText) findViewById(R.id.editText);
                txt.setText(txt.getText() + "0");
                if (Number == 0)
                    Number = 0;
                else Number = Number * 10 + 0;
            }
        }
    }
    class Clickadd implements View.OnClickListener{
        public void onClick(View v){
            EditText TextfistNumber=(EditText) findViewById(R.id.editText2);
            TextfistNumber.setText(""+firstNumber);
            EditText txt=(EditText) findViewById(R.id.editText);
            txt.setText("");
            Number1=firstNumber;
            firstNumber=0;
            sign=1;
        }
    }

    class Click_equal implements View.OnClickListener{
        public void onClick(View v){
if(sign==1)
{
Result=Number1+Number;

}
            else if(sign==2) {
    Result=Number1-Number;
}
            else if(sign==3){
    Result=Number1*Number;
}
            else if(sign==4){
    Result=Number1/Number;
}
            EditText a=(EditText) findViewById(R.id.editText3);
            a.setText(""+Result);

        }
    }

    class Click_button13 implements View.OnClickListener{
        public void onClick(View v){
            EditText TextfistNumber=(EditText) findViewById(R.id.editText2);
            TextfistNumber.setText(""+firstNumber);
            EditText txt=(EditText) findViewById(R.id.editText);
            txt.setText("");
            Number1=firstNumber;
            firstNumber=0;
            sign=2;
        }
    }

    class Click_button14 implements View.OnClickListener{
        public void onClick(View v){
            EditText TextfistNumber=(EditText) findViewById(R.id.editText2);
            TextfistNumber.setText(""+firstNumber);
            EditText txt=(EditText) findViewById(R.id.editText);
            txt.setText("");
            Number1=firstNumber;
            firstNumber=0;
            sign=3;
        }
    }

    class Click_button15 implements View.OnClickListener{
        public void onClick(View v){
            EditText TextfistNumber=(EditText) findViewById(R.id.editText2);
            TextfistNumber.setText(""+firstNumber);
            EditText txt=(EditText) findViewById(R.id.editText);
            txt.setText("");
            Number1=firstNumber;
            firstNumber=0;
            sign=4;
        }
    }

    class Click_Restart implements View.OnClickListener{
        public void onClick(View v){
            firstNumber=0;
            Number=0;
            sign=0;
            Result=0;
            Number1=0;
            EditText txt1=(EditText)findViewById(R.id.editText);
            txt1.setText("");
            EditText txt2=(EditText)findViewById(R.id.editText2);
            txt2.setText("");
            EditText txt3=(EditText)findViewById(R.id.editText3);
            txt3.setText("");
        }
    }

    class Click_radioButton2 implements View.OnClickListener{
        public void onClick(View v){
Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }
    }

    class Click_radioButton3 implements View.OnClickListener{
        public void onClick(View v){
            Intent intent=new Intent(MainActivity.this,MainActivity.class);
            startActivity(intent);
        }
    }

}

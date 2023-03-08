package com.example.calculator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    TextView tv1;
    Double c, d, r, b;
    String a = "0", aa, msg;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.textView);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b10 = (Button) findViewById(R.id.b10);
        b11 = (Button) findViewById(R.id.b11);
        b12 = (Button) findViewById(R.id.b12);
        b13 = (Button) findViewById(R.id.b13);
        b14 = (Button) findViewById(R.id.b14);
        b15 = (Button) findViewById(R.id.b15);
        b16 = (Button) findViewById(R.id.b16);
        b17 = (Button) findViewById(R.id.b17);
        b18 = (Button) findViewById(R.id.b18);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "1";
                tv1.setText(a);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = tv1.getText().toString();
                a = a + "2";
                tv1.setText(a);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                a = tv1.getText().toString();
                a = a + "3";
                tv1.setText(a);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "4";
                tv1.setText(a);}
        });
        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "5";
                tv1.setText(a);}
        });
        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "6";
                tv1.setText(a);}
        });
        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "7";
                tv1.setText(a);}
        });
        b8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "8";
                tv1.setText(a);}
        });
        b9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "9";
                tv1.setText(a);}
        });
        b10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "0";
                tv1.setText(a);}
        });
        b11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aa = a;
                b = 1.0;
                a = "";
                tv1.setText("+");
                tv1.setText("");
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aa = a;
                b = 2.0;
                a = "";
                tv1.setText("-");
                tv1.setText("");}
        });
        b13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aa = a;
                b = 3.0;
                a = "";
                tv1.setText("*");
                tv1.setText(" ");}
        });
        b14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aa = a;
                b = 4.0;
                a = "";
                tv1.setText("/");
                tv1.setText("");}
        });
        b15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (b == 1) {
                    c = Double.parseDouble(aa);
                    d = Double.parseDouble(a);
                    r = c + d;
                } else if (b == 4) {
                    c = Double.parseDouble(aa);
                    d = Double.parseDouble(a);
                    try {
                        r = c / d;
                    } catch (Exception e) {
                        tv1.setText("Can't Divide with 0");
                    }
                } else if (b == 2) {
                    c = Double.parseDouble(aa);
                    d = Double.parseDouble(a);
                    r = c - d;
                } else if (b == 3) {
                    c = Double.parseDouble(aa);
                    d = Double.parseDouble(a);
                    r = c * d;
                }
                String op = "";
                if (b == 1) {
                    op = " + ";
                } else if (b == 2) {
                    op = " - ";
                } else if (b == 3) {
                    op = " * ";
                } else if (b == 4) {
                    op = " / ";
                }
                tv1.setText(c + op + d + " = " + r);
                String ans = c + op + d + " = " + r;
                Toast.makeText(MainActivity.this, ans, Toast.LENGTH_LONG).show();
            }});
        b16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                tv1.setText("");
            }

        });
        b17.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                a = tv1.getText().toString();
                a = a + ",";
                tv1.setText(a);

            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {
                tv1.setText(" ");

            }
        });
    }
}




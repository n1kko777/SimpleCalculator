package ru.n1kko777.simplecalculator;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.text.DecimalFormat;

import ru.n1kko777.simplecalculator.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private Double valueOne;
    private Double valueTwo;

    private boolean plus, minus, umn, div;

    private ActivityMainBinding binding;
    private DecimalFormat decimalFormat;
    private ViewModel model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        model = new ViewModel();
        binding.setModel(model);
        decimalFormat = new DecimalFormat("#.##########");

        inic_value();
        inic_oper();
       }

    private void inic_oper() {

        //Operation
        binding.btplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    valueOne = Double.parseDouble(model.getTextView() + "");
                    plus = true;
                    model.setTextView("");

                }catch (Exception e)
                {
                    Toast.makeText(MainActivity.this, "Incorrect value!", Toast.LENGTH_SHORT).show();
                }


            }
        });

        binding.btminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    valueOne = Double.parseDouble(model.getTextView() + "");
                    minus = true;
                    model.setTextView("");

                }catch (Exception e)
                {
                    Toast.makeText(MainActivity.this, "Incorrect value!", Toast.LENGTH_SHORT).show();
                }




            }
        });

        binding.btmulty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    valueOne = Double.parseDouble(model.getTextView() + "");
                    umn = true;
                    model.setTextView("");

                }catch (Exception e)
                {
                    Toast.makeText(MainActivity.this, "Incorrect value!", Toast.LENGTH_SHORT).show();
                }

            }
        });

        binding.btdivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    valueOne = Double.parseDouble(model.getTextView() + "");
                    div = true;
                    model.setTextView("");

                }catch (Exception e)
                {
                    Toast.makeText(MainActivity.this, "Incorrect value!", Toast.LENGTH_SHORT).show();
                }



            }
        });

        binding.btequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{

                    valueTwo = Double.parseDouble(model.getTextView() + "");
                    computeCalculation();

                }catch (Exception e)
                {
                    Toast.makeText(MainActivity.this, "Incorrect value!", Toast.LENGTH_SHORT).show();
                }



            }
        });

        binding.btclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model.setTextView("");
                valueOne = null;
                valueTwo = null;
            }
        });
    }

    private void inic_value() {
        //Value
        binding.btdote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model.setTextView(model.getTextView() + ".");
            }
        });

        binding.btzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model.setTextView(model.getTextView() + "0");
            }
        });

        binding.btone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model.setTextView(model.getTextView() + "1");
            }
        });

        binding.bttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model.setTextView(model.getTextView() + "2");
            }
        });

        binding.btthre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model.setTextView(model.getTextView() + "3");
            }
        });

        binding.btfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model.setTextView(model.getTextView() + "4");
            }
        });

        binding.btfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model.setTextView(model.getTextView() + "5");
            }
        });

        binding.btsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model.setTextView(model.getTextView() + "6");
            }
        });

        binding.btseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model.setTextView(model.getTextView() + "7");
            }
        });

        binding.bteight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model.setTextView(model.getTextView() + "8");
            }
        });

        binding.btnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model.setTextView(model.getTextView() + "9");
            }
        });

    }


    private void computeCalculation() {

        if(plus == true)
        {
            model.setTextView(decimalFormat.format(valueOne + valueTwo));
            plus = false;
        }
        if(minus == true)
        {
            model.setTextView(decimalFormat.format(valueOne - valueTwo));
            minus = false;

        }
        if(umn == true)
        {
            model.setTextView(decimalFormat.format(valueOne * valueTwo));
            umn = false;

        }
        if(div == true)
        {
            model.setTextView(decimalFormat.format(valueOne / valueTwo));
            div = false;

        }
    }
}

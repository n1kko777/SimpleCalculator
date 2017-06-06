package ru.n1kko777.simplecalculator;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        inic_value();
        inic_oper();
       }

    private void inic_oper() {

        //Operation
        binding.btplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Log", binding.editText.getText().toString());

                if(binding.editText.getText().toString() != "" )
                {
                    valueOne = Double.parseDouble(binding.editText.getText().toString() + "");
                    plus = true;
                    binding.editText.setText(null);

                }
            }
        });

        binding.btminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.editText.getText() != null)
                {
                    valueOne = Double.parseDouble(binding.editText.getText().toString() + "");
                    minus = true;
                    binding.editText.setText(null);

                }
            }
        });

        binding.btmulty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.editText.getText() != null)
                {
                    valueOne = Double.parseDouble(binding.editText.getText().toString() + "");
                    umn = true;
                    binding.editText.setText(null);

                }
            }
        });

        binding.btdivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.editText.getText() != null )
                {

                    valueOne = Double.parseDouble(binding.editText.getText().toString() + "");
                    div = true;
                    binding.editText.setText(null);
                }

            }
        });

        binding.btequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.editText.getText() != null)
                {
                    valueTwo = Double.parseDouble(binding.editText.getText().toString() + "");
                    computeCalculation();
                }

            }
        });

        binding.btclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(null);
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
                binding.editText.setText(binding.editText.getText() + ".");
            }
        });

        binding.btzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "0");
            }
        });

        binding.btone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "1");
            }
        });

        binding.bttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "2");
            }
        });

        binding.btthre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "3");
            }
        });

        binding.btfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "4");
            }
        });

        binding.btfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "5");
            }
        });

        binding.btsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "6");
            }
        });

        binding.btseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "7");
            }
        });

        binding.bteight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "8");
            }
        });

        binding.btnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "9");
            }
        });

    }


    private void computeCalculation() {

        if(plus == true)
        {
            binding.editText.setText(valueOne + valueTwo + "");
            plus = false;
        }
        if(minus == true)
        {
            binding.editText.setText(valueOne - valueTwo + "");
            minus = false;

        }
        if(umn == true)
        {
            binding.editText.setText(valueOne * valueTwo + "");
            umn = false;

        }
        if(div == true)
        {
            binding.editText.setText(valueOne / valueTwo + "");
            div = false;

        }
    }
}
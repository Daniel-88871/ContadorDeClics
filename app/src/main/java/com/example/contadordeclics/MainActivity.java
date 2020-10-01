package com.example.contadordeclics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.contadordeclics.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    int contador1, contador2, contador3, contador4, contadorTotal;


    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.augmentar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            contador1++;
            contadorTotal++;
            binding.contador1.setText(String.valueOf(contador1));
                binding.contadorAll.setText(String.valueOf(contadorTotal));
            }
        });
        binding.augmentar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador2++;
                contadorTotal++;
                binding.contador2.setText(String.valueOf(contador2));
                binding.contadorAll.setText(String.valueOf(contadorTotal));
            }
        });
        binding.augmentar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador3++;
                contadorTotal++;
                binding.contador3.setText(String.valueOf(contador3));
                binding.contadorAll.setText(String.valueOf(contadorTotal));
            }
        });
        binding.augmentar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador4++;
                contadorTotal++;
                binding.contador4.setText(String.valueOf(contador4));
                binding.contadorAll.setText(String.valueOf(contadorTotal));
            }
        });
        binding.reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadorTotal = contadorTotal - contador1;
                contador1 = 0;
                binding.contador1.setText(String.valueOf(contador1));
                binding.contadorAll.setText(String.valueOf(contadorTotal));
            }
        });
        binding.reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadorTotal = contadorTotal - contador2;
                contador2 = 0;
                binding.contador2.setText(String.valueOf(contador2));
                binding.contadorAll.setText(String.valueOf(contadorTotal));
            }
        });
        binding.reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadorTotal = contadorTotal - contador3;
                contador3 = 0;
                binding.contador3.setText(String.valueOf(contador3));
                binding.contadorAll.setText(String.valueOf(contadorTotal));
            }
        });
        binding.reset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadorTotal = contadorTotal - contador4;
                contador4 = 0;
                binding.contador4.setText(String.valueOf(contador4));
                binding.contadorAll.setText(String.valueOf(contadorTotal));
            }
        });
        binding.resetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadorTotal = 0;
                contador1 = 0;
                contador2 = 0;
                contador3 = 0;
                contador4 = 0;
                binding.contador1.setText(String.valueOf(contador1));
                binding.contador2.setText(String.valueOf(contador2));
                binding.contador3.setText(String.valueOf(contador3));
                binding.contador4.setText(String.valueOf(contador4));
                binding.contadorAll.setText(String.valueOf(contadorTotal));
            }
        });
    }
}
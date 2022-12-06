package com.example.databindingviewmodellivedata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.databindingviewmodellivedata.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //TextView editText;
    MainViewModel mViewModel;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        //editText = findViewById(R.id.quoteTxt);

        Quote quote;
        quote = new Quote("Awesome", "Ram");
        binding.setQuote(quote);

        mViewModel.getQuoteLiveData().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                //editText.setText(s);
                binding.quoteTxt.setText(s);

            }
        });

    }

    public void getQuoteBtn(View view) {
        mViewModel.getQuote();

    }
}
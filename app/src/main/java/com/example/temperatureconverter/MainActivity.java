package com.example.temperatureconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.temperatureconverter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    EditText fText;
    EditText cText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        fText = findViewById(R.id.fahrenheitEdit);
        cText = findViewById(R.id.celsiusEdit);
    }

    public void onClick(View v) {
        if((cText.getText().length() == 0) || (fText.getText().length() == 0)) {
            if(cText.getText().length() == 0) {
                float fahr = Float.parseFloat(fText.getText().toString());
                float cel = (fahr-32)*5/9;
                cText.setText(String.valueOf(cel));
            } else {
                float cel = Float.parseFloat((cText.getText().toString()));
                float fahr = ((cel*9/5) + 32);
                fText.setText(String.valueOf(fahr));
            }
        }
    }
}
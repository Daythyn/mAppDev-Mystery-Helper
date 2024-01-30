package com.example.project1amysterydcp;

import static java.lang.Math.abs;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.project1amysterydcp.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    private String[] ideas;
    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        ideas = getResources().getStringArray(R.array.ideas);

        binding.ideaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t = binding.ideaText;
                t.setText(ideas[abs(rand.nextInt()%(ideas.length-1))]);
            }
        });
    }
}


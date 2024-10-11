package com.csaszar.martin.layouts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button linear = findViewById(R.id.btnToLinear);
        Button relative = findViewById(R.id.btnToRelative);
        Button frame = findViewById(R.id.btnToFrame);
        Button table = findViewById(R.id.btnToTable);
        Button web = findViewById(R.id.btnToWeb);

        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentToLinear = new Intent(MainActivity.this,LinearActivity.class);
                startActivity(intentToLinear);
            }
        });

        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentToRelative = new Intent(MainActivity.this, RelativeActivity.class);
                startActivity(intentToRelative);
            }
        });

        frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentToFrame = new Intent(MainActivity.this, FrameActivity.class);
                startActivity(intentToFrame);
            }
        });




    }
}
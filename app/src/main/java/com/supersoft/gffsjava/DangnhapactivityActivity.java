package com.supersoft.gffsjava;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DangnhapactivityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.dangnhapactivity);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        CheckBox checkbox1 = findViewById(R.id.checkbox1);
        EditText tencuaban = findViewById(R.id.tencuaban);

        Button dangnhapbutton = (Button)findViewById(R.id.DANGNHAPBUTTON);
        dangnhapbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkbox1.isChecked() && !tencuaban.getText().toString().isEmpty()) {
                    Intent intent;
                    intent = new Intent(DangnhapactivityActivity.this, MainActivity.class);

                    startActivity(intent);
                }

            }
        });
    }
}
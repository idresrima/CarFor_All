package com.example.carforall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        ImageView btnLogIn = (ImageView) findViewById(R.id.btnLogIn);
        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LogInActivity.this, "Youre signed ", Toast.LENGTH_SHORT).show();
            }
        });
    }



//    public void displayToast() {
//        Toast.makeText(getApplicationContext(), "Youre signed ", Toast.LENGTH_SHORT).show();
//    }
}
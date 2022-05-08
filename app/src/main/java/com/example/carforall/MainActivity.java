package com.example.carforall;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
//import androidx.room.Room;

public class MainActivity extends AppCompatActivity {
    public Button btnAddCar;
    public Button btnBookCar;
    public Button btnReport;

    public FrameLayout container;
    public ConstraintLayout container1;
    public Button btnregister;
    EditText name, brnad, model, regiN, buildYear, phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        MyRoomDatebase db = Room.databaseBuilder(getApplicationContext(),MyRoomDatebase.class, "CarFormDatabase").allowMainThreadQueries().build();
//        //Connecting the editText to the database
//        name=find

        btnBookCar = (Button) findViewById(R.id.askcar_btn);
        btnBookCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), BookCarActivity.class);
                startActivity(intent);
            }
        });

        btnReport = (Button) findViewById(R.id.report_btn);
        btnReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                ReportFragment rf = new ReportFragment();
                fm.beginTransaction().replace(R.id.root,rf).commit();
            }
        });

        btnAddCar = (Button) findViewById(R.id.addcar_btn);
        btnAddCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                CarFormFragment cf = new CarFormFragment();
                fm.beginTransaction().replace(R.id.root,cf).commit();
            }
        });

//         btnregister.setOnClickListener(new View.OnClickListener() {
//             @Override
//            public void onClick(View view) {
//                 FragmentManager fm = getSupportFragmentManager();
//                 registerFragment rf = new registerFragment();
//
//                fm.beginTransaction().replace(R.id.container1,rf).commit();

//            getSupportFragmentManager().beginTransaction().replace(R.id.container,new registerFragment()).commit();
//    }
//});
//        btnregister.setOnClickListener(this);


    }
}


//    public void onClick(View view) {
//        if(view.getId()==R.id.join_btn){
//            FragmentManager fm = getSupportFragmentManager();
//            registerFragment rf = new registerFragment();
//            fm.beginTransaction().replace(R.id.container1,rf).commit();
       //    getSupportFragmentManager().beginTransaction().replace(R.id.container,new registerFragment()).commit();
//            getSupportFragmentManager().beginTransaction().remove(new registerFragment()).remove();

//           container.setVisibility(View.VISIBLE);
//            container1.setVisibility(View.GONE);
//           btnregister.setVisibility(View.GONE);
        //}


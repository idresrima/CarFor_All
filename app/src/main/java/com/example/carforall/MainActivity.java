package com.example.carforall;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.room.Room;

public class MainActivity extends AppCompatActivity  {
    public Button btnAddCar;
    public FrameLayout container;
    public ConstraintLayout container1;
    public Button btnregister;
    EditText name, brnad, model,regiN,buildYear, phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        MyRoomDatebase db = Room.databaseBuilder(getApplicationContext(),MyRoomDatebase.class, "CarFormDatabase").allowMainThreadQueries().build();
//        //Connecting the editText to the database
//        name=find

        btnregister=findViewById(R.id.join_btn);

        btnAddCar=(Button) findViewById(R.id.addcar_btn);
//
        btnregister.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        FragmentManager fm = getSupportFragmentManager();
            registerFragment rf = new registerFragment();

            fm.beginTransaction().replace(R.id.container1,rf).commit();

//            getSupportFragmentManager().beginTransaction().replace(R.id.container,new registerFragment()).commit();
    }
});
//        btnregister.setOnClickListener(this);
        btnAddCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,carForm.class);
                startActivity(intent);
            }
        });
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
        }


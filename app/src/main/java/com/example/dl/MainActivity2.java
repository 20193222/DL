package com.example.dl;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity2 extends AppCompatActivity {

    private TextView FullName;
    private TextView AddressOutput;
    private TextView NationalityOutput;
    private TextView DateOfDirthOutput;
    private TextView SexOutput;
    private TextView HeigthOutput;
    private TextView WeightOutput;
    private TextView BloodOutput;
    private TextView EyeOutput;


    Button button1;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button1 = (Button) findViewById(R.id.Back);
        builder = new AlertDialog.Builder(this);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setMessage("Do you want to Edit your Driver License application?");
                builder.setCancelable(false);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        Toast.makeText(getApplicationContext(), "Back to Edit", Toast.LENGTH_SHORT).show();
                    }
                }); builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        Toast.makeText(getApplicationContext(), "Cancelled", Toast.LENGTH_SHORT).show();
                    }});
                AlertDialog alert = builder.create();
                alert.setTitle("Confirmation");
                alert.show();
            }
        });

        FullName = findViewById(R.id.Fullname2);
        AddressOutput = findViewById(R.id.Address2);
        NationalityOutput = findViewById(R.id.Nationality2);
        DateOfDirthOutput = findViewById(R.id.DateOfBirth2);
        SexOutput = findViewById(R.id.Sex2);
        HeigthOutput = findViewById(R.id.Height2);
        WeightOutput= findViewById(R.id.Weight2);
        BloodOutput=findViewById(R.id.Bloodtype2);
        EyeOutput=findViewById(R.id.EYE2);

        String f1 = getIntent().getStringExtra("LASTNAME");
        String f2 = getIntent().getStringExtra("FIRSTNAME");
        String f3= getIntent().getStringExtra("MIDDLENAME");
        String f4 = getIntent().getStringExtra("ADDRESS");
        String f5 = getIntent().getStringExtra("NAT");
        String f6 = getIntent().getStringExtra("YEAR");
        String f7= getIntent().getStringExtra("MONTH");
        String f8 = getIntent().getStringExtra("DAY");
        String f9 = getIntent().getStringExtra("SEX");
        String f10 = getIntent().getStringExtra("HEI");
        String f11 = getIntent().getStringExtra("WEI");
        String f12 = getIntent().getStringExtra("EYECOLOR");
        String f13 = getIntent().getStringExtra("BLOODTYPE");

        FullName.setText(f1+","+f2+" "+f3+".");
        AddressOutput.setText(f4);
        NationalityOutput.setText(f5);
        DateOfDirthOutput.setText(f6+"/"+f7+"/"+f8);
        SexOutput.setText(f9);
        HeigthOutput.setText(f10);
        WeightOutput.setText(f11);
        BloodOutput.setText(f12);
        EyeOutput.setText(f13);


    }
    public void Exit(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
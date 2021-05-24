package com.example.dl;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {

     EditText Lname;
     EditText Fname;
     EditText Mname;
     EditText Add;
     EditText Nat;
     EditText Hei;
     EditText Wei;
     EditText S6;
     EditText YY;
     EditText MM;
     EditText DD;
     EditText BT;
     EditText EC;
    private Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Lname = findViewById(R.id.Last_Name);
        Fname = findViewById(R.id.First_Name);
        Mname = findViewById(R.id.Middle_Name);
        Add = findViewById(R.id.Address);
        BT = findViewById(R.id.Blood_type);
        EC=findViewById(R.id.Eye_Color);
        Nat = findViewById(R.id.Nationality);
        Hei = findViewById(R.id.Height);
        Wei = findViewById(R.id.Weight);
        S6 = findViewById(R.id.Sex);
        YY= findViewById(R.id.Year);
        MM= findViewById(R.id.Month);
        DD= findViewById(R.id.Day);
         Submit = findViewById(R.id.button);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(MainActivity.this);
                    builder.setTitle("Confirmation");
                    builder.setMessage("Do you want to Submit your Driver licence?");
                    builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                String LnameExtra = Lname.getText().toString();
                String FnameExtra = Fname.getText().toString();
                String MnameExtra = Mname.getText().toString();
                String AddressExtra = Add.getText().toString();
                String NatExtra = Nat.getText().toString();
                String HeiExtra = Hei.getText().toString();
                String WeiExtra = Wei.getText().toString();
                String SexExtra = S6.getText().toString();
                String YearExtra = YY.getText().toString();
                String MonthExtra = MM.getText().toString();
                String DayExtra = DD.getText().toString();String EyeExtra = EC.getText().toString();
                String BloodExtra = BT.getText().toString();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("LASTNAME", LnameExtra);
                intent.putExtra("FIRSTNAME", FnameExtra);
                intent.putExtra("MIDDLENAME", MnameExtra);
                intent.putExtra("ADDRESS", AddressExtra);
                intent.putExtra("NAT", NatExtra);
                intent.putExtra("HEI", HeiExtra);
                intent.putExtra("WEI", WeiExtra);
                intent.putExtra("SEX", SexExtra);
                intent.putExtra("YEAR", YearExtra);
                intent.putExtra("MONTH", MonthExtra);
                intent.putExtra("DAY", DayExtra);
                intent.putExtra("EYECOLOR", EyeExtra);
                intent.putExtra("BLOODTYPE", BloodExtra);
                startActivity(intent);
                        }
                    }).setNegativeButton("NO", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            dialogInterface.dismiss();
                        }
                    });
                builder.show();

            }
        });}}
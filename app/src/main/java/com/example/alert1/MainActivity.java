package com.example.alert1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.btn);
btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);

        final View dialogView= LayoutInflater.from(MainActivity.this).inflate(R.layout.item,null,false);
        alert.setView(dialogView);

final AlertDialog alertDialog=alert.create();
alertDialog.show();

Button yes=dialogView.findViewById(R.id.yes);
Button no=dialogView.findViewById(R.id.no);

yes.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
finish();
    }
});

no.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

       alertDialog.cancel();
    }

});

    }
});
    }
}

package com.example.guano.biodata;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Alamat,Telepon,Email;

        Alamat=(Button)findViewById(R.id.alamat);
        Telepon=(Button)findViewById(R.id.telepon);
        Email=(Button)findViewById(R.id.email);
    }

    public void openMail(View v){
        Intent it = new Intent(Intent.ACTION_SEND);
        String mail = "vereghratna@gmail.com";
        it.setType("text/plain");
        it.putExtra(Intent.EXTRA_EMAIL, mail);

        startActivity(Intent.createChooser(it, "Send Mail"));
    }

    public void openTelp(View v){
        String number = "081333696136";

        Uri uri = Uri.parse("tel:"+number);
        Intent it = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(it);
    }

    public void openAddress(View v){
        Uri uri = Uri.parse("geo:-7.092881, 110.419886?q="+Uri.encode("Jl. Kepodang Timur III B"));
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        it.setPackage("com.google.android.apps.maps");
        startActivity(it);
    }
}

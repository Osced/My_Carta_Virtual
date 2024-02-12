package com.example.mycartavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void conocerEntradas (View v)
    {
        Intent intencion = new Intent(this,EntradasActivity.class);
        startActivity(intencion);
    }

    public void conocerPlatos (View v)
    {
        Intent intencion = new Intent(this,PlatosActivity.class);
        startActivity(intencion);

    }

    public void conocerBebidas (View v)
    {
        Intent intencion = new Intent(this,BebidasActivity.class);
        startActivity(intencion);
    }

    public void conocerSedes (View v)
    {
        Intent intencion = new Intent(this,SedesActivity.class);
        startActivity(intencion);
    }

    public void contactarSede (View v)
    {
        String whatsApp = "com.whatsapp";
        PackageManager pm = getPackageManager();
        Intent intencion = pm.getLaunchIntentForPackage(whatsApp);
        //Mensaje y número
        startActivity(intencion);
    }
}
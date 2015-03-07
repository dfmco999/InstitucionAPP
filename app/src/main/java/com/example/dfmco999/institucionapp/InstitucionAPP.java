package com.example.dfmco999.institucionapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class InstitucionAPP extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_institucion_app);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_institucion_ap, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void mod_estudiante (View v)
    {
        Intent acti = new Intent(this, frm_mainEstudiante.class);
        startActivity(acti);
    }
    public void mod_docente (View v)
    {
        Intent acti = new Intent(this, frm_main_docente.class);
        startActivity(acti);

    }
    public void mod_director (View v)
    {
        Intent acti = new Intent(this, frm_main_director.class);
        startActivity(acti);

    }
    public void salir (View v)
    {

    }
}

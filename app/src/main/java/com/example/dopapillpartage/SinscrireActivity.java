package com.example.dopapillpartage;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.android.*;


public class SinscrireActivity extends Activity {

    private Button btn_send;
    private EditText et_pseudo, et_email, et_mdppatient, et_mdppatient2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagedinscription);

        btn_send = (Button) findViewById(R.id.boutonsinscrire);
        et_pseudo = (EditText) findViewById(R.id.pseudo);
        et_email = (EditText) findViewById(R.id.email);
        et_mdppatient = (EditText) findViewById(R.id.mdppatient);
        et_mdppatient2 = (EditText) findViewById(R.id.mdppatient2);

        startActivityForResult(new Intent(SinscrireActivity.this,AccueilActivity.class), RESULT_OK);

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pseudo = et_pseudo.getText().toString().trim();
                String email = et_email.getText().toString().trim();
                String password = et_mdppatient.getText().toString().trim();
                String password2 = et_mdppatient2.getText().toString().trim();
                // request.register(pseudo, email, password, password2);
            }
        });
    }

}
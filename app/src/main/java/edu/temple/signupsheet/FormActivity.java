package edu.temple.signupsheet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FormActivity extends AppCompatActivity {

    EditText userName;
    EditText mailName;
    EditText password;
    EditText confirm;

    TextView savedname;
    TextView savedmail;
    TextView savedpass;
    TextView savedconf;

    String savedNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = (EditText) findViewById(R.id.NameSlot);
        mailName = (EditText) findViewById(R.id.MailSlot);
        password = (EditText) findViewById(R.id.PasswordSlot);
        confirm = (EditText) findViewById(R.id.ConfirmSlot);
        Button save = (Button) findViewById(R.id.SaveButton);


        save.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String name = userName.getText().toString();
                String mail = mailName.getText().toString();
                String pass = password.getText().toString();
                String conf = confirm.getText().toString();


                if (name == "" || mail == "" || pass == "" || conf == "") {
                    Toast.makeText(getApplicationContext(), "Missing Information", Toast.LENGTH_LONG).show();
                }
                else if (pass != conf) {
                    Toast.makeText(getApplicationContext(), "Password Does Not Match", Toast.LENGTH_LONG).show();
                }
                else {
                    Intent launchintent = new Intent(FormActivity.this, SecondActivity.class);
                    launchintent.putExtra("name", name);
                    startActivity(launchintent);

                }
            }
        });
    }
}






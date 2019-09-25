package edu.temple.signupsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText userName = (EditText) findViewById(R.id.NameSlot);
        EditText mailName = (EditText) findViewById(R.id.MailSlot);
        EditText password = (EditText) findViewById(R.id.PasswordSlot);
        EditText confirm = (EditText) findViewById(R.id.ConfirmSlot);
        Button save = (Button) findViewById(R.id.SaveButton);
        
    }
}

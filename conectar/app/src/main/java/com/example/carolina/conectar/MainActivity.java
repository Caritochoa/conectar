package com.example.carolina.conectar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button form;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        form = (Button)findViewById(R.id.btnform);

        form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openForm();
            }
        });
    }

    public void openForm() {
        Intent intent = new Intent (getApplicationContext(), Main2Activity.class);
        startActivity(intent);
    }
}

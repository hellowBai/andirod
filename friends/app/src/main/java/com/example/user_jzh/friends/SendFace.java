package com.example.user_jzh.friends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SendFace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_face);
        Button send_button=findViewById(R.id.send_button);
        Button concel_button=findViewById(R.id.concel_button);
        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SendFace.this,Main2Activity.class);
                TextView mess=findViewById(R.id.message_text);
                Bundle bundle=new Bundle();
                bundle.putString("mess",mess.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        concel_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SendFace.this,Main2Activity.class);
                startActivity(intent);
            }
        });

    }
}

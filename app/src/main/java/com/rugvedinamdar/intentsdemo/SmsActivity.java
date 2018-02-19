package com.rugvedinamdar.intentsdemo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SmsActivity extends Activity {

    Button smsSelectBtn;
    EditText smsTextEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        smsSelectBtn = findViewById(R.id.btn_sms_select);
        smsTextEt = findViewById(R.id.et_sms_text);
        smsSelectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:"));
                sendIntent.putExtra("sms_body", smsTextEt.getText().toString());
                startActivity(sendIntent);
            }
        });

    }
}

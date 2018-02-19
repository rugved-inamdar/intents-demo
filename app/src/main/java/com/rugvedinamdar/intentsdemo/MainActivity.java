package com.rugvedinamdar.intentsdemo;

import android.app.Activity;
import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button galleryBtn;
    Button cameraBtn;
    Button smsBtn;
    Button contactsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        galleryBtn = (Button) findViewById(R.id.btn_gallery);
        galleryBtn.setOnClickListener(this);
        cameraBtn = (Button) findViewById(R.id.btn_camera);
        cameraBtn.setOnClickListener(this);
        smsBtn = (Button) findViewById(R.id.btn_sms);
        smsBtn.setOnClickListener(this);
        contactsBtn = (Button) findViewById(R.id.btn_contacts);
        contactsBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_gallery:
                Intent galleryActivity = new Intent(this,GalleryActivity.class);
                startActivity(galleryActivity);
                break;
            case R.id.btn_camera:
                Intent cameraActivity = new Intent(this,CameraActivity.class);
                startActivity(cameraActivity);
                break;
            case R.id.btn_sms:
                Intent smsActivity = new Intent(this,SmsActivity.class);
                startActivity(smsActivity);
                break;
            case R.id.btn_contacts:
                Intent contactsActivity = new Intent(this,ContactsActivity.class);
                startActivity(contactsActivity);
                break;
            default:break;
        }

    }
}


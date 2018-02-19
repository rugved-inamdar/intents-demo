package com.rugvedinamdar.intentsdemo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class GalleryActivity extends Activity {
    public static final int RESULT_GALLERY = 0;
    private Uri imageUri;
    Button gallerySelectBtn;
    ImageView selectedImageImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        gallerySelectBtn = findViewById(R.id.btn_gallery_select);
        gallerySelectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent galleryIntent = new Intent(
                        Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(galleryIntent , RESULT_GALLERY );
            }
        });
        selectedImageImg = findViewById(R.id.img_selectedImage);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case GalleryActivity.RESULT_GALLERY :
                if (null != data) {
                    imageUri = data.getData();
                    //Do whatever that you desire here. or leave this blank
                    selectedImageImg.setImageURI(imageUri);
                }
                break;
            default:
                break;
        }
    }
}

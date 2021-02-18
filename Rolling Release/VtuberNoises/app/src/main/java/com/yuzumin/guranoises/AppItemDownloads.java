package com.yuzumin.guranoises;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class AppItemDownloads extends AppCompatActivity {

    private static final int MY_PERMISSION_RQUEST_STORAGE=1;

    ImageView GuraIMG0;
    ImageView Gura0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_item_downloads);
        getSupportActionBar().hide();;

        if(ContextCompat.checkSelfPermission(AppItemDownloads.this, Manifest.permission.WRITE_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED){
            if(ActivityCompat.shouldShowRequestPermissionRationale(AppItemDownloads.this,Manifest.permission.WRITE_EXTERNAL_STORAGE)){
                ActivityCompat.requestPermissions(AppItemDownloads.this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},MY_PERMISSION_RQUEST_STORAGE);
            }else{
                ActivityCompat.requestPermissions(AppItemDownloads.this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},MY_PERMISSION_RQUEST_STORAGE);
            }
        }



        Gura0=findViewById(R.id.gura0);
        GuraIMG0=findViewById(R.id.gura_img);
        GuraIMG0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://drive.google.com/drive/folders/1sdPmRkkI7m1L4-3Fo1eI8n5yBx6LnKxz?usp=sharing"));
                startActivity(i);
            }
        });
    }


}
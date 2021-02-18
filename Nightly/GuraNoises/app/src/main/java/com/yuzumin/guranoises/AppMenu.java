package com.yuzumin.guranoises;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class AppMenu extends AppCompatActivity {

    CardView AppYoutube;
    CardView AppVersion;
    CardView LegalInformation;

    CardView Sound_Settings;
    CardView AppDownload;
    CardView MoreApps;

    Integer DevCount=1;

    ImageView BackBTN;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_menu);
        getSupportActionBar().hide();

        BackBTN=findViewById(R.id.back_btn);
        BackBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        //Get SharedPreference to Check Developer Mode
        sharedPreferences =getSharedPreferences("DevMode",MODE_PRIVATE);
        DevCount=sharedPreferences.getInt("DevCount",1);


        AppYoutube =findViewById(R.id.app_youtube);
        AppYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.youtube.com/channel/UCoSrY_IQQVpmIRZ9Xf-y93g"));
                startActivity(i);
            }
        });
        AppYoutube.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    AppYoutube.setCardBackgroundColor(getResources().getColor(R.color.darkblvck));
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    AppYoutube.setCardBackgroundColor(getResources().getColor(R.color.blvck));
                }
                return false;
            }
        });


        AppVersion =findViewById(R.id.app_version);
        AppVersion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(DevCount>=7){
                    Toast.makeText(AppMenu.this, "You are now a Developer", Toast.LENGTH_SHORT).show();
                    editor =getSharedPreferences("DevMode",MODE_PRIVATE).edit();
                    editor.putInt("DevCount",7);//maintain the DevCount at 7
                    editor.apply();
                }else{
                    Toast.makeText(AppMenu.this, "You are "+(7-DevCount)+" steps from being a Developer", Toast.LENGTH_SHORT).show();
                    editor =getSharedPreferences("DevMode",MODE_PRIVATE).edit();
                    editor.putInt("DevCount",DevCount++);//add 1 to DevCount
                    editor.apply();
                }
            }
        });
        AppVersion.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    AppVersion.setCardBackgroundColor(getResources().getColor(R.color.darkblvck));
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    AppVersion.setCardBackgroundColor(getResources().getColor(R.color.blvck));
                }
                return false;
            }
        });


        //View Privacy policy and User Agreement and Terms of use
        LegalInformation=findViewById(R.id.app_legal);
        LegalInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(AppMenu.this, LegalInfo.class);
                startActivity(intent);
            }
        });
        LegalInformation.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    LegalInformation.setCardBackgroundColor(getResources().getColor(R.color.darkblvck));
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    LegalInformation.setCardBackgroundColor(getResources().getColor(R.color.blvck));
                }
                return false;
            }
        });


        //Open SoundSettings to change settings
        Sound_Settings=findViewById(R.id.sounds);
        Sound_Settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(AppMenu.this, ClickerSettings.class);
                startActivity(intent);
            }
        });
        Sound_Settings.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    Sound_Settings.setCardBackgroundColor(getResources().getColor(R.color.darkblvck));
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    Sound_Settings.setCardBackgroundColor(getResources().getColor(R.color.blvck));
                }
                return false;
            }
        });



        //To set character stuff
        AppDownload =findViewById(R.id.app_downloads);
        AppDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://drive.google.com/drive/folders/1sdPmRkkI7m1L4-3Fo1eI8n5yBx6LnKxz?usp=sharing"));
                startActivity(i);
            }
        });
        AppDownload.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    AppDownload.setCardBackgroundColor(getResources().getColor(R.color.darkblvck));
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    AppDownload.setCardBackgroundColor(getResources().getColor(R.color.blvck));
                }
                return false;
            }
        });



        //To open google play to see my other apps
        MoreApps=findViewById(R.id.more_apps);
        MoreApps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://play.google.com/store/apps/dev?id=8294948611477283731"));
                startActivity(i);
            }
        });
        MoreApps.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    MoreApps.setCardBackgroundColor(getResources().getColor(R.color.darkblvck));
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    MoreApps.setCardBackgroundColor(getResources().getColor(R.color.blvck));
                }
                return false;
            }
        });


    }
}
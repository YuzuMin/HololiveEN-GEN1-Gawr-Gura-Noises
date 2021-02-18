package com.yuzumin.guranoises;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class LegalInfo extends AppCompatActivity {


    ImageView back_btn;
    LinearLayout Terms_And_Conditions;
    LinearLayout Privacy_Policy;
    LinearLayout License;
    LinearLayout ReleaseNotes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legal_info);
        getSupportActionBar().hide();

        back_btn=findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        //Press to open Reader activity to read stuff
        Terms_And_Conditions=findViewById(R.id.terms_and_conditions);
        Terms_And_Conditions.setOnClickListener(click_UA);
        Terms_And_Conditions.setOnTouchListener(touch_UA);

        Privacy_Policy=findViewById(R.id.privacy_policy);
        Privacy_Policy.setOnClickListener(click_PP);
        Privacy_Policy.setOnTouchListener(touch_PP);

        License=findViewById(R.id.Licensing);
        License.setOnClickListener(click_LC);
        License.setOnTouchListener(touch_LC);

        ReleaseNotes=findViewById(R.id.ReleaseNotes);
        ReleaseNotes.setOnClickListener(click_RN);
        ReleaseNotes.setOnTouchListener(touch_RN);

    }

    private final View.OnClickListener click_UA=new View.OnClickListener() {
        //To open version activity
        @Override
        public void onClick(View v) {
            Intent intent;
            intent=new Intent(LegalInfo.this,Reader.class);
            intent.putExtra("Value",2); //sends a 1 to reader activity to show user agreement
            startActivity(intent);
        }
    };

    private final View.OnTouchListener touch_UA= new View.OnTouchListener() {
        //To change button color from dark blvck to blvck
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            if(event.getAction() == MotionEvent.ACTION_UP) {
                Terms_And_Conditions.setBackgroundColor(getResources().getColor(R.color.darkblvck));

            } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                Terms_And_Conditions.setBackgroundColor(getResources().getColor(R.color.blvck));
            }
            return false;
        }
    };


    private final View.OnClickListener click_PP=new View.OnClickListener() {
        //To open version activity
        @Override
        public void onClick(View v) {
            Intent intent;
            intent=new Intent(LegalInfo.this,Reader.class);
            intent.putExtra("Value",0); //sends a 2 to reader activity to show click privacy policy
            startActivity(intent);
        }
    };

    private final View.OnTouchListener touch_PP= new View.OnTouchListener() {
        //To change button color from dark blvck to blvck
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            if(event.getAction() == MotionEvent.ACTION_UP) {
                Privacy_Policy.setBackgroundColor(getResources().getColor(R.color.darkblvck));

            } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                Privacy_Policy.setBackgroundColor(getResources().getColor(R.color.blvck));
            }
            return false;
        }
    };


    private final View.OnClickListener click_LC=new View.OnClickListener() {
        //To open version activity
        @Override
        public void onClick(View v) {
            Intent intent;
            intent=new Intent(LegalInfo.this,Reader.class);
            intent.putExtra("Value",1); //sends a 3 to reader activity to show click license
            startActivity(intent);
        }
    };

    private final View.OnTouchListener touch_LC= new View.OnTouchListener() {
        //To change button color from dark blvck to blvck
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            if(event.getAction() == MotionEvent.ACTION_UP) {
                License.setBackgroundColor(getResources().getColor(R.color.darkblvck));

            } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                License.setBackgroundColor(getResources().getColor(R.color.blvck));
            }
            return false;
        }
    };



    private final View.OnClickListener click_RN=new View.OnClickListener() {
        //To open version activity
        @Override
        public void onClick(View v) {
            Intent intent;
            intent=new Intent(LegalInfo.this,Reader.class);
            intent.putExtra("Value",3); //sends a 3 to reader activity to show click license
            startActivity(intent);
        }
    };

    private final View.OnTouchListener touch_RN= new View.OnTouchListener() {
        //To change button color from dark blvck to blvck
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            if(event.getAction() == MotionEvent.ACTION_UP) {
                ReleaseNotes.setBackgroundColor(getResources().getColor(R.color.darkblvck));

            } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                ReleaseNotes.setBackgroundColor(getResources().getColor(R.color.blvck));
            }
            return false;
        }
    };

}
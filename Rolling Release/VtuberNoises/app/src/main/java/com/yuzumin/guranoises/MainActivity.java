package com.yuzumin.guranoises;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.yuzumin.guranoises.activities.AlarmActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Count.CountListener{
    ImageView image;
    TextView textCount;

    MediaPlayer noise;
    MediaPlayer.OnCompletionListener listener;

    ObjectAnimator anim1, anim2, anim3;
    AnimatorSet set1, set2;

    SharedPreferences SavedSettings;

    boolean switch1;
    boolean switch2;
    boolean switch3;
    boolean switch4;
    boolean switch5;
    boolean switch6;
    boolean switch7;
    boolean switch8;
    boolean switch9;
    boolean switch10;
    boolean switch11;
    boolean switch12;
    boolean switch13;
    boolean switch14;
    boolean switch15;
    boolean switch16;
    boolean switch17;
    boolean switch18;
    boolean switch19;
    boolean switch20;
    boolean switch21;
    boolean switch22;
    boolean switch23;
    boolean switch24;
    boolean switch25;
    boolean switch26;
    boolean switch27;
    boolean switch28;
    boolean switch29;


    List<Integer> listofsounds;
    int charavalue;

    
    Count count;
    SharedPreferences sp;

    @Override
    public void OnUpdated(int count) {
        sp.edit().putInt("count", count).apply();
        textCount.setText(String.format("Count: %d", count));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        SavedSettings =getSharedPreferences("save2",MODE_PRIVATE);
        switch2= SavedSettings.getBoolean("value2",true);

        listener = new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                cleanupMediaPlayer();
            }
        };

        image = findViewById(R.id.image);
        retrievedata();
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(switch2){
                    count.increment();
                    startRandomSound();
                }
                else{
                    Toast.makeText(v.getContext(), "NOT ACTIVE", Toast.LENGTH_SHORT).show();
                }
            }
        });

        textCount = findViewById(R.id.count);


        anim1 = ObjectAnimator.ofFloat(image,"translationY", 0f,-50f, 50f, -50f, 50f, 0);
        anim1.setDuration(600);
        set1 = new AnimatorSet();
        ArrayList<Animator> setArray = new ArrayList<>();


        anim2 = ObjectAnimator.ofFloat(image,"translationY", 0f,-50f, 50f, -50f, 50f, -50f, 50f, -50f, 50f,0);
        anim2.setRepeatCount(ValueAnimator.INFINITE);
        setArray.add(anim2);
        anim2 = ObjectAnimator.ofFloat(image,"translationX", 0f,-70f, 70f, -70f, 70f, 0);
        anim2.setRepeatCount(ValueAnimator.INFINITE);
        setArray.add(anim2);
        set1.playTogether(setArray);
        set1.setDuration(2000);
        anim2 = null;


        set2 = new AnimatorSet();
        setArray = new ArrayList<>();
        anim3 = ObjectAnimator.ofFloat(image, "rotation", 0f, -90f, 0f, 90f, 180f, 270f, 360f);
        anim3.setRepeatCount(ValueAnimator.INFINITE);
        setArray.add(anim3);
        anim3 = ObjectAnimator.ofFloat(image, "scaleX", 1f,0.5f, 1.5f, 0.5f, 1.5f, 1f);
        anim3.setRepeatCount(ValueAnimator.INFINITE);
        setArray.add(anim3);
        anim3 = ObjectAnimator.ofFloat(image, "scaleY", 1f,.5f, 1.5f, 0.5f, 1.5f, 1f);
        anim3.setRepeatCount(ValueAnimator.INFINITE);
        setArray.add(anim3);
        set2.playTogether(setArray);
        set2.setDuration(2000);
        anim3 = null;
        count = new Count();
        count.setListener(this);

        sp = this.getSharedPreferences("count", MODE_PRIVATE);
        count.setCount(sp.getInt("count", 0));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.option,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case(R.id.Alarm):
                Intent intent;
                intent = new Intent(MainActivity.this, AlarmActivity.class);
                startActivity(intent);
                break;
            case(R.id.menu_btn):
                Intent settingmenu;
                settingmenu = new Intent(MainActivity.this, AppMenu.class);
                startActivity(settingmenu);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    private void stopAnimations(){
        if (anim1.isRunning())
            anim1.end();
        if (set1.isRunning())
            set1.end();
        if (set2.isRunning())
            set2.end();
    }

    private void cleanupMediaPlayer(){
        stopAnimations();
        if(noise!=null) {
            if(noise.isPlaying())
                noise.stop();
            noise.release();
            noise = null;
        }
    }

    private void startRandomSound() {

        if(listofsounds.isEmpty()){
            cleanupMediaPlayer();
            Toast.makeText(this, "NO SOUND SELECTED", Toast.LENGTH_SHORT).show();

        }else{
            int value=(int)(Math.random()*(listofsounds.size()));
            int num = listofsounds.get(value);
            cleanupMediaPlayer();

            if (num==3&&switch3) {

                //play A

                noise = MediaPlayer.create(this, R.raw.guranoise1);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch1){
                    Toast.makeText(this, "A", Toast.LENGTH_SHORT).show();
                }
                anim1.start();

            } else if (num==4&&switch4) {

                //play Ehh

                noise = MediaPlayer.create(this, R.raw.guranoise2);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch1){
                    Toast.makeText(this, "Ehh", Toast.LENGTH_SHORT).show();
                }
                set1.start();

            } else if (num==5&&switch5) {

                //Play Ahh

                noise = MediaPlayer.create(this, R.raw.guranoise3);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch1){
                    Toast.makeText(this, "Ahh", Toast.LENGTH_SHORT).show();
                }
                set1.start();

            }else if (num==6&&switch6) {

                //play Ara Ara

                noise = MediaPlayer.create(this, R.raw.guranoise4);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch1){
                    Toast.makeText(this, "Ara Ara", Toast.LENGTH_SHORT).show();
                }
                set1.start();

            }else if (num==7&&switch7){

                //Play NOOOOOO

                noise = MediaPlayer.create(this, R.raw.guranoise5);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch1){
                    Toast.makeText(this, "NOOOOOO!", Toast.LENGTH_SHORT).show();
                }
                set2.start();

            }else if (num==8&&switch8){

                //play Hey that's pretty good

                noise = MediaPlayer.create(this, R.raw.guranoise6);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch1){
                    Toast.makeText(this, "Hey that's pretty good", Toast.LENGTH_SHORT).show();
                }
                set1.start();

            }else if (num==9&&switch9){

                //play lewd A

                noise = MediaPlayer.create(this, R.raw.guranoise7);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch1){
                    Toast.makeText(this, "Lewd 'A'", Toast.LENGTH_SHORT).show();
                }
                anim1.start();

            }else if (num==10&&switch10){

                //play Wake Up

                noise = MediaPlayer.create(this, R.raw.guranoise8);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch1){
                    Toast.makeText(this, "Wake Up", Toast.LENGTH_SHORT).show();
                }
                set1.start();

            }else if (num==11&&switch11){

                //play OK?

                noise = MediaPlayer.create(this, R.raw.guranoise9);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch1){
                    Toast.makeText(this, "OK?", Toast.LENGTH_SHORT).show();
                }
                anim1.start();

            }else if (num==12&&switch12){

                //play JA JANG

                noise = MediaPlayer.create(this, R.raw.guranoise10);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch1){
                    Toast.makeText(this, "JA JANG", Toast.LENGTH_SHORT).show();
                }
                set1.start();
            }else if (num==13&&switch13){

                noise = MediaPlayer.create(this, R.raw.guranoise11);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch1){
                    Toast.makeText(this, "Uhh", Toast.LENGTH_SHORT).show();
                }
                set1.start();
            }else if (num==14&&switch14){

                noise = MediaPlayer.create(this, R.raw.guranoise12);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch1){
                    Toast.makeText(this, "Onii Chan", Toast.LENGTH_SHORT).show();
                }
                set1.start();
            }
            else if (num==15&&switch15){

                noise = MediaPlayer.create(this, R.raw.guranoise13);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch1){
                    Toast.makeText(this, "Do you want my seed?", Toast.LENGTH_SHORT).show();
                }
                set1.start();
            }else if (num==16&&switch16){

                noise = MediaPlayer.create(this, R.raw.guranoise14);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch1){
                    Toast.makeText(this, "OOO", Toast.LENGTH_SHORT).show();
                }
                set1.start();
            }else if (num==17&&switch17){

                noise = MediaPlayer.create(this, R.raw.guranoise15);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch1){
                    Toast.makeText(this, "No problem", Toast.LENGTH_SHORT).show();
                }
                set1.start();
            }else if (num==18&&switch18){

                noise = MediaPlayer.create(this, R.raw.guranoise16);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch1){
                    Toast.makeText(this, "*clearing throat*", Toast.LENGTH_SHORT).show();
                }
                set1.start();
            }else if (num==19&&switch19){

                noise = MediaPlayer.create(this, R.raw.guranoise17);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch1){
                    Toast.makeText(this, "*realizes mic on*", Toast.LENGTH_SHORT).show();
                }
                set1.start();
            }else if (num==20&&switch20){

                noise = MediaPlayer.create(this, R.raw.guranoise18);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch1){
                    Toast.makeText(this, "HII", Toast.LENGTH_SHORT).show();
                }
                set1.start();
            }else if (num==21&&switch21){

                noise = MediaPlayer.create(this, R.raw.guranoise19);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch1){
                    Toast.makeText(this, "Uh oh", Toast.LENGTH_SHORT).show();
                }
                set1.start();
            }else if (num==22&&switch22){

                noise = MediaPlayer.create(this, R.raw.guranoise20);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch1){
                    Toast.makeText(this, "*tongue noises*", Toast.LENGTH_SHORT).show();
                }
                set1.start();
            }else if (num==23&&switch23){

                noise = MediaPlayer.create(this, R.raw.guranoise21);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch1){
                    Toast.makeText(this, "Yeah", Toast.LENGTH_SHORT).show();
                }
                set1.start();
            }else if (num==24&&switch24){

                noise = MediaPlayer.create(this, R.raw.guranoise22);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch2){
                    Toast.makeText(this, "*awkward greeting*", Toast.LENGTH_SHORT).show();
                }
                set1.start();
            }else if (num==25&&switch25){

                noise = MediaPlayer.create(this, R.raw.guranoise23);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch2){
                    Toast.makeText(this, "*frustrated noises*", Toast.LENGTH_SHORT).show();
                }
                set2.start();
            }else if (num==26&&switch26){

                noise = MediaPlayer.create(this, R.raw.guranoise24);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch2){
                    Toast.makeText(this, "Hey guys what's up", Toast.LENGTH_SHORT).show();
                }
                set1.start();
            }else if (num==27&&switch27){

                noise = MediaPlayer.create(this, R.raw.guranoise25);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch2){
                    Toast.makeText(this, "Oh no not the water monster", Toast.LENGTH_SHORT).show();
                }
                set1.start();
            }else if (num==28&&switch28){

                noise = MediaPlayer.create(this, R.raw.guranoise26);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch2){
                    Toast.makeText(this, "*table noises*", Toast.LENGTH_SHORT).show();
                }
                set1.start();
            }else if (num==29&&switch29){

                noise = MediaPlayer.create(this, R.raw.guranoise27);
                noise.setOnCompletionListener(listener);
                noise.start();
                if(switch2){
                    Toast.makeText(this, "*self introduction*", Toast.LENGTH_SHORT).show();
                }
                set1.start();
            }else{
                Toast.makeText(this, "NO SOUND SELECTED", Toast.LENGTH_SHORT).show();
            }
        }



    }


    private void retrievedata(){

        SavedSettings =getSharedPreferences("Chara",MODE_PRIVATE);
        charavalue= SavedSettings.getInt("CharaValue",0);
        if(charavalue==0){
            image.setImageResource(R.drawable.gura0);
        }else if (charavalue==1){
            image.setImageResource(R.drawable.gura1);
        }

        listofsounds= new ArrayList<Integer>();

        SavedSettings =getSharedPreferences("save1",MODE_PRIVATE);
        switch1= SavedSettings.getBoolean("value1",true);

        SavedSettings =getSharedPreferences("save2",MODE_PRIVATE);
        switch2= SavedSettings.getBoolean("value2",true);


        SavedSettings =getSharedPreferences("save3",MODE_PRIVATE);
        switch3= SavedSettings.getBoolean("value3",true);
        if (switch3) {
            listofsounds.add(3);
        }

        SavedSettings =getSharedPreferences("save4",MODE_PRIVATE);
        switch4= SavedSettings.getBoolean("value4",true);
        if (switch4) {
            listofsounds.add(4);
        }

        SavedSettings =getSharedPreferences("save5",MODE_PRIVATE);
        switch5= SavedSettings.getBoolean("value5",true);
        if (switch5) {
            listofsounds.add(5);
        }

        SavedSettings =getSharedPreferences("save6",MODE_PRIVATE);
        switch6= SavedSettings.getBoolean("value6",true);
        if (switch6) {
            listofsounds.add(6);
        }

        SavedSettings =getSharedPreferences("save7",MODE_PRIVATE);
        switch7= SavedSettings.getBoolean("value7",true);
        if (switch7) {
            listofsounds.add(7);
        }

        SavedSettings =getSharedPreferences("save8",MODE_PRIVATE);
        switch8= SavedSettings.getBoolean("value8",true);
        if (switch8) {
            listofsounds.add(8);
        }

        SavedSettings =getSharedPreferences("save9",MODE_PRIVATE);
        switch9= SavedSettings.getBoolean("value9",true);
        if (switch9) {
            listofsounds.add(9);
        }

        SavedSettings =getSharedPreferences("save10",MODE_PRIVATE);
        switch10= SavedSettings.getBoolean("value10",true);
        if (switch10) {
            listofsounds.add(10);
        }

        SavedSettings =getSharedPreferences("save11",MODE_PRIVATE);
        switch11= SavedSettings.getBoolean("value11",true);
        if (switch11) {
            listofsounds.add(11);
        }

        SavedSettings =getSharedPreferences("save12",MODE_PRIVATE);
        switch12= SavedSettings.getBoolean("value12",true);
        if (switch12) {
            listofsounds.add(12);
        }

        SavedSettings =getSharedPreferences("save13",MODE_PRIVATE);
        switch13= SavedSettings.getBoolean("value13",true);
        if (switch13) {
            listofsounds.add(13);
        }

        SavedSettings =getSharedPreferences("save14",MODE_PRIVATE);
        switch14= SavedSettings.getBoolean("value14",true);
        if (switch14) {
            listofsounds.add(14);
        }

        SavedSettings =getSharedPreferences("save15",MODE_PRIVATE);
        switch15= SavedSettings.getBoolean("value15",true);
        if (switch15) {
            listofsounds.add(15);
        }

        SavedSettings =getSharedPreferences("save16",MODE_PRIVATE);
        switch16= SavedSettings.getBoolean("value16",true);
        if (switch16) {
            listofsounds.add(16);
        }

        SavedSettings =getSharedPreferences("save17",MODE_PRIVATE);
        switch17= SavedSettings.getBoolean("value17",true);
        if (switch17) {
            listofsounds.add(17);
        }

        SavedSettings =getSharedPreferences("save18",MODE_PRIVATE);
        switch18= SavedSettings.getBoolean("value18",true);
        if (switch18) {
            listofsounds.add(18);
        }

        SavedSettings =getSharedPreferences("save19",MODE_PRIVATE);
        switch19= SavedSettings.getBoolean("value19",true);
        if (switch19) {
            listofsounds.add(19);
        }

        SavedSettings =getSharedPreferences("save20",MODE_PRIVATE);
        switch20= SavedSettings.getBoolean("value20",true);
        if (switch20) {
            listofsounds.add(20);
        }

        SavedSettings =getSharedPreferences("save21",MODE_PRIVATE);
        switch21= SavedSettings.getBoolean("value21",true);
        if (switch21) {
            listofsounds.add(21);
        }


        SavedSettings =getSharedPreferences("save22",MODE_PRIVATE);
        switch22= SavedSettings.getBoolean("value22",true);
        if (switch22) {
            listofsounds.add(22);
        }

        SavedSettings =getSharedPreferences("save23",MODE_PRIVATE);
        switch23= SavedSettings.getBoolean("value23",true);
        if (switch23) {
            listofsounds.add(23);
        }

        SavedSettings =getSharedPreferences("save24",MODE_PRIVATE);
        switch24= SavedSettings.getBoolean("value24",true);
        if (switch24) {
            listofsounds.add(24);
        }

        SavedSettings =getSharedPreferences("save25",MODE_PRIVATE);
        switch25= SavedSettings.getBoolean("value25",true);
        if (switch25) {
            listofsounds.add(25);
        }

        SavedSettings =getSharedPreferences("save26",MODE_PRIVATE);
        switch26= SavedSettings.getBoolean("value26",true);
        if (switch26) {
            listofsounds.add(26);
        }

        SavedSettings =getSharedPreferences("save27",MODE_PRIVATE);
        switch27= SavedSettings.getBoolean("value27",true);
        if (switch27) {
            listofsounds.add(27);
        }

        SavedSettings =getSharedPreferences("save28",MODE_PRIVATE);
        switch28= SavedSettings.getBoolean("value28",true);
        if (switch28) {
            listofsounds.add(28);
        }
        SavedSettings =getSharedPreferences("save29",MODE_PRIVATE);
        switch29= SavedSettings.getBoolean("value29",true);
        if (switch29) {
            listofsounds.add(29);
        }


    }

    @Override
    protected void onDestroy() {
        cleanupMediaPlayer();
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        cleanupMediaPlayer();
        super.onStop();
    }

    @Override
    protected void onResume() {
        retrievedata();
        super.onResume();
    }

}
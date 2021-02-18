package com.yuzumin.guranoises;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TableRow;

import androidx.appcompat.app.AppCompatActivity;

public class ClickerSettings extends AppCompatActivity {

    ImageView back_btn;

    TableRow GuraIMGRow;
    TableRow GuraIMG2Row;
    Integer charavalue;
    RadioButton GuraIMG;
    RadioButton GuraIMG2;

    Switch switch1;
    Switch switch2;
    Switch switch3;
    Switch switch4;
    Switch switch5;
    Switch switch6;
    Switch switch7;
    Switch switch8;
    Switch switch9;
    Switch switch10;
    Switch switch11;
    Switch switch12;
    Switch switch13;
    Switch switch14;
    Switch switch15;
    Switch switch16;
    Switch switch17;
    Switch switch18;
    Switch switch19;
    Switch switch20;
    Switch switch21;
    Switch switch22;
    Switch switch23;
    Switch switch24;
    Switch switch25;
    Switch switch26;
    Switch switch27;
    Switch switch28;
    Switch switch29;


    SharedPreferences SoundSettings;
    SharedPreferences.Editor SoundSettingsEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clicker_settings);
        getSupportActionBar().hide();

        back_btn=findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        GuraIMG=findViewById(R.id.gura_img);
        GuraIMGRow =findViewById(R.id.gura_img_row);
        GuraIMG2 =findViewById(R.id.gura2_img);
        GuraIMG2Row=findViewById(R.id.gura2_img_row);
        retrievedata();

        GuraIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=0;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                GuraIMG.setChecked(true);
                GuraIMG2.setChecked(false);

            }
        });
        GuraIMGRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=0;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                GuraIMG.setChecked(true);
                GuraIMG2.setChecked(false);
            }
        });
        GuraIMG2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=1;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                GuraIMG.setChecked(false);
                GuraIMG2.setChecked(true);
            }
        });
        GuraIMG2Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=1;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                GuraIMG.setChecked(false);
                GuraIMG2.setChecked(true);

            }
        });




        // for switch 1 to activate
        switch1=findViewById(R.id.switch1);
        SoundSettings =getSharedPreferences("save1",MODE_PRIVATE);
        switch1.setChecked(SoundSettings.getBoolean("value1",true));
        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch1.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save1",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value1",true);
                    SoundSettingsEditor.apply();
                    switch1.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save1",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value1",false);
                    SoundSettingsEditor.apply();
                    switch1.setChecked(false);
                }
            }
        });

        // for switch 2 to activate
        switch2=findViewById(R.id.switch2);
        SoundSettings =getSharedPreferences("save2",MODE_PRIVATE);
        switch2.setChecked(SoundSettings.getBoolean("value2",true));
        switch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch2.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save2",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value2",true);
                    SoundSettingsEditor.apply();
                    switch2.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save2",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value2",false);
                    SoundSettingsEditor.apply();
                    switch2.setChecked(false);
                }
            }
        });

        // for switch 3 to activate
        switch3=findViewById(R.id.switch3);
        SoundSettings =getSharedPreferences("save3",MODE_PRIVATE);
        switch3.setChecked(SoundSettings.getBoolean("value3",true));
        switch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch3.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save3",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value3",true);
                    SoundSettingsEditor.apply();
                    switch3.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save3",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value3",false);
                    SoundSettingsEditor.apply();
                    switch3.setChecked(false);
                }
            }
        });

        // for switch 4 to activate
        switch4=findViewById(R.id.switch4);
        SoundSettings =getSharedPreferences("save4",MODE_PRIVATE);
        switch4.setChecked(SoundSettings.getBoolean("value4",true));
        switch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch4.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save4",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value4",true);
                    SoundSettingsEditor.apply();
                    switch4.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save4",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value4",false);
                    SoundSettingsEditor.apply();
                    switch4.setChecked(false);
                }
            }
        });

        // for switch 5 to activate
        switch5=findViewById(R.id.switch5);
        SoundSettings =getSharedPreferences("save5",MODE_PRIVATE);
        switch5.setChecked(SoundSettings.getBoolean("value5",true));
        switch5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch5.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save5",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value5",true);
                    SoundSettingsEditor.apply();
                    switch5.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save5",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value5",false);
                    SoundSettingsEditor.apply();
                    switch5.setChecked(false);
                }
            }
        });

        // for switch 6 to activate
        switch6=findViewById(R.id.switch6);
        SoundSettings =getSharedPreferences("save6",MODE_PRIVATE);
        switch6.setChecked(SoundSettings.getBoolean("value6",true));
        switch6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch6.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save6",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value6",true);
                    SoundSettingsEditor.apply();
                    switch6.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save6",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value6",false);
                    SoundSettingsEditor.apply();
                    switch6.setChecked(false);
                }
            }
        });

        // for switch 7 to activate
        switch7=findViewById(R.id.switch7);
        SoundSettings =getSharedPreferences("save7",MODE_PRIVATE);
        switch7.setChecked(SoundSettings.getBoolean("value7",true));
        switch7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch7.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save7",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value7",true);
                    SoundSettingsEditor.apply();
                    switch7.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save7",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value7",false);
                    SoundSettingsEditor.apply();
                    switch7.setChecked(false);
                }
            }
        });

        // for switch 8 to activate
        switch8=findViewById(R.id.switch8);
        SoundSettings =getSharedPreferences("save8",MODE_PRIVATE);
        switch8.setChecked(SoundSettings.getBoolean("value8",true));
        switch8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch8.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save8",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value8",true);
                    SoundSettingsEditor.apply();
                    switch8.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save8",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value8",false);
                    SoundSettingsEditor.apply();
                    switch8.setChecked(false);
                }
            }
        });

        // for switch 9 to activate
        switch9=findViewById(R.id.switch9);
        SoundSettings =getSharedPreferences("save9",MODE_PRIVATE);
        switch9.setChecked(SoundSettings.getBoolean("value9",true));
        switch9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch9.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save9",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value9",true);
                    SoundSettingsEditor.apply();
                    switch9.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save9",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value9",false);
                    SoundSettingsEditor.apply();
                    switch9.setChecked(false);
                }
            }
        });

        // for switch 10 to activate
        switch10=findViewById(R.id.switch10);
        SoundSettings =getSharedPreferences("save10",MODE_PRIVATE);
        switch10.setChecked(SoundSettings.getBoolean("value10",true));
        switch10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch10.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save10",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value10",true);
                    SoundSettingsEditor.apply();
                    switch10.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save10",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value10",false);
                    SoundSettingsEditor.apply();
                    switch10.setChecked(false);
                }
            }
        });

        // for switch 11 to activate
        switch11=findViewById(R.id.switch11);
        SoundSettings =getSharedPreferences("save11",MODE_PRIVATE);
        switch11.setChecked(SoundSettings.getBoolean("value11",true));
        switch11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch11.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save11",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value11",true);
                    SoundSettingsEditor.apply();
                    switch11.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save11",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value11",false);
                    SoundSettingsEditor.apply();
                    switch11.setChecked(false);
                }
            }
        });

        // for switch 12 to activate
        switch12=findViewById(R.id.switch12);
        SoundSettings =getSharedPreferences("save12",MODE_PRIVATE);
        switch12.setChecked(SoundSettings.getBoolean("value12",true));
        switch12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch12.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save12",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value12",true);
                    SoundSettingsEditor.apply();
                    switch12.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save12",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value12",false);
                    SoundSettingsEditor.apply();
                    switch12.setChecked(false);
                }
            }
        });

        // for switch 13 to activate
        switch13=findViewById(R.id.switch13);
        SoundSettings =getSharedPreferences("save13",MODE_PRIVATE);
        switch13.setChecked(SoundSettings.getBoolean("value13",true));
        switch13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch13.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save13",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value13",true);
                    SoundSettingsEditor.apply();
                    switch13.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save13",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value13",false);
                    SoundSettingsEditor.apply();
                    switch13.setChecked(false);
                }
            }
        });

        // for switch 14 to activate
        switch14=findViewById(R.id.switch14);
        SoundSettings =getSharedPreferences("save14",MODE_PRIVATE);
        switch14.setChecked(SoundSettings.getBoolean("value14",true));
        switch14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch14.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save14",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value14",true);
                    SoundSettingsEditor.apply();
                    switch14.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save14",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value14",false);
                    SoundSettingsEditor.apply();
                    switch14.setChecked(false);
                }
            }
        });

        // for switch 15 to activate
        switch15=findViewById(R.id.switch15);
        SoundSettings =getSharedPreferences("save15",MODE_PRIVATE);
        switch15.setChecked(SoundSettings.getBoolean("value15",true));
        switch15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch15.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save15",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value15",true);
                    SoundSettingsEditor.apply();
                    switch15.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save15",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value15",false);
                    SoundSettingsEditor.apply();
                    switch15.setChecked(false);
                }
            }
        });

        // for switch 16 to activate
        switch16=findViewById(R.id.switch16);
        SoundSettings =getSharedPreferences("save16",MODE_PRIVATE);
        switch16.setChecked(SoundSettings.getBoolean("value16",true));
        switch16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch16.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save16",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value16",true);
                    SoundSettingsEditor.apply();
                    switch16.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save16",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value16",false);
                    SoundSettingsEditor.apply();
                    switch16.setChecked(false);
                }
            }
        });

        // for switch 17 to activate
        switch17=findViewById(R.id.switch17);
        SoundSettings =getSharedPreferences("save17",MODE_PRIVATE);
        switch17.setChecked(SoundSettings.getBoolean("value17",true));
        switch17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch17.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save17",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value17",true);
                    SoundSettingsEditor.apply();
                    switch17.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save17",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value17",false);
                    SoundSettingsEditor.apply();
                    switch17.setChecked(false);
                }
            }
        });

        // for switch 18 to activate
        switch18=findViewById(R.id.switch18);
        SoundSettings =getSharedPreferences("save18",MODE_PRIVATE);
        switch18.setChecked(SoundSettings.getBoolean("value18",true));
        switch18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch18.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save18",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value18",true);
                    SoundSettingsEditor.apply();
                    switch18.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save18",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value18",false);
                    SoundSettingsEditor.apply();
                    switch18.setChecked(false);
                }
            }
        });

        // for switch 19 to activate
        switch19=findViewById(R.id.switch19);
        SoundSettings =getSharedPreferences("save19",MODE_PRIVATE);
        switch19.setChecked(SoundSettings.getBoolean("value19",true));
        switch19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch19.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save19",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value19",true);
                    SoundSettingsEditor.apply();
                    switch19.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save19",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value19",false);
                    SoundSettingsEditor.apply();
                    switch19.setChecked(false);
                }
            }
        });

        // for switch 20 to activate
        switch20=findViewById(R.id.switch20);
        SoundSettings =getSharedPreferences("save20",MODE_PRIVATE);
        switch20.setChecked(SoundSettings.getBoolean("value20",true));
        switch20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch20.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save20",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value20",true);
                    SoundSettingsEditor.apply();
                    switch20.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save20",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value20",false);
                    SoundSettingsEditor.apply();
                    switch20.setChecked(false);
                }
            }
        });

        // for switch 21 to activate
        switch21=findViewById(R.id.switch21);
        SoundSettings =getSharedPreferences("save21",MODE_PRIVATE);
        switch21.setChecked(SoundSettings.getBoolean("value21",true));
        switch21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch21.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save21",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value21",true);
                    SoundSettingsEditor.apply();
                    switch21.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save21",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value21",false);
                    SoundSettingsEditor.apply();
                    switch21.setChecked(false);
                }
            }
        });

        // for switch 22 to activate
        switch22=findViewById(R.id.switch22);
        SoundSettings =getSharedPreferences("save22",MODE_PRIVATE);
        switch22.setChecked(SoundSettings.getBoolean("value22",true));
        switch22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch22.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save22",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value22",true);
                    SoundSettingsEditor.apply();
                    switch22.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save22",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value22",false);
                    SoundSettingsEditor.apply();
                    switch22.setChecked(false);
                }
            }
        });

        // for switch 23 to activate
        switch23=findViewById(R.id.switch23);
        SoundSettings =getSharedPreferences("save23",MODE_PRIVATE);
        switch23.setChecked(SoundSettings.getBoolean("value23",true));
        switch23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch23.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save23",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value23",true);
                    SoundSettingsEditor.apply();
                    switch23.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save23",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value23",false);
                    SoundSettingsEditor.apply();
                    switch23.setChecked(false);
                }
            }
        });

        // for switch 24 to activate
        switch24=findViewById(R.id.switch24);
        SoundSettings =getSharedPreferences("save24",MODE_PRIVATE);
        switch24.setChecked(SoundSettings.getBoolean("value24",true));
        switch24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch24.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save24",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value24",true);
                    SoundSettingsEditor.apply();
                    switch24.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save24",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value24",false);
                    SoundSettingsEditor.apply();
                    switch24.setChecked(false);
                }
            }
        });

        // for switch 25 to activate
        switch25=findViewById(R.id.switch25);
        SoundSettings =getSharedPreferences("save25",MODE_PRIVATE);
        switch25.setChecked(SoundSettings.getBoolean("value25",true));
        switch25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch25.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save25",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value25",true);
                    SoundSettingsEditor.apply();
                    switch25.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save25",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value25",false);
                    SoundSettingsEditor.apply();
                    switch25.setChecked(false);
                }
            }
        });

        // for switch 26 to activate
        switch26=findViewById(R.id.switch26);
        SoundSettings =getSharedPreferences("save26",MODE_PRIVATE);
        switch26.setChecked(SoundSettings.getBoolean("value26",true));
        switch26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch26.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save26",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value26",true);
                    SoundSettingsEditor.apply();
                    switch26.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save26",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value26",false);
                    SoundSettingsEditor.apply();
                    switch26.setChecked(false);
                }
            }
        });

        // for switch 27 to activate
        switch27=findViewById(R.id.switch27);
        SoundSettings =getSharedPreferences("save27",MODE_PRIVATE);
        switch27.setChecked(SoundSettings.getBoolean("value27",true));
        switch27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch27.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save27",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value27",true);
                    SoundSettingsEditor.apply();
                    switch27.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save27",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value27",false);
                    SoundSettingsEditor.apply();
                    switch27.setChecked(false);
                }
            }
        });

        // for switch 28 to activate
        switch28=findViewById(R.id.switch28);
        SoundSettings =getSharedPreferences("save28",MODE_PRIVATE);
        switch28.setChecked(SoundSettings.getBoolean("value28",true));
        switch28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch28.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save28",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value28",true);
                    SoundSettingsEditor.apply();
                    switch28.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save28",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value28",false);
                    SoundSettingsEditor.apply();
                    switch28.setChecked(false);
                }
            }
        });

        // for switch 29 to activate
        switch29=findViewById(R.id.switch29);
        SoundSettings =getSharedPreferences("save29",MODE_PRIVATE);
        switch29.setChecked(SoundSettings.getBoolean("value29",true));
        switch29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch29.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save29",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value29",true);
                    SoundSettingsEditor.apply();
                    switch29.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save29",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value29",false);
                    SoundSettingsEditor.apply();
                    switch29.setChecked(false);
                }
            }
        });



/*

        //Reset button
        button1=findViewById(R.id.buttonR);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //To set all switches to false state and its memory to false

                SoundSettingsEditor =getSharedPreferences("save1",MODE_PRIVATE).edit();
                SoundSettingsEditor.putBoolean("value1",false);
                SoundSettingsEditor.apply();
                switch1.setChecked(false);

                SoundSettingsEditor =getSharedPreferences("save2",MODE_PRIVATE).edit();
                SoundSettingsEditor.putBoolean("value2",false);
                SoundSettingsEditor.apply();
                switch2.setChecked(false);

                SoundSettingsEditor =getSharedPreferences("save3",MODE_PRIVATE).edit();
                SoundSettingsEditor.putBoolean("value3",false);
                SoundSettingsEditor.apply();
                switch3.setChecked(false);

                SoundSettingsEditor =getSharedPreferences("save4",MODE_PRIVATE).edit();
                SoundSettingsEditor.putBoolean("value4",false);
                SoundSettingsEditor.apply();
                switch4.setChecked(false);

                SoundSettingsEditor =getSharedPreferences("save5",MODE_PRIVATE).edit();
                SoundSettingsEditor.putBoolean("value5",false);
                SoundSettingsEditor.apply();
                switch5.setChecked(false);

                SoundSettingsEditor =getSharedPreferences("save6",MODE_PRIVATE).edit();
                SoundSettingsEditor.putBoolean("value6",false);
                SoundSettingsEditor.apply();
                switch6.setChecked(false);

                SoundSettingsEditor =getSharedPreferences("save7",MODE_PRIVATE).edit();
                SoundSettingsEditor.putBoolean("value7",false);
                SoundSettingsEditor.apply();
                switch7.setChecked(false);

                SoundSettingsEditor =getSharedPreferences("save8",MODE_PRIVATE).edit();
                SoundSettingsEditor.putBoolean("value8",false);
                SoundSettingsEditor.apply();
                switch8.setChecked(false);

                SoundSettingsEditor =getSharedPreferences("save9",MODE_PRIVATE).edit();
                SoundSettingsEditor.putBoolean("value9",false);
                SoundSettingsEditor.apply();
                switch9.setChecked(false);

                SoundSettingsEditor =getSharedPreferences("save10",MODE_PRIVATE).edit();
                SoundSettingsEditor.putBoolean("value10",false);
                SoundSettingsEditor.apply();
                switch10.setChecked(false);

                SoundSettingsEditor =getSharedPreferences("save11",MODE_PRIVATE).edit();
                SoundSettingsEditor.putBoolean("value11",false);
                SoundSettingsEditor.apply();
                switch11.setChecked(false);

                SoundSettingsEditor =getSharedPreferences("save12",MODE_PRIVATE).edit();
                SoundSettingsEditor.putBoolean("value12",false);
                SoundSettingsEditor.apply();
                switch12.setChecked(false);
            }
        });
        button1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    button1.setCardBackgroundColor(getResources().getColor(R.color.button));
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    button1.setCardBackgroundColor(getResources().getColor(R.color.clearbutton));
                }
                return false;
            }
        });


 */

    }

    private void retrievedata(){
        SoundSettings=getSharedPreferences("Chara",MODE_PRIVATE);
        charavalue=SoundSettings.getInt("CharaValue",0);

        if(charavalue==0){
            GuraIMG.setChecked(true);
            GuraIMG2.setChecked(false);
        }else if(charavalue==1){
            GuraIMG.setChecked(false);
            GuraIMG2.setChecked(true);
        }
    }
}
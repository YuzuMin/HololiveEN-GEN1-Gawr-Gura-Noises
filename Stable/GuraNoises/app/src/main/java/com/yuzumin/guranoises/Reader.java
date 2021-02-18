package com.yuzumin.guranoises;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Reader extends AppCompatActivity {

    int value;
    TextView title;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reader);
        getSupportActionBar().hide();


        Bundle extras = getIntent().getExtras();
        value = extras.getInt("Value");

        title=findViewById(R.id.reader_title);
        text=findViewById(R.id.reader_text);
        displaystuff();
    }

    private void displaystuff(){

        if(value==0){
            title.setText("Privacy Policy");
            text.setText("YuzuMin built the Gura Noises app as an Open Source app. This SERVICE is provided by YuzuMin at no cost and is intended for use as is.\n" +
                    "\n" +
                    "This page is used to inform visitors regarding my policies with the collection, use, and disclosure of Personal Information if anyone decided to use my Service.\n" +
                    "\n" +
                    "If you choose to use my Service, then you agree to the collection and use of information in relation to this policy. The Personal Information that I collect is used for providing and improving the Service. I will not use or share your information with anyone except as described in this Privacy Policy.\n" +
                    "\n" +
                    "The terms used in this Privacy Policy have the same meanings as in our Terms and Conditions, which is accessible at Gura Noises unless otherwise defined in this Privacy Policy.\n" +
                    "\n" +
                    "Information Collection and Use\n" +
                    "\n" +
                    "For a better experience, while using our Service, I may require you to provide us with certain personally identifiable information. The information that I request will be retained on your device and is not collected by me in any way.\n" +
                    "\n" +
                    "The app does use third party services that may collect information used to identify you.\n" +
                    "\n" +
                    "Link to privacy policy of third party service providers used by the app\n" +
                    "\n" +
                    "Google Play Services\n" +
                    "Log Data\n" +
                    "\n" +
                    "I want to inform you that whenever you use my Service, in a case of an error in the app I collect data and information (through third party products) on your phone called Log Data. This Log Data may include information such as your device Internet Protocol (“IP”) address, device name, operating system version, the configuration of the app when utilizing my Service, the time and date of your use of the Service, and other statistics.\n" +
                    "\n" +
                    "Cookies\n" +
                    "\n" +
                    "Cookies are files with a small amount of data that are commonly used as anonymous unique identifiers. These are sent to your browser from the websites that you visit and are stored on your device's internal memory.\n" +
                    "\n" +
                    "This Service does not use these “cookies” explicitly. However, the app may use third party code and libraries that use “cookies” to collect information and improve their services. You have the option to either accept or refuse these cookies and know when a cookie is being sent to your device. If you choose to refuse our cookies, you may not be able to use some portions of this Service.\n" +
                    "\n" +
                    "Service Providers\n" +
                    "\n" +
                    "I may employ third-party companies and individuals due to the following reasons:\n" +
                    "\n" +
                    "To facilitate our Service;\n" +
                    "To provide the Service on our behalf;\n" +
                    "To perform Service-related services; or\n" +
                    "To assist us in analyzing how our Service is used.\n" +
                    "I want to inform users of this Service that these third parties have access to your Personal Information. The reason is to perform the tasks assigned to them on our behalf. However, they are obligated not to disclose or use the information for any other purpose.\n" +
                    "\n" +
                    "Security\n" +
                    "\n" +
                    "I value your trust in providing us your Personal Information, thus we are striving to use commercially acceptable means of protecting it. But remember that no method of transmission over the internet, or method of electronic storage is 100% secure and reliable, and I cannot guarantee its absolute security.\n" +
                    "\n" +
                    "Links to Other Sites\n" +
                    "\n" +
                    "This Service may contain links to other sites. If you click on a third-party link, you will be directed to that site. Note that these external sites are not operated by me. Therefore, I strongly advise you to review the Privacy Policy of these websites. I have no control over and assume no responsibility for the content, privacy policies, or practices of any third-party sites or services.\n" +
                    "\n" +
                    "Children’s Privacy\n" +
                    "\n" +
                    "These Services do not address anyone under the age of 13. I do not knowingly collect personally identifiable information from children under 13. In the case I discover that a child under 13 has provided me with personal information, I immediately delete this from our servers. If you are a parent or guardian and you are aware that your child has provided us with personal information, please contact me so that I will be able to do necessary actions.\n" +
                    "\n" +
                    "Changes to This Privacy Policy\n" +
                    "\n" +
                    "I may update our Privacy Policy from time to time. Thus, you are advised to review this page periodically for any changes. I will notify you of any changes by posting the new Privacy Policy on this page.\n" +
                    "\n" +
                    "This policy is effective as of 2021-02-12\n" +
                    "\n" +
                    "Contact Us\n" +
                    "\n" +
                    "If you have any questions or suggestions about my Privacy Policy, do not hesitate to contact me at yuzuminteam@gmail.com.\n" +
                    "\n" +
                    "This privacy policy page was created at privacypolicytemplate.net and modified/generated by App Privacy Policy Generator");

        }else if(value==1){
            title.setText("License");
            text.setText("MIT License\n" +
                    "\n" +
                    "Copyright (c) 2021 YuzuMin\n" +
                    "\n" +
                    "Permission is hereby granted, free of charge, to any person obtaining a copy\n" +
                    "of this software and associated documentation files (the \"Software\"), to deal\n" +
                    "in the Software without restriction, including without limitation the rights\n" +
                    "to use, copy, modify, merge, publish, distribute, sublicense, and/or sell\n" +
                    "copies of the Software, and to permit persons to whom the Software is\n" +
                    "furnished to do so, subject to the following conditions:\n" +
                    "\n" +
                    "The above copyright notice and this permission notice shall be included in all\n" +
                    "copies or substantial portions of the Software.\n" +
                    "\n" +
                    "THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n" +
                    "IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n" +
                    "FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n" +
                    "AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n" +
                    "LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,\n" +
                    "OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE\n" +
                    "SOFTWARE.");
        }else if(value==2){
            title.setText("Terms & Conditions" );
            text.setText("By downloading or using the app, these terms will automatically apply to you – you should make sure therefore that you read them carefully before using the app. You’re not allowed to copy, or modify the app, any part of the app, or our trademarks in any way. You’re not allowed to attempt to extract the source code of the app, and you also shouldn’t try to translate the app into other languages, or make derivative versions. The app itself, and all the trade marks, copyright, database rights and other intellectual property rights related to it, still belong to YuzuMin.\n" +
                    "\n" +
                    "YuzuMin is committed to ensuring that the app is as useful and efficient as possible. For that reason, we reserve the right to make changes to the app or to charge for its services, at any time and for any reason. We will never charge you for the app or its services without making it very clear to you exactly what you’re paying for.\n" +
                    "\n" +
                    "The Gura Noises app stores and processes personal data that you have provided to us, in order to provide my Service. It’s your responsibility to keep your phone and access to the app secure. We therefore recommend that you do not jailbreak or root your phone, which is the process of removing software restrictions and limitations imposed by the official operating system of your device. It could make your phone vulnerable to malware/viruses/malicious programs, compromise your phone’s security features and it could mean that the Gura Noises app won’t work properly or at all.\n" +
                    "\n" +
                    "The app does use third party services that declare their own Terms and Conditions.\n" +
                    "\n" +
                    "Link to Terms and Conditions of third party service providers used by the app\n" +
                    "\n" +
                    "Google Play Services\n" +
                    "You should be aware that there are certain things that YuzuMin will not take responsibility for. Certain functions of the app will require the app to have an active internet connection. The connection can be Wi-Fi, or provided by your mobile network provider, but YuzuMin cannot take responsibility for the app not working at full functionality if you don’t have access to Wi-Fi, and you don’t have any of your data allowance left.\n" +
                    "\n" +
                    "If you’re using the app outside of an area with Wi-Fi, you should remember that your terms of the agreement with your mobile network provider will still apply. As a result, you may be charged by your mobile provider for the cost of data for the duration of the connection while accessing the app, or other third party charges. In using the app, you’re accepting responsibility for any such charges, including roaming data charges if you use the app outside of your home territory (i.e. region or country) without turning off data roaming. If you are not the bill payer for the device on which you’re using the app, please be aware that we assume that you have received permission from the bill payer for using the app.\n" +
                    "\n" +
                    "Along the same lines, YuzuMin cannot always take responsibility for the way you use the app i.e. You need to make sure that your device stays charged – if it runs out of battery and you can’t turn it on to avail the Service, YuzuMin cannot accept responsibility.\n" +
                    "\n" +
                    "With respect to YuzuMin’s responsibility for your use of the app, when you’re using the app, it’s important to bear in mind that although we endeavour to ensure that it is updated and correct at all times, we do rely on third parties to provide information to us so that we can make it available to you. YuzuMin accepts no liability for any loss, direct or indirect, you experience as a result of relying wholly on this functionality of the app.\n" +
                    "\n" +
                    "At some point, we may wish to update the app. The app is currently available on Android – the requirements for system(and for any additional systems we decide to extend the availability of the app to) may change, and you’ll need to download the updates if you want to keep using the app. YuzuMin does not promise that it will always update the app so that it is relevant to you and/or works with the Android version that you have installed on your device. However, you promise to always accept updates to the application when offered to you, We may also wish to stop providing the app, and may terminate use of it at any time without giving notice of termination to you. Unless we tell you otherwise, upon any termination, (a) the rights and licenses granted to you in these terms will end; (b) you must stop using the app, and (if needed) delete it from your device.\n" +
                    "\n" +
                    "Changes to This Terms and Conditions\n" +
                    "\n" +
                    "I may update our Terms and Conditions from time to time. Thus, you are advised to review this page periodically for any changes. I will notify you of any changes by posting the new Terms and Conditions on this page.\n" +
                    "\n" +
                    "These terms and conditions are effective as of 2021-02-12\n" +
                    "\n" +
                    "Contact Us\n" +
                    "\n" +
                    "If you have any questions or suggestions about my Terms and Conditions, do not hesitate to contact me at yuzuminteam@gmail.com.\n" +
                    "\n" +
                    "This Terms and Conditions page was generated by App Privacy Policy Generator");
        }else if(value==3){
            title.setText("Release Notes" );
            text.setText(
                    "/***NEW FEATURES***/\n" +
                    "•Developer Mode\n" +
                    "•Alarm Clock\n" +
                    "•Google Drive Download\n" +
                    "•Updated Setting\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "/***FIXES***/\n" +
                    "•New Randomizer\n" +
                    "•Popup Text Error\n" +
                    "\n" +
                    "\n" +
                    "/***HOW TO USE***/\n" +
                    "Go to menu and tap Version 7 times \n" +
                    "to unlock Alarm feature \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "/***IMPORTANT***/\n" +
                    "Alarm is still an unstable feature\n" +
                    "Uses Media Volume instead of Alarm Volume\n" +
                    "Currently is not able to delete alarms yet\n" +
                    "\n"+
                    "IT IS NOT RECOMMENDED TO BE USED AS A MAIN ALARM\n");
        }
    }
}
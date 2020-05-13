package com.chhuo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ImagesViewActivity extends AppCompatActivity {

    boolean stoppedOnBack = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_images_view);

        Toast.makeText(this, R.string.love_pogu, Toast.LENGTH_LONG).show();

        TextView pakshiuTextView = findViewById(R.id.text_pakshiu);
        pakshiuTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(ImagesViewActivity.this, " My You, Me Urs | All for U ", Toast.LENGTH_LONG).show();
                startActivity(new Intent(getApplicationContext(), FeedbackActivity.class));
                stopService(new Intent(getApplicationContext(), MusicPlayService.class));
                finish();
            }
        });

        TextView firstRowTextView = findViewById(R.id.first_row_text);
        firstRowTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ImagesViewActivity.this, "Always|Forever Together Mere Yaaraa", Toast.LENGTH_LONG).show();
            }
        });
        TextView secondRowTextView = findViewById(R.id.second_row_text);
        secondRowTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ImagesViewActivity.this, "We're Same | In You, I got Me", Toast.LENGTH_LONG).show();
            }
        });
        TextView fourthRowTextView = findViewById(R.id.fourth_row_text);
        fourthRowTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ImagesViewActivity.this, "Akele Adhure se, Sath Poore se", Toast.LENGTH_LONG).show();
            }
        });
        TextView fifthRowTextView = findViewById(R.id.fifth_row_text);
        fifthRowTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ImagesViewActivity.this, "Jee rahe the, Jeene Lage Hum", Toast.LENGTH_LONG).show();
            }
        });
        TextView seventhRowTextView = findViewById(R.id.seventh_row_text);
        seventhRowTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ImagesViewActivity.this, "Bin Kuch Kahe Sab Keh Diya Tumne", Toast.LENGTH_LONG).show();
            }
        });
        TextView eighthRowTextView = findViewById(R.id.eighth_row_text);
        eighthRowTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ImagesViewActivity.this, "Tum Mile, Sab Kuch Mila", Toast.LENGTH_SHORT).show();
            }
        });

        // setting images to image views in activity
        // 1st row
        setImageResourceImageMisc();
        // 2nd & 4th row
        setImageResourceImageSent();
        // 3rd row
        setImageResourceImageSelfie();
        // 5th & 7th row
        setImageResourceImageDaily();
        // 6th row
        setImageResourceImageMehendi();
        // 8th row
        setImageResourceImageScreenShot();

    }

    private void setImageResourceImageScreenShot() {
        // 8th row
        ImageView imageView81 = findViewById(R.id.image_screenshot_81);
        imageView81.setImageResource(R.drawable.image_screenshot_81);
        ImageView imageView82 = findViewById(R.id.image_screenshot_82);
        imageView82.setImageResource(R.drawable.image_screenshot_82);
        ImageView imageView83 = findViewById(R.id.image_screenshot_83);
        imageView83.setImageResource(R.drawable.image_screenshot_83);
        ImageView imageView84 = findViewById(R.id.image_screenshot_84);
        imageView84.setImageResource(R.drawable.image_screenshot_84);
//        ImageView imageView85 = findViewById(R.id.image_screenshot_85);
//        imageView85.setImageResource(R.drawable.image_screenshot_85);
        ImageView imageView86 = findViewById(R.id.image_screenshot_86);
        imageView86.setImageResource(R.drawable.image_screenshot_86);
        ImageView imageView87 = findViewById(R.id.image_screenshot_87);
        imageView87.setImageResource(R.drawable.image_screenshot_87);
        ImageView imageView88 = findViewById(R.id.image_screenshot_88);
        imageView88.setImageResource(R.drawable.image_screenshot_88);
        ImageView imageView89 = findViewById(R.id.image_screenshot_89);
        imageView89.setImageResource(R.drawable.image_screenshot_89);
    }

    private void setImageResourceImageMehendi() {
        // 6th row
        ImageView imageView61 = findViewById(R.id.image_mehendi_1);
        imageView61.setImageResource(R.drawable.image_mehendi_1);
        ImageView imageView62 = findViewById(R.id.image_mehendi_2);
        imageView62.setImageResource(R.drawable.image_mehendi_2);
        ImageView imageView63 = findViewById(R.id.image_mehendi_3);
        imageView63.setImageResource(R.drawable.image_mehendi_3);
        ImageView imageView64 = findViewById(R.id.image_mehendi_4);
        imageView64.setImageResource(R.drawable.image_mehendi_4);
        ImageView imageView65 = findViewById(R.id.image_mehendi_5);
        imageView65.setImageResource(R.drawable.image_mehendi_5);
    }

    private void setImageResourceImageDaily() {
        // 5th row
        ImageView imageView51 = findViewById(R.id.image_daily_51);
        imageView51.setImageResource(R.drawable.images_daily_51);
        ImageView imageView52 = findViewById(R.id.image_daily_52);
        imageView52.setImageResource(R.drawable.images_daily_52);
        ImageView imageView53 = findViewById(R.id.image_daily_53);
        imageView53.setImageResource(R.drawable.images_daily_53);
        ImageView imageView54 = findViewById(R.id.image_daily_54);
        imageView54.setImageResource(R.drawable.images_daily_54);
        ImageView imageView55 = findViewById(R.id.image_daily_55);
        imageView55.setImageResource(R.drawable.images_daily_55);
        ImageView imageView56 = findViewById(R.id.image_daily_56);
        imageView56.setImageResource(R.drawable.images_daily_56);
        ImageView imageView57 = findViewById(R.id.image_daily_57);
        imageView57.setImageResource(R.drawable.images_daily_57);
        ImageView imageView58 = findViewById(R.id.image_daily_58);
        imageView58.setImageResource(R.drawable.images_daily_58);
        ImageView imageView59 = findViewById(R.id.image_daily_59);
        imageView59.setImageResource(R.drawable.images_daily_59);
//        ImageView imageView510 = findViewById(R.id.image_daily_510);
//        imageView510.setImageResource(R.drawable.images_daily_510);
        ImageView imageView511 = findViewById(R.id.image_daily_5_11);
        imageView511.setImageResource(R.drawable.images_daily_5_11);
        // 7th row
        ImageView imageView71 = findViewById(R.id.image_daily_71);
        imageView71.setImageResource(R.drawable.image_daily_71);
        ImageView imageView72 = findViewById(R.id.image_daily_72);
        imageView72.setImageResource(R.drawable.image_daily_72);
        ImageView imageView73 = findViewById(R.id.image_daily_73);
        imageView73.setImageResource(R.drawable.image_daily_73);
        ImageView imageView74 = findViewById(R.id.image_daily_74);
        imageView74.setImageResource(R.drawable.image_daily_74);
//        ImageView imageView75 = findViewById(R.id.image_daily_75);
//        imageView75.setImageResource(R.drawable.image_daily_75);
        ImageView imageView76 = findViewById(R.id.image_daily_76);
        imageView76.setImageResource(R.drawable.image_daily_76);
        ImageView imageView77 = findViewById(R.id.image_daily_77);
        imageView77.setImageResource(R.drawable.image_daily_77);
        ImageView imageView78 = findViewById(R.id.image_daily_78);
        imageView78.setImageResource(R.drawable.image_daily_78);
        ImageView imageView79 = findViewById(R.id.image_daily_79);
        imageView79.setImageResource(R.drawable.image_daily_79);
        ImageView imageView710 = findViewById(R.id.image_daily_7_10);
        imageView710.setImageResource(R.drawable.image_daily_7_10);
        ImageView imageView711 = findViewById(R.id.image_daily_7_11);
        imageView711.setImageResource(R.drawable.image_daily_7_11);
    }

    private void setImageResourceImageSelfie() {
        // 3rd row
        ImageView imageView31 = findViewById(R.id.image_selfie_31);
        imageView31.setImageResource(R.drawable.image_selfie_31);
        ImageView imageView32 = findViewById(R.id.image_selfie_32);
        imageView32.setImageResource(R.drawable.image_selfie_32);
        ImageView imageView33 = findViewById(R.id.image_selfie_33);
        imageView33.setImageResource(R.drawable.image_selfie_33);
        ImageView imageView34 = findViewById(R.id.image_selfie_34);
        imageView34.setImageResource(R.drawable.image_selfie_34);
        ImageView imageView35 = findViewById(R.id.image_selfie_35);
        imageView35.setImageResource(R.drawable.image_selfie_35);
    }

    private void setImageResourceImageMisc() {
        // 1st row
        ImageView imageView1 = findViewById(R.id.image_misc_11);
        imageView1.setImageResource(R.drawable.image_misc_11);
        ImageView imageView2 = findViewById(R.id.image_misc_12);
        imageView2.setImageResource(R.drawable.image_misc_12);
        ImageView imageView3 = findViewById(R.id.image_misc_13);
        imageView3.setImageResource(R.drawable.image_misc_13);
        ImageView imageView4 = findViewById(R.id.image_misc_14);
        imageView4.setImageResource(R.drawable.image_misc_14);
        ImageView imageView5 = findViewById(R.id.image_misc_15);
        imageView5.setImageResource(R.drawable.image_misc_15);
        ImageView imageView6 = findViewById(R.id.image_misc_16);
        imageView6.setImageResource(R.drawable.image_misc_16);
        ImageView imageView7 = findViewById(R.id.image_misc_17);
        imageView7.setImageResource(R.drawable.image_misc_17);
    }

    private void setImageResourceImageSent() {
        // 2nd row
        ImageView imageView21 = findViewById(R.id.image_sent_21);
        imageView21.setImageResource(R.drawable.image_sent_21);
        ImageView imageView22 = findViewById(R.id.image_sent_22);
        imageView22.setImageResource(R.drawable.image_sent_22);
        ImageView imageView23 = findViewById(R.id.image_sent_23);
        imageView23.setImageResource(R.drawable.image_sent_23);
        ImageView imageView24 = findViewById(R.id.image_sent_24);
        imageView24.setImageResource(R.drawable.image_sent_24);
        ImageView imageView25 = findViewById(R.id.image_sent_25);
        imageView25.setImageResource(R.drawable.image_sent_25);
        ImageView imageView26 = findViewById(R.id.image_sent_26);
        imageView26.setImageResource(R.drawable.image_sent_26);
        ImageView imageView27 = findViewById(R.id.image_sent_27);
        imageView27.setImageResource(R.drawable.image_sent_27);
        ImageView imageView28 = findViewById(R.id.image_sent_28);
        imageView28.setImageResource(R.drawable.image_sent_28);
        // 4th row
        ImageView imageView31 = findViewById(R.id.image_sent_31);
        imageView31.setImageResource(R.drawable.image_sent_31);
        ImageView imageView32 = findViewById(R.id.image_sent_32);
        imageView32.setImageResource(R.drawable.image_sent_32);
        ImageView imageView33 = findViewById(R.id.image_sent_33);
        imageView33.setImageResource(R.drawable.image_sent_33);
        ImageView imageView34 = findViewById(R.id.image_sent_34);
        imageView34.setImageResource(R.drawable.image_sent_34);
        ImageView imageView35 = findViewById(R.id.image_sent_35);
        imageView35.setImageResource(R.drawable.image_sent_35);
        ImageView imageView36 = findViewById(R.id.image_sent_36);
        imageView36.setImageResource(R.drawable.image_sent_36);
        ImageView imageView37 = findViewById(R.id.image_sent_37);
        imageView37.setImageResource(R.drawable.image_sent_37);
        ImageView imageView38 = findViewById(R.id.image_sent_38);
        imageView38.setImageResource(R.drawable.image_sent_38);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        stopService(new Intent(getApplicationContext(), MusicPlayService.class));
        Toast.makeText(this, R.string.wish_with_toast, Toast.LENGTH_LONG).show();
        stoppedOnBack = true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        stopService(new Intent(getApplicationContext(), MusicPlayService.class));
        if(!stoppedOnBack) {
            //Toast.makeText(getApplicationContext(), R.string.wish_with_toast, Toast.LENGTH_LONG).show();
        }
    }
}
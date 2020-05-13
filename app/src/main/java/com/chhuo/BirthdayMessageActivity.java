package com.chhuo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BirthdayMessageActivity extends AppCompatActivity {

    boolean calledByBackPressFlag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_birthday_message);

        Toast.makeText(this, R.string.love_idli, Toast.LENGTH_LONG).show();

        startService(new Intent(getApplicationContext(), MusicPlayService.class));

        Button idharChhuo = findViewById(R.id.idharChhuoButton);
        idharChhuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToImagesViewActivity();
            }
        });
    }

    private void goToImagesViewActivity() {
        calledByBackPressFlag = true;
        startActivity(new Intent(getApplicationContext(), ImagesViewActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        calledByBackPressFlag = true;
        stopService(new Intent(getApplicationContext(), MusicPlayService.class));
        Toast.makeText(this, R.string.wish_with_toast, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(!calledByBackPressFlag) {
            stopService(new Intent(getApplicationContext(), MusicPlayService.class));
            //Toast.makeText(this, R.string.wish_with_toast, Toast.LENGTH_LONG).show();
        }
    }
}
package com.chhuo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //View decorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // hiding status bar at activity launch
//      decorView = getWindow().getDecorView();
//      decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
//      decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, R.string.love_momo, Toast.LENGTH_LONG).show();

        Button touchMeButton = findViewById(R.id.touchMeButton);
        touchMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToBirthdayMessageActivity();
            }
        });
    }

    private void goToBirthdayMessageActivity() {
        Intent intent = new Intent(getApplicationContext(), BirthdayMessageActivity.class);
        //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        stopService(new Intent(getApplicationContext(), MusicPlayService.class));
        Toast.makeText(this, R.string.wish_with_toast, Toast.LENGTH_LONG).show();
    }
}
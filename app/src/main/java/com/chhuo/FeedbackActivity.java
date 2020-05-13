package com.chhuo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.Telephony;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FeedbackActivity extends AppCompatActivity {

    private static final String contactNumber = "+918804360187";
    EditText feedbackEditText;
    Button sendMessageButton;
    SmsManager smsManager;
    String inputMessage = "Blank Message From Poggu";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        feedbackEditText = findViewById(R.id.feedback_input_editText);
        sendMessageButton = findViewById(R.id.send_message_button);

        // getting runtime permissions
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS},143);
        } else {
            Toast.makeText(getApplicationContext(), " My You, Me Urs | All for U ", Toast.LENGTH_LONG).show();
        }

        sendMessageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smsManager = SmsManager.getDefault();
                if(!feedbackEditText.getText().toString().isEmpty()) {
                    inputMessage = feedbackEditText.getText().toString().trim();
                }
                smsManager.sendMultipartTextMessage(contactNumber, null, smsManager.divideMessage(inputMessage), null, null);
                if (!inputMessage.equals("Blank Message From Poggu")) {
                    Toast.makeText(getApplicationContext(), "Message sent to Your LOVE", Toast.LENGTH_LONG).show();
                    inputMessage = "Blank Message From Poggu";
                } else {
                    Toast.makeText(getApplicationContext(), "Blank Message sent to Your LOVE", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == 143) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                sendMessageButton.setEnabled(true);
                Toast.makeText(getApplicationContext(), " My You, Me Urs | All for U ", Toast.LENGTH_LONG).show();
            } else {
                sendMessageButton.setEnabled(false);
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, R.string.wish_with_toast, Toast.LENGTH_LONG).show();
    }
}

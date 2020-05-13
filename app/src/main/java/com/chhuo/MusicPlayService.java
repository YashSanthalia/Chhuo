package com.chhuo;

import android.app.Service;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MusicPlayService extends Service {

    MediaPlayer mediaPlayer;
    AudioManager audioManager;
    boolean flag = true;

    public MusicPlayService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.music_happy_birthday);
        audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        if(flag == true && mediaPlayer != null) {
            if(!mediaPlayer.isPlaying()) {
                flag = false;
                final int initialAudioLevel = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC), 0);
                mediaPlayer.setVolume(1f, 1f);
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, initialAudioLevel, 0);
                        stopSelf();
                    }
                });
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        if(mediaPlayer != null || mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
    }
}

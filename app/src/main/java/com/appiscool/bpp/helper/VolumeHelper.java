package com.appiscool.bpp.helper;

import android.content.Context;
import android.media.AudioManager;

/**
 * Created by Mukla dot C on 1/20/2016.
 */
public class VolumeHelper {

    Context context;
    AudioManager audio;
    public VolumeHelper(Context ctx){
        context = ctx;
        initialize(context);
    }

    private void initialize(Context context){
         audio = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);

    }
    public int getRingtoneVolume(){
        return audio.getStreamVolume(AudioManager.STREAM_RING);
    }
    public int getMusicVolume(){
        return audio.getStreamVolume(AudioManager.STREAM_MUSIC);
    }
    public int getAlarmVolume(){
        return audio.getStreamVolume(AudioManager.STREAM_ALARM);
    }
    public int getVoiceCallVolume(){
        return audio.getStreamVolume(AudioManager.STREAM_VOICE_CALL);
    }
}

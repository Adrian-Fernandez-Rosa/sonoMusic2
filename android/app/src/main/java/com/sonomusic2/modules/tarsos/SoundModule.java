package com.sonomusic2.modules.tarsos;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import be.tarsos.dsp.AudioDispatcher;
import be.tarsos.dsp.io.android.AudioDispatcherFactory;
import be.tarsos.dsp.io.android.AndroidAudioPlayer;
import be.tarsos.dsp.synthesis.SineGenerator;
import android.util.Log;

public class SoundModule extends ReactContextBaseJavaModule {

    private static final int SAMPLE_RATE = 44100;
    private static final int BUFFER_SIZE = 7168;

    public SoundModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "SoundModule";
    }

    @ReactMethod
    public void playTone(int frequency, double duration) {
       try{

      
        SineGenerator generator = new SineGenerator(frequency, 30);
        AudioDispatcher dispatcher = 
        AudioDispatcherFactory.fromDefaultMicrophone(SAMPLE_RATE, BUFFER_SIZE, 0);
        dispatcher.addAudioProcessor(generator);
        new Thread(dispatcher, "Audio Dispatcher").start();

        System.out.println("Intentando reproducir en 30 segundos");
        } catch (Exception e){
            Log.e("SoundModule", e.getMessage());
            System.out.println();
            System.out.println();
           System.out.println("*********** ERRORRAZOOOOOOOOOO");
        }
    }
}
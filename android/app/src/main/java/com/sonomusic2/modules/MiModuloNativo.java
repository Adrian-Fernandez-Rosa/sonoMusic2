package com.sonomusic2.modules;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class MiModuloNativo extends ReactContextBaseJavaModule {
    MiModuloNativo(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "MiModuloNativo";
    }

    @ReactMethod
    public void saluda() {
        System.out.println("¡Hola desde el módulo nativo!");
    }

}

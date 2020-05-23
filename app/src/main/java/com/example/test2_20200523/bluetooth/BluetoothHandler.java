package com.example.test2_20200523.bluetooth;

import android.content.Context;
import android.util.Log;

public class BluetoothHandler {
    final private String TAG = getClass().getName();
    private String DEVICE_ID;

    public BluetoothHandler(String DEVICE_ID) {
        this.DEVICE_ID = DEVICE_ID;
    }

    public String getDEVICE_ID() {
        Log.d(TAG, DEVICE_ID);
        return DEVICE_ID;
    }

    public void setDEVICE_ID(String DEVICE_ID) {
        this.DEVICE_ID = DEVICE_ID;
    }

    public void connect() {
        Log.d(TAG, "Connecting...");
    }

    public void disconnect() {
        Log.d(TAG, "Disconnecting...");
    }
}

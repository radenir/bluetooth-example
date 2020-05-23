package com.example.test2_20200523;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.test2_20200523.bluetooth.BluetoothHandler;

public class MainActivity extends AppCompatActivity {

    TextView helloWorldTextView;
    Button helloWorldButton, buttonConnect, buttonDisconnect;
    ImageView imageView;

    BluetoothHandler bluetoothHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bluetoothHandler = new BluetoothHandler("123456");

        helloWorldTextView = findViewById(R.id.hello_world_textview);
        helloWorldButton = findViewById(R.id.hello_world_button);
        buttonConnect = findViewById(R.id.button_connect);
        buttonDisconnect = findViewById(R.id.button_disconnect);
        imageView = findViewById(R.id.itemImageView);
        helloWorldTextView.setText("My first app!");
        helloWorldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                helloWorldTextView.setText("Changed text...");
                imageView.setImageResource(R.drawable.ic_bluetooth_disabled);
            }
        });

        buttonConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bluetoothHandler.connect();
                bluetoothHandler.getDEVICE_ID();
            }
        });

        buttonDisconnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bluetoothHandler.disconnect();
                bluetoothHandler.getDEVICE_ID();
            }
        });
    }
}


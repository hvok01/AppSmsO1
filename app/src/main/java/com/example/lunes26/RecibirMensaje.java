package com.example.lunes26;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class RecibirMensaje extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Nuevo Mensaje", Toast.LENGTH_LONG).show();
    }
}

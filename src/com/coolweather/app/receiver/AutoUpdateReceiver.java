package com.coolweather.app.receiver;

import com.coolweather.app.service.AutoUpdateServise;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AutoUpdateReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Intent i = new Intent(context, AutoUpdateServise.class);
		context.startService(i);
	}

}

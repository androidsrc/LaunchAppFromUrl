package com.androidsrc.openappfromurl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private static final String LAUNCH_FROM_URL = "com.androidsrc.launchfrombrowser";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView launchInfo = (TextView)findViewById(R.id.launch_info);
		
		Intent intent = getIntent();
		if(intent != null && intent.getAction().equals(LAUNCH_FROM_URL)){
			Bundle bundle = intent.getExtras();
			if(bundle != null){
				String msgFromBrowserUrl = bundle.getString("msg_from_browser");
				launchInfo.setText(msgFromBrowserUrl);
			}
		}else{
			launchInfo.setText("Normal application launch");
		}
	}

}

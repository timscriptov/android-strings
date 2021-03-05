package com.mcal.lang;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.mcal.lang.utils.Lang;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;

public class MainActivity extends Activity {
	
    private TextView helloWorld;
	private Button showAlert;
	
	public String string(String text) {
		return Lang.lang("ru", text);
	}
	
	public String string(int id) {
		return Lang.lang("ru", id);
	}
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		helloWorld = findViewById(R.id.hello);
		helloWorld.setText(string(0x1));
		
		showAlert = findViewById(R.id.show_alert);
		showAlert.setText(string("btn_show_alert"));
		showAlert.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
						dialog.setTitle(string("alert_title"));
						dialog.setMessage(string(0x4));
						dialog.setPositiveButton(string("alert_btn_ok"), null);
						dialog.create();
						dialog.show();
				}
		});
		Toast.makeText(this, Lang.lang(null, 0x1), Toast.LENGTH_SHORT).show();
    }
}

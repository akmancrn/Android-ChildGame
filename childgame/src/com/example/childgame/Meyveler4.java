package com.example.childgame;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class Meyveler4 extends Activity {
	String gelen,strI;
	  int skor =0;
	Button btn,btn1,btn2;
	ImageButton imgbtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_meyveler4);
		btn=(Button)findViewById(R.id.threebutton);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
		btn.setText(" ");
		btn.setBackgroundResource(R.drawable.button);
		gelen = (getIntent().getExtras().getString("veri"));
		skor = Integer.valueOf(gelen);
		skor = skor+5;
		strI= String.valueOf(skor);
		MediaPlayer ses = MediaPlayer.create(Meyveler4.this, R.raw.alkissesi);
		ses.start();
		btn1.setEnabled(false);
		btn2.setEnabled(false); 
		imgbtn.setVisibility(View.VISIBLE);
		SystemClock.sleep(3000);
		 ses.stop();
		
			
			}
		});
		//---------------------------------------------------------------------
		btn1=(Button)findViewById(R.id.onebutton);
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				
		btn1.setBackgroundResource(R.drawable.ybutton);
		MediaPlayer ses = MediaPlayer.create(Meyveler4.this, R.raw.yanlisses);
		ses.start();
		gelen = (getIntent().getExtras().getString("veri"));
		skor = Integer.valueOf(gelen);
		strI= String.valueOf(skor);
		btn.setEnabled(false);
		btn2.setEnabled(false); 
		 
		imgbtn.setVisibility(View.VISIBLE);
		btn1.setText(" ");
	
	
			
			}
		});
		//-----------------------------------------------------------------------
		btn2=(Button)findViewById(R.id.twobutton);
		btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				
		btn2.setBackgroundResource(R.drawable.ybutton);
		MediaPlayer ses = MediaPlayer.create(Meyveler4.this, R.raw. yanlisses);
		ses.start();
		gelen = (getIntent().getExtras().getString("veri"));
		skor = Integer.valueOf(gelen);
		strI= String.valueOf(skor);
		btn1.setEnabled(false);
		btn.setEnabled(false); 
		
		imgbtn.setVisibility(View.VISIBLE);
		btn2.setText(" ");
		
			
			}
		});
		//--------------------------------------------------------------------------
		imgbtn=(ImageButton)findViewById(R.id.imgbtn);
		imgbtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			

				Intent transition = new Intent (Meyveler4.this,Meyveler5.class);
				 transition.putExtra("veri", strI);
						startActivity(transition);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.meyveler4, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

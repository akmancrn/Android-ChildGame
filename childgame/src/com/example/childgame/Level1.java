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

public class Level1 extends Activity {

	
  public static String SKOR = "skor";
  private int skor = 0;
  String strI;
	Button btn,btn1,btn2;
	ImageButton imgbtn;
	Intent transition = new Intent();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_level1);
	
	btn=(Button)findViewById(R.id.threebutton);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				btn.setText(" ");		
		btn.setBackgroundResource(R.drawable.button);
		MediaPlayer ses = MediaPlayer.create(Level1.this, R.raw.alkissesi);
		ses.start();
		btn1.setEnabled(false);
		btn2.setEnabled(false); 
		imgbtn.setVisibility(View.VISIBLE);
		SystemClock.sleep(3000);
		 ses.stop();
		skor = skor + 5;
		strI= String.valueOf(skor);
	 
			}
		});
		//--------------------------------------------------------------------
		btn1=(Button)findViewById(R.id.twobutton);
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub			
		btn1.setBackgroundResource(R.drawable.ybutton);
		MediaPlayer ses = MediaPlayer.create(Level1.this, R.raw.yanlisses);
		ses.start();
		skor=0;
		btn.setEnabled(false);
		btn2.setEnabled(false); 
		 strI= String.valueOf(skor);
		imgbtn.setVisibility(View.VISIBLE);
		btn1.setText(" ");

			}
		});
		//--------------------------------------------------------------------------
		btn2=(Button)findViewById(R.id.onebutton);
		btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				
		btn2.setBackgroundResource(R.drawable.ybutton);
		MediaPlayer ses = MediaPlayer.create(Level1.this, R.raw. yanlisses);
		ses.start();
		skor=0;
		btn1.setEnabled(false);
		btn.setEnabled(false); 
		 strI= String.valueOf(skor);
		imgbtn.setVisibility(View.VISIBLE);
		btn2.setText(" ");
		
			
			}
		});
		
		imgbtn=(ImageButton)findViewById(R.id.imgbtn);
		imgbtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			
			 transition = new Intent (Level1.this,Level2.class);
			 transition.putExtra("veri", strI);
					startActivity(transition);
			}
		});
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.level1, menu);
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

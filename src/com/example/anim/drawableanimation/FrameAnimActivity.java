package com.example.anim.drawableanimation;


import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.widget.ImageView;

import com.example.anim.R;

public class FrameAnimActivity extends Activity {

	private AnimationDrawable frameAnimation;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.frame_anim);
		init();

	}

	private void init() {
		ImageView img = (ImageView) findViewById(R.id.spinning_wheel_image);
		img.setBackgroundResource(R.drawable.frame_anim);
		frameAnimation = (AnimationDrawable) img.getBackground();
		frameAnimation.start();
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		if (event.getAction() == MotionEvent.ACTION_DOWN) {
			frameAnimation.stop();
		}
		return super.onTouchEvent(event);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}

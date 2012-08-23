package com.example.ui.qiyi;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.anim.R;

public class SearchActivity extends Activity {
	GridView mHotGridView, mHistoryGridView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.search_activity);
		prepareView();
	}

	private void prepareView() {
		mHotGridView = (GridView) findViewById(R.id.hot_search_grid);
		mHotGridView.setAdapter(new GridAdapter(this));
		mHistoryGridView = (GridView) findViewById(R.id.history_search_grid);
		mHistoryGridView.setAdapter(new GridAdapter(this));
	}
}

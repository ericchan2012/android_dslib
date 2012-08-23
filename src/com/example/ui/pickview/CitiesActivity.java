package com.example.ui.pickview;

import com.example.anim.R;

import android.app.Activity;
import android.os.Bundle;

public class CitiesActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pickview_cities_layout);
                
        WheelView country = (WheelView) findViewById(R.id.country);
        String countries[] = new String[] {"USA", "Canada", "Ukraine", "France"};
        country.setVisibleItems(3);
        country.setAdapter(new ArrayWheelAdapter<String>(countries));

        final String cities[][] = new String[][] {
        		new String[] {"New York", "Washington", "Chicago", "Atlanta", "Orlando"},
        		new String[] {"Ottawa", "Vancouver", "Toronto", "Windsor", "Montreal"},
        		new String[] {"Kiev", "Dnipro", "Lviv", "Kharkiv"},
        		new String[] {"Paris", "Bordeaux"},
        		};
        
        final WheelView city = (WheelView) findViewById(R.id.city);
        city.setVisibleItems(5);

        country.addChangingListener(new OnWheelChangedListener() {
			public void onChanged(WheelView wheel, int oldValue, int newValue) {
				city.setAdapter(new ArrayWheelAdapter<String>(cities[newValue]));
				city.setCurrentItem(cities[newValue].length / 2);
			}
		});
        
        country.setCurrentItem(2);
    }
}

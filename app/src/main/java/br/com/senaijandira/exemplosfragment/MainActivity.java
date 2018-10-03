package br.com.senaijandira.exemplosfragment;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import br.com.senaijandira.exemplosfragment.fragments.Fragment1;
import br.com.senaijandira.exemplosfragment.fragments.Fragment2;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm;

    TabLayout tab_menu;

    BottomNavigationView bottom_nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getSupportFragmentManager();

        //** código para o TAB MENU **/
        tab_menu = findViewById(R.id.tab_menu);

        tab_menu.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if (tab.getPosition() == 0) {
                    openFragment1(null);
                }

                if (tab.getPosition() == 1) {
                    openFragment2(null);

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        //** FIM código tab **//




    }

    public void openFragment1(View view) {

        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(R.id.frame_layout, new Fragment1());

        ft.commit();
    }

    public void openFragment2(View view) {
        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(R.id.frame_layout, new Fragment2());

        ft.commit();
    }
}

package com.timmyg.interviewcourse.fourth_lesson.fragment_lifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.timmyg.interviewcourse.R;
import com.timmyg.interviewcourse.fourth_lesson.fragment_lifecycle.fragments.Fragment1;
import com.timmyg.interviewcourse.fourth_lesson.fragment_lifecycle.fragments.Fragment2;

public class FragmentActivity extends AppCompatActivity {

    private Button btn_fragment1;
    private Button btn_fragment2;
    private Fragment1 fragment1;
    private Fragment2 fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        initUI();

    }

    private void initUI() {
        btn_fragment1 = findViewById(R.id.btn_fragment1);
        btn_fragment2 = findViewById(R.id.btn_fragment2);

        btn_fragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                if (fragment2 != null && fragment2.isAdded()) {
                    transaction.remove(fragment2);
                }

                if (fragment1 == null) {
                    fragment1 = new Fragment1();
                }

                if (!fragment1.isAdded()) {
                    transaction.add(R.id.fragment_content, fragment1);
                }
                transaction.commit();
            }
        });

        btn_fragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                if (fragment1 != null && fragment1.isAdded()) {
                    transaction.remove(fragment1);
                }

                if (fragment2 == null) {
                    fragment2 = new Fragment2();
                }

                if (!fragment2.isAdded()) {
                    transaction.add(R.id.fragment_content, fragment2);
                }
                transaction.commit();
            }
        });
    }
}

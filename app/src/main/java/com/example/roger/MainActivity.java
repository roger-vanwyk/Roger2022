package com.example.roger;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.roger.card.CardActivity;
import com.example.roger.databinding.ActivityMainBinding;
import com.example.roger.guide.GuideActivity;
import com.example.roger.musical.MusicActivity;
import com.example.roger.news.NewsActivity;
import com.example.roger.quiz.QuizActivity;
import com.example.roger.scorekeeper.ScorekeeperActivity;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

        private ActivityMainBinding binding;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            binding = ActivityMainBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());

            Toolbar toolbar = binding.toolbar;
            /*setSupportActionBar(toolbar);*/
            CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
            toolBarLayout.setTitle(getTitle());

            FloatingActionButton fab = binding.fab;
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });

//        Project 1
            Button project1Button = findViewById(R.id.project1);
            project1Button.setOnClickListener(v -> {
                //            OnClickListener for ImageButton opens CardActivity onClick
                Intent project1Intent = new Intent(MainActivity.this, CardActivity.class);
                startActivity(project1Intent);

                Toast.makeText(getApplicationContext(), "Card", Toast.LENGTH_SHORT).show();
            });

//        Project 2
            Button project2Button = findViewById(R.id.project2);
            project2Button.setOnClickListener(v -> {
                //            OnClickListener for ImageButton opens CardActivity onClick
                Intent project2Intent = new Intent(MainActivity.this, ScorekeeperActivity.class);
                startActivity(project2Intent);

                Toast.makeText(getApplicationContext(), "Scorekeeper", Toast.LENGTH_SHORT).show();
            });

//        Project 3
            Button project3Button = findViewById(R.id.project3);
            project3Button.setOnClickListener(v -> {
                //            OnClickListener for ImageButton opens QuizActivity onClick
                Intent project3Intent = new Intent(MainActivity.this, QuizActivity.class);
                startActivity(project3Intent);

                Toast.makeText(getApplicationContext(), "Quiz", Toast.LENGTH_SHORT).show();
            });

//        Project 4
            Button project4Button = findViewById(R.id.project4);
            project4Button.setOnClickListener(v -> {
                //            OnClickListener for ImageButton opens MusicActivity onClick
                Intent project4Intent = new Intent(MainActivity.this, MusicActivity.class);
                startActivity(project4Intent);

                Toast.makeText(getApplicationContext(), "Music", Toast.LENGTH_SHORT).show();
            });

            Button project5Button = findViewById(R.id.project5);
            project5Button.setOnClickListener(v -> {
                //            OnClickListener for ImageButton opens GuideActivity onClick
                Intent project5Intent = new Intent(MainActivity.this, GuideActivity.class);
                startActivity(project5Intent);

                Toast.makeText(getApplicationContext(), "Guide", Toast.LENGTH_SHORT).show();
            });

            Button project6Button = findViewById(R.id.project6);
            project6Button.setOnClickListener(v -> {
                //            OnClickListener for ImageButton opens NewsActivity onClick
                Intent project6Intent = new Intent(MainActivity.this, NewsActivity.class);
                startActivity(project6Intent);

                Toast.makeText(getApplicationContext(), "News", Toast.LENGTH_SHORT).show();
            });

        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_scrolling, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {

                Intent scrollingIntent = new Intent(MainActivity.this, ScrollingActivity.class);
                startActivity(scrollingIntent);
//                return true;
            }
            return super.onOptionsItemSelected(item);
        }
    }
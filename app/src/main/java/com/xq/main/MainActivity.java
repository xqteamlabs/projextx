package com.xq.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.xq.R;
import com.xq.floatingBar.Create_new_business;
import com.xq.floatingBar.Create_new_queue;
import com.xq.rightMenuBar.About_us;
import com.xq.rightMenuBar.Feedbacks;
import com.xq.rightMenuBar.Login;
import com.xq.rightMenuBar.Setting;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar1);
        toolbar.setLogo(R.drawable.logo);

        setTitle("");
        setSupportActionBar(toolbar);



    /*    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/


        // final View actionB = findViewById(R.id.action_b);

        final com.getbase.floatingactionbutton.FloatingActionButton actionA = (com.getbase.floatingactionbutton.FloatingActionButton) findViewById(R.id.action_a);
        actionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Create_new_business.class);
                startActivity(intent);
            }
        });

        final com.getbase.floatingactionbutton.FloatingActionButton actionB = (com.getbase.floatingactionbutton.FloatingActionButton) findViewById(R.id.action_b);
        actionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  actionB.setTitle("Action B clicked");
                Intent intent = new Intent(MainActivity.this, Create_new_queue.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        Intent intent = getIntent();
        switch (id) {
            case R.id.action_settings:
                intent = new Intent(this, Setting.class);
                break;
            case R.id.action_about_us:
                intent = new Intent(this, About_us.class);
                break;
            case R.id.action_feddbacks:
                intent = new Intent(this, Feedbacks.class);
                break;

            case R.id.signin:
                intent = new Intent(this, Login.class);
                break;
        }
        startActivity(intent);

        return super.onOptionsItemSelected(item);
    }
}

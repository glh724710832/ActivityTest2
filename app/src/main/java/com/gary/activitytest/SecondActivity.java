package com.gary.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends BaseActivity {

    Button button_2;
    Button button_3;
    Button button_4;
    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "task id is "+getTaskId());
        Log.d(TAG, this.toString());
        setContentView(R.layout.second_layout);

        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");


        view();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.second_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.chose1_item:
                Toast.makeText(this,"you clicked"+item.getTitle()+"",Toast.LENGTH_SHORT).show();
                break;
            case R.id.chose2_item:
                Toast.makeText(this,"you clicked"+item.getTitle()+"",Toast.LENGTH_SHORT).show();
                break;
            case R.id.chose3_item:
                Toast.makeText(this, "you clicked"+item.getTitle()+"", Toast.LENGTH_SHORT).show();
             default:
        }
        return true;
    }

    void view(){

        button_2 = findViewById(R.id.button_2);
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });

        button_3 = findViewById(R.id.button_3);
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });


    }

    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
}

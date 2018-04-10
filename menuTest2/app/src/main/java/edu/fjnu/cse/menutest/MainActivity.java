package edu.fjnu.cse.menutest;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (EditText) findViewById(R.id.txt);
        registerForContextMenu(txt);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflator=new MenuInflater(this);
        inflator.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater inflator=new MenuInflater(this);
        inflator.inflate(R.menu.context, menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // 普通箱单被点击处所进行的操作。
            case R.id.plain_menu:
                Toast.makeText(this, "你单击了普通菜单", Toast.LENGTH_LONG).show();
                break;
            // 为子菜单的子项定义被点击时所进行的操作。
            case R.id.font_10:
                txt.setTextSize(10);
                break;
            case R.id.font_16:
                txt.setTextSize(16);
                break;
            case R.id.font_20:
                txt.setTextSize(20);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        item.setChecked(true);
        switch (item.getItemId()) {
            case R.id.font_blue:
                item.setChecked(true);
                txt.setBackgroundColor(Color.BLUE);
                break;
            case R.id.font_green:
                item.setChecked(true);
                txt.setBackgroundColor(Color.GREEN);
                break;
        }
        return true;
    }
}

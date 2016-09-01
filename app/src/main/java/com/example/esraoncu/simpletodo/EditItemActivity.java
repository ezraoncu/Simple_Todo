package com.example.esraoncu.simpletodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

   private  EditText etTask;
    private String item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        item=getIntent().getStringExtra("task");
        etTask=(EditText) findViewById(R.id.etTask);
        etTask.setText(item);
        etTask.requestFocus();
    }
    public void saveTodoItem(View v){
        EditText etNewTask = (EditText) findViewById(R.id.etTask);
        Intent data=new Intent();
        data.putExtra("newTask",etNewTask.getText().toString());
        setResult(RESULT_OK,data);
        finish();
    }
}

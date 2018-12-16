package com.program.user.androidspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.program.user.androidspinner.model.TagModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private Spinner spinner;
    private Button btnAdd;
    private final static  String TAG="MainActivity";
    List<TagModel> TagModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=(Spinner) findViewById(R.id.spinner);
        btnAdd=(Button) findViewById(R.id.btnAdd);

        TagModelList= new ArrayList<>();
        TagModel t1 = new TagModel(1,"AAA","2018-11-14 07:00:00");
        TagModelList.add(t1);

        TagModel t2 = new TagModel(2,"BBB","2018-11-14 07:00:00");
        TagModelList.add(t2);

        TagModel t3 = new TagModel(3,"CCC","2018-11-14 07:00:00");
        TagModelList.add(t3);


        ArrayAdapter<TagModel> adapter = new ArrayAdapter<TagModel>(this,android.R.layout.simple_spinner_item,TagModelList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                TagModel tagsModel =(TagModel) adapterView.getSelectedItem();
                desplayTagsData(tagsModel);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSelectdTags(v);
            }
        });

    }


    public void getSelectdTags(View v){
        TagModel tagsModel =(TagModel) spinner.getSelectedItem();
        desplayTagsData(tagsModel);
    }

    private void desplayTagsData (TagModel tagModel){
        int id = tagModel.getId();
        String titulo = tagModel.getTitle();
        String showData= "id: " + id + "\nTitulo: " + titulo;
        Toast.makeText(this, showData, Toast.LENGTH_SHORT).show();
    }
}

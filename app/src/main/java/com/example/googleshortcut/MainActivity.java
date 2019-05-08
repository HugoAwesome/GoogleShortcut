package com.example.googleshortcut;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView ListGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListGoogle = findViewById(R.id.ListGoogle);

        ListGoogle.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent GoogleDocs = new Intent(MainActivity.this, Detail.class);
                    GoogleDocs.putExtra("posisi", position);
                    GoogleDocs.putExtra("link", "https://docs.google.com/document/u/0/");
                    startActivity(GoogleDocs);
                }else if (position == 1) {
                    Intent GoogleSheets = new Intent(MainActivity.this, Detail.class);
                    GoogleSheets.putExtra("posisi", position);
                    GoogleSheets.putExtra("link", "https://docs.google.com/spreadsheets/u/0/");
                    startActivity(GoogleSheets);
                }else if (position == 3) {
                    Intent GoogleSlides = new Intent(MainActivity.this, Detail.class);
                    GoogleSlides.putExtra("posisi", position);
                    GoogleSlides.putExtra("link", "https://docs.google.com/presentation/u/0/");
                    startActivity(GoogleSlides);
                }else if (position == 4) {
                    Intent GoogleDrive = new Intent(MainActivity.this, Detail.class);
                    GoogleDrive.putExtra("posisi", position);
                    GoogleDrive.putExtra("link", "https://drive.google.com/drive/?usp=slides_home&ths=true");
                    startActivity(GoogleDrive);
                }
            }
        });
    }
}

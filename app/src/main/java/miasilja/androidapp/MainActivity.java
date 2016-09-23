package miasilja.androidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> pelitListaSisalto = new ArrayList<String>() {{
        for (int i = 0; i < 5; i++) {
            add("Ammattikorkeakoulu A - Yliopisto B");
            add("Ammattikorkeakoulu B - Ammattikorkeakoulu C");
            add("Yliopisto A - Yliopisto C");
        }
    }};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String nimi = intent.getStringExtra("EXTRA_MESSAGE");
        TextView tervetuloaNimi = (TextView) findViewById(R.id.tervetuloa_nimi);
        tervetuloaNimi.append(nimi);

        ListView lv = (ListView) findViewById(R.id.pelit_lista);
        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(
                this,
                R.layout.single_game_item, R.id.single_game_item_view, pelitListaSisalto);
        lv.setAdapter(listAdapter);
    }
}

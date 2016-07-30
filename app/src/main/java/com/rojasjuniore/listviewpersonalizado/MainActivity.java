package com.rojasjuniore.listviewpersonalizado;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objectos objectos_datos[] = new Objectos[]{
                new Objectos(R.drawable.ic_launcher,  "Manzana"),
                new Objectos(R.drawable.ic_launcher,  "Pera"),
                new Objectos(R.drawable.ic_launcher, "Cambur"),
                new Objectos(R.drawable.ic_launcher, "Fresa"),
                new Objectos(R.drawable.ic_launcher, "Cereza"),
                new Objectos(R.drawable.ic_launcher, "Mamon"),
                new Objectos(R.drawable.ic_launcher, "Manzana"),
                new Objectos(R.drawable.ic_launcher, "Pera"),
                new Objectos(R.drawable.ic_launcher, "Cambur"),
                new Objectos(R.drawable.ic_launcher, "Fresa"),
                new Objectos(R.drawable.ic_launcher, "Cereza"),
                new Objectos(R.drawable.ic_launcher, "Mamon"),
                new Objectos(R.drawable.ic_launcher, "Manzana"),
                new Objectos(R.drawable.ic_launcher, "Pera"),
                new Objectos(R.drawable.ic_launcher, "Cambur"),
                new Objectos(R.drawable.ic_launcher, "Fresa"),
                new Objectos(R.drawable.ic_launcher, "Cereza"),
                new Objectos(R.drawable.ic_launcher, "Mamon"),
        };
        ObjectosAdaptes adaptes = new ObjectosAdaptes(this, R.layout.listview_item_row, objectos_datos);
        listView = (ListView) findViewById(R.id.listView);
        View header = (View) getLayoutInflater().inflate(R.layout.list_header_row, null);
        listView.addHeaderView(header);
        listView.setAdapter(adaptes);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView textView = (TextView) view.findViewById(R.id.tvText);
                Toast.makeText(getApplicationContext(), textView.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

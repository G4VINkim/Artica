package kim.gavin.artica;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Stock extends AppCompatActivity
    implements AdapterView.OnItemSelectedListener {

    TextView acrylic;
    TextView watercolor;
    TextView oilpaint;
    TextView colorpencil;
    TextView pencil;
    TextView oilpastel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stock);


        acrylic = findViewById(R.id.textView24);
        watercolor = findViewById(R.id.textView26);
        oilpaint = findViewById(R.id.textView27);
        colorpencil = findViewById(R.id.textView29);
        pencil = findViewById(R.id.textView31);
        oilpastel = findViewById(R.id.textView33);


        Spinner spinner = (Spinner) findViewById(R.id.spinner7);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.location, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                String[] arr = {"10", "25", "6", "15", "15", "15"};
                acrylic.setText(arr[0]);
                watercolor.setText(arr[1]);
                oilpaint.setText(arr[2]);
                colorpencil.setText(arr[3]);
                pencil.setText(arr[4]);
                oilpastel.setText(arr[5]);

                break;
            case 1:
                String[] arr2 = {"9", "18", "3", "15", "13", "12"};
                acrylic.setText(arr2[0]);
                watercolor.setText(arr2[1]);
                oilpaint.setText(arr2[2]);
                colorpencil.setText(arr2[3]);
                pencil.setText(arr2[4]);
                oilpastel.setText(arr2[5]);
                break;
            case 2:
                String[] arr3 = {"1", "10", "8", "20", "9", "14"};
                acrylic.setText(arr3[0]);
                watercolor.setText(arr3[1]);
                oilpaint.setText(arr3[2]);
                colorpencil.setText(arr3[3]);
                pencil.setText(arr3[4]);
                oilpastel.setText(arr3[5]);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

package kim.gavin.artica;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RecyclingBin extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclebinlocation);

        Button btn = findViewById(R.id.aboutus_button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(RecyclingBin.this,Aboutus.class);
                startActivity(it);
            }
        });

        Button btn2 = findViewById(R.id.shop_button1);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(RecyclingBin.this,CanvasOption.class);
                startActivity(it);
            }
        });

        Button btn3 = findViewById(R.id.main_button1);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(RecyclingBin.this,Mainpage.class);
                startActivity(it);
            }
        });

        Button btn4 = findViewById(R.id.form_button1);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(RecyclingBin.this,Form.class);
                startActivity(it);
            }
        });
    }
}

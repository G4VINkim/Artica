package kim.gavin.artica;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Mainpage extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage);

        Button btn = findViewById(R.id.aboutus_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Mainpage.this,Aboutus.class);
                startActivity(it);
            }
        });

        Button btn2 = findViewById(R.id.shop_button);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Mainpage.this,CanvasOption.class);
                startActivity(it);
            }
        });

        Button btn3 = findViewById(R.id.bin_button);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Mainpage.this,Bin.class);
                startActivity(it);
            }
        });

        Button btn4 = findViewById(R.id.form_button);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Mainpage.this,Form.class);
                startActivity(it);
            }
        });



    }
}

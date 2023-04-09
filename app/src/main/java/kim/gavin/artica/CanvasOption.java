package kim.gavin.artica;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CanvasOption extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.canvasoption);

        Button btn = findViewById(R.id.imageButton1)
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent it = new Intent(CanvasOption.this,Canvas_apron.class)
                                startActivity(it)
                    }
                });

        Button btn2 = findViewById(R.id.imageButton2)
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent it = new Intent(CanvasOption.this,Canvas_totebag.class)
                                startActivity(it)
                    }
                });

        Button btn3 = findViewById(R.id.imageButton3)
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent it = new Intent(CanvasOption.this,Canvas_pencil.class)
                                startActivity(it)
                    }
                });
    }
}

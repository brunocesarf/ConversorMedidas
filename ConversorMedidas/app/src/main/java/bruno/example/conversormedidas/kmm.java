package bruno.example.conversormedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class kmm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kmm);

        final EditText edtKm_Prog = (EditText)findViewById(R.id.edtKM);
        final EditText edtm_prog = (EditText)findViewById(R.id.edtM);
        Button btnConverter_prog = (Button)findViewById(R.id.btnConverter);
        Button btnNovo_Prog = (Button)findViewById(R.id.btnNovo);

        btnConverter_prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double km = Double.parseDouble(edtKm_Prog.getText().toString());
                double m = km*1000;
                edtm_prog.setText(String.valueOf(m));
            }
        });

        btnNovo_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtm_prog.setText("");
                edtKm_Prog.setText("");
                edtKm_Prog.requestFocus();
            }
        });
    }
}
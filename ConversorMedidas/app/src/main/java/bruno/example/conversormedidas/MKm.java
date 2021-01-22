package bruno.example.conversormedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MKm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_km);

        final EditText edtm_Prog = (EditText)findViewById(R.id.edtm);
        final EditText edtkm_prog = (EditText)findViewById(R.id.edtkm);
        Button btnConverter_prog = (Button)findViewById(R.id.btnConverter);
        Button btnNovo_Prog = (Button)findViewById(R.id.btnNovo);

        btnConverter_prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double m = Double.parseDouble(edtm_Prog.getText().toString());
                double km = m/1000;
                edtkm_prog.setText(String.valueOf(km));
            }
        });

        btnNovo_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtkm_prog.setText("");
                edtm_Prog.setText("");
                edtm_Prog.requestFocus();
            }
        });
    }
}
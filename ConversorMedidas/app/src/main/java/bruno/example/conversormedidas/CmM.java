package bruno.example.conversormedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CmM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cm_m);

        final EditText edtCm_Prog = (EditText)findViewById(R.id.edtCm);
        final EditText edtM_prog = (EditText)findViewById(R.id.edtM);
        Button btnConverter_prog = (Button)findViewById(R.id.btnConverter);
        Button btnNovo_Prog = (Button)findViewById(R.id.btnNovo);

        btnConverter_prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Cm = Double.parseDouble(edtCm_Prog.getText().toString());
                double M = Cm/100;
                edtM_prog.setText(String.valueOf(M));
            }
        });

        btnNovo_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtM_prog.setText("");
                edtCm_Prog.setText("");
                edtCm_Prog.requestFocus();
            }
        });
    }
}
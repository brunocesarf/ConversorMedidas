package bruno.example.conversormedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MCm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_cm);

        final EditText edtm_Prog = (EditText)findViewById(R.id.edtm);
        final EditText edtcm_prog = (EditText)findViewById(R.id.edtcm);
        Button btnConverter_prog = (Button)findViewById(R.id.btnConverter);
        Button btnNovo_Prog = (Button)findViewById(R.id.btnNovo);

        btnConverter_prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double m = Double.parseDouble(edtm_Prog.getText().toString());
                double cm = m*100;
                edtcm_prog.setText(String.valueOf(cm));
            }
        });

        btnNovo_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtcm_prog.setText("");
                edtm_Prog.setText("");
                edtm_Prog.requestFocus();
            }
        });
    }
}
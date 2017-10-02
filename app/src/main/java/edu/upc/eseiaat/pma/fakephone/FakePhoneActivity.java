package edu.upc.eseiaat.pma.fakephone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FakePhoneActivity extends AppCompatActivity {

    EditText edit_num = (EditText) findViewById(R.id.edit_num);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_phone);
    }

    public void clicat (View v){
        Button boto = (Button) v;

        String num = edit_num.getText().toString() + boto.getId();
        edit_num.setText(num);

        Log.i("click","Has clicat el boto!");
        //TODO: Metode que escrigui numeros per pantalla
    }

    public void trucada (View v){
        String trucant = String.format("Trucant al ", edit_num.getText());
        Toast.makeText(FakePhoneActivity.this, trucant, Toast.LENGTH_SHORT).show();
        finish();

        //Log.i("click","Has clicat el boto TRUCADA!");
        //TODO: Afegir un toast que em mostri el numero que hi ha al "id_numero"
    }

    public void esborra (View v){
        String num = " ";
        edit_num.setText(num);

        //Log.i("click","Has clicat el boto ESBORRA!");
        //TODO: Esborrar tot el text que hi hagui en el "id_numero"
    }
}

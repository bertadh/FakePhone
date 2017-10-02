package edu.upc.eseiaat.pma.fakephone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FakePhoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_phone);
    }

    public void clicat (View v){
        Button boto = (Button) v;
        Log.i("click","Has clicat el boto!");
        //TODO: Metode que escrigui numeros per pantalla
    }
}

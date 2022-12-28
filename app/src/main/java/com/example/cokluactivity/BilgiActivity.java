package com.example.cokluactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BilgiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilgi);
    }
    public void digerActivity(View view){
        String adiSoyadi = binding.editTextTextAdiSoyadi.getText().toString();
        String telefonNo = binding.editTextTelefon.getText().toString();
        Intent intent = new Intent(MainActivity.this,BilgiActivity.class);
        intent.putExtra(“adiSoyadiKey”,adiSoyadi);
        intent.putExtra(“telefonNoKey”,telefonNo);
        startActivity(intent);
    }
}
package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ExplicitIntentActivity extends AppCompatActivity {

    // Mendeklarasikan atribut dengan nama nameInput dengan tipe EditText
    private EditText nameInput;
    // Mendeklarasikan atribut dengan nama outputText dengan tipe TextView
    private TextView outputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);


    }

    public void handleExplicitIntent(View view) {
        nameInput = findViewById(R.id.input_name);
        outputText = findViewById(R.id.text_output);

        String name = nameInput.getText().toString();
        outputText.setText("Hello " + name);
    }

}

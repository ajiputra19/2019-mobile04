package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class ParcelableActivity extends AppCompatActivity {

    public static final String USERNAME_KEY = "username";
    public static final String NAME_KEY = "name";
    public static final String AGE_KEY = "age";

    private EditText usernameInput;
    private EditText nameInput;
    private EditText ageInput;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcelable);
    }



}

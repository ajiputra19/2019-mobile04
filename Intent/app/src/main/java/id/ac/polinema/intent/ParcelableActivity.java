package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import id.ac.polinema.intent.Model.User;

public class ParcelableActivity extends AppCompatActivity {


    public static final String USER_KEY = "user";

    private EditText nameInput, usernameInput, ageInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcelable);

        nameInput = findViewById(R.id.input_name);
        usernameInput = findViewById(R.id.input_username);
        ageInput = findViewById(R.id.input_age);
    }


    public void handleSubmitPerc(View view) {
        String username = usernameInput.getText().toString();
        String name = nameInput.getText().toString();
        int age = Integer.parseInt(ageInput.getText().toString());

        User user = new User(username, name, age);

        Intent intent = new Intent(this, ProfileParcelableActivity.class);
        intent.putExtra(USER_KEY, user);

        startActivity(intent);
    }
}

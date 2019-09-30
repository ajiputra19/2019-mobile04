package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Parcelable;
import android.widget.TextView;

import id.ac.polinema.intent.Model.User;

public class ProfileParcelableActivity extends AppCompatActivity {

    private TextView usernameText, nameText, ageText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        // TODO: bind here

        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            // TODO: display value here

            User user = getIntent().getParcelableExtra(ParcelableActivity.USER_KEY);
            usernameText.setText(user.getUsername());
            nameText.setText(user.getName());
            ageText.setText(String.valueOf(user.getAge()));
        }
    }
}

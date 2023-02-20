package com.example.newptportal;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import com.firebase.client.Firebase;


public class DisciplineActivity extends AppCompatActivity {

    private Firebase Ref;
    private EditText username,feedback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discipline);

        username =(EditText)findViewById(R.id.username);
        feedback = (EditText)findViewById(R.id.feedback);
        Firebase.setAndroidContext(this);
        Ref = new Firebase("https://newptportal-default-rtdb.asia-southeast1.firebasedatabase.app/");


    }


    public void feedbacksent(){
        String usernameinput = username.getText().toString();
        String feedbackinput = feedback.getText().toString();
        Firebase Reusername = Ref.child("Username");
        Reusername.setValue(usernameinput);
        Firebase Reffeedback=Ref.child("Feedback");
        Reffeedback.setValue(feedbackinput);
    }


}

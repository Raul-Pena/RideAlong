package com.example.ridealong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class LoginTab extends Fragment {

    public LoginTab() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.login, container, false);

        // Inflate the layout for this fragment

        TextView registerScreen = (TextView) rootView.findViewById(R.id.link_to_register);

        // Listening to register new account link
        registerScreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Switching to Register screen
                Intent i = new Intent(getContext(), RegisterActivity.class);
                startActivity(i);
            }
        });

        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    public class RegisterActivity extends Activity {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            // Set View to register.xml
            setContentView(R.layout.register);

            TextView loginScreen = (TextView) findViewById(R.id.link_to_login);

            // Listening to Login Screen link
            loginScreen.setOnClickListener(new View.OnClickListener() {

                public void onClick(View arg0) {
                    // Closing registration screen
                    // Switching to Login Screen/closing register screen
                    finish();
                }
            });
        }
    }


}
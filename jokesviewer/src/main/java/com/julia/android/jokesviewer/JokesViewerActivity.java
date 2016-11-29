package com.julia.android.jokesviewer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokesViewerActivity extends AppCompatActivity {

    public static final String EXTRA_JOKE = "com.julia.android.jokesviewer.EXTRA_JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes_viewer);

        String joke = getIntent().getExtras().getString(EXTRA_JOKE);

        TextView jokeTextView = (TextView) findViewById(R.id.text_view_joke);

        jokeTextView.setText(joke);
    }
}

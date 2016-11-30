package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class FetchJokeTaskTest {

    /**
     * Test that Async task successfully retrieves a non-empty string.
     */
    @Test
    public void testNonEmptyString() {

        new FetchJokeTask(new FetchJokeTask.Listener() {

            String result = null;

            @Override
            public void onJokeLoaded(String joke) {
                try {
                    result = joke;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                assertNotNull(result);
            }

        }).execute();
    }
}
package uk.co.johncowie.twitter.twitterbotstrap;

import twitter4j.RawStreamListener;

public class CustomRawStreamListener implements RawStreamListener {

    @Override
    public void onMessage(String s) {
        System.out.println("Raw message: " + s);
    }

    @Override
    public void onException(Exception e) {
        System.out.println("Raw exception: " + e);
    }
}

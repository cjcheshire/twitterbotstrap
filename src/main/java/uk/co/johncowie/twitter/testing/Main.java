package uk.co.johncowie.twitter.testing;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.conf.PropertyConfiguration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, TwitterException {
        PropertyConfiguration propertyConfiguration
                = new PropertyConfiguration(new FileInputStream("/Users/jcowie/Dropbox/nuotltester.properties"));
        TwitterStream stream = new TwitterStreamFactory(propertyConfiguration).getInstance();
        final Twitter twitter = new TwitterFactory(propertyConfiguration).getInstance();
//        twitter.createFriendship("nuotltestuser");
        twitter.destroyFriendship("nuotltestuser");
        stream.addListener(new CustomUserStreamListener());
        stream.addListener(new CustomRawStreamListener());
        stream.user();
    }



}

package uk.co.johncowie.twitter.testing;

import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.conf.PropertyConfiguration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        PropertyConfiguration propertyConfiguration
                = new PropertyConfiguration(new FileInputStream("/Users/jcowie/Dropbox/nuotltester.properties"));
        TwitterStream stream = new TwitterStreamFactory(propertyConfiguration).getInstance();
        stream.addListener(new CustomUserStreamListener());
        stream.addListener(new CustomRawStreamListener());
        stream.user(new String[]{"@nextuptester"});
    }



}

twitterbotstrap
===================

A base project for playing around with the twitter4j library and creating a twitter bot.


Getting Started
----------------

1. Create a twitter account for your twitter bot at [twitter.com](http://twitter.com)

2. Sign into [dev.twitter.com](http://dev.twitter.com) with your new account

3. Using the right-hand menu go to 'my applications' and click to create a new application

4. Fill in the details to create your new application

5. Click the settings tab and change your application type to 'Read and Write' 

6. Click 'Create my access token' on the details page.

7. Copy your consumer key, consumer secret, access key and access secret into the template.properties file in this repo

8. Run ```mvn package```

9. Run ```java -jar target/twitterbotstrap-1.0-SNAPSHOT.jar <my properties file>```

If stuff is working you should now see a ton of tweets flying out of your console.





package uk.co.johncowie.twitter.twitterbotstrap;

import twitter4j.DirectMessage;
import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.User;
import twitter4j.UserList;
import twitter4j.UserStreamListener;

public class CustomUserStreamListener implements UserStreamListener {

    @Override
    public void onDeletionNotice(long l, long l2) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onFriendList(long[] longs) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onFavorite(User user, User user2, Status status) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onUnfavorite(User user, User user2, Status status) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onFollow(User user, User user2) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onDirectMessage(DirectMessage directMessage) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onUserListMemberAddition(User user, User user2, UserList userList) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onUserListMemberDeletion(User user, User user2, UserList userList) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onUserListSubscription(User user, User user2, UserList userList) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onUserListUnsubscription(User user, User user2, UserList userList) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onUserListCreation(User user, UserList userList) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onUserListUpdate(User user, UserList userList) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onUserListDeletion(User user, UserList userList) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onUserProfileUpdate(User user) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onBlock(User user, User user2) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onUnblock(User user, User user2) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onStatus(Status status) {
        System.out.println(status.getText());
    }

    @Override
    public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onTrackLimitationNotice(int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onScrubGeo(long l, long l2) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onStallWarning(StallWarning stallWarning) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onException(Exception e) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

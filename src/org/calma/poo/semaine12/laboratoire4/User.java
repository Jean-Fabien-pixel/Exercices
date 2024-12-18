package org.calma.poo.semaine12.laboratoire4;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Post> posts = new ArrayList<Post>();
    private List<Observer> followers = new ArrayList<>();
    private NotificationPreferences preferences;

    public User(String username, NotificationPreferences preferences) {
        this.username = username;
        this.preferences = preferences;
    }

    public void postMessage(String type, String content) {
        Post post = new Post(type, content);
        posts.add(post);
        notifyFollowers(post);
    }

    public void addFollower(Observer observer) {
        followers.add(observer);
    }

    public void removeFollower(Observer observer) {
        followers.remove(observer);
    }

    public List<Observer> getFollowers() {
        return followers;
    }

    public void setFollowers(List<Observer> followers) {
        this.followers = followers;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public NotificationPreferences getPreferences() {
        return preferences;
    }

    public void setPreferences(NotificationPreferences preferences) {
        this.preferences = preferences;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void notifyFollowers(Post post) {
        for (Observer follower : followers) {
            if (preferences.shouldNotify(post.getType())) {
                follower.update(this, post, "a mis un nouveau post");
            }
        }
    }
}

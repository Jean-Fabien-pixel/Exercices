package org.calma.poo.semaine12.laboratoire4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Post {
    private String content;
    private String type;
    private int likesCount;
    private List<String> comments = new ArrayList<String>();
    private List<Observer> postObservers = new ArrayList<>();
    private LocalDateTime timestamp;

    public Post(String content, String type) {
        this.content = content;
        this.type = type;
        this.likesCount = 0;
        this.timestamp = LocalDateTime.now();

    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public List<Observer> getPostObservers() {
        return postObservers;
    }

    public void setPostObservers(List<Observer> postObservers) {
        this.postObservers = postObservers;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void addComment(Observer observer, String comment) {
        this.comments.add(comment);
        notifyPostObservers("a commenté");
    }

    public void likePost(Observer observer) {
        setLikesCount(getLikesCount() + 1);
        notifyPostObservers("a aimé");
    }

    public void notifyPostObservers(String action) {
        for (Observer follower : postObservers) {
            follower.update(null, this, action);
        }
    }

    public void addPostObserver(Observer observer) {
        postObservers.add(observer);
    }

    public void removePostObserver(Observer observer) {
        postObservers.remove(observer);
    }
}

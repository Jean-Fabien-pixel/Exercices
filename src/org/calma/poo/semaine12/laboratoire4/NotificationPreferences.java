package org.calma.poo.semaine12.laboratoire4;

public class NotificationPreferences {
    private boolean notifyText;
    private boolean notifyImage;
    private boolean notifyVideo;

    public NotificationPreferences(boolean notifyText, boolean notifyImage, boolean notifyVideo) {
        this.notifyText = notifyText;
        this.notifyImage = notifyImage;
        this.notifyVideo = notifyVideo;
    }

    public boolean shouldNotify(String postType){
        if(postType.equalsIgnoreCase("text")){
            return notifyText;
        }
        else if(postType.equalsIgnoreCase("image")){
            return notifyImage;
        }
        else if(postType.equalsIgnoreCase("video")){
            return notifyVideo;
        }
        return false;
    }
}

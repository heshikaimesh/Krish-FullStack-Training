
import java.util.ArrayList;


public class Test {

   
    public static void main(String[] args) {
        
        MrBean c = new MrBean();
        
        ConcreteSubscriber s1 = new ConcreteSubscriber();
        ConcreteSubscriber s2 = new ConcreteSubscriber();
        ConcreteSubscriber s3 = new ConcreteSubscriber();
        
        s1.subscribe(c);
        s2.subscribe(c);
        s3.subscribe(c);
        
        c.uploadNewVideo("Mr. Bean");

    }
    
}

 interface YoutubeChannel{
     public void addSubscriber(Subscriber s);
     public void removeSubscriber(Subscriber s);
     public void notifySubscriber(String msg);
     public void uploadNewVideo(String title);
 }

 class MrBean implements YoutubeChannel{
    ArrayList<Subscriber> subscribers = new ArrayList<>(); 
    
    @Override
    public void addSubscriber(Subscriber s){
        subscribers.add(s);
    }
    
    @Override
    public void removeSubscriber(Subscriber s){
        subscribers.remove(s);
    }
    
    @Override
    public void notifySubscriber(String msg){
        for (Subscriber s : subscribers){
            s.update(msg);
        }
    }
    
    @Override
    public void uploadNewVideo(String title){
        notifySubscriber("New Video Released : "+title);
    }
    
 }

interface Subscriber{
    //abstract kiyala daana onema na
    public abstract void subscribe(YoutubeChannel c);
    public abstract void unsubscribe();
    public abstract void update(String msg);
    public abstract void displayNotification();
}

class ConcreteSubscriber implements Subscriber{
    
    YoutubeChannel youtubeChannel; 
    String notificationMessage;
    
    @Override
    public void subscribe(YoutubeChannel c){
        this.youtubeChannel = c;
        this.youtubeChannel.addSubscriber(this);
    }
    
    @Override
    public void unsubscribe(){
        this.youtubeChannel.removeSubscriber(this);
        this.youtubeChannel = null;
    }
    
    @Override
    public void update(String msg){
        notificationMessage = msg;
        displayNotification();
    }
    
    @Override
    public void displayNotification(){
        System.out.println(notificationMessage);
    }
}

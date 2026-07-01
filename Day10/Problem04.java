public class Problem04 {
    public static void main(String[] args) {
        Notification n1 = new EmailNotification();
        n1.sendNotification();
        Notification n2 = new SMSNotification();
        n2.sendNotification();
        Notification n3 = new PushNotification();
        n3.sendNotification();
    }
}
interface Notification{
    void sendNotification();
}
class EmailNotification implements Notification{
    public void sendNotification(){
        System.out.println("Sending Email Notification");
    }
}
class SMSNotification implements Notification{
    public void sendNotification(){
        System.out.println("Sending SMS Notification");
    }
}
class PushNotification implements Notification{
    public void sendNotification(){
        System.out.println("Sending Push Notification");
    }
}
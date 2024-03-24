public class SmsNotificationService implements NotificationService{
    private String phoneNumber;
    
    public SmsNotificationService(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendNotifications(String message){
        System.out.println("Sending email notifications to " + phoneNumber);
    }

    @Override
    public void subscribeToTopic(String topic){
        System.out.println("Subscribed " + phoneNumber + " to sms notifications for topic: " + topic);
    }
}
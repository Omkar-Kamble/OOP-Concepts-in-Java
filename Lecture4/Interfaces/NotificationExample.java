public class NotificationExample{
    public static void main(String[] args){
        NotificationService emailService = new EmailService("omkar29@gmail.com");
        NotificationService smsService = new SmsNotificationService("+91123456789");

        emailService.sendNotifications("Hello, this is an email notification");
        smsService.sendNotifications("Hi there, this is an sms notification");

        emailService.subscribeToTopic("News");
        smsService.subscribeToTopic("Alerts");
    }
}
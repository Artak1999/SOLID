public class Main {
    public static void main(String[] args) {
        NotificationService emailService = new EmailNotificationService();
        UserService userServiceWithEmail = new UserService(emailService);
        userServiceWithEmail.registerUser("Alice");

        NotificationService smsService = new SMSNotificationService();
        UserService userServiceWithSMS = new UserService(smsService);
        userServiceWithSMS.registerUser("Bob");
    }
}
public class EmailService {
    public static void sendEBook(String title, String email) {
        System.out.println("Sending email to: " + email);
        System.out.println("Subject: Your eBook - " + title);
        System.out.println("Body: Here is your eBook - " + title);
    }
}

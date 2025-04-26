public class SmsSender {

    /**
     * Sends an SMS to a given phone number with a specific message.
     * @param phoneNumber The phone number to send the SMS to.
     * @param message The message to send.
     */
    public static void sendSms(String phoneNumber, String message) {
        try {
            if (phoneNumber == null || phoneNumber.isEmpty()) {
                throw new IllegalArgumentException("Phone number cannot be null or empty.");
            }
            if (message == null || message.isEmpty()) {
                throw new IllegalArgumentException("Message cannot be null or empty.");
            }

            // Example of actual SMS sending logic (to be implemented with a library)
            System.out.println("Sending SMS to: " + phoneNumber);
            System.out.println("Message: " + message);
            // Replace this with actual SMS sending code using a library/service
            // For example: Twilio, GSM library, etc.

        } catch (Exception e) {
            System.err.println("Failed to send SMS: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Test the method
        sendSms("+1234567890", "Hello, this is a test message!");
    }
}

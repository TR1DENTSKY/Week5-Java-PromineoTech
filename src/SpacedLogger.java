// Step 3

public class SpacedLogger implements Logger {

    // Step 6 & 7

    @Override
    public void Log(String str) {

        // Using StringBuilder for mutable sequence of characters
        StringBuilder log = new StringBuilder();

        // Creating a For loop to ensure a space is adding between each char of the string
        for (int i = 0; i < str.length(); i ++) {
            log.append(str.charAt(i) + " ");
        }

        System.out.println(log);
    }

    // Step 8

    @Override
    public void Error(String str) {

        String err = "ERROR: " + str;

        Log(err);
    }

}

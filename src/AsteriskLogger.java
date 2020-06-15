// Step 3

public class AsteriskLogger implements Logger {

    // Step 4

    // Ensuring that when Log is called out it adds *** to both side of the string
    @Override
    public void Log(String str) {

        System.out.println("***" + str + "***");
        System.out.println();
    }

    // Step 5

    // Ensuring when Error is called, it adds Error: prior to the string and *** above and below
    @Override
    public void Error(String str) {

        String error = "Error: " + str;

        System.out.println("******************");
        System.out.println();
        Log(error);
        System.out.println("******************");
    }
}


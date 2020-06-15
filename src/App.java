
// Step 9

public class App {

    public static void main(String[] args) {

        // Step 10 & 11

        Logger aL = new AsteriskLogger();
        Logger sL = new SpacedLogger();

        aL.Log("cd homee");
        aL.Error("Cannot proceed");

        System.out.println();

        sL.Log("homee");

        System.out.println();

        sL.Error("Cannot locate homee");

    }
}



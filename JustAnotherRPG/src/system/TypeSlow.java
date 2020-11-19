package system;

import java.util.concurrent.TimeUnit;

public class TypeSlow {

    public static void typeSlow(String myString) {
        System.out.println("");
        for (int index = 0; index < myString.length(); index++) {
            System.out.print(myString.charAt(index));
            try {
                TimeUnit.MILLISECONDS.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    
}

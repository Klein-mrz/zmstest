package todo;

import java.util.Random;

public class rand {

    public static int rand(int i) {
        Random random=new Random();
        return random.nextInt(i)+1;
    }

}

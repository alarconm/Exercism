import java.util.Random;

public class Robot {
    String name;
    String oldName = "old";

    Robot () {
        this.name = createName();
    }

    private String createName () {

        StringBuilder createName = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < 2; i++) {
            createName.append((char)(rand.nextInt(26) + 65));
        }
        for (int i = 0; i < 3; i++) {
            createName.append(rand.nextInt(9));
        }
        
        return createName.toString();
    }

    public void reset() {
        this.oldName = name;
        this.name = createName();

        if (this.name == oldName) {
            createName();
        }
    }

    String getName() {
        return this.name;
    }
}

import java.util.*;

class KindergartenGarden {

    private List<String> studentList;
    private HashMap<String, List<Plant>> studentPlants = new HashMap<>();

    KindergartenGarden(String garden, String[] students) {
        Arrays.sort(students);
        String[] rows = garden.split("\n");
        Plant[][] plants =new Plant[(garden.length() -1) / 2][4];
        this.studentList = Arrays.asList(students);

        int ph = 0; //placeholder to count index by 1 while looping by 2
        for (int i = 0; i < rows[0].length(); i += 2) {
            plants[ph][0] = Plant.getPlant(rows[0].charAt(i));
            plants[ph][1] = Plant.getPlant(rows[0].charAt(i + 1));
            plants[ph][2] = Plant.getPlant(rows[1].charAt(i));
            plants[ph][3] = Plant.getPlant(rows[1].charAt(i + 1));
            studentPlants.put(studentList.get(ph), Arrays.asList(plants[ph]));
            ph++;
        }
    }

    KindergartenGarden(String garden) {

        String[] rows = garden.split("\n");
        Plant[][] plants =new Plant[(garden.length() -1) / 2][4];
        String[] studentArray = {
                "Alice",
                "Bob",
                "Charlie",
                "David",
                "Eve",
                "Fred",
                "Ginny",
                "Harriet",
                "Ileana",
                "Joseph",
                "Kincaid",
                "Larry"
        };
        this.studentList = Arrays.asList(studentArray);

        int ph = 0; //placeholder to count index by 1 while looping by 2
        for (int i = 0; i < rows[0].length(); i += 2) {
            plants[ph][0] = Plant.getPlant(rows[0].charAt(i));
            plants[ph][1] = Plant.getPlant(rows[0].charAt(i + 1));
            plants[ph][2] = Plant.getPlant(rows[1].charAt(i));
            plants[ph][3] = Plant.getPlant(rows[1].charAt(i + 1));
            studentPlants.put(studentList.get(ph), Arrays.asList(plants[ph]));
            ph++;
        }
    }

    List<Plant> getPlantsOfStudent(String student) {
        return studentPlants.get(student);
    }
}

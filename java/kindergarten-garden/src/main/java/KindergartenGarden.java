import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class KindergartenGarden {

    List<String> studentList;
    List<Plant[]> plants = new ArrayList<>();

    KindergartenGarden(String garden, String[] students) {


    }

    KindergartenGarden(String garden) {

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

        int ph = 0;
        for (int i = 0; i < garden.length(); i += 2) {

            if (garden.charAt(i) == '\n') {
                ph = 0;
                i -= 1;
            }
            else {
                plants[ph].add());
                plants.add(ph, Plant.getPlant(garden.charAt(i+1)));
                ph++;
            }
        }
        System.out.println(plants);
    }

    List<Plant> getPlantsOfStudent(String student) {
        return Arrays.asList(plants.get(studentList.indexOf(student)));
    }
}

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

class KindergartenGarden {

    LinkedHashMap<String, List<Plant>> students = new LinkedHashMap<>();

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


        int mapPlaceHolder = 0;
        for (int i = 0; i < garden.length(); i += 2) {

            List<Plant> plants =
                    Arrays.asList(Plant.getPlant(garden.charAt(mapPlaceHolder)),
                    Plant.getPlant(garden.charAt(mapPlaceHolder + 1)));

            if (garden.charAt(i) == '\n') {
                mapPlaceHolder = 0;
            }
            else {
                students.put(studentArray[mapPlaceHolder], plants);
                students.put(studentArray[mapPlaceHolder], plants);
                mapPlaceHolder++;
            }

        }
        System.out.println(students);
    }

    List<Plant> getPlantsOfStudent(String student) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}

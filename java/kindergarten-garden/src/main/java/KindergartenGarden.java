import java.util.*;

class KindergartenGarden {

    private List<String> studentList;
    private String[] students = {"Alice", "Bob", "Charlie", "David", "Eve", "Fred",
            "Ginny", "Harriet", "Ileana", "Joseph", "Kincaid", "Larry"};
    private String garden;
    private List<Plant> plantList;

    KindergartenGarden(String garden, String[] students) {
        this.garden = garden;
        this.students = students;
        Arrays.sort(students);
    }

    KindergartenGarden(String garden) {
        this.garden = garden;
    }

    List<Plant> getPlantsOfStudent(String student) {

        String[] rows = garden.split("\n");
        this.plantList = new ArrayList<>();
        studentList = Arrays.asList(students);
        int index = studentList.indexOf(student) * 2; // each student has 2 plants

        plantList.add(Plant.getPlant(rows[0].charAt(index)));
        plantList.add(Plant.getPlant(rows[0].charAt(index + 1)));
        plantList.add(Plant.getPlant(rows[1].charAt(index)));
        plantList.add(Plant.getPlant(rows[1].charAt(index + 1)));
        return plantList;
    }
}

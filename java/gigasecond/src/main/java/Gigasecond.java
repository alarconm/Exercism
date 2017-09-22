import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private LocalDateTime birthDateTime;
    private LocalDate birthDate;

    Gigasecond(LocalDate birthDate) {
        this.birthDate = birthDate;

   }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime = birthDateTime;
    }

    LocalDateTime getDate() {

        if (birthDateTime != null) {

            return birthDateTime.plusSeconds(100000000);

        }

        return birthDateTime;
    }

}

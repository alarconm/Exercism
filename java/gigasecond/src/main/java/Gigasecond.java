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

            return birthDateTime.plusSeconds(1000000000);

        }
        LocalDateTime convertedDate = LocalDateTime.of(birthDate.getYear(),
                birthDate.getMonth(),birthDate.getDayOfMonth(), 0, 00, 00);
        return convertedDate.plusSeconds(1000000000);
    }

}

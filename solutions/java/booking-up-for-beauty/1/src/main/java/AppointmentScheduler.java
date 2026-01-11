import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    
        return LocalDateTime.parse(appointmentDateDescription, parser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        if (appointmentDate.isBefore(LocalDateTime.now())) {
            return true;
        }

        return false;
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        
        if (hour >= 12 && hour < 18) {
            return true;
        }

        return false;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        return String.format("You have an appointment on %tA, %tB %te, %tY, at %tl:%tM %Tp.", appointmentDate, appointmentDate, appointmentDate, appointmentDate, appointmentDate, appointmentDate, appointmentDate);
    }

    public LocalDate getAnniversaryDate() {
        String anniversary = String.format("%tY-09-15", LocalDate.now());
        return LocalDate.parse(anniversary);
    }
}

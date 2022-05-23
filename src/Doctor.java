import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id = 0; // Autoincrement
    private String name;
    private String email;
    private String speciality;

    /**
     * This goes as a separate class here will apply Nested Classes
     * private int id_avaiableAppointment;
     * private Date date;
     * private String time;
     */

    // AvailableAppointment


    Doctor() {
        System.out.println("Construyendo el objeto Doctor");
    }

    Doctor(String name, String speciality) {
        System.out.println("El nombre del Doctor es: " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    /**
     * behaviors or methods:
     * 1- The first method is showName to show the name of the doctor.
     * 2- Method id autoincrement show
     */
    public void showName( ){
        System.out.println(name);
    }

    public void showId() {
        System.out.println("ID Doctor: " + id);
    }

    // Arraylist
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    // Nested Class (Clase Anidada)
    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

}

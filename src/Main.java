import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Lo voy a comentar solo para la clase 10 del video showMenu();

        Doctor myDoctor = new Doctor("Paula Abad", "Cirujana");
        /* System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
        */
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        /*System.out.println(myDoctor.getAvailableAppointments());

        Patient patient = new Patient("Andrea", "andrea@mail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());
        */
    }


}

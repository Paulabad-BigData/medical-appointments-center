import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;

import java.util.Date;

import static ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {
        showMenu();

        // Lo voy a comentar solo para la clase 10 del video showMenu();

        //Doctor myDoctor = new Doctor("Paula Abad", "Cirujana");
        /* System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
        */
        /*
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        // Polimorfismo:
        User user = new Doctor("Paula", "paula@mail.com");
        user.showDataUser();

        User userPa = new Patient("Yellow", "yellow@mail.com");
        userPa.showDataUser();

        // Anonymous Class
        User user1 = new User("Paula", "paula@mail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor");
                System.out.println("Hospital: Cruz Verde");
                System.out.println("Departamento: Geriatría");
            }
        };

        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };


        /*
        for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        */
        /*
        System.out.println(myDoctor.getAvailableAppointments());

        Patient patient = new Patient("Andrea", "andrea@mail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());

        System.out.println(patient);
        */
    }


}

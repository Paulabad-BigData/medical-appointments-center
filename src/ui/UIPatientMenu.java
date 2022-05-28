package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {

    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: " + UIMenu.patientLogged.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My Appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    showPatientMyAppointments();
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        }while (response!=0);
    }

    private static void showBookAppointmentMenu() {
        int response = 0;
        do {
            System.out.println("::Book an appointment");
            System.out.println(":: Select date: ");
            /**
             * Collections => Map
             * First Integer has Doctors list Integer stores index form available dates
             * Second Integer carries selected date
             * fori
             * Available Appointment file UIDocotrMenu
             * Within the For, an Arraylist is created to capture the booked appointments.
             * TreeMap tree structure
             */
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();
                
                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i));

                    doctors.put(Integer.valueOf(k), doctorAppointments);
                }
            }
            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());

            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("", "");
            // Foreach
            for (Map.Entry<Integer, Doctor> doc :doctorAvailableSelected.entrySet()) {
                // IndexDate Doctor
                // Access key & Value
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }

            System.out.println(doctorSelected.getName() +
                    ". Date: " + doctorSelected.getAvailableAppointments().get(indexDate).getDate() +
                    ". Time: " + doctorSelected.getAvailableAppointments().get(indexDate).getTime());

            // Confirmation message
            System.out.println("Confirm your appointment: \n1. Yes \n2. Change Date");
            response = Integer.valueOf(sc.nextLine());

            // To Schedule
            if (response == 1) {
                UIMenu.patientLogged.addAppoinmentDoctors(
                        doctorSelected,
                        doctorSelected.getAvailableAppointments().get(indexDate).getDate(null),
                        doctorSelected.getAvailableAppointments().get(indexDate).getTime());

                showPatientMenu();
            }

        }while (response!=0);
    }

    private static void showPatientMyAppointments() {
        int response = 0;
        do {
            System.out.println("::My Appointmentes");
            if (UIMenu.patientLogged.getAppoinmentDoctors().size() ==0) {
                System.out.println("Don't have appointments");
                break;
            }

            for (int i = 0; i < UIMenu.patientLogged.getAppoinmentDoctors().size(); i++) {
                int j = i + 1;
                System.out.println(j + ". " +
                        "Date: " + UIMenu.patientLogged.getAppoinmentDoctors().get(i).getDate() +
                        " Time: " + UIMenu.patientLogged.getAppoinmentDoctors().get(i).getTime() +
                        "\n Doctor: " + UIMenu.patientLogged.getAppoinmentDoctors().get(i).getDoctor().getName()
                        );
            }

            System.out.println("0. Return");

        }while (response!=0);
    }
}

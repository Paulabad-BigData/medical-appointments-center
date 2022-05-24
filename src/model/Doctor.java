package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    // Atributos
    private String speciality;

    Doctor(String name, String email) {
        super(name,email);
        System.out.println("El nombre del model.Doctor asignado es: " + name);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    /**
     * This goes as a separate class here will apply Nested Classes
     * private int id_avaiableAppointment;
     * private Date date;
     * private String time;
     */

    // AvailableAppointment

    /**
     * behaviors or methods:
     * 1- The first method is showName to show the name of the doctor.
     * 2- Method id autoincrement show
     */
    /*
    public void showName( ){
        System.out.println(name);
    }

    public void showId() {
        System.out.println("ID model.Doctor: " + id);
    }
    */
    // Arraylist
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    // Method toString Available Appointments (2)
    @Override
    public String toString() {
        return super.toString() + "\n Speciality: " + speciality + "\n Available" + availableAppointments.toString();
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

        // Getters & Setters ID, Date, Time

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

        // Method toString AvailableAppointments (1)
        @Override
        public String toString() {
            return "Available Appointments \n Date: " + date + "\n Time: " + time;
        }
    }

}

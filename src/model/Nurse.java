package model;

// Legacy User
public class Nurse extends User {
    // Constructor
    private String speciality;

    public Nurse(String name, String email) {
        super(name, email);
    }
    // Getters & Setters (alt + ins)
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}

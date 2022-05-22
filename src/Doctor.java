public class Doctor {
    static int id = 1; // Autoincrement
    String name;
    String speciality;

    Doctor() {
        System.out.println("Construyendo el objeto Doctor");
        id++;
    }

    Doctor(String name) {
        System.out.println("El nombre del Doctor es: " + name);
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

}

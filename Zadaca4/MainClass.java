public class MainClass {

    public static void main(String[] args){

        Avtomobil avtomobil = new Avtomobil("BMW", "BMW Group", "Bela", 150115);

        System.out.println("Marka: " + avtomobil.getMarka() +
                "\nModel: " + avtomobil.getModel() +
                "\nBoja: " + avtomobil.getBoja() +
                "\nPominati km: " + avtomobil.getPominatiKm() +
                "\nPomnozeni km: " + avtomobil.PomnoziKm(3L));
    }
}
public class MainClass {

    public static void main(String[] args){

        Covek covek = new Covek();
        covek.setIme("Andrej");
        covek.setPrezime("Filkoski");
        covek.setMaticen(1234567891011F);

        System.out.println("Ime: " + covek.ime +
                "\nPrezime: " + covek.prezime +
                "\nMaticen: " + covek.maticen);
    }
}
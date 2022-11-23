public class MainClass {

    public static void main(String[] args){

        Proizvod proizvod = new Proizvod();

        System.out.println("Ime: " + proizvod.getIme() +
                "\nProizvoditel: " + proizvod.getProizvoditel() +
                "\nCena: " + proizvod.getCena() +
                "\nTezina: " + proizvod.getTezina());
    }
}
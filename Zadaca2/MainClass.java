public class MainClass {

    public static void main(String[] args){

        Restoran restoran = new Restoran();
        restoran.setIme("Andrej");
        restoran.setLokacija("Filkoski");
        restoran.setTelefonskiBroj(3538756);
        restoran.setBrojNaSedista(78);

        System.out.println("Ime: " + restoran.getIme() +
                "\nLokacija: " + restoran.getLokacija() +
                "\nTelefonski broj: 07" + restoran.getTelefonskiBroj() +
                "\nBroj na sedista: " + restoran.getBrojNaSedista());
    }
}
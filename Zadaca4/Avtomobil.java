public class Avtomobil {
    private String marka, model, boja;
    private int pominatiKm;

    public Avtomobil(String marka, String model, String boja, int pominatiKm) {
        this.marka = marka;
        this.model = model;
        this.boja = boja;
        this.pominatiKm = pominatiKm;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public String getBoja() {
        return boja;
    }

    public int getPominatiKm() {
        return pominatiKm;
    }

    public Long PomnoziKm(Long pomnoziKm){
        pomnoziKm *= pominatiKm;
        return pomnoziKm;
    }
}

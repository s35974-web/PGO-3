import java.util.ArrayList;

public class Zamowienie {

    private int numerZamowienia;
    private KlientKawiarni klient;
    private ArrayList<ProduktMenu> produkty;
    private boolean oplacone;
    private static int kolejnyNumer = 1;

    public Zamowienie(KlientKawiarni klient) {
        this.numerZamowienia = kolejnyNumer;
        this.klient = klient;
        this.produkty = new ArrayList<>();
        this.oplacone = false;
        kolejnyNumer++;
    }


    public void dodajProdukt(ProduktMenu produkt) {
        produkty.add(produkt);
    }

    public double policzWartosc() {
        double suma = 0;

        for (ProduktMenu produkt : produkty) {
            suma = suma + produkt.getCena();
        }

        return suma;
    }

    public int policzLiczbeProduktow() {
        return produkty.size();
    }

    public void oznaczJakoOplacone() {
        oplacone = true;
    }

    @Override
    public String toString() {
        return "Zamowienie numer " + numerZamowienia + ", klient: " + klient.pelneDane() + ", produkty: " + produkty + ", oplacone: " + oplacone;
    }

}

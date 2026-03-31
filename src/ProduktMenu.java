public class ProduktMenu{
    //    Julia jest najpiękniejsza najwspanialsza
    private String nazwa;
    private Double cena;
    private String kod;
    private String kategoria;
    private static int liczbaProduktow = 0;


    public ProduktMenu(String nazwa, double cena,String kategoria,String kod){
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
        this.kod = kod;
        liczbaProduktow++;
    }

    public String getKod(){
        return kod;
    }

    public String getNazwa(){
        return nazwa;
    }

    public Double getCena(){
        return cena;
    }

    public String getKategoria(){
        return kategoria;
    }

    public static int getLiczbaProduktow(){
        return liczbaProduktow;
    }

    @Override
    public String toString(){
        return "Produkt: " + nazwa + ", kod: " + kod + "cena:" + cena + "kategoria:" + kategoria;
    }

//    @Override
//    public boolean equals(){
//
//    }




}

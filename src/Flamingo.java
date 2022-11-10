public class Flamingo extends Animal {
    String locNastere;

    Flamingo() { super(); }
    Flamingo(String nume,String specie,int varsta,tipHrana hrana,int cantitateHranaPeZi,String locNastere) {
        super(nume,specie,varsta,hrana,cantitateHranaPeZi);
        this.locNastere = locNastere;
    }
    public String toString() {
        return "Flamingo { Nume: " + nume + ", specie: " + specie + ", varsta: " + varsta + ", tip hrana: " + hrana + ", mananca pe zi: " + cantitateHranaPeZi + ", din: " + locNastere+ " }";
    }

    public String getLocNastere() {
        return locNastere;
    }

    public void setLocNastere(String locNastere) {
        this.locNastere = locNastere;
    }
}

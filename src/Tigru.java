public class Tigru extends Animal {
    String culoare;

    Tigru() { super(); }
    Tigru(String nume,String specie,int varsta,tipHrana hrana,int cantitateHranaPeZi,String culoare) {
        super(nume,specie,varsta,hrana,cantitateHranaPeZi);
        this.culoare = culoare;
    }

    public String toString() {
        return "Tigru { Nume: " + nume + ", specie: " + specie + ", varsta: " + varsta + ", tip hrana: " + hrana + ", mananca pe zi: " + cantitateHranaPeZi + ", culoare: " + culoare + " }";
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
}

public class Strut extends Animal {
    double viteza;

    Strut() {
        super();
    }

    Strut(String nume,String specie,int varsta,tipHrana hrana,int cantitateHranaPeZi, double viteza) {
        super(nume,specie,varsta,hrana,cantitateHranaPeZi);
        this.viteza = viteza;
    }

    public String toString() {
        return "Strut { Nume: " + nume + ", specie: " + specie + ", varsta: " + varsta + ", tip hrana: " + hrana + ", mananca pe zi: " + cantitateHranaPeZi + ", viteza: " + viteza + " }";    }

    public double getViteza() {
        return viteza;
    }

    public void setViteza(double viteza) {
        this.viteza = viteza;
    }
}


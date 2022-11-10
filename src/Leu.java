public class Leu extends Animal {
    int nrPui;

    Leu() { super(); }
    Leu(String nume,String specie,int varsta,tipHrana hrana,int cantitateHranaPeZi,int nrPui) {
        super(nume,specie,varsta,hrana,cantitateHranaPeZi);
        this.nrPui = nrPui;
    }
    public String toString() {
        return "Leu { Nume: " + nume + ", specie: " + specie + ", varsta: " + varsta + ", tip hrana: " + hrana + ", mananca pe zi: " + cantitateHranaPeZi + ", pui: " + nrPui + " }";
    }

    public int getNrPui() {
        return nrPui;
    }

    public void setNrPui(int nrPui) {
        this.nrPui = nrPui;
    }
}
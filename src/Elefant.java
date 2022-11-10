public class Elefant extends Animal{
    int greutate;

    public Elefant() {super(); }
    public Elefant(String nume,String specie,int varsta,tipHrana hrana,int cantitateHranaPeZi,int greutate) {
        super(nume,specie,varsta,hrana,cantitateHranaPeZi);
        this.greutate = greutate;
    }

    public String toString() {
        return "Elefant { Nume: " + nume + ", specie: " + specie + ", varsta: " + varsta + ", tip hrana: " + hrana + ", mananca pe zi: " + cantitateHranaPeZi + ", greutate: " + greutate + " }";
    }
    public int getGreutate() {
        return greutate;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }
}
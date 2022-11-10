public abstract class Animal {
    protected String nume;
    protected String specie;
    protected int varsta;

    public enum tipHrana { carnivor, ierbivor }
    protected tipHrana hrana;
    protected int cantitateHranaPeZi;

    public Animal() {}
    public Animal(String nume,String specie,int varsta,tipHrana hrana,int cantitateHranaPeZi) {
        this.nume = nume;
        this.specie = specie;
        this.varsta = varsta;
        this.hrana = hrana;
        this.cantitateHranaPeZi = cantitateHranaPeZi;
    }

    public int getCantitateHranaPeZi() {
        return cantitateHranaPeZi;
    }
}
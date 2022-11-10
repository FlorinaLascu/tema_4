import java.util.List;

public class GradinaZoologica {
    String nume;
    List <Animal> animale;

    public GradinaZoologica() {}
    public GradinaZoologica(String nume, List <Animal> animale) {
        this.nume = nume;
        this.animale = animale;
    }

    @Override
    public String toString() {
        return "GradinaZoologica{" +
                "nume='" + nume + '\'' +
                ", animale=" + animale +
                '}';
    }

    public void afisare(GradinaZoologica g) {
        System.out.println(g.nume + "{ ");
        for(Animal a : g.animale)
            System.out.println(a);
        System.out.println(" }");
    }

    public List<Animal> getAnimale() {
        return animale;
    }
}
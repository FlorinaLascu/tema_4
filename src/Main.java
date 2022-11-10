import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Strut s = new Strut("Striti","pasare",4, Animal.tipHrana.ierbivor,2, 100);

        Tigru t = new Tigru("Tisha","felina",3, Animal.tipHrana.carnivor,9,"cafenie");

        Elefant e = new Elefant("Darli","mamifer",5, Animal.tipHrana.ierbivor,12,290);

        Leu l = new Leu("Pisi","feline",1, Animal.tipHrana.carnivor,20,7);

        Flamingo f = new Flamingo("Flame","pasare",2, Animal.tipHrana.ierbivor,10,"plaja");

        List <Animal> anim = new ArrayList<>();
        anim.add(s);
        anim.add(t);
        anim.add(e);
        anim.add(l);
        anim.add(f);

        anim.add(new Tigru("Simba","mamifer",1, Animal.tipHrana.carnivor,7,"vargat"));

        anim.add(new Elefant("Pablo","mamifer",6, Animal.tipHrana.ierbivor,50,500));

        GradinaZoologica g = new GradinaZoologica("Zoo",anim);
        g.afisare(g);

        int necesarHranaIerbivor=0, necesarHranaCarnivor=0;
        for(Animal a : anim) {
            if(a.hrana.equals(Animal.tipHrana.ierbivor))
                necesarHranaIerbivor = necesarHranaIerbivor + a.cantitateHranaPeZi;
            else
                necesarHranaCarnivor = necesarHranaCarnivor + a.cantitateHranaPeZi;
        }

        System.out.println("Necesar hrana carnivora pe zi: " + necesarHranaCarnivor);
        System.out.println("Necesar hrana ierbivora pe zi: " + necesarHranaIerbivor);


        calculLuna(necesarHranaIerbivor,necesarHranaCarnivor);

        cantitateHranaPerAnimal(g);

        System.out.println(" lista animale de acelasi tip ");
        listaAnimale(g);
    }
    public static void calculLuna(int ierbivor,int carnivor) {
        Scanner sc = new Scanner(System.in);
        int necesarCarnivorLuna=0, necesarIerbivorLuna=0;
        System.out.println(" luna: "); String luna = sc.nextLine();
        if(luna.toLowerCase().equals("ianuarie") || luna.toLowerCase().equals("martie") || luna.toLowerCase().equals("mai") || luna.toLowerCase().equals("iulie") || luna.toLowerCase().equals("august") || luna.toLowerCase().equals("octombrie") || luna.toLowerCase().equals("decembrie")) {
            necesarCarnivorLuna = carnivor * 31;
            necesarIerbivorLuna = ierbivor * 31;
        }
        else if(luna.toLowerCase().equals("aprilie") || luna.toLowerCase().equals("iunie") || luna.toLowerCase().equals("septembrie") || luna.toLowerCase().equals("noiembrie")) {
            necesarCarnivorLuna = carnivor * 30;
            necesarIerbivorLuna = ierbivor * 30;
        }
        else if(luna.toLowerCase().equals("februarie")) {
            necesarCarnivorLuna = carnivor * 28;
            necesarIerbivorLuna = ierbivor * 28;
        }
        System.out.println("hrana carnivora pe luna: " + necesarCarnivorLuna);
        System.out.println("hrana ierbivora pe luna: " + necesarIerbivorLuna);
    }

    public static void cantitateHranaPerAnimal(GradinaZoologica g) {
        Map <String,Integer> dictionar = new HashMap<String, Integer>();
        for(Animal a : g.getAnimale())
            if(dictionar.containsKey(a.getClass().getName()))
                dictionar.put(a.getClass().getName(), dictionar.get(a.getClass().getName()) + a.cantitateHranaPeZi);
            else
                dictionar.put(a.getClass().getName(),a.getCantitateHranaPeZi());
        System.out.println("Cantitate de hrana necesara pentru fiecare tip de animal: ");
        for(Map.Entry<String,Integer> pereche : dictionar.entrySet())
            System.out.println(pereche.getKey() + "-" + pereche.getValue());
    }

    public static void listaAnimale(GradinaZoologica g) {
        Map<String,List <Animal>> dic = new HashMap<String,List <Animal>>();
        for(Animal a : g.getAnimale())
            if(dic.containsKey(a.getClass().getName()))
                dic.get(a.getClass().getName()).add(a);
            else {
                List<Animal> aux = new ArrayList<>();
                aux.add(a);
                dic.put(a.getClass().getName(),aux);
            }
        for(Map.Entry<String,List<Animal>> per : dic.entrySet())
            System.out.println(per.getKey() + " avem: " + per.getValue()) ;
    }
}
package be.vdab.jpfhfdst21;

import be.vdab.jpfhfdst10.Klinkers;

import java.util.ArrayList;

public class KleinsteOppervlakte {
    public static void main(String[] args) {
        ArrayList<Rechthoek> rechthoeken = new ArrayList<Rechthoek>();
        rechthoeken.add(new Rechthoek(5,6));
        rechthoeken.add(new Rechthoek(4,7));
        rechthoeken.add(new Rechthoek(3,8));
        rechthoeken.add(new Rechthoek(3,6));
        rechthoeken.add(new Rechthoek(2,9));

        rechthoeken.stream().mapToInt(driehoek -> driehoek.getOppervlakte())
                .min()
                .ifPresent(kleinste -> {
                    System.out.println(kleinste);
                    rechthoeken.stream()
                        .filter(driehoek -> driehoek.getOppervlakte() == kleinste)
                        .forEach(driehoek -> System.out.println(
                            "Lengte : " + driehoek.getLengte() +
                            ", Breedte : " + driehoek.getBreedte()));
                });
    }
}

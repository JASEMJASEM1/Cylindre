package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println();

       Cylindre c = new Cylindre();
      /** c.setMatiere ("bois");
       double volume = c.getVolume( 10.3d, 20.5);
         System.out.println("le volume du cylindre est :" +volume);**/



        c.setHaut(10.4d);
        c.setDiam(42.5d );
        c.setMatiere("bois");
        double volume= c.getVolume();
        System.out.println("le volume du cylindre est :" +volume);







    }
}
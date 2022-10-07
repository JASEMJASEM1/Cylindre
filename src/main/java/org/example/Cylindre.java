package org.example;

/**
 * @
 *
 * auteur philippe
 * classe utilsié lors des exercises pour comprndre les méthodes et
 */

public class Cylindre {
    private double hauteur;
    private double diam;
    private String matiere = "";

    public double getHaut() {
        return hauteur;
    }

    public void setHaut(double haut) {
        this.hauteur = haut;
    }

    public double getDiam() {
        return diam;
    }

    public void setDiam(double diam) {
        this.diam = diam;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    /**
     * 
     * @param hauteur
     * @param diam
     * @return
     */
    public double getVolume(double hauteur, double diam) {


        return hauteur * diam * diam * Math.PI / 4;
    }

    /**
     *
     * @return
     */
    public double getVolume()

    {


        return this.hauteur * this.diam * this.diam * Math.PI / 4;
    }
}


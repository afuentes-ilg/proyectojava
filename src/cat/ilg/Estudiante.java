package cat.ilg;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona{
    private Double nota;
    private List<Double> listaNotas= new ArrayList<>();




    public Estudiante(){

    }


    public void posarNota(double nota) throws Exception {

            if( nota > 10 || nota < 0 ){
                throw new Exception("La nota ha de ser entre 0 i 10");
            }
            else{
                listaNotas.add(nota);
            }
    }

    public String obtenirDades() throws Exception {

            if(nom == null || dni == null){
                throw new Exception("No hi ha dades sobre la Persona");
            }
            else{
                return "Persona amb nom : " + nom + " i dni: " + dni + "(Estudiant amb nota: " + listaNotas + " La nota máxima es: " + this.notaMax() + " La nota mínima es: " + this.notaMin() + " Esta es la media de las notas " + this.media() +")";
            }

    }

    public double notaMax() {
       double notaMax = 0;
       for (double i: listaNotas) {
           if (i > notaMax) {
               notaMax = i;
           }

       }
        return notaMax;
    }

    public double notaMin() {
        double notaMin = this.notaMax();
        for (double i: listaNotas) {
            if (i < notaMin) {
                notaMin = i;
            }

        }
        return notaMin;
    }

    public double media() {
        double media;
        double suma = 0;

        for (double i: listaNotas) {
            suma += i;
            }
        media = suma / listaNotas.size();
        return media;
    }

};

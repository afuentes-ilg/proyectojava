package cat.ilg;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        try {
            Instituto guineueta = new Instituto();
            guineueta.cambiaNom("La Guineueta");
            //System.out.println("Institut la Guineueta llista de personas:");

            Profesor profe1 = new Profesor();
            profe1.cambiaNom("Marc");
            profe1.assignaDni("1234");
            //profe1.assignaDni("2341");
            profe1.canviarSou(2000);
            guineueta.afegirPersona(profe1);
            //System.out.println(profe1.obtenirDades());

            Estudiante estudiant1 = new Estudiante();
            estudiant1.cambiaNom("Joan");
            estudiant1.assignaDni("4567");
            estudiant1.posarNota(7.5);
            estudiant1.posarNota(8);
            estudiant1.posarNota(4);
            //estudiant1.posarNota(11);
            guineueta.afegirPersona(estudiant1);
            //System.out.println(estudiant1.obtenirDades());

            sustituto profe2 = new sustituto();
            profe2.cambiaNom("Laura");
            profe2.assignaDni("8888");
            profe2.canviarSou(2500);
            //profe2.canviarSou(3500);
            Date dataInici = new Date(2021, 11, 1);
            Date dataFi = new Date(2022, 6, 30);
            profe2.assignaSustitucio(dataInici, dataFi);
            guineueta.afegirPersona(profe2);
           // System.out.println(profe2.obtenirDades());
            guineueta.imprimirInformacio();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

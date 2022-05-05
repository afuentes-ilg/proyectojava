package cat.ilg;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private String nom;
    private List<Persona> listaPersonas= new ArrayList<>();


    public Instituto(){

    }
    public void cambiaNom(String nom){
        this.nom=nom;
    }

    public void afegirPersona(Persona persona){
        listaPersonas.add(persona);
    }

    public void imprimirInformacio() throws Exception {
        System.out.println("Institut la Guineueta llista de personas:");
        for (Persona persona: listaPersonas){
            System.out.println(persona.obtenirDades());
       }
    }
}

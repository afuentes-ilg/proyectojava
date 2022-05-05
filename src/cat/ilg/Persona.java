package cat.ilg;

import org.w3c.dom.ls.LSOutput;

public class Persona {
    protected String dni;
    protected String nom;

    public Persona(String DNI, String NOM){
        this.dni=DNI;
        this.nom=NOM;
    }

    public Persona(){
    }
    public void cambiaNom(String nom){
        this.nom=nom;
    }

    public void assignaDni(String dni) throws Exception {
       if (this.dni == null){ //si la persona no té dni
           this.dni = dni;
       }
       else{ //si ja té DNI...
           throw new Exception("No es pot modificar el dni");
        }
    }

    public String obtenirDades() throws Exception {
       return "nom: " + this.nom + "dni: " + this.dni;
    }
}



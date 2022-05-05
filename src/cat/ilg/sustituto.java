package cat.ilg;

import java.util.Date;

public class sustituto extends Profesor {

    private Date dataInici;
    private Date dataFi;

    public sustituto(){

    }

    public void assignaSustitucio(Date dataInici, Date dataFi){
        this.dataInici = dataInici;
        this.dataFi = dataFi;

    }

    public String obtenirDades(){
        return "Persona amb nom :" +  nom + " i dni " + dni + "(PROFE amb sou: " + sou + " del " + dataInici.getDate() + "/" + dataInici.getMonth() + "/" + dataInici.getYear() +  " al " + dataFi.getDate() + "/" + dataFi.getMonth() + "/" + dataFi.getYear()  + ")";
    }
}

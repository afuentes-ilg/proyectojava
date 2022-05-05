package cat.ilg;

public class Profesor extends Persona{
    protected double sou;

    public Profesor(){
    }

    public void cambiaNom(String nom){
        this.nom=nom;
    }

    public void canviarSou(double nouSou) throws Exception {

            if (nouSou > 3000) {
                throw new Exception("Els profes són uns pringats, així que no poden cobrar mes de 3000");
            }
            else{
                this.sou = nouSou;
            }
            if (nouSou < 0){
                throw new Exception("Els sous no poden ser números negatius");
            }
            else{
                this.sou = nouSou;
            }
    }

    public String obtenirDades(){
        return "Persona amb nom : " + nom + " i  dni: " + dni + "(PROFE amb sou: " + this.sou + ")";
    }
}

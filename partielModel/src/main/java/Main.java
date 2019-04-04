import exeptions.PseudoDejaPrisException;
import facade.Facade;
import modele.Model;

public class Main {

    public static void main(String[] args) throws PseudoDejaPrisException {

        Facade model=new Model();
        model.connexion("hello");
    }

}
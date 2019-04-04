package facade;

import exeptions.PseudoDejaPrisException;

public interface Facade {

    public void connexion(String pseudo) throws PseudoDejaPrisException;


}

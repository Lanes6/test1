package modele;

import exeptions.PseudoDejaPrisException;
import facade.Facade;

import java.util.*;

public class Model implements Facade {

    private Map<String, String> trucs = new HashMap();

    private Collection<String> pseudos = new ArrayList();

    public void connexion(String pseudo) throws PseudoDejaPrisException {
        if (pseudos.contains(pseudo)) {
            throw new PseudoDejaPrisException();
        }
        this.pseudos.add(pseudo);
    }



}

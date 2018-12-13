package com.ramiromartin.exceptions.checked;

public class ChateadorConProblemas implements Chateador {
    @Override
    public void chat(String frase) throws TerminaConEException {
        if (frase.endsWith("e")){
            throw new TerminaConEException();
        }
        System.out.println(frase);
    }
}

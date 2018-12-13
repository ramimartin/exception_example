package com.ramiromartin.exceptions.unchecked;

public class ChateadorConProblemas implements Chateador {
    @Override
    public void chat(String frase) {
        if (frase.endsWith("e")){
            throw new TerminaConEException();
        }
        System.out.println(frase);
    }
}

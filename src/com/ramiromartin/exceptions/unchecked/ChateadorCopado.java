package com.ramiromartin.exceptions.unchecked;

public class ChateadorCopado implements Chateador {

    @Override
    public void chat(String frase) {
        System.out.println(frase);
    }
}

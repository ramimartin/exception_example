package com.ramiromartin.exceptions.checked;

public class ChateadorCopado implements Chateador {

    @Override
    public void chat(String frase) {
        System.out.println(frase);
    }
}

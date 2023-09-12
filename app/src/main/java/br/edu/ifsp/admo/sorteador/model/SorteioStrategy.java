package br.edu.ifsp.admo.sorteador.model;

import java.util.Random;

public abstract class SorteioStrategy {
    protected Random mRandom;
    public  SorteioStrategy(){
        mRandom = new Random();
    }
    public abstract int nextNumber();
    public abstract int getLowBorder();
    public abstract int getHighBoder();

    public abstract int getHighBorder();
}

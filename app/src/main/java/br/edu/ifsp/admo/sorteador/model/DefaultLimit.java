package br.edu.ifsp.admo.sorteador.model;

public class DefaultLimit extends SorteioStrategy {
    private final int BORDER_DEFAULT = 1000;
    private static DefaultLimit instance;

    private DefaultLimit(){

    }
    public static DefaultLimit getInstance(){
        if (instance == null){
            instance = new DefaultLimit();
        }
        return instance;
    }
    @Override
    public int nextNumber(){
        return mRandom.nextInt(BORDER_DEFAULT) + 1;
    }
    @Override
    public int getLowBorder(){
        return 1;
    }
    @Override
    public int getHighBoder(){
        return BORDER_DEFAULT;
    }

    @Override
    public int getHighBorder() {
        return 0;
    }
}

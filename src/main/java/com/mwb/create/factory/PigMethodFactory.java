package com.mwb.create.factory;

/**
 * Created by mwb on 16-1-13.
 */
public class PigMethodFactory implements MethodFactory {
    @Override
    public Animal getAnimal() {
        return new Pig();
    }
}

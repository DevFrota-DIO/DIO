package service;

import java.lang.constant.Constable;

public class ParametrosInvalidosException extends Exception{
    protected int num1;
    protected int num2;

    public ParametrosInvalidosException(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public java.lang.String toString() {
        return "Aconteceu um erro:"+
                "\nO segundo parâmetro deve ser maior que o primeiro";
    }
}

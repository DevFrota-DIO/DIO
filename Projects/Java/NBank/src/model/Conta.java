package model;

import java.math.BigDecimal;

public class Conta {
    Integer num = 0;
    String numConta = "10";
    BigDecimal saldoCc;
    BigDecimal saldoCp;
    BigDecimal saldo;

    public Conta() {
        novaConta();
        saldoCc = new BigDecimal("50.00");
        saldoCp = new BigDecimal("50.00");
        this.saldo = new BigDecimal(String.valueOf(saldoCc.add(saldoCp)));
    }

    private void novaConta() {
        this.numConta = (numConta + (num++));
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public BigDecimal getSaldoCc() {
        return saldoCc;
    }

    public void setSaldoCc(BigDecimal saldoCc) {
        this.saldoCc = saldoCc;
    }

    public BigDecimal getSaldoCp() {
        return saldoCp;
    }

    public void setSaldoCp(BigDecimal saldoCp) {
        this.saldoCp = saldoCp;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}

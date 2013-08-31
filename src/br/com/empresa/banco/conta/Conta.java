package br.com.empresa.banco.conta;

public interface Conta {
    public double getSaldo();
    public void deposita(double valor) throws ValorInvalidoException;
    public void saca(double valor) throws ValorInvalidoException;
    public void atualiza(double taxaSelic);
}

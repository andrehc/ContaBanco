package Banco;

public class Conta {
    private int numeroConta;
    private int digitoConta;
    private float saldo;

    public Conta(int numeroConta, float saldo) {
        this.numeroConta = numeroConta;
        this.digitoConta = digitoConta;
        this.saldo = saldo;
    }

    public Conta() { }

    public int getNumeroConta() { return numeroConta; }
    public void setNumeroConta(int numeroConta) { this.numeroConta = numeroConta; }
    public int getDigitoConta() { return digitoConta; }
    public void setDigitoConta(int digitoConta) { this.digitoConta = digitoConta; }
    public float getSaldo() { return saldo; }
    public void setSaldo(float saldo) { this.saldo = saldo; }
}

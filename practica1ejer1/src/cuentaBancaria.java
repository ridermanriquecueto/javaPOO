public class cuentaBancaria {
    public int cuenta;
    public  int saldo;

    public cuentaBancaria(int cuenta, int saldo) {
        this.cuenta = cuenta;
        this.saldo = saldo;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "cuentaBancaria{" +
                "cuenta=" + cuenta +
                ", saldo=" + saldo +
                '}';
    }

}

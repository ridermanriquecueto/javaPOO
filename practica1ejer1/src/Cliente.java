public class Cliente {
    public  String nombre;
    public  int telefono;
    public  int dni;
    public String email;
    public cuentaBancaria cb;

    public Cliente(String nombre, int telefono, int dni, String email, cuentaBancaria cb) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.dni = dni;
        this.email = email;
        this.cb = cb;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public cuentaBancaria getCb() {
        return cb;
    }

    public void setCb(cuentaBancaria cb) {
        this.cb = cb;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", dni=" + dni +
                ", email='" + email + '\'' +
                ", cb=" + cb +
                '}';
    }

    public void realizarDeposito(int saldo){
        this.cb.setSaldo(this.cb.getSaldo()+saldo);
    }
    public void extraxines(int saldo){
        this.cb.setSaldo(this.cb.getSaldo()-saldo);
    }
    public int  conocerSaldo(){
        return this.cb.getSaldo();

    }



}

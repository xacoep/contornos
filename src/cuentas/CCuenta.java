package cuentas;
/**
 * 
 * simula u
 * na cuenta bancaria
 * @author jacob
 **/
public class CCuenta {
    /**
     * Atributos
     */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    /**
     * Constructor vacío
     */
    public CCuenta()
    {
    }
    /**
     * Constructor con los siguientes parámetros
     * @param nom String, nombre del titular
     * @param cue String, nombre de cuenta
     * @param sal double, saldo de cuenta
     * @param tipo dobule, tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    /**
     * @return el saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * 
     * @param cantidad a ingresar en la cuenta
     * @throws Exception devuelta en caso de que se ingrese una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * 
     * @param cantidad a retirar de una cuenta
     * @throws Exception devuelta en caso de que se meta un número negativo o se haya puesto una cantidad mayor que el saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

/**
 * 
 * @return el nombre del titular de la cuenta
 */
String getNombre() {
    return nombre;
}
/**
 * 
 * @param nombre del titular a pasar como parámetro
 */
void setNombre(String nombre) {
    this.nombre = nombre;
}
/**
 * 
 * @return el nº de cuenta
 */
String getCuenta() {
    return cuenta;
}
/**
 * 
 * @param cuenta nº de cuenta a pasar como parámetro
 */
void setCuenta(String cuenta) {
    this.cuenta = cuenta;
}
/**
 * 
 * @return el saldo de la cuenta
 */
double getSaldo () {
    return saldo;
}
/**
 * 
 * @param saldo a pasarle como parámetro
 */
void setSaldo(double saldo) {
    this.saldo = saldo;
}
/**
 * 
 * @return el tipo de interés
 */
double getTipoInterés() {
    return tipoInterés;
}
/**
 * 
 * @param tipoInterés a pasarle como parametro
 */
void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
}

}

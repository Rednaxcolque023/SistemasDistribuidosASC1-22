/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmisionRetenciones;

import java.io.Serializable;

/**
 *
 * @author Alex Lion
 */
public class Cuenta implements Serializable {
    private int banco;
    private String cuenta;
    private String ci;
    private String nombres;
    private String apellidos;
    private double saldo;

    public Cuenta(int banco, String cuenta, String ci, String nombres, String apellidos, double saldo) {
        this.banco = banco;
        this.cuenta = cuenta;
        this.ci = ci;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.saldo = saldo;
    }

    public int getBanco() {
        return banco;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "banco=" + banco + ", cuenta=" + cuenta + ", ci=" + ci + ", nombres=" + nombres + ", apellidos=" + apellidos + ", saldo=" + saldo + '}';
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eamenfinal;

import java.io.Serializable;

/**
 *
 * @author Alexander S
 */
public class Cuenta implements Serializable{
    private int id;
    private String clienteid;
    private int ncuenta;
    private double saldo;

    public Cuenta(int id, String clienteid, int ncuenta, double saldo) {
        this.id = id;
        this.clienteid = clienteid;
        this.ncuenta = ncuenta;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClienteid() {
        return clienteid;
    }

    public void setClienteid(String clienteid) {
        this.clienteid = clienteid;
    }

    public int getNcuenta() {
        return ncuenta;
    }

    public void setNcuenta(int ncuenta) {
        this.ncuenta = ncuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "id=" + id + ", clienteid=" + clienteid + ", ncuenta=" + ncuenta + ", saldo=" + saldo + '}';
    }
    
}

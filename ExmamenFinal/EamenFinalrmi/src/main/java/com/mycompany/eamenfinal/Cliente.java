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
public class Cliente implements Serializable{
    private int id;
    private int nrodocumento;
    private String complemento;
    private String nombres;
    private String primerapellido;
    private String segundoapellido;

    public Cliente(int id, int nrodocumento, String complemento, String nombres, String primerapellido, String segundoapellido) {
        this.id = id;
        this.nrodocumento = nrodocumento;
        this.complemento = complemento;
        this.nombres = nombres;
        this.primerapellido = primerapellido;
        this.segundoapellido = segundoapellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNrodocumento() {
        return nrodocumento;
    }

    public void setNrodocumento(int nrodocumento) {
        this.nrodocumento = nrodocumento;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPrimerapellido() {
        return primerapellido;
    }

    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    public String getSegundoapellido() {
        return segundoapellido;
    }

    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nrodocumento=" + nrodocumento + ", complemento=" + complemento + ", nombres=" + nombres + ", primerapellido=" + primerapellido + ", segundoapellido=" + segundoapellido + '}';
    }
    
    
}

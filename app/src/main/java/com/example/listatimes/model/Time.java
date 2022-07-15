package com.example.listatimes.model;

import java.util.List;

public class Time {
    private int escudo;
    private String nome;
    private String local;
    private List<String> titulos;

    public Time() {
    }

    public Time(int escudo, String nome, String local, List<String> titulos) {
        this.escudo = escudo;
        this.nome = nome;
        this.local = local;
        this.titulos = titulos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public List<String> getTitulos() {
        return titulos;
    }

    public void setTitulos(List<String> titulos) {
        this.titulos = titulos;
    }
}

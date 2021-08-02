package com.pires.covidario;


public class Pacientes {

     private String nome;
     private String data;
     private String lugares;
     private String nascimento;

     public String getNome(){
         return nome;
     } public void setNome(String nome) { this.nome = nome; }

    public String getData() {
        return data;
    } public void setData(String data) {
        this.data = data;
    }

    public String getLugares() {
        return lugares;
    } public void setLugares(String lugares) {
        this.lugares = lugares;
    }

    public String getNascimento() {
        return nascimento;
    } public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
}

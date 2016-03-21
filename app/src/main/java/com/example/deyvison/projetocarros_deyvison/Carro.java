package com.example.deyvison.projetocarros_deyvison;

/**
 * Created by Deyvison on 20/03/2016.
 */
public class Carro {

    private String nomeCarro;
    private int idImageCarro;

    public Carro(int idImageCarro, String nomeCarro) {
        this.nomeCarro = nomeCarro;
        this.idImageCarro = idImageCarro;
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public int getIdImageCarro() {
        return idImageCarro;
    }

    public void setIdImageCarro(int idImageCarro) {
        this.idImageCarro = idImageCarro;
    }
}

package com.example.deyvison.projetocarros_deyvison;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Deyvison on 20/03/2016.
 */
public class CarrosApplication extends Application{
    List<Carro> carros;

    @Override
    public void onCreate() {
        super.onCreate();
        this.carros = new ArrayList<>();
        criarCarrosPadrao();
    }

    private void criarCarrosPadrao(){
        carros.add(new Carro(R.drawable.bmw_720,"Bmw"));
        carros.add(new Carro(R.drawable.camaro,"Camaro"));
        carros.add(new Carro(R.drawable.corvette,"Corvette"));
        carros.add(new Carro(R.drawable.ct6,"Ct6"));
        carros.add(new Carro(R.drawable.db77,"Db77"));
        carros.add(new Carro(R.drawable.gallardo,"Gallardo"));
        carros.add(new Carro(R.drawable.mustang,"Mustang"));
        carros.add(new Carro(R.drawable.paganni_zonda,"Paganni Zonda"));
        carros.add(new Carro(R.drawable.porsche_911,"Porsche"));
        carros.add(new Carro(R.drawable.vyron,"Vyron"));
    }

    public List<Carro> getCarros(){
        return this.carros;
    }

    public Carro adicionarCarro(){
        Random random =  new Random();
        Carro carro = carros.get(random.nextInt(carros.size() - 1));
        carros.add(carro);
        return carro;
    };

    public void removerCarro(int position){
        carros.remove(position);
    };

}

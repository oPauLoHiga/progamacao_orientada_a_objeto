package Atividade_Animal.Progama;

import Atividade_Animal.Entidades.Cachorro;
import Atividade_Animal.Entidades.Gato;

public class Animais {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();

        cachorro.setNome("Tapioca");
        cachorro.setIdade(7);
        cachorro.fazerSom();
        System.out.println(cachorro);

        Gato gato = new Gato();
        gato.setNome("Tom");
        gato.setIdade(3);
        gato.fazerSom();
        System.out.println(gato);
    }
}

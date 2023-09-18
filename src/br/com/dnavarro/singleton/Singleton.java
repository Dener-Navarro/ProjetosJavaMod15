package br.com.dnavarro.singleton;

public class Singleton {

    private  static Singleton singleton; //propriedade e classe referenciando ele mesmo.

    private Singleton (){ // construtor privado, para ngm instanciar mais a classe.

    }
    public static Singleton getInstance() { // método publico para instanciar.
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton; // se a variavel for nula vc retorna ela para acessar, e instancia.
    }
}

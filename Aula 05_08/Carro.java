package exercícioCarro;

public class Carro {
    String modelo;
    int ano;

    public Carro() {
        modelo = "Rapido";
        ano = 2007;
    }

    public Carro(String modeloCarro) {
        modelo = modeloCarro;
        ano = 2040;
    }

    public Carro(String modeloCarro, int anoCarro) {
        modelo = modeloCarro;
        ano = anoCarro;
    }
}

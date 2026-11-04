package exercícioCarro;

public class TestarCarro {

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        System.out.println("Carro 1 / Modelo / " + carro1.modelo + " Ano / " + carro1.ano);

        Carro carro2 = new Carro("Fusca");
        System.out.println("Carro 2 / Modelo / " + carro2.modelo + " Ano / " + carro2.ano);

        Carro carro3 = new Carro("Civic", 2023);
        System.out.println("Carro 3 / Modelo / " + carro3.modelo + " Ano / " + carro3.ano);
    }
}

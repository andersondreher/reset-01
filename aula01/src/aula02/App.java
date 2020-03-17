package aula02;

public class App {

    public static void imprimirVeiculo(Veiculo veiculo) {
        System.out.println(veiculo);
    }

    public static void main(String[] args) {

        Combustivel gasolinaDeAviacao = new Combustivel("Gasolina de Aviação");
        Combustivel carvao = new Combustivel("Carvão");
        Combustivel eletrecidade = new Combustivel("Eletrecidade");
        Combustivel diesel = new Combustivel("Diesel");
        Combustivel gasolina = new Combustivel("Gasolina");

        Navio navio = new Navio("Navio", 200, diesel);
        Submarino submarino = new Submarino("Yellow", 50, 5000, carvao);
        Trem trem = new Trem("Trem", 80, eletrecidade);
        Caminhao caminhao = new Caminhao("Caminhão", 120, diesel);
        Carro carro = new Carro("Carro", 180, gasolina);
        Bicicleta bicicleta = new Bicicleta("Bike", 30);
        Aviao aviao = new Aviao("Avião", 360, 12000, gasolinaDeAviacao);

        Veiculo novoSubmarino = new Submarino("blue", 360, 12000, carvao);

        System.out.println(submarino.toString());
        System.out.println(novoSubmarino.toString());

    }
}
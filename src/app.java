public class app {

    public static void main (String[] args) {

        Calculadora calculadoraDeIdades = new Calculadora();
        int somaDasIdades = calculadoraDeIdades.somar(33,34);
        System.out.println("Soma das idades: " + somaDasIdades);

        int subtracaoDasIdades = calculadoraDeIdades.subtracao(33,34);
        System.out.println("Subtração das idades: " + subtracaoDasIdades);

        int multiplicacaoDasIdades = calculadoraDeIdades.multiplicacao(33,34);
        System.out.println("Multiplicação das idades: " + multiplicacaoDasIdades);

        int divisaoDasIdades = calculadoraDeIdades.divisao(33,34);
        System.out.println("Divisão das idades: " + divisaoDasIdades);

    }
}

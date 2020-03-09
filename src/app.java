public class app {

    public static void main (String[] args) { //método main

        Calculadora calculadoraDeIdades = new Calculadora();   //calculadoraDeIdades = objeto baseado na classe calculadora
        int somaDasIdades = calculadoraDeIdades.somar(33,34); //o método é somar, subtrair, multiplicar, dividir
        System.out.println("Soma das idades: " + somaDasIdades);

        int subtracaoDasIdades = calculadoraDeIdades.subtracao(33,34);
        System.out.println("Subtração das idades: " + subtracaoDasIdades);

        int multiplicacaoDasIdades = calculadoraDeIdades.multiplicacao(33,34);
        System.out.println("Multiplicação das idades: " + multiplicacaoDasIdades);

        double divisaoDasIdades = calculadoraDeIdades.divisao(33,34);
        System.out.println("Divisão das idades: " + divisaoDasIdades);

        Comparador comparadorDeIdades = new Comparador();
        boolean comparacaoDeIdades = comparadorDeIdades.menorQue(36,34);
        System.out.println("comparador de idades: " + comparacaoDeIdades);
    }
}

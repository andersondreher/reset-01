
import java.util.ArrayList;
import java.util.List;

    public class AppMercado {

        public static void main(String[] args) {

            Item item1 = new Item("Arroz", Segmento.ALIMENTACAO, 4.5,2);
            Item item2 = new Item("Massa", Segmento.ALIMENTACAO, 2.99,3);
            Item item3 = new Item("Shampoo", Segmento.HIGIENE, 12.54,2);
            Item item4 = new Item("Sabonete", Segmento.HIGIENE, 2.99,4);
            Item item5 = new Item("Carne", Segmento.ALIMENTACAO, 22.90,2);
            Item item6 = new Item("Detergente", Segmento.LIMPEZA, 1.99,1);
            Item item7 = new Item("Tomate", Segmento.ALIMENTACAO, 3.99,2);
            Item item8 = new Item("Cebola", Segmento.ALIMENTACAO, 2.99,1);

            List<Item> listaDeCompras = new ArrayList<>();
            listaDeCompras.add(item1);
            listaDeCompras.add(item2);
            listaDeCompras.add(item3);
            listaDeCompras.add(item4);
            listaDeCompras.add(item5);
            listaDeCompras.add(item6);
            listaDeCompras.add(item7);
            listaDeCompras.add(item8);

            for (Item item : listaDeCompras){
                double valorTotal = item.getValor() * item.getQuantidade();
                System.out.println("[" + item.getSegmento() + "] " + item.getNome() + " (" + item.getQuantidade() + ") - " + item.getValor() + " | " + valorTotal);
            }
        }
}

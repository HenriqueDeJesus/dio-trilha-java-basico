package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i : itemList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        itemList.removeAll(itensParaRemover);
    }
  
    public double calcularValorTotal(){
        double valorTotal = 0d;
        if (!itemList.isEmpty()){
            for(Item item : itemList){
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }  
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }


    @Override
    public String toString() {
        return "CarrinhoDeCompras [itemList=" + itemList + "]";
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println("O número total de elementos na lista é: " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.adicionarItem("Leite", 4.50d, 1);
        carrinhoDeCompras.adicionarItem("Manteiga", 6.00d, 2);
        carrinhoDeCompras.adicionarItem("Feijão", 6.00d, 1);

        carrinhoDeCompras.exibirItens();
        System.out.println("O número total de elementos na lista é: " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Leite");
        System.out.println("O número total de elementos na lista é: " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.exibirItens();
        System.out.println("O valor final do carrinho é: " + carrinhoDeCompras.calcularValorTotal());
    }
    
}

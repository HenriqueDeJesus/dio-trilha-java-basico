package sistema.internet;

public class NavegadorInternet implements Navegador{
    public void exibirPagina() {
        System.out.println("Página web");
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando a página web");
    }
}

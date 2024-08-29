package smartphone;

import sistema.internet.Navegador;
import sistema.iphone.Iphone;
import sistema.musica.ReprodutorMusical;
import sistema.telefone.Telefone;

public class Smartphone {
    public static void main(String[] args)  {
        Iphone iphone = new Iphone();

        ReprodutorMusical reprodutorMusical = iphone;
        Navegador navegador = iphone;
        Telefone telefone = iphone;

        reprodutorMusical.tocarMusica();
        navegador.exibirPagina();
        telefone.ligar();
    }
}

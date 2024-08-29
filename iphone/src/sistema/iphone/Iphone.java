package sistema.iphone;

import sistema.internet.Navegador;
import sistema.musica.ReprodutorMusical;
import sistema.telefone.Telefone;

public class Iphone implements Navegador, ReprodutorMusical, Telefone {

    public void tocarMusica() {
		System.out.println("TOCANDO MUSICA NO IPHONE");
	}

	public void pausarMusica() {
		System.out.println("PAUSANDO MUSICA NO IPHONE");	
	}

	public void escolherMusica() {
		System.out.println("SELECIONANDO MUSICA NO IPHONE");	
	}
	
	public void ligar() {
		System.out.println("LIGANDO NO IPHONE");
	}

	public void atender() {
		System.out.println("ATENDENDO IPHONE");
	}

	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ NO IPHONE");	
	}

	public void exibirPagina() {
		System.out.println("EXIBINDO PAGINAS WEB NO IPHONE");
	}

	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO ABA DE NAVEGADOR NO IPHONE");
	}

    public void atualizarPagina() {
        System.out.println("ATUALIZANDO A PÁGINA");
    }
    
}



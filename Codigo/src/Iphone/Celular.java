package Iphone;

import AparelhoTelefonico.Exe;
import Navegador.Exe2;
import ReprodutorMusical.Exe3;


public class Celular implements Exe, Exe2, Exe3{
    
    //aparelho telefônico
    public void ligar(){
        System.out.println("Ligando...");
      }
      public void atender(){
        System.out.println("Atendendo...");
      }
      public void iniciarCorreioDeVoz(){
        System.out.println("Iniciando correio de voz...");
      }

    //reprodutor musical
    public void selecionarMusica(){
        System.out.println("Selecione a música que deseja ouvir");
    }
    public void tocarMuscia(){
        System.out.println("Tocando música");
    }
    public void pausarMusica(){
        System.out.println("Pausando música");
    }

    //navegador
    public void exibirPagina(){
        System.out.println("Exibindo pagina");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando pagina");
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }
    public static void main(String[] args) {
        Celular celular = new Celular();
        
        //funções do reprodutor musical
        System.out.println("REPRODUTOR MUSICAL");
        celular.selecionarMusica();
        celular.tocarMuscia();
        celular.pausarMusica();

        //funções do navegador
        System.out.println("NAVEGADOR");
        celular.exibirPagina();
        celular.atualizarPagina();
        celular.adicionarNovaAba();

        //funções do aparelho telefônico
        System.out.println("APARELHO TELEFÔNICO");
        celular.ligar();
        celular.atender();
        celular.iniciarCorreioDeVoz();
    }

}

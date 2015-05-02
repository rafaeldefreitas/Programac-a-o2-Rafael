package caixa_eletronico;
public class Banco {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    Banco(){
        nome = null;
    }
 /*   
001      Banco do Brasil
047 Banco do Estado de Sergipe.
037 Banco do Estado do Par?.
041 Banco do Estado do Rio Grande do Sul.
004 Banco do Nordeste do Brasil. 
Se o n?mero n?o estiver na lista n?o deve atribuir
nada.*/
  public  String buscar(String nbanco){
        if(nbanco.equals("001")){
            nome = "001 - Banco do Brasil";
            return nome;
        }
        else if(nbanco.equals("047")){
            nome = "047 - Banco do Estado de Sergipe";
            return nome;
        }
        else if(nbanco.equals("037")){
            nome = "037 - Banco do Estado do Pará";
            return nome;
        }
        else if(nbanco.equals("041")){
            nome = "041 - Banco do Estado do Rio Grande do Sul";
            return nome;
        }
        else if(nbanco.equals("004")){
            nome = "004 - Banco do Nordeste do Brasil";
            return nome;
        }
        else{
           return "Não encontrado";

        }
    }
}


package javaqueue;

public class Pessoa {
    private String nome;
    private String rg;
    private int idade;

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getRg() {
        return rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override //Muda uma classe que ja existe
    public String toString(){
        return "Nome: "+ getNome()+ "\n Idade: " + getIdade()+ "\n Rg: " + getRg();
    }//fim to String
}

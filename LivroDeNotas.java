public class LivroDeNotas{
   private String nomeDisciplina;
 //principio do menor privilegio
 public String getNomeDisciplina(){
    return nomeDisciplina;
 }
 public String setNomeDisciplina(String nomeDisciplina){
    this.nomeDisciplina = nomeDisciplina;
 }
    public void exibirMensagem(){
        System.out.printf("Bem vindo ao livro de notas de %s", nomeDisciplina);

    }
    //construtor padrão(aquele cuja lista de parâmetros é vazia)
    LivroDeNotas(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }
}
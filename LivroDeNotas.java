public class LivroDeNotas{
    String nomeDisciplina;
    public void exibirMensagem(){
        System.out.printf("Bem vindo ao livro de notas de %s", nomeDisciplina);
    }
    //construtor padrão(aquele cuja lista de parâmetros é vazia)
    LivroDeNotas(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }
}
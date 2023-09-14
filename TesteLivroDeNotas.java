public class TesteLivroDeNotas{
    static public void main(String args []){
        String nomeDisciplina = javax.swing.JOptionPane.showInputDialog("Digite o nome da diciplina");
        var livroDeNotas = new LivroDeNotas(nomeDisciplina);
        //livroDeNotas.nomeDisciplina = nomeDisciplina;
        livroDeNotas.exibirMensagem();
        System.out.println("\nAte logo ");
    }
}
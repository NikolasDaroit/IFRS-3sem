
public class Curso
{

    String nome;
    int max_alunos = 2;
    int total_alunos ;

    
    public Curso()
    {
        total_alunos = 0;
        nome = "Nome_curso";
    }
    void print(String text){
        System.out.println(text);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    
}

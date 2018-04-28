
public class Aluno
{

    String nome;
    int sexo;
    int matricula;
    Curso curso;

    public Aluno()
    {
        // inicializa variáveis de instância
        sexo = 0;
        nome = "Nome_Aluno";
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCurso (){
        return this.curso.getNome();
    }
    public String getNome (){
        return this.nome;
    }
    public void setDisciplina (Disciplina disciplina){
        if (disciplina.addAluno(this) == true){
            this.curso = curso;

        }else{
            this.curso = null;
            System.out.println("n f possivel add");
        }
        
        

    }
}

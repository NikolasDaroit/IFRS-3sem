
/**
 * Escreva a descrição da classe Disciplina aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Disciplina
{
    String nome;
    Professor professor;
    Curso curso;
    int max_alunos = 30;
    int total_alunos ;
    Aluno[] matriculados = new Aluno[max_alunos];
    
    public Disciplina()
    {
        // inicializa variáveis de instância
        total_alunos = 0;
        
        nome = "Nome_Disciplina";
    }
    public void print(String text){
        System.out.println(text);
    }
    public String getCurso (){
        return this.curso.getNome();
    }
    public String getProfessor(){
        return this.professor.getNome();
    }
    public String getNome (){
        return this.nome;
    }

    public void setCurso (Curso curso){
        this.curso = curso;
    }
    public void setProfessor (Professor professor){
        this.professor = professor;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getTotal(){
        return total_alunos;
    }
    public void getAlunos(){
        for (int i=0; i < max_alunos; i++){
            print(matriculados[i].getNome());
        }
        
    }
    public boolean addAluno(Aluno aluno){
     if ((total_alunos+1) <= max_alunos){

         this.matriculados[this.total_alunos] = aluno;
         this.total_alunos += 1;

         return true;
        }else{
        return false;}
    }
}

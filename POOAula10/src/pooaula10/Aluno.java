package pooaula10;

public class Aluno extends Pessoa {
    
    private int matr;
    private String curso;

    /*public Aluno(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }*/
    
    public void cancelarMatr(){
        System.out.println("Matricula será cancelada");
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}

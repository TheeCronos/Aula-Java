package pooaula14;

public abstract class Pessoa {
    
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int xp;
    
    protected void ganharExp(){
        
    }

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.xp = 0;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    @Override
    public String toString() {
        return "Pessoa:" 
                + "\nNome = " + nome 
                + "\nIdade = " + idade 
                + "\nSexo = " + sexo 
                + "\nExperiência = " + xp
                + "\n______________________________";
    }
    
    
    
}

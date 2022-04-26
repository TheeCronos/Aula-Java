package pooaula11;

public class Professor extends Pessoa{
    
    private String espec;
    private float salario;
    
    public void receberAumento(){
        System.out.println(this.nome + " recebeu aumento!");
    }

    public String getEspec() {
        return espec;
    }

    public void setEspec(String espec) {
        this.espec = espec;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}

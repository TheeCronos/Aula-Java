package pooaula10;

public class POOAula10 {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("carlos");
        p2.setNome("xandon");
        p3.setNome("Caio");
        p4.setNome("AAAA");
        
        p1.setSexo("M");
        p1.setIdade(20);
        
        p2.setIdade(21);
        p2.setSexo("Mm");
        
        p3.setIdade(22);
        p3.setSexo("Mmm");
        
        p4.setIdade(23);
        p4.setSexo("BBBB");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}

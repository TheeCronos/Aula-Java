package pooaula11;

public class POOAula11 {

    public static void main(String[] args) {

        //Pessoa p1 = new Pessoa(); <- não pode ser instanciada. Pessoa é classe abstrata.
        
        Visitante v1 = new Visitante();
        
        v1.setNome("Carlos");
        v1.setIdade(20);
        v1.setSexo("M");
        
        System.out.println(v1.toString());
        System.out.println("");
        
        Aluno a1 = new Aluno();
        
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensal();
        System.out.println(a1.toString());
        System.out.println("");
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensal();
        System.out.println(b1.toString());
        System.out.println("");
        
        Professor p1 = new Professor();
        p1.setNome("jorge");
        p1.setIdade(42);
        p1.setSexo("M");
        p1.setSalario(3000.0f);
        p1.setEspec("Geografia");
        p1.receberAumento();
        System.out.println(p1.toString());
        System.out.println(p1.getEspec());
        System.out.println(p1.getSalario());
        System.out.println("");
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Marcos");
        t1.setIdade(45);
        t1.setSexo("M");
        t1.setMatricula(1234);
        t1.setCurso("ADS");
        t1.praticar();
        System.out.println(t1.toString());
        System.out.println(t1.getMatricula());
        System.out.println(t1.getCurso());
        System.out.println("");
    }
}

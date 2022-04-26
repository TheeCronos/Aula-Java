package pooaula09;

public class POOAula09 {

    public static void main(String[] args) {
        
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        p[0] = new Pessoa("xandão", 19, "Gay");
        p[1] = new Pessoa("Carlos", 20, "Baitola");
        
        l[0] = new Livro("A", "AA", 300, p[0]);
        l[1] = new Livro("B", "BB", 500, p[1]);
        l[2] = new Livro("C", "CC", 700, p[0]);
        //p[0].status();
        //p[1].status();
        System.out.println(l[0].detalhes());
    }
}

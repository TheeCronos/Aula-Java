package pooaula14;

public class POOAula14e15 {
    public static void main(String[] args) {
        
        Video v[] = new Video[3];
        
        v[0] = new Video("Aula 1 de PHP");
        v[1] = new Video("Aula 12 de Java");
        v[2] = new Video("Aula 15 de HTML5");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Vinicius", 26, "M", "Cronos");
        g[1] = new Gafanhoto("Xandão", 24, "M", "Kxamp");
        
        Visualizacao a[] = new Visualizacao[2];
        a[0] = new Visualizacao(g[0], v[1]);
        a[0].avaliar();
        a[1] = new Visualizacao(g[1], v[0]);
        a[1] = new Visualizacao(g[0], v[2]);
        a[0].avaliar(87.5f);
        
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
        System.out.println(a[0].toString());
        System.out.println(a[1].toString());
    }
}

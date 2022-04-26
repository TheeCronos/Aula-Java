package vetorescombusca;

import java.util.Arrays;

public class VetoresComBusca {

    public static void main(String[] args) {
        
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        
        for(int v: vet){
            System.out.print(v + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 2); //arrays.binarySearch para buscar passando a variável e 
        System.out.println("Encontrei o valor na posição " + p);
    }
}

import java.util.Scanner;

public class If {

    public static void main(String[] args){

        System.out.print("Digite a idade: ");
        Scanner teclado = new Scanner(System.in);
        int idade = teclado.nextInt();

        if (idade<16){
            System.out.println("Não pode votar!");
        }else if((idade>=16 && idade<18) || (idade>70)){
            System.out.println("Voto opcional!");
        }else{
            System.out.println("Voto obrigatório!");
        }
    }
}


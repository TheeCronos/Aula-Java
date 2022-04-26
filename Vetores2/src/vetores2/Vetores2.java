package vetores2;

public class Vetores2 {

    public static void main(String[] args) {
        
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
                        "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int day[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for(int i = 0; i < mes.length; i++){
            System.out.println("O mês " + mes[i] +
                    " tem " + day[i] + " dias ao todo");
        }
    }
}

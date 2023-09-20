import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class metodos {
    private double premio;

    public double getPremio() {
        return premio;
    }

    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public void menu (){
        System.out.println("**************");
        System.out.println("Menu LOTOFACIL:"
        +"\n1) Apostar de 0 a 100"
        +"\n2) Apostar de A a Z"
        +"\n3) Apostar em par ou impar"
        +"\n4) Ver o valor da sua premiacao"
        +"\n0) Sair");
        System.out.println("**************");
        System.out.print("Sua opcao: ");
    }

    public int numPC(){
        int numeroAleatorio = rand.nextInt(101);
        return numeroAleatorio;
    }

    public void mtdAposta0a100 (){
        while (true){
            System.out.println("Digite um numero entre 0 100: ");
            int numeroAposta = sc.nextInt();
            if (numeroAposta < 0 || numeroAposta > 100){
                System.out.println("Aposta invalida");
            }
            else{
                if (numeroAposta == numPC()){
                    System.out.println("Parabens, voce ganhou R$1000,00");
                    premio +=1000.00;
                    break;
                }
                else{
                    System.out.println("Que pena!! O numero sorteado foi: "+numPC());
                    break;
                }
            }
        }
    }

    public void mtdApostaAaZ (){
        try {
            System.out.println("Digite uma letra e pressione Enter:");
            int caractereLido = System.in.read(); // Lê um byte de entrada

            if (Character.isLetter(caractereLido)) {
                char caractere = (char) caractereLido;
                caractere = Character.toUpperCase(caractere);

                if (caractere == 'G') {
                    System.out.println("Parabens! Voce ganhou R$500,00");
                    premio+=500.00;
                } else {
                    System.out.println("Que pena! A letra sorteada foi: G");
                }
            } else {
                System.out.println("Aposta invalida. Digite uma letra.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void mtdApostaParOUImpar(){
        while(true){        
            System.out.print("Digite um numero inteiro e veja se a premiacao e para par ou impar: ");
            int num = sc.nextInt();
            if (num%2==0){
                System.out.println("Parabens! Voce ganhou R$100,00");
                premio+=100.00;
                break;
            }
            else if(num%2!=0){
                System.out.println("Que pena! O numero digitado e impar e a premiacao foi para numeros pares.");
                break;
            }
            else{
                System.out.println("Aposta invalida.");
            }

        }       
    }
}
        



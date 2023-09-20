import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos metodosLotofacil = new metodos();

        int opc = 0;
        do{
            metodosLotofacil.menu();
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    metodosLotofacil.mtdAposta0a100();
                    break;
                case 2:
                    metodosLotofacil.mtdApostaAaZ();
                    break;
                case 3:
                    metodosLotofacil.mtdApostaParOUImpar();
                    break;
                case 4:
                    System.out.println("O valor do premio ate agora eh: R$"+metodosLotofacil.getPremio());
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opc != 0);
    }

}


import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Saque saque = new Saque();
        Leitura l= new Leitura();
        l.cedDispo();
        saque.obterSaldo();
        saque.sacarDinheiro(l);
        outroValor(l, saque);
    }
    private static <l> int outroValor(Leitura l, Saque saque) {
        Scanner tec = new Scanner(System.in);
        if (saque.saldo.compareTo(BigDecimal.valueOf(0.00))<=0) {
            System.out.print("\nSeu saldo é insuficiente para realizar outro saque. Por favor realize um depósito.");
            return 0;
        }else {
            if (l.getSomCedMoed().compareTo(BigDecimal.valueOf(0))==0){
                System.out.printf("\nNão há valores disponiveis para saque!\n");
                return 0;
            }else{
                System.out.print("Deseja obter outro valor?(1-Sim e 0-Não)\n");
                int ValorOp = Integer.parseInt(tec.nextLine());
                if (ValorOp == 1) {
                    saque.sacarDinheiro(l);
                    outroValor(l, saque);
                } else {
                    System.out.print("Fim.");
                }
            }
        }
        return 0;
    }
}
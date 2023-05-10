import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leitura {
    int i, j, x, y; //contadores
    double[] moed= {1,0.50,0.25,0.10,0.05,0.01};//moedas=6
    int[] ced = {200,100,50,20,10,5,2};//cédulas=7
    int[] quantNdisp = new int[7];//quantidade das cédulas disponíveis
    int[] quantMdisp = new int[6];//quantidade de moedas disponíveis

    public void cedDispo(){ //cédulas e moedas disponíveis na máquína.
        Scanner scan = new Scanner(System.in);
        for (i=0; i<7; i++) {
            System.out.print("Qual o valor de cédulas de R$" + ced[i] + " Disponível?\n");
            quantNdisp[j] = (scan.nextInt());
            j++;
        }
        for (x=0; x<6; x++) {
            System.out.print("Qual o valor de moedas de R$" + moed[x] + " Disponível?\n");
            quantMdisp[y] = (scan.nextInt());
            y++;
        }
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leitura {
    int i, j, x, y;
    double somCedMoed;
    double[] moed= {1,0.50,0.25,0.10,0.05,0.01};
    int[] ced = {200,100,50,20,10,5,2};
    int[] quantNdisp = new int[7];
    int[] quantMdisp = new int[6];

    public void cedDispo(){
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
        somCedMoed=quantNdisp[0]*200+quantNdisp[1]*100+quantNdisp[2]*50+quantNdisp[3]*25+quantNdisp[4]*10+quantNdisp[5]*5+ quantNdisp[6]*2+
                quantMdisp[0]*1.00+quantMdisp[1]*0.50+quantMdisp[2]*0.25+quantMdisp[3]*0.10+quantMdisp[4]*0.05+quantMdisp[5]*0.01;
    }
}
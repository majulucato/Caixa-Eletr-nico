import java.math.BigDecimal;
import java.util.Scanner;

public class Leitura {
    int i, j=0, x, y=0, r, s ;
    private BigDecimal somCedMoed;
    BigDecimal[] moed= {BigDecimal.valueOf(1), BigDecimal.valueOf(0.50), BigDecimal.valueOf(0.25), BigDecimal.valueOf(0.10), BigDecimal.valueOf(0.05), BigDecimal.valueOf(0.01)};
    BigDecimal[] ced = {BigDecimal.valueOf(200), BigDecimal.valueOf(100), BigDecimal.valueOf(50), BigDecimal.valueOf(20), BigDecimal.valueOf(10), BigDecimal.valueOf(5), BigDecimal.valueOf(2)};
    BigDecimal[] vlN = new BigDecimal[7];
    BigDecimal[] vlM = new BigDecimal[6];
    private BigDecimal[] quantNdisp = new BigDecimal[7];
    private BigDecimal[] quantMdisp = new BigDecimal[6];
    BigDecimal somaVlN, somaVlM;

    public void cedDispo(){
        Scanner scan = new Scanner(System.in);
        for (i=0; i<7; i++) {
            System.out.print("Qual o valor de cédulas de R$" + getCed()[i] + " Disponível?\n");
            quantNdisp[j] = (scan.nextBigDecimal());
            j++;
        }
        i=0; j=0;
        for (x=0; x<6; x++) {
            System.out.print("Qual o valor de moedas de R$" + moed[x] + " Disponível?\n");
            quantMdisp[y] = (scan.nextBigDecimal());
            y++;
        }
        x=0;y=0;
        for(r=0;r<7;r++){
            vlN[r]= (getQuantNdisp()[j]).multiply(ced[i]);
            i++;
            j++;
        }
        i=0; j=0; r=0;
        for(s=0;s<6;s++){
            vlM[s]= (getQuantMdisp()[y].multiply(moed[x]));
            x++;
            y++;
        }
        x=0;y=0;s=0;
        somaVlN = vlN[0].add(vlN[1].add(vlN[2].add(vlN[3]).add(vlN[4].add(vlN[5].add(vlN[6])))));
        somaVlM = vlM[0].add(vlM[1].add(vlM[2].add(vlM[3]).add(vlM[4].add(vlM[5]))));
        setSomCedMoed(somaVlN.add(somaVlM));
    }
    public BigDecimal getSomCedMoed() {
        return somCedMoed;
    }
    public void setSomCedMoed(BigDecimal somCedMoed) {
        this.somCedMoed = somCedMoed;
    }
    public BigDecimal[] getCed() {
        return ced;
    }
    public BigDecimal[] getQuantNdisp() {
        return quantNdisp;
    }
    public BigDecimal[] getQuantMdisp() {
        return quantMdisp;
    }
}
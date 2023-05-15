import java.math.BigDecimal;
import java.util.Scanner;

public class Saque {
    int opc, i, j, x, y, r, s;
    BigDecimal saldo;
    private BigDecimal vlsaque, saqueIn;
    private BigDecimal difSaldo;
    BigDecimal[] saqN = new BigDecimal[7];
    BigDecimal[] saqM = new BigDecimal[6];

    public void obterSaldo(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\nQual o saldo inicial da conta?\n");
        saldo = scan.nextBigDecimal();
    }

    public double sacarDinheiro(Leitura l){
        Scanner scan = new Scanner(System.in);
        System.out.print("\nSeu saldo disponível para saque é de R$"+ saldo);
        System.out.print("\nValor total armazenado em caixa: R$"+ l.getSomCedMoed() +"\n");
        System.out.print("\nCédulas disponíveis: \n");
        for(j=0; BigDecimal.valueOf(j).compareTo(BigDecimal.valueOf(7))<0; j++){
            if(l.getQuantNdisp()[j].compareTo(new BigDecimal(0))>0){System.out.print(l.getQuantNdisp()[j]+ " R$"+ l.getCed()[i]+"\n");}
            i++;
        }
        i=0; j=0;
        System.out.print("\nMoedas disponíveis: \n");
        for(y=0; BigDecimal.valueOf(y).compareTo(BigDecimal.valueOf(6))<0; y++){
            if(l.getQuantMdisp()[y].compareTo(new BigDecimal(0))>0){System.out.print(l.getQuantMdisp()[y]+ " R$"+l.moed[x]+"\n");}
            x++;
        }
        x=0; y=0;
        System.out.print("\nQual o valor que deseja realizar o saque?\n");
        vlsaque = scan.nextBigDecimal();
        if(new BigDecimal(String.valueOf(vlsaque)).compareTo(BigDecimal.valueOf(0))==0){
            System.out.print("\nValor de saque incorreto, não será possível realizar o saque.\n");
            return 0;
        }
        if(vlsaque.compareTo(l.getSomCedMoed())==1){
            System.out.print("\nValor de saque incompatível com valor em caixa, não será possível realizar o saque.\n");
            return 0;
        }else{
            if (saldo.compareTo(vlsaque) >= 0){
                System.out.print("\nDeseja realizar o saque de R$: " + vlsaque + "?(1-Sim e 0-Não)\n");
                opc = scan.nextInt();
                if (opc == 1) {
                    saqueIn=vlsaque;
                    System.out.print("\nSaque de cédulas e/ou moedas: \n");
                    //                                       NOTAS
                    for(r=0; BigDecimal.valueOf(s).compareTo(BigDecimal.valueOf(7))<0; r++){
                        if (l.getQuantNdisp()[j].compareTo((vlsaque.divideToIntegralValue(l.getCed()[i])))>=0) {
                            if((l.getQuantNdisp()[j].subtract(vlsaque.divideToIntegralValue(l.getCed()[i]))).compareTo(BigDecimal.valueOf(0))>=0){
                                saqN[s]= (vlsaque.divideToIntegralValue(l.getCed()[i]));
                                vlsaque= vlsaque.remainder(l.getCed()[i]);
                                if(saqN[s].compareTo(new BigDecimal(0))>0){System.out.print(saqN[s]+" R$"+ l.getCed()[i]+".\n");}
                                l.getQuantNdisp()[j] = l.getQuantNdisp()[j].subtract(saqN[s]);
                            }
                        }else {
                            saqN[s]= (l.getQuantNdisp()[j]);
                            vlsaque= vlsaque.subtract(saqN[s].multiply(l.getCed()[i]));
                            if(saqN[s].compareTo(BigDecimal.valueOf(0))>0){System.out.print(saqN[s]+" R$"+ l.getCed()[i]+".\n");}
                            l.getQuantNdisp()[j] = BigDecimal.valueOf(0);
                        }
                        i++;
                        j++;
                        s++;
                    }
                    s=0;i=0;j=0;
    //                                                        MOEDAS
                    for(r=0; BigDecimal.valueOf(s).compareTo(BigDecimal.valueOf(6))<0; r++){
                        if (l.getQuantMdisp()[y].compareTo((vlsaque.divideToIntegralValue(l.moed[x])))>=0) {
                            if((l.getQuantMdisp()[y].subtract(vlsaque.divideToIntegralValue(l.moed[x]))).compareTo(BigDecimal.valueOf(0))>=0){
                                saqM[s]= (vlsaque.divideToIntegralValue(l.moed[x]));
                                vlsaque= vlsaque.remainder(l.moed[x]);
                                if(saqM[s].compareTo(new BigDecimal(0))>0){System.out.print(saqM[s]+" R$"+ l.moed[x]+".\n");}
                                l.getQuantMdisp()[y] = l.getQuantMdisp()[y].subtract(saqM[s]);//atualizar cédulas
                            }
                        }else {
                            saqM[s]= (l.getQuantMdisp()[y]);
                            vlsaque= vlsaque.subtract(saqM[s].multiply(l.moed[x]));
                            if(saqM[s].compareTo(BigDecimal.valueOf(0))>0){System.out.print(saqM[s]+" R$"+ l.moed[x]+".\n");}
                            l.getQuantMdisp()[y] = BigDecimal.valueOf(0);
                        }
                        x++;
                        y++;
                        s++;
                    }
                    s=0;x=0;y=0;
                    if(vlsaque.compareTo(BigDecimal.valueOf(0))==0){ //verificar se o saque é possível
                        vlsaque=saqueIn;
                        l.setSomCedMoed(l.getSomCedMoed().subtract(vlsaque));
                        saldo = saldo.subtract(vlsaque);
                        System.out.printf("\nSeu  novo saldo é de R$" + saldo + ".\n");
                    }else{
                        System.out.print("\nNão há número de cédulas compativel com o seu saque!\n" +
                                "Insera mais cédulas ou escolha outro valor para saque.\n\n");
                        //retornar as quantidades de cédulas
                        for(j=0; (BigDecimal.valueOf(j)).compareTo(BigDecimal.valueOf(7))<0;j++){
                            l.getQuantNdisp()[j] = l.getQuantNdisp()[j].add(saqN[s]);
                            i++;
                            s++;
                        }
                        i=0;j=0;s=0;
                        for(y=0; (BigDecimal.valueOf(y)).compareTo(BigDecimal.valueOf(6))<0;y++){
                            l.getQuantMdisp()[y] = l.getQuantMdisp()[y].add(saqM[s]);
                            x++;
                            s++;
                        }
                        s=0;x=0;y=0;
                    }
                } else {
                    System.out.print("\nSaque de R$: " + vlsaque + " cancelado!\n");
                    vlsaque = BigDecimal.ZERO;
                    this.saldo = saldo.subtract(vlsaque);
                    System.out.printf("\nSeu saldo é de R$" + this.saldo + "\n");
                    if (saldo.compareTo(BigDecimal.valueOf(0.00))==0) {
                        System.out.print("\nSeu saldo é de R$0,00. Por favor realize um depósito para realizar outro saque.");
                        return 0;
                    }
                }
            }else {
                difSaldo = saldo.subtract(vlsaque);
                System.out.print("Saldo insuficiente: " + difSaldo + "\n");
            }
        }
        return 0;
    }
}
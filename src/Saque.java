import java.util.Scanner;

public class Saque {
    int opc;
    double saldo;
    private double vlsaque, saqueIn;
    private double difSaldo;

    private int s200, s100, s50, s20, s10, s5, s2, m1, m50, m25, m10, m5, m01;

    public void obterSaldo(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Qual o saldo inicial da conta?\n");
        saldo = scan.nextDouble();
    }

    public double sacarDinheiro(Leitura l){
        Scanner scan = new Scanner(System.in);
        System.out.print("\nValor total armazenado em caixa: R$" + l.somCedMoed+"\n");
        System.out.print("\nSeu saldo disponível para saque é de R$"+ this.saldo);
        System.out.print("\n\nCédulas disponíveis: \n");
        System.out.print(l.quantNdisp[0]+ " R$"+l.ced[0]+"\n");
        System.out.print(l.quantNdisp[1]+ " R$"+l.ced[1]+"\n");
        System.out.print(l.quantNdisp[2]+ " R$"+l.ced[2]+"\n");
        System.out.print(l.quantNdisp[3]+ " R$"+l.ced[3]+"\n");
        System.out.print(l.quantNdisp[4]+ " R$"+l.ced[4]+"\n");
        System.out.print(l.quantNdisp[5]+ " R$"+l.ced[5]+"\n");
        System.out.print(l.quantNdisp[6]+ " R$"+l.ced[6]+"\n");
        System.out.print("\nMoedas disponíveis: \n");
        System.out.print(l.quantMdisp[0]+" R$"+l.moed[0]+"\n");
        System.out.print(l.quantMdisp[1]+" R$"+l.moed[1]+"\n");
        System.out.print(l.quantMdisp[2]+" R$"+l.moed[2]+"\n");
        System.out.print(l.quantMdisp[3]+" R$"+l.moed[3]+"\n");
        System.out.print(l.quantMdisp[4]+" R$"+l.moed[4]+"\n");
        System.out.print(l.quantMdisp[5]+" R$"+l.moed[5]+"\n");
        System.out.print("\nQual o valor que deseja realizar o saque?\n");
        vlsaque = scan.nextDouble();
        if(vlsaque==0){
            System.out.print("\nValor de saque incorreto, não será possível realizar o saque.\n");
            return 0;
        }
        if(l.somCedMoed<vlsaque){
            System.out.print("\nValor de saque incompatível com valor em caixa, não será possível realizar o saque.\n");
            return 0;
        }

        if (vlsaque <= this.saldo){
            System.out.print("\nDeseja realizar o saque de R$: " + vlsaque + "?(1-Sim e 0-Não)\n");
            opc = scan.nextInt();
            if (opc == 1) {
                saqueIn=vlsaque;
                System.out.print("Saque de cédulas e/ou moedas: \n");

                //                                       NOTAS

                if (((int) (vlsaque/200)) <= l.quantNdisp[0]) {
                    if((l.quantNdisp[0]-((int) (vlsaque/200)))>=0){
                        s200= (int) (vlsaque/200);
                        vlsaque= vlsaque-(s200*200);
                        System.out.print(s200+" R$200.\n");
                        l.quantNdisp[0] = l.quantNdisp[0] - s200;
                    }
                }else {
                    s200= l.quantNdisp[0];
                    vlsaque= vlsaque-(s200*200);
                    System.out.print(s200+" R$200.\n");
                    l.quantNdisp[0] = 0;
                }

                if (((int) (vlsaque/100)) <= l.quantNdisp[1]) {
                    if((l.quantNdisp[1]-((int) (vlsaque/100)))>=0){
                        s100= (int) (vlsaque/100);
                        vlsaque= vlsaque-(s100*100);
                        System.out.print(s100+" R$100.\n");
                        l.quantNdisp[1] = l.quantNdisp[1] - s100;
                    }
                }else {
                    s100= l.quantNdisp[1];
                    vlsaque= vlsaque-(s100*100);
                    System.out.print(s100+" R$100.\n");
                    l.quantNdisp[1] = 0;
                }

                if (((int) (vlsaque/50)) <= l.quantNdisp[2]) {
                    if((l.quantNdisp[2]-((int) (vlsaque/50)))>=0){
                        s50= (int) (vlsaque/50);
                        vlsaque= vlsaque-(s50*50);
                        System.out.print(s50+" R$50.\n");
                        l.quantNdisp[2] = l.quantNdisp[2] - s50;
                    }
                }else {
                    s50= l.quantNdisp[2];
                    vlsaque= vlsaque-(s50*50);
                    System.out.print(s50+" R$50.\n");
                    l.quantNdisp[2] = 0;
                }

                if (((int) (vlsaque/20)) <= l.quantNdisp[3]) {
                    if((l.quantNdisp[3]-((int) (vlsaque/20)))>=0){
                        s20= (int) (vlsaque/20);
                        vlsaque= vlsaque-(s20*20);
                        System.out.print(s20+" R$20.\n");
                        l.quantNdisp[3] = l.quantNdisp[3] - s20;
                    }
                }else {
                    s20= l.quantNdisp[3];
                    vlsaque= vlsaque-(s20*20);
                    System.out.print(s20+" R$20.\n");
                    l.quantNdisp[3] = 0;
                }

                if (((int) (vlsaque/10)) <= l.quantNdisp[4]) {
                    if((l.quantNdisp[4]-((int) (vlsaque/10)))>=0){
                        s10= (int) (vlsaque/10);
                        vlsaque= vlsaque-(s10*10);
                        System.out.print(s10+" R$10.\n");
                        l.quantNdisp[4] = l.quantNdisp[4] - s10;
                    }
                }else {
                    s10= l.quantNdisp[4];
                    vlsaque= vlsaque-(s10*10);
                    System.out.print(s10+" R$10.\n");
                    l.quantNdisp[4] = 0;
                }

                if (((int) (vlsaque/5)) <= l.quantNdisp[5]) {
                    if((l.quantNdisp[5]-((int) (vlsaque/5)))>=0){
                        s5= (int) (vlsaque/5);
                        vlsaque= vlsaque-(s5*5);
                        System.out.print(s5+" R$5.\n");
                        l.quantNdisp[5] = l.quantNdisp[5] - s5;
                    }
                }else {
                    s5= l.quantNdisp[5];
                    vlsaque= vlsaque-(s5*5);
                    System.out.print(s5+" R$5.\n");
                    l.quantNdisp[5] = 0;
                }

                if (((int) (vlsaque/2)) <= l.quantNdisp[6]) {
                    if((l.quantNdisp[6]-((int) (vlsaque/2)))>=0){
                        s2= (int) (vlsaque/2);
                        vlsaque= vlsaque-(s2*2);
                        System.out.print(s2+" R$2.\n");
                        l.quantNdisp[6] = l.quantNdisp[6] - s2;
                    }
                }else {
                    s2= l.quantNdisp[6];
                    vlsaque= vlsaque-(s2*2);
                    System.out.print(s2+" R$2.\n");
                    l.quantNdisp[6] = 0;
                }

//                                                        MOEDAS

                if (((int) (vlsaque/1.00)) <= l.quantMdisp[0]) {
                    if((l.quantMdisp[0]-((int) (vlsaque/1.00)))>=0){
                        m1= (int) (vlsaque/1.00);
                        vlsaque= vlsaque-(m1*1.00);
                        System.out.print(m1+" R$1,00.\n");
                        l.quantMdisp[0] = l.quantMdisp[0] - m1;
                    }
                }else {
                    m1= l.quantMdisp[0];
                    vlsaque= vlsaque-(m1*1.00);
                    System.out.print(m1+" R$1,00.\n");
                    l.quantMdisp[0] = 0;
                }

                if (((int) (vlsaque/0.50)) <= l.quantMdisp[1]) {
                    if((l.quantMdisp[1]-((int) (vlsaque/0.50)))>=0){
                        m50= (int) (vlsaque/0.50);
                        vlsaque= vlsaque-(m50*0.50);
                        System.out.print(m50+" R$0,50.\n");
                        l.quantMdisp[1] = l.quantMdisp[1] - m50;
                    }
                }else {
                    m50= l.quantMdisp[1];
                    vlsaque= vlsaque-(m50*0.50);
                    System.out.print(m50+" R$0,50.\n");
                    l.quantMdisp[1] = 0;
                }

                if (((int) (vlsaque/0.25)) <= l.quantMdisp[2]) {
                    if((l.quantMdisp[2]-((int) (vlsaque/0.25)))>=0){
                        m25= (int) (vlsaque/0.25);
                        vlsaque= vlsaque-(m25*0.25);
                        System.out.print(m25+" R$0,25.\n");
                        l.quantMdisp[2] = l.quantMdisp[2] - m25;
                    }
                }else {
                    m25= l.quantMdisp[2];
                    vlsaque= vlsaque-(m25*0.25);
                    System.out.print(m25+" R$0,25.\n");
                    l.quantMdisp[2] = 0;
                }

                if (((int) (vlsaque/0.10)) <= l.quantMdisp[3]) {
                    if(l.quantMdisp[3]-((int) (vlsaque/0.10))>=0){
                        m10= (int) (vlsaque/0.10);
                        vlsaque=  vlsaque-(m10*0.10);
                        System.out.print(m10+" R$0,10.\n");
                        l.quantMdisp[3] = l.quantMdisp[3] - m10;
                    }
                }else {
                    m10= l.quantMdisp[3];
                    vlsaque= vlsaque-(m10*0.10);
                    System.out.print(m10+" R$0,10.\n");
                    l.quantMdisp[3] = 0;
                }

                if (((int) (vlsaque/0.05)) <= l.quantMdisp[4]) {
                    if((l.quantMdisp[4]-((int) (vlsaque/0.05)))>=0){
                        m5= (int) (vlsaque/0.05);
                        vlsaque= vlsaque-(m5*0.05);
                        System.out.print(m5+" R$0,05.\n");
                        l.quantMdisp[4] = l.quantMdisp[4] - m5;
                    }
                }else {
                    m5= l.quantMdisp[4];
                    vlsaque= vlsaque-(m5*0.05);
                    System.out.print(m5+" R$0,05.\n");
                    l.quantMdisp[4] = 0;
                }

                if (((int) (vlsaque/0.01)) <= l.quantMdisp[5]) {
                    if((l.quantMdisp[5]-((int) (vlsaque/0.01)))>=0){
                        m01= (int) (vlsaque/0.01);
                        vlsaque= vlsaque-(m01*0.01);
                        System.out.print(m01+" R$0,01.\n");
                        l.quantMdisp[5] = l.quantMdisp[5] - m01;
                        vlsaque=saqueIn;
                        this.saldo = this.saldo - vlsaque;
                        System.out.printf("Seu saldo é de R$" + this.saldo + "\n");
                    }
                }else {
                    System.out.print(m01+" R$0,01.\n");
                    System.out.print("\nNão há número de cédulas compativel com o seu saque!\n" +
                            "Entre em contato com um oficial para inserir mais cédulas ou escolha outra valor para saque.\n\n");
                    l.quantNdisp[0] = l.quantNdisp[0] + s200;
                    l.quantNdisp[1] = l.quantNdisp[1] + s100;
                    l.quantNdisp[2] = l.quantNdisp[2] + s50;
                    l.quantNdisp[3] = l.quantNdisp[3] + s20;
                    l.quantNdisp[4] = l.quantNdisp[4] + s10;
                    l.quantNdisp[5] = l.quantNdisp[5] + s5;
                    l.quantNdisp[6] = l.quantNdisp[6] + s2;
                    l.quantMdisp[0] = l.quantMdisp[0] + m1;
                    l.quantMdisp[1] = l.quantMdisp[1] + m50;
                    l.quantMdisp[2] = l.quantMdisp[2] + m25;
                    l.quantMdisp[3] = l.quantMdisp[3] + m10;
                    l.quantMdisp[4] = l.quantMdisp[4] + m5;
                    l.quantMdisp[5] = l.quantMdisp[5] + m01;
                }
            } else {
                System.out.print("\nSaque de R$: " + vlsaque + " cancelado!\n");
                vlsaque = 0;
                this.saldo = this.saldo - vlsaque;
                System.out.printf("\nSeu saldo é de R$" + this.saldo + "\n");
                if (this.saldo<=0.0) {
                    System.out.print("\nSeu saldo é de R$0,00. Por favor realize um depósito para realizar outro saque.");
                    return 0;
                }
            }
        }else{
            difSaldo= this.saldo - vlsaque;
            System.out.print("Saldo insuficiente: "+difSaldo+"\n");
        }
        return saldo;
    }
}

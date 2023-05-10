import java.util.Scanner;

public class Saque {
    int opc, x;
    double saldo; //SALDO INICIAL
    private double vlsaque, saqueIn; //valor que quero sacar
    private double difSaldo;//verifica se há saldo compativel com saque

    private int s200, s100, s50, s20, s10, s5, s2, m1,m50, m25, m10, m5, m01;

    public void obterSaldo(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Qual o saldo inicial da conta?\n");
        saldo = scan.nextDouble();
    }

    public double sacarDinheiro(Notas notas, Leitura l){
        Scanner scan = new Scanner(System.in);
        System.out.print("\nSeu saldo disponível para saque é de R$"+ this.saldo +
            "\n\nQual o valor que deseja realizar o saque?\n");
        vlsaque = scan.nextDouble();
        notas.notass=vlsaque;
        if (vlsaque <= this.saldo){
            notas.menorQuantidadeNotas();
            System.out.print("\nDeseja realizar o saque de R$: " + vlsaque + "?(1-Sim e 0-Não)\n");
            opc = scan.nextInt();
            if (opc == 1) {
                saqueIn=vlsaque;
                System.out.print("Retirando o valor de cédulas e/ou moedas: \n");

                //                                       NOTAS

                if (notas.getQuantNotas200() <= l.quantNdisp[0]) {
                    if((l.quantNdisp[0]-notas.getQuantNotas200())>0){
                        s200= (int) (vlsaque/200);
                        vlsaque= vlsaque%200;   //atualizar o saldo, para ir pra próxima nota
                        System.out.print(s200+" R$200.\n");
                        l.quantNdisp[0] = l.quantNdisp[0] - s200; //atualizar o valor de notas disponíveis
                    }
                }else {
                    s200= l.quantNdisp[0];  //valor de saque seja compatível  com o valor de n dispo
                    vlsaque= vlsaque-(s200*200);   //atualizar o saldo, para ir pra próxima nota
                    System.out.print(s200+" R$200.\n");
                    l.quantNdisp[0] = 0; //atualizar o valor de notas disponíveis
                }

                if (((int) (vlsaque/100)) <= l.quantNdisp[1]) {
                    if((l.quantNdisp[1]-notas.getQuantNotas100())>0){
                        s100= (int) (vlsaque/100);
                        vlsaque= vlsaque%100;   //atualizar o saldo, para ir pra próxima nota
                        System.out.print(s100+" R$100.\n");
                        l.quantNdisp[1] = l.quantNdisp[1] - s100; //atualizar o valor de notas disponíveis
                    }
                }else {
                    s100= l.quantNdisp[1];  //valor de saque seja compatível  com o valor de n dispo
                    vlsaque= vlsaque-(s100*100);   //atualizar o saldo, para ir pra próxima nota
                    System.out.print(s100+" R$100.\n");
                    l.quantNdisp[1] = 0; //atualizar o valor de notas disponíveis
                }

                if (notas.getQuantNotas50() <= l.quantNdisp[2]) {
                    if((l.quantNdisp[2]-notas.getQuantNotas50())>0){
                        s50= (int) (vlsaque/50);
                        vlsaque= vlsaque%50;   //atualizar o saldo, para ir pra próxima nota
                        System.out.print(s50+" R$50.\n");
                        l.quantNdisp[2] = l.quantNdisp[2] - s50; //atualizar o valor de notas disponíveis
                    }
                }else {
                    s50= l.quantNdisp[2];  //valor de saque seja compatível  com o valor de n dispo
                    vlsaque= vlsaque-(s50*50);   //atualizar o saldo, para ir pra próxima nota
                    System.out.print(s50+" R$50.\n");
                    l.quantNdisp[2] = 0; //atualizar o valor de notas disponíveis
                }

                if (notas.getQuantNotas20() <= l.quantNdisp[3]) {
                    if((l.quantNdisp[3]-notas.getQuantNotas20())>0){
                        s20= (int) (vlsaque/20);
                        vlsaque= vlsaque%20;   //atualizar o saldo, para ir pra próxima nota
                        System.out.print(s20+" R$20.\n");
                        l.quantNdisp[3] = l.quantNdisp[3] - s20; //atualizar o valor de notas disponíveis
                    }
                }else {
                    s20= l.quantNdisp[3];  //valor de saque seja compatível  com o valor de n dispo
                    vlsaque= vlsaque-(s20*20);   //atualizar o saldo, para ir pra próxima nota
                    System.out.print(s20+" R$20.\n");
                    l.quantNdisp[3] = 0; //atualizar o valor de notas disponíveis
                }

                if (notas.getQuantNotas10() <= l.quantNdisp[4]) {
                    if((l.quantNdisp[4]-notas.getQuantNotas10())>0){
                        s10= (int) (vlsaque/10);
                        vlsaque= vlsaque%10;   //atualizar o saldo, para ir pra próxima nota
                        System.out.print(s10+" R$10.\n");
                        l.quantNdisp[4] = l.quantNdisp[4] - s10; //atualizar o valor de notas disponíveis
                    }
                }else {
                    s10= l.quantNdisp[4];  //valor de saque seja compatível  com o valor de n dispo
                    vlsaque= vlsaque-(s10*10);   //atualizar o saldo, para ir pra próxima nota
                    System.out.print(s10+" R$10.\n");
                    l.quantNdisp[4] = 0; //atualizar o valor de notas disponíveis
                }

                if (notas.getQuantNotas5() <= l.quantNdisp[5]) {
                    if((l.quantNdisp[5]-notas.getQuantNotas5())>0){
                        s5= (int) (vlsaque/5);
                        vlsaque= vlsaque%5;   //atualizar o saldo, para ir pra próxima nota
                        System.out.print(s5+" R$5.\n");
                        l.quantNdisp[5] = l.quantNdisp[5] - s5; //atualizar o valor de notas disponíveis
                    }
                }else {
                    s5= l.quantNdisp[5];  //valor de saque seja compatível  com o valor de n dispo
                    vlsaque= vlsaque-(s5*5);   //atualizar o saldo, para ir pra próxima nota
                    System.out.print(s5+" R$5.\n");
                    l.quantNdisp[5] = 0; //atualizar o valor de notas disponíveis
                }

                if (notas.getQuantNotas2() <= l.quantNdisp[6]) {
                    if((l.quantNdisp[6]-notas.getQuantNotas2())>0){
                        s2= (int) (vlsaque/2);
                        vlsaque= vlsaque%2;   //atualizar o saldo, para ir pra próxima nota
                        System.out.print(s2+" R$2.\n");
                        l.quantNdisp[6] = l.quantNdisp[6] - s2; //atualizar o valor de notas disponíveis
                    }
                }else {
                    s2= l.quantNdisp[6];  //valor de saque seja compatível  com o valor de n dispo
                    vlsaque= vlsaque-(s2*2);   //atualizar o saldo, para ir pra próxima nota
                    System.out.print(s2+" R$2.\n");
                    l.quantNdisp[6] = 0; //atualizar o valor de notas disponíveis
                }

//                                                        MOEDAS

                if (((int) (vlsaque/1.00)) <= l.quantMdisp[0]) {
                    if((l.quantMdisp[0]-notas.getQuantMoeda1())>0){
                        m1= (int) (vlsaque/1.00);
                        vlsaque= vlsaque%1.00;   //atualizar o saldo, para ir pra próxima nota
                        System.out.print(m1+" R$1,00.\n");
                        l.quantMdisp[0] = l.quantMdisp[0] - m1; //atualizar o valor de notas disponíveis
                    }
                }else {
                    m1= l.quantMdisp[0];  //valor de saque seja compatível  com o valor de n dispo
                    vlsaque= vlsaque-(m1*1.00);   //atualizar o saldo, para ir pra próxima nota
                    System.out.print(m1+" R$1,00.\n");
                    l.quantMdisp[0] = 0; //atualizar o valor de notas disponíveis
                }

                if (((int) (vlsaque/0.50)) <= l.quantMdisp[1]) {
                    if((l.quantMdisp[1]-notas.getQuantMoeda50())>0){
                        m50= (int) (vlsaque/0.50);
                        vlsaque= vlsaque%0.50;   //atualizar o saldo, para ir pra próxima nota
                        System.out.print(m50+" R$0,50.\n");
                        l.quantMdisp[1] = l.quantMdisp[1] - m50; //atualizar o valor de notas disponíveis
                    }
                }else {
                    m50= l.quantMdisp[1];  //valor de saque seja compatível  com o valor de n dispo
                    vlsaque= vlsaque-(m50*0.50);   //atualizar o saldo, para ir pra próxima nota
                    System.out.print(m50+" R$0,50.\n");
                    l.quantMdisp[1] = 0; //atualizar o valor de notas disponíveis
                }

                if (((int) (vlsaque/0.25)) <= l.quantMdisp[2]) {
                    if((l.quantMdisp[2]-notas.getQuantMoeda25())>0){
                        m25= (int) (vlsaque/0.25);
                        vlsaque= vlsaque%0.25;   //atualizar o saldo, para ir pra próxima nota
                        System.out.print(m25+" R$0,25.\n");
                        l.quantMdisp[2] = l.quantMdisp[2] - m25; //atualizar o valor de notas disponíveis
                    }
                }else {
                    m25= l.quantMdisp[2];  //valor de saque seja compatível  com o valor de n dispo
                    vlsaque= vlsaque-(m25*0.25);   //atualizar o saldo, para ir pra próxima nota
                    System.out.print(m25+" R$0,25.\n");
                    l.quantMdisp[2] = 0; //atualizar o valor de notas disponíveis
                }

                if (((int) (vlsaque/0.10)) <= l.quantMdisp[3]) {
                    if((l.quantMdisp[3]-notas.getQuantMoeda10())>0){
                        m10= (int) (vlsaque/0.10);
                        vlsaque= vlsaque%0.10;   //atualizar o saldo, para ir pra próxima nota
                        System.out.print(m10+" R$0,10.\n");
                        l.quantMdisp[3] = l.quantMdisp[3] - m10; //atualizar o valor de notas disponíveis
                    }
                }else {
                    m10= l.quantMdisp[3];  //valor de saque seja compatível  com o valor de n dispo
                    vlsaque= vlsaque-(m10*0.10);   //atualizar o saldo, para ir pra próxima nota
                    System.out.print(m10+" R$0,10.\n");
                    l.quantMdisp[3] = 0; //atualizar o valor de notas disponíveis
                }

                if (((int) (vlsaque/0.05)) <= l.quantMdisp[4]) {
                    if((l.quantMdisp[4]-notas.getQuantMoeda5())>0){
                        m5= (int) (vlsaque/0.05);
                        vlsaque= vlsaque%0.05;   //atualizar o saldo, para ir pra próxima nota
                        System.out.print(m5+" R$0,05.\n");
                        l.quantMdisp[4] = l.quantMdisp[4] - m5; //atualizar o valor de notas disponíveis
                    }
                }else {
                    m5= l.quantMdisp[4];  //valor de saque seja compatível  com o valor de n dispo
                    vlsaque= vlsaque-(m5*0.05);   //atualizar o saldo, para ir pra próxima nota
                    System.out.print(m5+" R$0,05.\n");
                    l.quantMdisp[4] = 0; //atualizar o valor de notas disponíveis
                }

                if (((int) (vlsaque/0.01)) <= l.quantMdisp[5]) {
                    if((l.quantMdisp[5]-notas.getQuantMoeda01())>0){
                        m01= (int) (vlsaque/0.01);
                        vlsaque= vlsaque%0.01;   //atualizar o saldo, para ir pra próxima nota
                        System.out.print(m01+" R$0,01.\n");
                        l.quantMdisp[5] = l.quantMdisp[5] - m01; //atualizar o valor de notas disponíveis
                        vlsaque=saqueIn;
                        this.saldo = this.saldo - vlsaque;
                        System.out.printf("Seu saldo é de R$" + this.saldo + "\n");
                    }
                }else {
                    System.out.print("\nNão há número de cédulas compativel com o seu saque!\n" +
                            "Entre em contato com um oficial para inserir mais cédulas ou escolha outra valor para saque.\n\n");
                }
            } else {
                System.out.print("Saque de R$: " + vlsaque + " cancelado!\n");
                vlsaque = 0;
                this.saldo = this.saldo - vlsaque;
                System.out.printf("\nSeu saldo é de R$" + this.saldo + "\n");
                if (this.saldo<=0.0) {
                    System.out.print("Seu saldo é de R$0,00. Por favor realize um depósito para realizar outro saque.");
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
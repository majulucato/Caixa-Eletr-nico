public class Notas extends Leitura {
    public double notass;
    private int quantNotas200;
    private int quantNotas100;
    private int quantNotas50;
    private int quantNotas20;
    private int quantNotas10;
    private int quantNotas5;
    private int quantNotas2;
    private int quantMoeda1;
    private int quantMoeda50;
    private int quantMoeda25;
    private int quantMoeda10;
    private int quantMoeda5;
    private int quantMoeda01;
   public int getQuantNotas200() {
        return quantNotas200;
    }

    public int getQuantNotas100() {
        return quantNotas100;
    }

    public int getQuantNotas50() {
        return quantNotas50;
    }

    public int getQuantNotas20() {
        return quantNotas20;
    }

    public int getQuantNotas10() {
        return quantNotas10;
    }

    public int getQuantNotas5() {
        return quantNotas5;
    }

    public int getQuantNotas2() {return quantNotas2;}

    public int getQuantMoeda1() {
        return quantMoeda1;
    }

    public int getQuantMoeda50() {
        return quantMoeda50;
    }

    public int getQuantMoeda25() {
        return quantMoeda25;
    }

    public int getQuantMoeda10() {
        return quantMoeda10;
    }

    public int getQuantMoeda5() {
        return quantMoeda5;
    }

    public int getQuantMoeda01() {
        return quantMoeda01;
    }

    public void menorQuantidadeNotas() {
        if(notass/200>0) {
            quantNotas200 = (int) (notass/200);
            notass=(notass-(quantNotas200*200));
        } else {
            quantNotas200=0;
        }

        if(notass/100>0){
            quantNotas100 = (int) (notass/100);
            notass=(notass-(quantNotas100*100));
        } else {quantNotas100=0;}

        if(notass/50>0) {
            quantNotas50 = (int) (notass/50);
            notass=(notass-(quantNotas50*50));}
        else {quantNotas50=0;}

        if(notass/20>0) {
            quantNotas20 = (int) (notass/20);
            notass=(notass-(quantNotas20*20));}
        else {quantNotas20=0;}

        if(notass/10>0) {
            quantNotas10= (int) (notass/10);
            notass=(notass-(quantNotas10*10));}
        else {quantNotas10=0;}

        if(notass/5>0) {
            quantNotas5= (int) (notass / 5);
            notass=(notass-(quantNotas5*5));}
        else {quantNotas5=0;}

        if(notass/2>0) {
            quantNotas2= (int) (notass / 2);
            notass=(notass-(quantNotas2*2));}
        else {quantNotas2=0;}

        if(notass>0) {
            quantMoeda1= (int) (notass);
            notass=(notass-(quantMoeda1));}
        else {quantMoeda1=0;}

        if(notass/0.50>0) {
            quantMoeda50= (int) (notass / 0.50);
            notass=(notass-(quantMoeda50*0.50));}
        else {quantMoeda50=0;}

        if(notass/0.25>0) {
            quantMoeda25= (int) (notass / 0.25);
            notass=(notass-(quantMoeda25*0.25));}
        else {quantMoeda25=0;}

        if(notass/0.10>0) {
            quantMoeda10= (int) (notass / 0.10);
            notass=(notass-(quantMoeda10*0.10));}
        else{quantMoeda10=0;}

        if(notass/0.05>0) {
            quantMoeda5= (int) (notass / 0.05);
            notass=(notass-(quantMoeda5*0.05));}
        else {quantMoeda5=0;}

        if(notass/0.01>0) {
            quantMoeda01= (int) (notass / 0.01);
            notass=(notass-(quantMoeda01*0.01));}
        else {quantMoeda01=0;}
    }
}
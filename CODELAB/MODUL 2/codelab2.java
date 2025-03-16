import java.util.Scanner;

public class codelab2{
    public static void main(String[] args){
        Scanner winput = new Scanner(System.in);
        RekeningBank[] rekening = new RekeningBank[2];
        
        rekening[0] = new RekeningBank();
        rekening[0].nomerRekening = "202420370110493";
        rekening[0].namaPemilik = "Firman Maulana Firdauz";
        rekening[0].Saldo = 2000000;

        rekening[1] = new RekeningBank();
        rekening[1].nomerRekening = "202410370110456";
        rekening[1].namaPemilik = "Hamdan Julfa";
        rekening[1].Saldo = 10000;

        rekening[0].tampilkanInfo();
        System.err.println("\n\n");
        rekening[1].tampilkanInfo();

        System.out.println("\n\nrek 1 : "+rekening[0].namaPemilik+"\nrek 2 :" + rekening[1].namaPemilik+"\n\n----------------\npilih: ");
        int reknya = winput.nextInt();
        winput.nextLine();
        reknya -= 1;
 
        System.out.println("\n\n1. Setor tunai\n2. Tarik Tunai\n\n----------------\npilih: ");
        int pilihan = winput.nextInt();
        winput.nextLine();
        double Jumlah;
        switch(pilihan){
            case 1:
                System.out.println("Masukan jumlah: ");
                Jumlah = winput.nextDouble();
                winput.nextLine();
                rekening[reknya].setorUang(Jumlah);
                break;

            case 2:
                System.out.println("Masukan jumlah: ");
                Jumlah = winput.nextDouble();
                winput.nextLine();
                rekening[reknya].tarikUang(Jumlah);
                break;
        }
        
        winput.close();
        rekening[0].tampilkanInfo();
        System.err.println("\n\n");
        rekening[1].tampilkanInfo();

    }
}


class RekeningBank{
    String nomerRekening;
    String namaPemilik;
    public double Saldo;

    void tampilkanInfo(){
        System.out.println("nomer rekening: "+nomerRekening);
        System.out.println("Dengan atas nama Pemilik: "+namaPemilik);
        System.out.println("saldo: "+Saldo);
    }
    void setorUang(double jumlah){
        Saldo+=jumlah;
    }

    void tarikUang(double jumlah){
        Saldo-=jumlah;
    }


}
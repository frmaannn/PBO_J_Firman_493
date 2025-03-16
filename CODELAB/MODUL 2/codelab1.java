public class codelab1 {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan("Kucing", "Vivipar", "Nyann~~");
        Hewan hewan2 = new Hewan("Anjing", "Vivipar", "Woof-Woof!!");
        
        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
    }
}
record Hewan(String nama, String jenis, String suara) {
    public void tampilkanInfo() {
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
        System.out.println("Suara : " + suara);
        System.out.println();
    }
}
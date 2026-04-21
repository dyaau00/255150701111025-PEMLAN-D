package latihanInterface;
public class Hewan implements MakhlukHidup, Identitas {
    private String nama;
    private int umur;  
    
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    @Override
    public void makan() {
        System.out.println("Makan pakai mulut langsung");}

    @Override
    public void berjalan() {
        System.out.println("Jalan pakai 4 kaki");}

    @Override
    public void bersuara() {
        System.out.println("Suaranya rawrrr!");}

    @Override
    public void tampilkanNama() {
    System.out.println("Saya hewan: " + this.nama);}

    @Override
    public void tampilkanUmur() {
    System.out.println("Umur saya: " + this.umur + " tahun");}
}
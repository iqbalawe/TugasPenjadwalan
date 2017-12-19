package tugaspenjadwalan;

import java.util.*;

public class TugasPenjadwalan {
    
    private static ArrayList<Perjanjianku> data = new ArrayList();

    public static void main(String[] args) {
        
        DataOperant dataOperan = new DataOperant();
        int menu;
        
        System.out.println("KELOMPOK WAHID!!!");
        System.out.println();
        System.out.println("IQBAL AJIE WAHYUDIN");
        System.out.println("KUATI SEPTIANI");
        System.out.println("M.RIFKI CHAIRIL");
        System.out.println();
        System.out.println("Program Perjanjian");
        System.out.println("Program untuk menampilkan, merubah, mencari, menghapus perjanjian");
        System.out.println();
        System.out.println("~ SELAMAT MENCOBA ~");
        System.out.println();
        
        do{
            System.out.println("=============================");
            System.out.println("|\tMenu Perjanjian     |");
            System.out.println("=============================");
            System.out.println("|1. Buat Perjanjian         |");
            System.out.println("|2. Cari Perjanjian         |");
            System.out.println("|3. Melihat Semua Perjanjian|");
            System.out.println("|4. Menghapus Perjanjian    |");
            System.out.println("|5. Update Perjanjian       |");
            System.out.println("|6. Keluar                  |");
            System.out.println("=============================");
            System.out.print("Pilih menu : ");
            Scanner in = new Scanner(System.in);
            menu = Integer.valueOf(in.nextLine());
            
            switch (menu) {
                case 1: //Create
                    System.out.print("Nama Kegiatan : ");
                    String nama = in.nextLine();
                    System.out.print("Tanggal : ");
                    int tanggal = in.nextInt();
                    System.out.print("Bulan : ");
                    int bulan = in.nextInt();
                    System.out.print("Tahun : ");
                    int tahun = in.nextInt();
                    dataOperan.insertData(nama, tanggal, bulan, tahun);
                    break;
                    
                case 2: //Search
                    System.out.print("Search By ID : ");
                    Scanner search = new Scanner(System.in);
                    int searchById = search.nextInt();
                    dataOperan.findById(searchById);
                    break;
                    
                case 3: //Read
                    System.out.println();
                    System.out.println("Daftar Jadwal Perjanjian : ");
                    dataOperan.getAll();
                    break;
                    
                case 4: //Delete
                    System.out.print("Masukkan ID yang ingin dihapus : ");
                    Scanner delete = new Scanner(System.in);
                    int deleteById = delete.nextInt();
                    dataOperan.removeById(deleteById);
                    break;
            }
        } while(menu != 6);
    }
    
}

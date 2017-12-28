package tugaspenjadwalan;

import java.util.*;

public class TugasPenjadwalan {
    
    //Pendeklarasian ArrayList
    private static ArrayList<Perjanjianku> data = new ArrayList();

    public static void main(String[] args) {
        
        //Deklarasi dataOperan
        DataOperant dataOperan = new DataOperant();
        
        //Deklarasi menu
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
        System.out.println("~ Good Luck :) ~");
        System.out.println();
        
        //input data otomatis
        dataOperan.insertData("Kuliah", 4, 10, 2017);
        dataOperan.insertData("Rapat Paripurna", 10, 11, 2017);
        dataOperan.insertData("Belajar Bareng", 10, 11, 2017);
        dataOperan.insertData("Makan", 20, 10, 2017);
        
        do{
            System.out.println("=============================");
            System.out.println("|\tSchedule Menu       |");
            System.out.println("=============================");
            System.out.println("|1. Create Schedule         |");
            System.out.println("|2. Search Schedule         |");
            System.out.println("|3. Show All Schedule       |");
            System.out.println("|4. Delete Schedule         |");
            System.out.println("|5. Update Schedule         |");
            System.out.println("|6. Exit                    |");
            System.out.println("=============================");
            System.out.print("Choose menu : ");
            Scanner in = new Scanner(System.in);
            menu = Integer.valueOf(in.nextLine());
            
            switch (menu) {
                case 1: //Create
                    System.out.print("Insert the name : "); //Keluaran text nama kegiatan
                    String nama = in.nextLine(); //Nama akan disimpan di variabel in yang tipe datanya String
                    System.out.print("Date : "); //Keluaran text tanggal kegiatan
                    int tanggal = in.nextInt(); //Tanggal kegiatan akan disimpan di variabel in yang tipe datanya Integer
                    System.out.print("Month : "); //Keluaran text bulan kegiatan
                    int bulan = in.nextInt(); //Bulan kegiatan akan disimpan di variabel in yang tipe datanya Integer
                    System.out.print("Year : ");//Keluaran text tahun kegiatan
                    int tahun = in.nextInt(); //Tahun kegiatan akan disimpan di variabel in yang tipe datanya Integer
                    dataOperan.insertData(nama, tanggal, bulan, tahun); //Semua data yang ditulis tadi akan disimpan di dataoperan
                    System.out.print("Success !!"); //Pemberitahuan jika data berhasil dibuat
                    System.out.println();
                    System.out.println();
                    break;
                    
                case 2: //Search
                    /*System.out.print("Search By ID : ");
                    Scanner search = new Scanner(System.in);
                    int searchById = search.nextInt();
                    dataOperan.findById(searchById);*/
                    
                    //dengan format bulan-tanggal
                    Scanner inStart = new Scanner(System.in); //Deklarasi inStart sebagai variabel inputan baru
                    Scanner inEnd = new Scanner(System.in); //Deklarasi inEnd sebagai variabel inputan baru
                    System.out.print("Please enter the start month : "); //Keluaran untuk memasukkan bulan yang ingin dimulai
                    int start = inStart.nextInt(); //Start yang di input akan dimasukkan ke inStart
                    System.out.print("Please enter the end month : "); //Keluaran untuk memasukkan batas bulan
                    int end = inEnd.nextInt(); //Start yang di input akan dimasukkan ke inEnd
                    System.out.println();
                    dataOperan.searchByMonth(start, end); //Semua data yang ditulis tadi akan disimpan di dataoperan
                    System.out.println();
                    break;
                    
                case 3: //Read
                    System.out.println();
                    System.out.println("SCHEDULE LIST : ");
                    System.out.println("\n################################################");
                    dataOperan.getAll(); //Menampilkan semua yang ada di fungsi getAll
                    System.out.println("################################################");
                    System.out.println();
                    break;
                    
                case 4: //Delete
                    System.out.print("Please enter ID for delete : "); //Keluaran untuk memasukkan ID yang ingin dihapus
                    Scanner delete = new Scanner(System.in); //Deklarasi delete sebagai inputan baru
                    int deleteById = delete.nextInt(); //deleteById yang di input akan disimpan di variabel delete
                    dataOperan.removeById(deleteById); //Menampilkan semua data di dataOperan yang akan di eksekusi di dalam deleteById
                    System.out.print("Delete Success !!");
                    System.out.println();
                    System.out.println();
                    break;
                    
                case 5: //Update
                    System.out.print("Please enter ID for update : "); //Keluaran untuk input ID
                    Scanner up = new Scanner(System.in); //Deklarasi variabel up  sebagai inputan baru
                    int upById = up.nextInt(); //upById yang di input akan disimpan di variabel up
                    System.out.print("Insert the name : "); //Keluaran untuk input nama kegiatan yang baru
                    String namaUpdate = in.nextLine(); //namaUpdate akan disimpan di variabel in yang tipe datanya String
                    System.out.print("Date : "); //Keluaran untuk input tanggal kegiatan yang baru
                    int tanggalUpdate = in.nextInt(); //tanggalUpdate akan disimpan di variabel in yang tipe datanya Integer
                    System.out.print("Month : "); //Keluaran untuk input bulan kegiatan yang baru
                    int bulanUpdate = in.nextInt(); //bulanUpdate akan disimpan di variabel in yang tipe datanya Integer
                    System.out.print("Year : "); //Keluaran untuk input tahun kegiatan yang baru
                    int tahunUpdate = in.nextInt(); //tahunUpdate akan disimpan di variabel in yang tipe datanya Integer
                    dataOperan.updateById(upById, //Parameter pertama untuk mencari ID
                    new Perjanjianku(upById, namaUpdate, tanggalUpdate, bulanUpdate, tahunUpdate)); //Parameter kedua untuk Update data baru
                    System.out.println("Update Success !!");
                    System.out.println();
                    System.out.println();
                    break;
            }
        } while(menu != 6); //exit
    }
    
}

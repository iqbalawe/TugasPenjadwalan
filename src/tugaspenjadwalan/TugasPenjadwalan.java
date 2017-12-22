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
        System.out.println("~ Good Luck :) ~");
        System.out.println();
        
        /*dataOperan.insertData("a", 9, 2, 0);
        dataOperan.insertData("b", 11, 10, 0);
        dataOperan.insertData("c", 12, 2, 0);
        dataOperan.insertData("d", 12, 12, 0);*/
        
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
                    System.out.print("Insert the name : ");
                    String nama = in.nextLine();
                    System.out.print("Date : ");
                    int tanggal = in.nextInt();
                    System.out.print("Month : ");
                    int bulan = in.nextInt();
                    System.out.print("Year : ");
                    int tahun = in.nextInt();
                    dataOperan.insertData(nama, tanggal, bulan, tahun);
                    break;
                    
                case 2: //Search
                    //System.out.print("Search By ID : ");
                    //Scanner search = new Scanner(System.in);
                    //int searchById = search.nextInt();
                    //dataOperan.findById(searchById);
                    
                    //bulan-tanggal
                    Scanner inStart = new Scanner(System.in);
                    Scanner inEnd = new Scanner(System.in);
                    System.out.print("Please enter the start month : ");
                    int start = inStart.nextInt();
                    System.out.print("Please enter the end month : ");
                    int end = inEnd.nextInt();
                    dataOperan.searchByMonth(start, end);
                    break;
                    
                case 3: //Read
                    System.out.println();
                    System.out.println("Schedule List : ");
                    System.out.println("################################################");
                    dataOperan.getAll();
                    System.out.println("################################################");
                    System.out.println();
                    break;
                    
                case 4: //Delete
                    System.out.print("Please insert ID for remove : ");
                    Scanner delete = new Scanner(System.in);
                    int deleteById = delete.nextInt();
                    dataOperan.removeById(deleteById);
                    break;
                    
                case 5: //Update
                    System.out.println("Please Insert ID for update : ");
                    Scanner up = new Scanner(System.in);
                    int upById = up.nextInt();
                    System.out.print("Insert the name : ");
                    String namaUpdate = in.nextLine();
                    System.out.print("Date : ");
                    int tanggalUpdate = in.nextInt();
                    System.out.print("Month : ");
                    int bulanUpdate = in.nextInt();
                    System.out.print("Year : ");
                    int tahunUpdate = in.nextInt();
                    dataOperan.updateById(upById, 
                    new Perjanjianku(upById, namaUpdate, tanggalUpdate, bulanUpdate, tahunUpdate));
                    break;
            }
        } while(menu != 6);
    }
    
}

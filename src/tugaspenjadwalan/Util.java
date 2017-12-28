//Bagian ini Kuati yang jelasin

package tugaspenjadwalan;

import java.util.Date;

public class Util { //Utility untuk setting tanggal, bulan, tahun berdasarkan kalender
    public static boolean dateRanger(Date start, Date end) { //Method untuk membandingkan bulan yang pertama dan bulan yang terakhir
        Date startTemp = new Date(start.getYear(), start.getMonth(), start.getDay()); //Deklarasi startTemp sebagai bulan yang diinput pertama
        Date endTemp = new Date(end.getYear(), end.getMonth(), end.getDay()); ////Deklarasi endTemp sebagai bulan yang diinput terakhir
        return startTemp.getTime() <= endTemp.getTime(); //Pengembalian nilai startTemp dan endTemp
    }
}

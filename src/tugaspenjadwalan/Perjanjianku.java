//Bagian ini Rifki yang Jelasin

package tugaspenjadwalan;

import java.util.Date;

public class Perjanjianku implements Comparable<Perjanjianku>{ //Implementasi Perbandingan Semua Data
    private int id; //Deklarasi id
    private String kegiatan; //Deklarasi Kegiatan
    private int tanggal; //Deklarasi tanggal
    private int bulan; //Deklarasi bulan
    private int tahun; //Deklarasi tahun
    
    public Perjanjianku(int id, String kegiatan, int tanggal, int bulan, int tahun) {
        this.id = id; //Implementasi id
        this.kegiatan = kegiatan; //Implementasi kegiatan
        this.tanggal = tanggal; //Implementasi tanggal
        this.bulan = bulan; //Implementasi bulan
        this.tahun = tahun; //Implementasi tahun
    }
    
    public int getId() { //Method  untuk mengambil nilai Id
        return id; //Mengembalikan nilai id
    }
    
    public String getKegiatan() { //Method  untuk mengambil nilai Kegiatan
        return kegiatan; //Mengembalikan nilai kegiatan
    }
    
    public int getTanggal() { //Method  untuk mengambil nilai Tanggal
        return tanggal; //Mengembalikan nilai tanggal
    }
    
    public int getBulan() { //Method  untuk mengambil nilai Bulan
        return bulan; //Mengembalikan nilai bulan
    }
    
    public int getTahun() { //Method  untuk mengambil nilai Tahun
        return tahun; //Mengembalikan nilai tahun
    }
    
    public void display() {
        System.out.println("Kegiatan : " + kegiatan);
        System.out.println("Kapan Dilaksanakannya?" + tanggal + bulan + tahun);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKegiatan(String kegiatan) {
        this.kegiatan = kegiatan;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }

    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
    
    
    @Override
    public int compareTo(Perjanjianku o) {
        Date in = new Date(getTahun(), getBulan(), getTanggal());
        Date out = new Date(o.getTahun(), o.getBulan(), o.getTanggal());
        if(in.compareTo(out) < 0) {
            return -1;
        } else if(in.compareTo(out) > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
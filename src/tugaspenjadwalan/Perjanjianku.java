package tugaspenjadwalan;

import java.util.Date;

public class Perjanjianku implements Comparable<Perjanjianku>{ //Implementasi Perbandingan Semua Data
    private int id;
    private String kegiatan;
    private int tanggal;
    private int bulan;
    private int tahun;
    
    public Perjanjianku(int id, String kegiatan, int tanggal, int bulan, int tahun) {
        this.id = id;
        this.kegiatan = kegiatan;
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }
    
    public int getId() {
        return id;
    }
    
    public String getKegiatan() {
        return kegiatan;
    }
    
    public int getTanggal() {
        return tanggal;
    }
    
    public int getBulan() {
        return bulan;
    }
    
    public int getTahun() {
        return tahun;
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
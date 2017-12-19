package tugaspenjadwalan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class DataOperant {
    
    private ArrayList<Perjanjianku> datas;
    
    public DataOperant() {
        datas = new ArrayList<>();
    }
    
    public void insertData(String nama, int tanggal, int bulan, int tahun) {
        datas.add(new Perjanjianku(datas.size()+1, nama, tanggal, bulan, tahun));
    }
    
    public void getAll() { //Menyimpan Semua Data (Tanggal, Bulan, Tahun)
        Collections.sort(datas);
        for(Perjanjianku Perjanjianku: datas) {
            System.out.println();
            System.out.println(
                    "ID: " + Perjanjianku.getId() +
                    "\nKegiatan : "+Perjanjianku.getKegiatan()+
                    "\nDilaksanakan pada tanggal : "+Perjanjianku.getTanggal()+
                    "-"+Perjanjianku.getBulan()+"-"+Perjanjianku.getTahun());
            System.out.println();
        }
    }
    
    public void findById(int id) { //Mencari Berdasarkan ID
        int i = 0;
        for(Perjanjianku Perjanjianku: datas) {
            if(datas.get(i).getId() == id) {
                System.out.println();
                System.out.println(
                        "ID: " + datas.get(i).getId() +
                        "\nKegiatan : "+Perjanjianku.getKegiatan()+
                    "\nDilaksanakan pada tanggal : "+Perjanjianku.getTanggal()+
                    "-"+Perjanjianku.getBulan()+"-"+Perjanjianku.getTahun());
            System.out.println();
            break;
            }
            i++;
        }
    }
    
    public void removeById(int id) { //Menghapus Jadwal berdasarkan ID
        int i = 0;
        for(Perjanjianku Perjanjianku: datas) {
            if(datas.get(i).getId() == id) {
                datas.remove(id);
                break;
            }
            i++;
        }
    }
    
    public void updateById(int id, Perjanjianku newData) { //Update Jadwal berdasarkan ID
        int i = 0;
        for(Perjanjianku Perjanjianku: datas) {
            if(Perjanjianku.getId() == id) {
                Perjanjianku.setId(id);
                Perjanjianku.setKegiatan(newData.getKegiatan());
                Perjanjianku.setTanggal(newData.getTanggal());
                Perjanjianku.setBulan(newData.getBulan());
                Perjanjianku.setTahun(newData.getTahun());
                break;
            }
            i++;
        }
    }
    
}

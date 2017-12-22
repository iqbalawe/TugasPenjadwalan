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
            show(Perjanjianku);
            System.out.println();
        }
    }
    
    public void findById(int id) { //Mencari Berdasarkan ID
        for(Perjanjianku Perjanjianku: datas) {
            if(Perjanjianku.getId() == id) {
                System.out.println();
                show(Perjanjianku);
                System.out.println();
                break;
            }
        }
    }
    
    public void removeById(int id) { //Menghapus Jadwal berdasarkan ID
        int i = 0;
        for(Perjanjianku Perjanjianku: datas) {
            if(datas.get(i).getId() == id) {
                datas.remove(i);
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
    
    public void search(String start, String end) {
        Collections.sort(datas);
        for (Perjanjianku p: datas) {
            int inDb = p.getBulan() + p.getTanggal();
            
            int startMonth = Integer.valueOf(start.split("-")[0]);
            int startDate = Integer.valueOf(start.split("-")[1]);
            
            int endMonth = Integer.valueOf(end.split("-")[0]);
            int endDate = Integer.valueOf(end.split("-")[1]);
            
            int oStart = startMonth+startDate; //override
            int oEnd = endMonth+endDate; //overidde
            
            if (inDb == oStart) {
                show(p);
            } else if (inDb == oEnd) {
                show(p);
            } else {
                if (oStart > inDb || oEnd < inDb) {
                    show(p);
                }
            }
        }
    }
    
    public void searchByMonth(int start, int end) {
        Collections.sort(datas);
        for (Perjanjianku p: datas) {
            int inDb = p.getBulan();
            
            if (inDb == start) {
                show(p);
                continue;
            } else if (inDb == end) {
                show(p);
                continue;
            }
            
            if (start > inDb || inDb < end) {
                show(p);
            }
        }
    }
    
    private void show(Perjanjianku p) {
        System.out.println(
                "ID: " + p.getId() +
                "\nKegiatan : "+p.getKegiatan()+
                "\nDilaksanakan pada tanggal : "+p.getTanggal()+
                "-"+p.getBulan()+"-"+p.getTahun()
        );
    }
    
}

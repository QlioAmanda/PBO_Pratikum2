import java.util.ArrayList;

public class Jurusan {
    private String namaJurusan;
    private ArrayList<MataKuliah> mataKuliahList;

    public Jurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
        this.mataKuliahList = new ArrayList<>();
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }

    public void tambahMataKuliah(MataKuliah mk) {
        mataKuliahList.add(mk);
    }

    public ArrayList<MataKuliah> getMataKuliahList() {
        return mataKuliahList;
    }
}

package id.ac.polban.model;

public class MataKuliah {
    private String id;
    private String nama;
    private int sks;
    private String dosen;

    // static field sebagai counter jumlah mata kuliah
    private static int jumlahMataKuliah = 0;

    public MataKuliah(String id, String nama, int sks, String dosen) {
        this.id = id;
        this.nama = nama;
        this.sks = sks;
        this.dosen = dosen;
        jumlahMataKuliah++;
    }

    public String getId() { return id; }
    public String getNama() { return nama; }
    public int getSks() { return sks; }
    public String getDosen() { return dosen; }

    // Static method untuk mengakses jumlah mata kuliah
    public static int getJumlahMataKuliah() {
        return jumlahMataKuliah;
    }
}

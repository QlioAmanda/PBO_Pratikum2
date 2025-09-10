package id.ac.polban.model;

public class Mahasiswa {
    private String nama;
    private String nim;
    private Jurusan jurusan;

    // static counter jumlah mahasiswa
    private static int jumlahMahasiswa = 0;

    public Mahasiswa(String nama, String nim, Jurusan jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        jumlahMahasiswa++;
    }

    public String getNama() { return nama; }
    public String getNim() { return nim; }
    public Jurusan getJurusan() { return jurusan; }

    public static int getJumlahMahasiswa() {
        return jumlahMahasiswa;
    }
}

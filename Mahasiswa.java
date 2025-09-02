public class Mahasiswa {
    private String nama;
    private String nim;
    private Jurusan jurusan;

    public Mahasiswa(String nama, String nim, Jurusan jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public Jurusan getJurusan() {
        return jurusan;
    }
}

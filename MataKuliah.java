public class MataKuliah {
    private String id;
    private String nama;
    private int sks;
    private String dosen;

    public MataKuliah(String id, String nama, int sks, String dosen) {
        this.id = id;
        this.nama = nama;
        this.sks = sks;
        this.dosen = dosen;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    public String getDosen() {
        return dosen;
    }
}

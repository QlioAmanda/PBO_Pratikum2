import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Gunakan try-with-resources agar Scanner otomatis ditutup
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Jurusan> daftarJurusan = new ArrayList<>();

            // Tambahkan jurusan + mata kuliah
            Jurusan informatika = new Jurusan("Teknik Informatika");
            informatika.tambahMataKuliah(new MataKuliah("IF101", "Pemrograman Dasar", 3, "Budi Santoso"));
            informatika.tambahMataKuliah(new MataKuliah("IF102", "Struktur Data", 3, "Siti Aminah"));
            informatika.tambahMataKuliah(new MataKuliah("IF103", "Basis Data", 3, "Dewi Lestari"));

            Jurusan mesin = new Jurusan("Teknik Mesin");
            mesin.tambahMataKuliah(new MataKuliah("MS201", "Thermodinamika", 3, "Agus Raharjo"));
            mesin.tambahMataKuliah(new MataKuliah("MS202", "Mekanika Fluida", 3, "Rina Kurnia"));
            mesin.tambahMataKuliah(new MataKuliah("MS203", "Gambar Teknik Mesin", 2, "Eko Prabowo"));

            Jurusan sipil = new Jurusan("Teknik Sipil");
            sipil.tambahMataKuliah(new MataKuliah("SP301", "Beton Bertulang", 3, "Dian Susanto"));
            sipil.tambahMataKuliah(new MataKuliah("SP302", "Mekanika Tanah", 3, "Lina Marlina"));
            sipil.tambahMataKuliah(new MataKuliah("SP303", "Struktur Baja", 3, "Andi Nugroho"));

            Jurusan elektro = new Jurusan("Teknik Elektronika");
            elektro.tambahMataKuliah(new MataKuliah("EL401", "Rangkaian Listrik", 3, "Heri Wibowo"));
            elektro.tambahMataKuliah(new MataKuliah("EL402", "Sistem Digital", 3, "Tono Hidayat"));
            elektro.tambahMataKuliah(new MataKuliah("EL403", "Elektronika Analog", 3, "Sri Wahyuni"));

            Jurusan energi = new Jurusan("Teknik Energi");
            energi.tambahMataKuliah(new MataKuliah("EN501", "Energi Terbarukan", 3, "Ahmad Fadli"));
            energi.tambahMataKuliah(new MataKuliah("EN502", "Konversi Energi", 3, "Nur Aisyah"));
            energi.tambahMataKuliah(new MataKuliah("EN503", "Teknik Panas Bumi", 3, "Ridwan Saputra"));

            // Tambah ke daftar jurusan
            daftarJurusan.add(informatika);
            daftarJurusan.add(mesin);
            daftarJurusan.add(sipil);
            daftarJurusan.add(elektro);
            daftarJurusan.add(energi);

            // Pilih jurusan
            System.out.println("===== Sistem KRS Mahasiswa =====");
            System.out.println("Pilih Jurusan:");
            for (int i = 0; i < daftarJurusan.size(); i++) {
                System.out.println((i + 1) + ". " + daftarJurusan.get(i).getNamaJurusan());
            }

            System.out.print("Masukkan pilihan jurusan: ");
            int pilihan = sc.nextInt();
            sc.nextLine(); // buang newline
            Jurusan jurusanDipilih = daftarJurusan.get(pilihan - 1);

            // Input data mahasiswa
            System.out.print("Masukkan Nama: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = sc.nextLine();

            Mahasiswa mhs = new Mahasiswa(nama, nim, jurusanDipilih);

            // Tampilkan hasil
            System.out.println("\n=== Data Mahasiswa ===");
            System.out.println("Nama: " + mhs.getNama());
            System.out.println("NIM: " + mhs.getNim());
            System.out.println("Jurusan: " + mhs.getJurusan().getNamaJurusan());

            System.out.println("\nDaftar Mata Kuliah:");
            int totalSKS = 0;
            for (MataKuliah mk : mhs.getJurusan().getMataKuliahList()) {
                System.out.println("- " + mk.getId() + " | " + mk.getNama() +
                        " (" + mk.getSks() + " SKS) | Dosen: " + mk.getDosen());
                totalSKS += mk.getSks();
            }

            System.out.println("\nTotal SKS : " + totalSKS);
        }
    }
}

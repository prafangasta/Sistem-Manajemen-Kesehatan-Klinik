import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemManajemenKlinik implements PendapatanKlinik, FileManager {
    private List<Pasien> pasienList = new ArrayList<>();
    private List<Doctor> dokterList = new ArrayList<>();
    private List<Karyawan> karyawanList = new ArrayList<>();
    private List<JanjiTemu> janjiTemuList = new ArrayList<>();

    public void tambahKaryawan(Karyawan karyawan) {
        karyawanList.add(karyawan);
    }

    public void lihatSemuaKaryawan() {
        System.out.println("\n=== Semua Karyawan ===");
        for (Karyawan karyawan : karyawanList) {
            System.out.println("ID Karyawan: " + karyawan.getId());
            System.out.println("Nama Karyawan: " + karyawan.getNamaKaryawan());
            System.out.println("Jabatan: " + karyawan.getJabatan());
            System.out.println();
        }
    }

    public void tambahDokter(Doctor dokter) {
        dokterList.add(dokter);
    }

    public void inputDataPasien(Scanner scanner) {
        System.out.println("\n=== Input Data Pasien ===");
        System.out.print("Nama Pasien: ");
        String namaPasien = scanner.nextLine();
        System.out.print("Alamat Pasien: ");
        String alamatPasien = scanner.nextLine();
        System.out.print("Penyakit: ");
        String penyakit = scanner.nextLine();

        Pasien pasien = new Pasien("P" + (pasienList.size() + 1), namaPasien, alamatPasien, penyakit); // ID otomatis
        pasienList.add(pasien);
        System.out.println("Data pasien berhasil ditambahkan.");
    }

    public void lihatSemuaPasien() {
        System.out.println("\n=== Semua Pasien ===");
        for (Pasien pasien : pasienList) {
            System.out.println(pasien);
        }
    }

    public void lihatSemuaDokter() {
        System.out.println("\n=== Semua Dokter ===");
        for (Doctor dokter : dokterList) {
            dokter.tampilkanInfoDokter();
        }
    }

    public void pilihDokterUmum(Scanner scanner) {
        System.out.println("Memilih dokter umum...");
    }

    public void pilihDokterSpesialis(Scanner scanner) {
        System.out.println("Memilih dokter spesialis...");
    }

    @Override
    public void tampilkanPendapatan() {
        System.out.println("Pendapatan Klinik: Rp. 1000000");
    }

    @Override
    public void simpanData() {
    }

    @Override
    public void muatData() {
    }

    public List<Pasien> getPasienList() {
        return pasienList;
    }

    public List<Doctor> getDokterList() {
        return dokterList;
    }

    public List<Karyawan> getKaryawanList() {
        return karyawanList;
    }

    public void tambahJanjiTemu(JanjiTemu janjiTemu) {
        janjiTemuList.add(janjiTemu);
    }
}
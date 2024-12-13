public class JanjiTemu {
    private Pasien pasien;
    private Doctor dokter;
    private Karyawan karyawan;
    private String penyakit;

    public JanjiTemu(Pasien pasien, Doctor dokter, Karyawan karyawan, String penyakit) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.karyawan = karyawan;
        this.penyakit = penyakit;
    }

    public void tampilkanInfoJanjiTemu() {
        if (pasien != null && dokter != null && karyawan != null) {
            System.out.println("Pasien: " + pasien.getNamaPasien());
            System.out.println("Dokter: " + dokter.getNama());
            System.out.println("Penyakit: " + penyakit);
            System.out.println("Jadwal Praktek: " + dokter.getJadwalPraktek());
            System.out.println("Dijadwalkan oleh: " + karyawan.getNamaKaryawan());
        } else {
            System.out.println("Informasi pasien, dokter, atau karyawan belum lengkap.");
        }
    }
}
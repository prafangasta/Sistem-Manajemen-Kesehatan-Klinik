public class Pasien {
    private String idPasien;
    private String namaPasien;
    private String alamatPasien;
    private String penyakit;

    public Pasien(String idPasien, String namaPasien, String alamatPasien, String penyakit) {
        this.idPasien = idPasien;
        this.namaPasien = namaPasien;
        this.alamatPasien = alamatPasien;
        this.penyakit = penyakit;
    }

    public String getIdPasien() {
        return idPasien;
    }

    public String getNamaPasien() {
        return namaPasien;
    }

    public String getAlamatPasien() {
        return alamatPasien;
    }

    public String getPenyakit() {
        return penyakit;
    }

    @Override
    public String toString() {
        return "ID Pasien: " + idPasien + ", Nama: " + namaPasien + ", Penyakit: " + penyakit;
    }
}

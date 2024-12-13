public class Karyawan {
    private String id;
    private String namaKaryawan;
    private String jabatan;

    public Karyawan(String id, String namaKaryawan, String jabatan) {
        this.id = id;
        this.namaKaryawan = namaKaryawan;
        this.jabatan = jabatan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}

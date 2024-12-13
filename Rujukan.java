public class Rujukan {
    private String jenisPenyakit;
    private String spesialisasi;

    public Rujukan(String jenisPenyakit, String spesialisasi) {
        this.jenisPenyakit = jenisPenyakit;
        this.spesialisasi = spesialisasi;
    }

    public void cetakRujukan() {
        System.out.println("Rujukan untuk penyakit: " + jenisPenyakit);
        System.out.println("Ke Spesialis: " + spesialisasi);
    }
}

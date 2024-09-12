public class Anggota {
    private String idKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String id, String nama, int limitPinjaman) {
        this.idKTP = id;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int jumlah) {
        if (jumlahPinjaman + jumlah > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += jumlah;
        }
    }

    public void angsur(int jumlah) {
        int minimumAngsuran = jumlahPinjaman / 10;
        if (jumlah < minimumAngsuran) {
            System.out.println("Maaf, angsuran harus minimal 10% dari jumlah pinjaman.");
        } else if (jumlahPinjaman >= jumlah) {
            jumlahPinjaman -= jumlah;
            System.out.println("Jumlah pinjaman saat ini: " + jumlahPinjaman);
        } else {
            System.out.println("Jumlah angsuran melebihi jumlah pinjaman.");
        }
    }
}

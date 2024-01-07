/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sherise;

/**
 *
 * @author Lenovo
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PelaporanPelecehan {
    private String jenisPelecehan;
    private String deskripsiKejadian;
    private List<String> bukti;
    private String statusPelaporan;
    private String penggunaPelapor;
    private Date tanggalLaporan;
    private List<String> penerimaPemberitahuan;
    private Object daftarLaporanPelecehan;
    

    // Konstruktor
    public PelaporanPelecehan(String jenisPelecehan, String deskripsiKejadian, String penggunaPelapor, Date date) {
        this.jenisPelecehan = jenisPelecehan;
        this.deskripsiKejadian = deskripsiKejadian;
        this.bukti = new ArrayList<>();
        this.statusPelaporan = "Dikirim"; // Status awal pelaporan adalah "Dikirim"
        this.penggunaPelapor = penggunaPelapor;
        this.tanggalLaporan = new Date(); // Menginisialisasi tanggal laporan saat objek laporan dibuat
        this.penerimaPemberitahuan = new ArrayList<>();
    }

    // Metode Buat Laporan (masih ragu) member
public PelaporanPelecehan buatLaporan(String jenisPelecehan, String deskripsiKejadian, String penggunaPelapor, Date tanggalLaporan) {
    PelaporanPelecehan laporan = new PelaporanPelecehan(jenisPelecehan, deskripsiKejadian, penggunaPelapor, new Date());
    laporan.setStatusPelaporan("Diterima");
    System.out.println("Laporan pelecehan telah dibuat dan disimpan.");
    return laporan;
}


    // Metode Tinjau Laporan 
    public void tinjauLaporan(String status) {
        this.statusPelaporan = status;
        
    }

    // Metode Kirim Pemberitahuan Laporan member
    public void kirimPemberitahuanLaporan(String pesan) {
        penerimaPemberitahuan.add(pesan);
       
    }

    // Metode Tanggapi Permintaan Bantuan 
    public void tanggapiPermintaanBantuan(String status) {
    System.out.println("Tanggapan atas permintaan bantuan: " + status);
}
    // Metode Tambah Bukti
    public void tambahBukti(String bukti) {
        this.bukti.add(bukti);
    }

    public void setJenisPelecehan(String jenisPelecehan) {
        this.jenisPelecehan = jenisPelecehan;
    }

    public void setDeskripsiKejadian(String deskripsiKejadian) {
        this.deskripsiKejadian = deskripsiKejadian;
    }

    public void setBukti(List<String> bukti) {
        this.bukti = bukti;
    }

    public void setStatusPelaporan(String statusPelaporan) {
        this.statusPelaporan = statusPelaporan;
    }

    public void setPenggunaPelapor(String penggunaPelapor) {
        this.penggunaPelapor = penggunaPelapor;
    }

    public void setTanggalLaporan(Date tanggalLaporan) {
        this.tanggalLaporan = tanggalLaporan;
    }

    public void setPenerimaPemberitahuan(List<String> penerimaPemberitahuan) {
        this.penerimaPemberitahuan = penerimaPemberitahuan;
    }

    public void setDaftarLaporanPelecehan(Object daftarLaporanPelecehan) {
        this.daftarLaporanPelecehan = daftarLaporanPelecehan;
    }

    public String getJenisPelecehan() {
        return jenisPelecehan;
    }

    public String getDeskripsiKejadian() {
        return deskripsiKejadian;
    }

    public List<String> getBukti() {
        return bukti;
    }

    public String getStatusPelaporan() {
        return statusPelaporan;
    }

    public String getPenggunaPelapor() {
        return penggunaPelapor;
    }

    public Date getTanggalLaporan() {
        return tanggalLaporan;
    }

    public List<String> getPenerimaPemberitahuan() {
        return penerimaPemberitahuan;
    }

    public Object getDaftarLaporanPelecehan() {
        return daftarLaporanPelecehan;
    }
    
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sherise;

/**
 *
 * @author Lenovo
 */
public class Admin extends User {
    public Admin(String username, String email, String password, String phoneNumber, String status) {
        super(username, email, password, phoneNumber, status);
    }

    public void manageUsers() {
        System.out.println("Admin is managing users.");
    }

    public void terimaLaporan(User pelapor, String jenisLaporan, String deskripsiLaporan) {
        System.out.println("Laporan diterima dari " + pelapor.getUsername() + " - Jenis: " + jenisLaporan);
    }

    public void verifikasiLaporan(User pelapor, String jenisLaporan) {
        System.out.println("Laporan dari " + pelapor.getUsername() + " telah diverifikasi - Jenis: " + jenisLaporan);
    }

    public void kelolaDaftarPelapor() {
        System.out.println("Admin is managing the list of reporters.");
    }

    public void tindaklanjuti(User pelapor, String jenisLaporan) {
        System.out.println("Tindak lanjut laporan dari " + pelapor.getUsername() + " - Jenis: " + jenisLaporan);
    }

    public void hapusLaporan(User pelapor, String jenisLaporan) {
        System.out.println("Laporan dari " + pelapor.getUsername() + " telah dihapus - Jenis: " + jenisLaporan);
    }
    

    public void membuatKomunitas(String namaKomunitas, String deskripsiKomunitas, String kategoriKomunitas) {
        // Implementasi untuk membuat komunitas
        ForumKomunitas komunitas = new ForumKomunitas(namaKomunitas, deskripsiKomunitas, kategoriKomunitas, getUsername());
        // Simpan komunitas ke daftar komunitas (jika Anda memiliki daftar komunitas)
        // DaftarKomunitas.add(komunitas);

        System.out.println("Komunitas " + namaKomunitas + " berhasil dibuat oleh " + getUsername());
    }
    
    // yang belum: unggahlowongan, hapus lowongan, 
     
}


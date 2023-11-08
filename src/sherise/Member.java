/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
package sherise;
        
        
import java.util.ArrayList;
import java.util.List;

public class Member extends User{
    private List<ForumKomunitas> komunitasDiikuti;
    private List<KontenEdukasi> kontenDiakses;
    private boolean isLoggedIn; 

   public Member(String username, String email, String password, String phoneNumber, String status){
       super(username, email, password, phoneNumber, status);
       this.komunitasDiikuti = new ArrayList<>();
       this.kontenDiakses = new ArrayList<>();
   }

    public void registrasi() {
        // Implementasi untuk mendaftarkan pengguna baru.
        System.out.println("Registrasi berhasil untuk " + getUsername());
    }

    public void login() {
    if (this.email.equals(this.getEmail()) && this.password.equals(this.getPassword())) {
        this.setIsLoggedIn(true);
        System.out.println("Login as " + this.getUsername());
    } else {
        System.out.println("Login failed. Incorrect email or password.");
    }
}


     public void editProfile(String newUsername, String newEmail, String newPhoneNumber, String newPassword) {
        setUsername(newUsername);
        setEmail(newEmail);
        setPhoneNumber(newPhoneNumber);
        setPassword(newPassword);
        System.out.println("Profile updated successfully.");
    }

    public void ikutiForumKomunitas(ForumKomunitas komunitas) {
        komunitasDiikuti.add(komunitas);
        System.out.println("Anda sekarang mengikuti komunitas: " + komunitas.getNamaKomunitas());
    }

    public void aksesKontenEdukasi(KontenEdukasi konten) {
        kontenDiakses.add(konten);
        System.out.println("Anda telah mengakses konten edukasi: " + konten.getJudulKonten());
    }

    public void kirimPesan(User penerima, String isiPesan) {
        // Implementasi untuk mengirim pesan ke pengguna lain.
        System.out.println("Pesan terkirim ke " + penerima.getUsername() + ": " + isiPesan);
    }

    public void beriKomentar(KontenEdukasi konten, String komentar) {
        konten.beriKomentar(komentar);
        System.out.println("Komentar Anda telah ditambahkan pada konten: " + konten.getJudulKonten());
    }

    public List<ForumKomunitas> getKomunitasDiikuti() {
        return komunitasDiikuti;
    }

    public List<KontenEdukasi> getKontenDiakses() {
        return kontenDiakses;
    }

    public boolean isIsLoggedIn() {
        return isLoggedIn;
    }

    public void setKomunitasDiikuti(List<ForumKomunitas> komunitasDiikuti) {
        this.komunitasDiikuti = komunitasDiikuti;
    }

    public void setKontenDiakses(List<KontenEdukasi> kontenDiakses) {
        this.kontenDiakses = kontenDiakses;
    }

    public void setIsLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    
   

class ForumKomunitas {
    private String namaKomunitas;

    public ForumKomunitas(String namaKomunitas) {
        this.namaKomunitas = namaKomunitas;
    }

    public String getNamaKomunitas() {
        return namaKomunitas;
    }
}

class KontenEdukasi {
    private String judulKonten;

    public KontenEdukasi(String judulKonten) {
        this.judulKonten = judulKonten;
    }

    public String getJudulKonten() {
        return judulKonten;
    }

    public void beriKomentar(String komentar) {
        System.out.println("Komentar: " + komentar);
    }
  }
}

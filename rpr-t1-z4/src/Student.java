public class Student {
    private String ime, prezime;
    private int brojIndeksa;

    public Student(String ime, String prezime, int brojIndeksa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
    }

    public void setIme(String ime) { this.ime = ime; }
    public String getIme() { return ime; }
    public void setPrezime(String prezime) { this.prezime = prezime; }
    public String getPrezime() { return prezime; }
    public void setBrojIndeksa(int brojIndeksa) { this.brojIndeksa = brojIndeksa; }
    public int getBrojIndeksa() { return brojIndeksa; }
}

public class Predmet {
    private String nazivPredmeta, sifraPredmeta;
    private int maksimalanBrojStudenata;

    public Predmet(String nazivPredmeta, String sifraPredmeta, int maksimalanBrojStudenata) {
        this.nazivPredmeta = nazivPredmeta;
        this.sifraPredmeta = sifraPredmeta;
        this.maksimalanBrojStudenata = maksimalanBrojStudenata;
    }

    public void setNazivPredmeta(String nazivPredmeta) { this.nazivPredmeta = nazivPredmeta; }
    public String getNazivPredmeta() { return nazivPredmeta; }
    public void setSifraPredmeta(String sifraPredmeta) { this.sifraPredmeta = sifraPredmeta; }
    public String getSifraPredmeta() { return sifraPredmeta; }
    public int getMaksimalanBrojStudenata() { return maksimalanBrojStudenata; }
}

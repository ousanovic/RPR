import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void setNazivPredmeta() {
        Predmet p = new Predmet("naziv", "sifra", 10);
        p.setNazivPredmeta("Osnove programiranja");
        assertEquals("Osnove programiranja", p.getNazivPredmeta());
    }

    @Test
    void getNazivPredmeta() {
        Predmet p = new Predmet("naziv", "sifra", 10);
        p.setNazivPredmeta("Osnove programiranja");
        assertEquals("Osnove programiranja", p.getNazivPredmeta());
    }

    @Test
    void setSifraPredmeta() {
        Predmet p = new Predmet("naziv", "sifra", 10);
        p.setSifraPredmeta("naziv123");
        assertEquals("naziv123", p.getSifraPredmeta());
    }

    @Test
    void getSifraPredmeta() {
        Predmet p = new Predmet("naziv", "sifra", 10);
        p.setSifraPredmeta("naziv123");
        assertEquals("naziv123", p.getSifraPredmeta());
    }

    @Test
    void getMaksimalanBrojStudenata() {
        Predmet p = new Predmet("naziv", "sifra", 10);
        assertEquals(10, p.getMaksimalanBrojStudenata());
    }

    @Test
    void upisi() {
        Student s = new Student("ime", "prezime", 10000);
        Predmet p = new Predmet("naziv", "sifra", 10);
        p.upisi(s);
        assertEquals("prezime ime (10000)\n", p.toString());
    }

    @Test
    void ispisi() {
        Student s = new Student("ime", "prezime", 10000);
        Predmet p = new Predmet("naziv", "sifra", 10);
        p.upisi(s);
        p.ispisi(s);
        assertEquals("", p.toString());
    }

    @Test
    void equals() {
        Predmet p = new Predmet("naziv", "sifra", 10);
        Predmet q = new Predmet("naziv", "sifra", 10);
        assertTrue(p.equals(q));
    }
}
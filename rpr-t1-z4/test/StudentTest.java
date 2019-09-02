import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void setIme() {
        Student s = new Student("ime", "prezime", 10000);
        s.setIme("Ahmed");
        assertEquals("Ahmed", s.getIme());
    }

    @Test
    void getIme() {
        Student s = new Student("ime", "prezime", 10000);
        assertEquals("ime", s.getIme());
    }

    @Test
    void setPrezime() {
        Student s = new Student("ime", "prezime", 10000);
        s.setPrezime("Hljebic");
        assertEquals("Hljebic", s.getPrezime());
    }

    @Test
    void getPrezime() {
        Student s = new Student("ime", "prezime", 10000);
        assertEquals("prezime", s.getPrezime());
    }

    @Test
    void setBrojIndeksa() {
        Student s = new Student("ime", "prezime", 10000);
        s.setBrojIndeksa(17777);
        assertEquals(17777, s.getBrojIndeksa());
    }

    @Test
    void getBrojIndeksa() {
        Student s = new Student("ime", "prezime", 10000);
        assertEquals(10000, s.getBrojIndeksa());
    }

    @Test
    void testToString() {
        Student s = new Student("ime", "prezime", 10000);
        assertEquals("prezime ime (10000)", s.toString());
    }

    @Test
    void equals() {
        Student s = new Student("ime", "prezime", 10000);
        Student p = new Student("ime", "prezime", 10000);
        assertEquals(p.equals(s), true);
    }
}
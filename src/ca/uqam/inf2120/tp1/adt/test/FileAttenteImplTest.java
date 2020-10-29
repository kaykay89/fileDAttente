package ca.uqam.inf2120.tp1.adt.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ca.uqam.inf2120.tp1.adt.impl.FileAttenteImpl;

public class FileAttenteImplTest extends FileAttenteImpl<Membre> {

	List<Membre> file;
	Membre m1;
	Membre m2;
	Membre m3;
	Membre m4;
	Membre m5;
	Membre m6;
	

	@Before
	public void setUp() throws Exception {
		file = new ArrayList<Membre>();
		m1 = new Membre("M1", "Louis", "Kayla", 1);
		m2 = new Membre("M2", "Gervais", "Gabrielle", 3);
		m3 = new Membre("M3", "Ferron", "Karine", 4);
		m4 = new Membre("M4", "Lavigne", "Mariane", 4);
		m5 = new Membre("M5", "Michel", "Carline", 5);
		m6 = new Membre("M6", "Beaudoin", "Mike", 7);
		file.add(m1);
		file.add(m2);
		file.add(m3);
		file.add(m4);
		file.add(m5);
		file.add(m6);
		
	}

	@After
	public void tearDown() throws Exception {
		List<Membre> file = null;
		Membre m1 = null;
		Membre m2 = null;
		Membre m3 = null;
		Membre m4 = null;
		Membre m5 = null;
		Membre m6 = null;
	}

	@Test
	public void testPlacerT() {
		Membre m7;
		Membre m8 = new Membre("M8", "Gardien", "Stefanie", -4);
		Membre m9 = new Membre("M9", "St-Pierre", "Isabelle", 1);
		Membre m10 = new Membre("M10", "Cloutier", "Guy", 4);
		Membre m11 = new Membre("M9", "Noreau", "Nicole", 1);
		
		file.placer(m11);
		
		assertFalse(file.placer(m7));
		assertFalse(file.placer(m8));
		assertFalse(placer(m3));
		asserTrue(placer(m9));
		asserTrue(placer(m10));
		assertEquals(file.get(m9),1);
		assertEquals(file.get(m11),2)
		assertEquals(file.get(m10),1)
	}

	@Test
	public void testPlacerListOfT() {
		fail("Not yet implemented");
	}

	@Test
	public void testEnleverT() {
		fail("Not yet implemented");
	}

	@Test
	public void testEnleverListOfT() {
		fail("Not yet implemented");
	}

	@Test
	public void testEnleverInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testEnleverIntBoolean() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemplacer() {
		fail("Not yet implemented");
	}

	@Test
	public void testObtenirNbElments() {
		fail("Not yet implemented");
	}

	@Test
	public void testEstVide() {
		fail("Not yet implemented");
	}

	@Test
	public void testIterateur() {
		fail("Not yet implemented");
	}

}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

    private GradeBook student1;
    private GradeBook student2;
    
    @BeforeEach
    void setUp() throws Exception {
	
	student1 = new GradeBook(5);
	student2 = new GradeBook(5);
	
	student1.addScore(100);
	student1.addScore(75);
	
	student2.addScore(85);
	student2.addScore(55);
	student2.addScore(95);
	student2.addScore(75);
	
    }

    @AfterEach
    void tearDown() throws Exception {
	student1 = null;
	student2 = null;
    }

    @Test
    void testGetScoreSize() {
	assertTrue(student1.toString().equals("100.0 75.0 "));
	assertEquals(student1.getScoreSize(), 2);
	
	assertTrue(student2.toString().equals("85.0 55.0 95.0 75.0 "));
	assertEquals(student2.getScoreSize(), 4);
    }

    @Test
    void testToString() {
	
    }

    @Test
    void testAddScore() {
	
    }

    @Test
    void testSum() {
	assertEquals(student1.sum(),175);
	assertEquals(student2.sum(),310);
	
    }

    @Test
    void testMinimum() {
	assertEquals(student1.minimum(),75);
	assertEquals(student2.minimum(),55);
    }

    @Test
    void testFinalScore() {
	assertEquals(student1.finalScore(),100);
	assertEquals(student2.finalScore(),255);
    }

}

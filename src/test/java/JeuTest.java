import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sow25 on 14/04/16.
 */
public class JeuTest {

    Jeu jeu;

    @Before
    public void setUp() throws Exception {
        jeu = new Jeu();
    }

    @Test
    public void testMain(){
        jeu.main(null);
    }
}
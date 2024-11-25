package com.factoriaf5.rps.application;

import org.junit.jupiter.api.Test;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Scissors;
import com.factoriaf5.rps.models.Lizard;
import com.factoriaf5.rps.models.Spock;
import static org.junit.jupiter.api.Assertions.*;

public class MoveFactoryTest {

    @Test
    public void testCreateMove() {
        
        assertTrue(MoveFactory.createMove(1) instanceof Rock);
        assertTrue(MoveFactory.createMove(2) instanceof Paper);
        assertTrue(MoveFactory.createMove(3) instanceof Scissors);
        assertTrue(MoveFactory.createMove(4) instanceof Lizard);
        assertTrue(MoveFactory.createMove(5) instanceof Spock); 
        
        assertNull(MoveFactory.createMove(6));
    
    }
}

package com.equipo.taskmaster;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{


    /**
     * Rigourous Test :-)
     */
    @Test
    public void testAddTask()
    {
        App.tasks.clear();
        App.addTask("Terminar ejercicio Maven");
        assertEquals(1, App.tasks.size());
    }
}

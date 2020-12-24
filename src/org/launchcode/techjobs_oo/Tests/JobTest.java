package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JobTest {

    private Job test1, test2, test3, test4, test5;

    @Before
   public void createJobObjects(){
        test1 = new Job();
        test2 = new Job();
        test3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test4 = new Job("k", new Employer("k"), new Location("k"), new PositionType("k"), new CoreCompetency("k"));
        test5 = new Job("k", new Employer("k"), new Location("k"), new PositionType("k"), new CoreCompetency("k"));
    }

    @Test
    public void testSettingJobId(){
        assertEquals(1,test2.getId() - test1.getId(),.001);

    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals("Product tester", test3.getName());
        assertEquals("ACME", test3.getEmployer().getValue());
        assertEquals("Desert", test3.getLocation().getValue());
        assertEquals("Quality control", test3.getPositionType().getValue());
        assertEquals("Persistence", test3.getCoreCompetency().getValue());
        assertEquals(true,test3 instanceof Job);
    }

    @Test
    public void testJobsForEquality(){
        assertEquals(false, test4 == test5);
    }



}

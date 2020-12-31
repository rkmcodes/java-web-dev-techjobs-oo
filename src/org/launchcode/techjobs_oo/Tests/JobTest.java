package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JobTest {

    private Job test1, test2, test3, test4, test5, test6;

    @Before
   public void createJobObjects(){
        test1 = new Job();
        test2 = new Job();
        test3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test4 = new Job("k", new Employer("k"), new Location("k"), new PositionType("k"), new CoreCompetency("k"));
        test5 = new Job("k", new Employer("k"), new Location("k"), new PositionType("k"), new CoreCompetency("k"));
        test6 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

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

    @Test
    public void toStringShouldReturnStringWithBlankLineBeforeAndAfterJobInfo(){
        assertTrue(test4.toString().charAt(0) == test4.toString().charAt(test4.toString().length()-1));
    }

    @Test
    public void toStringShouldReturnLabelsForEachFieldFollowedByStoredDataOfThatField(){
        assertEquals("\n" + "ID: " + test4.getId() + "\n" +
                "Name: " + test4.getName() + "\n" +
                "Employer: " + test4.getEmployer() + "\n" +
                "Location: " + test4.getLocation() + "\n" +
                "Position Type: " + test4.getPositionType() + "\n" +
                "Core Competency: " + test4.getCoreCompetency() + "\n", test4.toString());
    }

    @Test
    public void toStringShouldAddMessageIfFieldIsEmpty(){

//        String result = String.format("\nID: %d\n" +
//                "Name: %s\n" +
//                "Employer: Data not available\n" +
//                "Location: Data not available\n" +
//                "Position Type: %s\n" +
//                "Core Competency: %s\n",test5.getId(),test5.getName(),test5.getPositionType(),test5.getCoreCompetency());

        String result = "\n" + "ID: " + test6.getId() + "\n"
                + "Name: " + "Data not available" + "\n"
                + "Employer: " + "Data not available" + "\n"
                + "Location: " + "Data not available" + "\n"
                + "Position Type: " + "Data not available" + "\n"
                + "Core Competency: " + "Data not available" + "\n";
        assertEquals(result,test6.toString());
    }

// BONUS
//    @Test
//    public void shouldReturnOopsIfOnlyHasId(){
//        assertEquals("OOPS! This job does not seem to exist.", test1.toString());
//    }


}

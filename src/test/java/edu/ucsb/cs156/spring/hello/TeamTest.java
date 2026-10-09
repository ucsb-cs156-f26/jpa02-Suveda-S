package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    //same obj
    @Test
    public void equals_returns_correct_boolean_Case1() {
        assertEquals(team, team);
    }

    //different class
    @Test
    public void equals_returns_correct_boolean_Case2() {
        String team2 = "test-team";
        assertEquals( false, team.equals(team2));
    }

    @Test
    public void equals_same_name_and_members() {
        Team team2 = new Team("test-team");
        assertEquals(true, team.equals(team2));
    }

    @Test
    public void equals_same_name_different_members() {
        Team team2 = new Team("test-team");
        team2.addMember("member1");
        assertEquals(false, team.equals(team2));
    }

    @Test
    public void equals_different_name_same_members() {
        Team team2 = new Team("test-team-2");
        assertEquals(false, team.equals(team2));
    }

    public void equals_different_name_different_members() {
        Team team2 = new Team("test-team-2");
        team2.addMember("member1");
        assertEquals(false, team.equals(team2));
    }

    @Test
    public void hash_stuff() {
        Team t = new Team("test-team");

        // // instantiate t as a Team object
         int result = t.hashCode();
        // System.out.println("hashCode: " + result);
         int expectedResult = -1226298695;
         assertEquals(expectedResult, result);
    }
   

}

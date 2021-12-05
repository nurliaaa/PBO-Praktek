/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Before;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

/**
 *
 * @author LIA
 */
public class AirportTest {
    
    @DisplayName("Given there is an economy flight")
	
	 @Nested
	 class EconomyFlightTest {
	 private Flight economyFlight;
	 
	 @BeforeEach
	 void setUp() {
		 economyFlight = new EconomyFlight("1");
		}
	
	 @Test
		
	 public void testEconomyFlightRegularPassenger() {
		 Passenger mike = new Passenger("Mike", false);
		 assertEquals("1", economyFlight.getId());
		 assertEquals(true, economyFlight.addPassenger(mike));
		 assertEquals(1, economyFlight.getPassengersList().size());
		 assertEquals("Mike",
		 economyFlight.getPassengersList().get(0).getName());
		 assertEquals(true, economyFlight.removePassenger(mike));
		 assertEquals(0, economyFlight.getPassengersList().size());
		 }
		 
	
	 @Test
		 
	 public void testEconomyFlightVipPassenger() {
		 Passenger james = new Passenger("James", true);
		 assertEquals("1", economyFlight.getId());
		 assertEquals(true, economyFlight.addPassenger(james));
		 assertEquals(1, economyFlight.getPassengersList().size());
		 assertEquals("James",
		 economyFlight.getPassengersList().get(0).getName());
		 assertEquals(false, economyFlight.removePassenger(james));
		 assertEquals(1, economyFlight.getPassengersList().size());
		 }
	}
    
    @DisplayName("Given there is a business flight") 
    @Nested 
    class BusinessFlightTest { 
    	 private Flight businessFlight; 
    	 @BeforeEach 
    	 void setUp() { 
    		 businessFlight = new BusinessFlight("2");
    	 } 
    	 @Test
    	 public void testBusinessFlightRegularPassenger() { 
    	 Passenger mike = new Passenger("Mike", false); 
    	 assertEquals(false, businessFlight.addPassenger(mike)); 
    	 assertEquals(0, businessFlight.getPassengersList().size()); 
    	 assertEquals(false, businessFlight.removePassenger(mike)); 
    	 assertEquals(0, businessFlight.getPassengersList().size()); 
    	 }
    	 @Test
    	 public void testBusinessFlightVipPassenger() {
    	 Passenger james = new Passenger("James", true); 
    	 assertEquals(true, businessFlight.addPassenger(james)); 
    	 assertEquals(1, businessFlight.getPassengersList().size()); 
    	 assertEquals(false, businessFlight.removePassenger(james)); 
    	 assertEquals(1, businessFlight.getPassengersList().size()); 
    	 }
    	}
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

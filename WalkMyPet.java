/*
This file: WalkMyPet.java
Provided in support of Project 8: Final project demonstrating all key concepts 

WalkMyPet: An interface that requires a method walk() that must be implemented with the specific details of 
what is required to take that type of pet on a walk in the park.
*/

public interface WalkMyPet {

  /* method walk() accepts a String of where the pet is going for the walk
   returns a String with a message describing how this pet gets walked
   for example:
     System.out.println(Obj.cook("the park"));
     // prints to screen: "Fido is going for a walk and wagging his tail in the park."
  */ 
  public abstract String walk(String whatIsBeingWalked);


  } // end WalkMyPet 
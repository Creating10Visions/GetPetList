//Turtle Class
public class Turtle extends Pet implements WalkMyPet {
   private boolean land;
   private boolean requiresHeat;
   
//Constructor for turtle attributes
public Turtle(String name, int age, String color, String gender, boolean land, boolean requriesHeat) {
   super(name, age, color, gender);
   this.land = land;
   this.requiresHeat = requiresHeat;
}

//Implement walk method
@Override
    public String walk(String whatIsBeingWalked) {
    return getName() +  " the Turtle is slowly walking and exploring in the " + whatIsBeingWalked + ".";
    }
  }  



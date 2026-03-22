//BIRD Class
 public class Bird extends Pet implements WalkMyPet {
   private String species;
   private boolean canTalk;
   private int maxAltitude;
   
 //Constructor bird attributes
 public Bird(String name, int age, String color, String gender, String species, boolean canTalk, int maxAltitude) {
   super(name, age, color, gender);
   this.species = species;
   this.canTalk = canTalk;
   this.maxAltitude = maxAltitude;
 }
 @Override
    public String walk(String where) {
        return getName() + " is flying to " + where + " with a max altitude of " + maxAltitude + " feet.";
    }
 
 
 //Getter method for bird attribute
 public String getSpecies() {
   return species;
 }
 public void setSpecies(String species) {
        this.species = species;
    }
 
 public boolean isCanTalk() {
   return canTalk;
 }
 public void setCanTalk(boolean canTalk) {
        this.canTalk = canTalk;
    }
 
 public int getMaxAltitude() {
   return maxAltitude;
 }
 public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }
}

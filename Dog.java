//DOG Class
 public class Dog extends Pet implements WalkMyPet {
   private String breed;
   private boolean tailWags;
   private boolean slobbery;
   private boolean canCatchBall;
   
 //Constructor dog attributes
 public Dog(String name, int age, String color, String gender, 
        String breed, boolean tailWags, boolean slobbery, boolean catchesBall) {
   super(name, age, color, gender);
   this.breed = breed;
   this.tailWags = tailWags;
   this.slobbery = slobbery;
   this.canCatchBall = canCatchBall;
   
   }
   
   @
   Override
   public String walk(String where) {
      return getName() + " is going for a walk and wagging " + (tailWags ? "her" : "its") +
               " tail in the " + where + ".";
    }
   
   //Getter method 
   public String getBreed() {
      return breed;
   }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
   public boolean isTailWags() {
      return tailWags;
   }
   public void setTailWags(boolean tailWags) {
        this.tailWags = tailWags;
    }
   
   public boolean isSlobbery() {
      return slobbery;
   }
   public void setSlobbery(boolean slobbery) {
        this.slobbery = slobbery;
    }
   
   public boolean isCatchesBall() {
      return canCatchBall;
   }
   public void setCanCatchBall(boolean canCatchBall) {
        this.canCatchBall = canCatchBall;
    }
}

 //PET
 //Attributes  
public abstract class Pet implements WalkMyPet {
   private String name;
   private int age;
   private String color;
   private String gender;
   
//Common attributes constructor

public Pet(String name, int age, String color, String gender) {
   this.name = name;
   this.age = age;
   this.color = color;
   this.gender = gender;
 }
 
 //Get and Set methods
 public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

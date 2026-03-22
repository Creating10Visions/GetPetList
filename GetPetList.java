import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class GetPetList {
   public static void main(String[] args) {
      System.out.println("Course: COP2805C");
      System.out.println("Assignment: P8");
      System.out.println("Date: 07/14/2024");
      System.out.println("Programmer: Vanessa Krug");
      
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter pet record file name");
      String fileName = scanner.nextLine();
      
      ArrayList<Pet> pets = new ArrayList<>();
      
      try {
         File file = new File(fileName);
         Scanner fileScanner = new Scanner(file);
         
         while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine().trim();
                 
            if (line.isEmpty()) continue;
                
                String[] parts = line.split(":");
                String petType = parts[0];
                
                switch (petType) {
                    case "Dog":
                        if (parts.length != 9) throw new PetException("Invalid Dog record: " + line);
                        pets.add(new Dog(parts[1], Integer.parseInt(parts[2]), parts[3], parts[4], parts[5], Boolean.parseBoolean(parts[6]), Boolean.parseBoolean(parts[7]), Boolean.parseBoolean(parts[8])));
                        break;
                    case "Bird":
                        if (parts.length != 8) throw new PetException("Invalid Bird record: " + line);
                        pets.add(new Bird(parts[1], Integer.parseInt(parts[2]), parts[3], parts[4], parts[5], Boolean.parseBoolean(parts[6]), Integer.parseInt(parts[7])));
                        break;
                    case "Turtle":
                        if (parts.length != 7) throw new PetException("Invalid Turtle record: " + line);
                        pets.add(new Turtle(parts[1], Integer.parseInt(parts[2]), parts[3], parts[4], Boolean.parseBoolean(parts[5]), Boolean.parseBoolean(parts[6])));
                        break;
                    default:
                        throw new PetException("Unknown pet type: " + petType);
                }
            }
            
            fileScanner.close();
            
            // Print out walk instructions for each pet
            for (Pet pet : pets) {
                System.out.println(pet.walk("park"));
            }

        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found: " + fileName);
        } catch (PetException e) {
            System.err.println("Error in pet data: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

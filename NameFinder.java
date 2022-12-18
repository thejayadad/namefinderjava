import java.util.Scanner;

public class NameFinder {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //List of students in 2d array
        String[][] names = {{"Jazz", "Mary"},
        {"Todd", "Julie"},
        {"Jason", "Jackson"},
        {"Edward", "Johnny"},
        {"Scottie", "Michael"},
        {"Kobe", "Karl"},
        {"Steve", "Joe"},
        {"Donald", "Doc"}

        };
        //Ask the user to enter the name

        String name;
        String response = "y";
        while(response.equalsIgnoreCase("y")){
            System.out.println("Enter the name of who you are looking for: ");
            name = scan.nextLine();
            //Use the search name to see if we have the user in the database
            if(searchName(names, name) == true){
                System.out.println("We found " + name + " in our database");


            } else {
                //not in our databse
                System.out.println("Sorry but " + name + " was not found");
                System.out.println("Would you like to try again?");
                response = scan.nextLine();
            }
            System.out.println("Thanks for using DayWork database!");

        }


    }
    //Search for the name in the database
    public static boolean searchName (String[][] names, String key){
        for(int row=0;row<names.length;row++)
        {
            for(int col=0;col<names[0].length;col++)
            {
                if(names[row][col].equalsIgnoreCase(key))
                    return true;
            }
        }
        return false;

    }
}

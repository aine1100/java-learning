import java.util.Scanner;

public class game {
    public class Gamers{
        String name;
        int age;
        String TypeOfGame;
        int Experience;

        public Gamers(String name,int age, String TypeOfGame,int Experience){
            this.name=name;
            this.TypeOfGame=TypeOfGame;
            this.age=age;
            this.Experience=Experience;
        }
        public void setName(String name){
            this.name= name;
        }
        public void setAge(int age){
            this.age= age;
        }
        public void setType(String TypeOfGame){
            this.TypeOfGame= TypeOfGame;
        }
        public void setExperience(int Experience){
            this.Experience= Experience;
        }
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
        public String getType(){
            return TypeOfGame;
        }
        public int getExperience(){
            return Experience;
        }
    }
    public static  void main(String[] args){
        game user=new game();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name:");
        String username=scanner.nextLine();
        System.out.println("Enter your age:");
        int userAge=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your Type of Game:");
        String userType=scanner.nextLine();
        System.out.println("Enter your Experience:");
        int userExperience=scanner.nextInt();
        Gamers first=user.new Gamers(username,userAge,userType,userExperience);
        System.out.println(" your name is " + first.getName() + " and your are " +first.getAge() +" old and your like " + first.getType() + " games with " + first.getExperience() + " years of experience" );

    }


}

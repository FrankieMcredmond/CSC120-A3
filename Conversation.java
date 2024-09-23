import java.beans.Statement;
import java.util.Scanner;
class Conversation {
  int rounds;

  public Conversation (int rounds){
    this.rounds=rounds;
  }
  public static void welcomeMesage(){
    System.out.println("Hi there!  What's on your mind?");
  }
  public void response(){
    System.out.println("mhm");
  }
  //public static String[] stringList(String sentenceString) {
    //char[] myArray = sentenceString.toCharArray();

  //}



  public static void main(String[] arguments) {
    //Get Rounds
    Scanner input = new Scanner(System.in); 
    System.out.print("How many rounds would you like? ");
    int times = input.nextInt();
    //input.nextLine(); // clear out extra \n
    //System.out.println();
    //input.close();

    Conversation convo = new Conversation(times);

    Conversation.welcomeMesage();

    String statement = input.nextLine(); //reads input from user
    
    for (int i = 0; i < convo.rounds; i++){
      System.out.println("Enter thought:\n"); 
      statement = input.nextLine(); //reads input from user
      System.out.println(statement);
      


      convo.response();

    }
     
   input.close ();

  }
  
}

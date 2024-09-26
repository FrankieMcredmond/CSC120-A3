import java.util.Scanner;
class Conversation {
  int rounds;

  public Conversation (int rounds){
    this.rounds=rounds;
  }
  public static void welcomeMesage(){
    System.out.println("Hi there!  What's on your mind?");
  }
    
  public String response(String Sentence){
    String myStr = Sentence;
    if (myStr.contains("I ")==true){System.out.println(myStr.replaceAll("I ", "You "));
    return (myStr.replaceAll("I ", "You "));
      
    } 
    else {int randomNum = (int)(Math.random() * 4);
      if (randomNum==1){System.out.println("mhm");
      return "mhm";}
      else if (randomNum==2){System.out.println("cool!");
      return "Cool!";}
      else if (randomNum==3){System.out.println("uh huh");
      return "uh huh";}
      else{
        System.out.println("wow");
        return "wow";
      }}
    
  }



  public static void main(String[] arguments) {
    //Get Rounds
    Scanner input = new Scanner(System.in); 
    System.out.print("How many rounds would you like? ");
    int times = input.nextInt();

    ///Initialize Conversation and Transcription
    Conversation convo = new Conversation(times);
    String[] Transcript= new String [2* times+2];

    ///Prints Welcome Message and Transcripts it
    Conversation.welcomeMesage();
    Transcript[0]= "Hi there!  What's on your mind?";
    
    ///Starts String statement
    String statement = input.nextLine(); //reads input from user
    
    ///For Loop: Conversation Rounds
    for (int i = 0; i < 2* convo.rounds; i=i+2){ 
      statement = input.nextLine(); //reads input from user
      Transcript[i+1]=statement; ///Transcripts Input
      


      Transcript[i+2]=convo.response(statement);///Creates Response/// Transcripts Response

    }
    ///For Loop Ends
    input.close ();

    ///Prints Goodbye Message and Transcripts it
    System.out.println("Goodbye");
    Transcript[2*convo.rounds+1]="Goodbye";

    ///Prints Transcript
    System.out.println("\n");
    System.out.println("Transcript:\n");
    for(int i=0; i<=2*times+1; i++){
      System.out.println (Transcript[i]);
      
    }
    

  }
  
}

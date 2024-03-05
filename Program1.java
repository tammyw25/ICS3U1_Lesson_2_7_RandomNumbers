import java.util.Random;

class Program1 extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    // your code goes here
    
    //creat a random object 
    Random myRandom = new Random();
    
    //generate random int number and store it in a variable 
    
    //this generate a number 10 and 30 
    
    int intRandom = myRandom.nextInt(5);
    
    System.out.println(intRandom);
    
  }
}

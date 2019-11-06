import java.util.Scanner; 
class Main {
public static void main (String [] args){


   
	boolean result;
    int score;
    String elig;

	Scanner scan=new Scanner(System.in);
  
    System.out.println("Do you need a loan?");
   
    result=scan.nextBoolean();
   
    	if (result) {
    				System.out.println("What is your credit score?");
    	
    	
    	
    				score=scan.nextInt();
    					if (score<600) {
    							elig="Not eligible";
    						}
    						else if (score>600 && score<700) {
    								elig="Maybe eligible";
    						}
    						else if (score>701 && score<800) {
                             elig="Eligible";
    						}
    						else {
                              elig="Definietly eligible";
    						}

          }
    		else{
    			System.out.println("Unknown");
    		} 
    			System.out.println("The eligibility is "+ elig);
          	
		}
          
             
      }

  
  
  
  





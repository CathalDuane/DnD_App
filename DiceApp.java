import java.util.Random;


public class DiceApp {
    //vars for rolls
    //Dice: 0 = 100, 1 = 20, 2 = 12, 3 = 10, 4 = 8, 5 = 6, 6 = 4
    public int dice;
    public int result;

    //constructor
    public DiceApp(){
        result = 0;
        dice = 0;
    }

    //setter
    public void setRoll(int dice){
        this.dice = dice;
    }
    //method
    public int resultMethod(){
       Random rand = new Random();


       if(dice == 0){
        int n = rand.nextInt(100);
        result = n+1;
        return result; 
       }

       else if(dice == 1){
       int n = rand.nextInt(20);
       result = n+1;
       return result;
       }

       else if(dice == 2){
        int n = rand.nextInt(12);
        result = n+1;
        return result;
        }

        else if(dice == 3){
            int n = rand.nextInt(10);
            result = n+1;
          
        }
        else if(dice == 4){
            int n = rand.nextInt(8);
            result = n+1; 
        }

            else if(dice == 5){
                int n = rand.nextInt(6);
                result = n+1;
                
             }

            else if(dice == 6){
                int n = rand.nextInt(4);
                result = n+1;
              
            }

            return result;
    }
    

    //getter
    // public int getResult(){
    //     return result;
    // }


        
   
}

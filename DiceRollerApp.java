import javax.swing.JOptionPane;


public class DiceRollerApp {
    public static void main(String[] args) {
        int diceSelection;
        int result;
        int numOfDice;

        //Dice options
        String[] options = {"d100","d20","d12","d10","d8","d6","d4"};

        // numOfDice = Integer.parseInt(JOptionPane.showInputDialog(null, "How many dice do you want to roll?"));

        //Button for selection dice
       
        diceSelection = JOptionPane.showOptionDialog(null, "Select dice to roll", "Dice selector", JOptionPane.DEFAULT_OPTION, 0, null, options, options[6]);
         
     
        DiceApp newRoll = new DiceApp();

        newRoll.setRoll(diceSelection);
        result = newRoll.resultMethod();

        System.out.println(result);
        
        

    }
    
}

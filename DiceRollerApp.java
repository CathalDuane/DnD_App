import javax.swing.JOptionPane;

public class DiceRollerApp {
    public static void main(String[] args) {
        int diceSelection;

        //Dice options
        String[] options = {"d100","d20","d12","d10","d8","d6","d4"};

        //Button for selection dice
        diceSelection = JOptionPane.showOptionDialog(null, "Select dice to roll", "Dice selector", JOptionPane.DEFAULT_OPTION, 0, null, options, options[6]);
            
        System.out.println(diceSelection);
        
        

    }
    
}

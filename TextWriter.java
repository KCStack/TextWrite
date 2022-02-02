
/**
 * Write a description of class TextWriter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TextWriter {
     private String textToDisplay; // the text to be displayed
     
     public TextWriter() {
         textToDisplay = "";
    }

    public TextWriter(String inputText) {
         textToDisplay = inputText;
    }   
     
     public void setTextToDisplay(String inputText) {
         textToDisplay = inputText;
    }
    
    public String getTextToDisplay() {
         return textToDisplay;
    }
    
    public void clearTextToDisplay() {
        textToDisplay = "";
    }
    
    public void display() {
         System.out.println(textToDisplay);
    }
}


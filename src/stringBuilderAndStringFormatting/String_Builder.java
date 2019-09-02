
package stringBuilderAndStringFormatting;

public class String_Builder {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder();
        
        str.append("Je suis Carlo,")
           .append(" développeur web java.")
           .append(" Je suis très doué et très bon.");
        
        System.out.println(str.toString());
    }
    
}

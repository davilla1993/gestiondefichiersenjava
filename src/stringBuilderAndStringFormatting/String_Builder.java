
package stringBuilderAndStringFormatting;

public class String_Builder {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder();
        
        str.append("Je suis Carlo,")
           .append(" d�veloppeur web java.")
           .append(" Je suis tr�s dou� et tr�s bon.");
        
        System.out.println(str.toString());
    }
    
}

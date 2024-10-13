/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package breakandcontinue;

/**
 *
 * @author flavi
 */
public class BreakAndContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i = 0;
        
        
          do{  
            if(i == 7){
                break;
                }if(i % 2 == 0){
                        continue;
                    }
                    System.out.println(i);
                        i++;
                }while(i < 10);


    }
    
}

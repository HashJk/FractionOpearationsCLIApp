/*#########################################################
This program created by Hashim Khubrani twitter: @HJKCS2002
##########################################################*/
import java.util.Scanner;
public class AddFraction {

        /*#######################################
             This Class for Addition Opearation.
         ########################################*/
    
    Scanner reader = new Scanner(System.in);
    private double noem;
    private double denom = 1;
    
    public void setNoem(double noem) {
        this.noem = noem;
    }
    
    public double getNoem() {
        return noem;
    }
    
    public void setdenom(double denom) {
        if (denom != 0)
            this.denom = denom;
        else {
            System.out.print("The Denominator have to Not Equle 0, This Fraction Undefind. Try Agian.. \nDenom is: ");
            setdenom(reader.nextDouble());
        }
    }
    
    public double getdenom() {
        return denom;
    }
    
    public AddFraction reusltAdd(AddFraction rel){
        AddFraction reusltFraction = new AddFraction();
       
        if (this.denom == rel.denom){
            reusltFraction.noem = this.noem + rel.noem;
            reusltFraction.denom = this.denom;
            return reusltFraction; 
        
        }
        
        else {
            reusltFraction.noem = (this.noem * rel.denom ) + (rel.noem * this.denom );
            reusltFraction.denom = (this.denom * rel.denom);
            return reusltFraction; 
        
        }
        
    }
    

}



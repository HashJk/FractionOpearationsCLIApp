/*#########################################################
This program created by Hashim Khubrani twitter: @HJKCS2002
##########################################################*/
import java.util.Scanner;
public class DivFraction {
    
    /*#######################################
        This Class for Division Opearation.
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
    
    public DivFraction reusltDiv(DivFraction rel){
        DivFraction reusltFraction = new DivFraction();
        reusltFraction.noem = this.noem * rel.denom;
        reusltFraction.denom = this.denom *  rel.noem;
        return reusltFraction;
        
    }
    
}



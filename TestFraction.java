/*#########################################################
This program created by Hashim Khubrani twitter: @HJKCS2002
##########################################################*/
import java.util.Scanner;
public class TestFraction {

    /*###########################################
        This program for Fraction Opearations: 
        Multi = Multiplication. 
        Div = Division. 
        Add = Addition. 
        Sub = Subtraction.
        Noem = Numerator.
        denom = Denominator.
     ############################################*/
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
/*#################################
         this is Objects Area.
###################################*/
        
        MultiFraction MultiFractionObject1 = new MultiFraction();
        MultiFraction MultiFractionObject2 = new MultiFraction();
       
        AddFraction AddFractionObject1 = new AddFraction();
        AddFraction AddFractionObject2 = new AddFraction();
        
        SubFraction SubFractionObject1 = new SubFraction();
        SubFraction SubFractionObject2 = new SubFraction();
        
        DivFraction DivFractionObject1 = new DivFraction();
        DivFraction DivFractionObject2 = new DivFraction();
        
        System.out.println("####This program created by Hashim Khubrani twitter: @HJKCS2002####");
        System.out.print("Enter type of Calc Proccess: 'Multi' or 'Add' or 'Sub' or 'Div': ");
        String choiceProccess = reader.next();
    
/*#################################
    this is part for Multi Procces 
###################################*/
                
            if (choiceProccess.equals("Multi")){
                System.out.print("Enter First Fraction as follwos 'Enter Numeratror then Denominator' : ");
                MultiFractionObject1.setNoem(reader.nextDouble());
                MultiFractionObject1.setdenom(reader.nextDouble());
                
                System.out.print("Enter Seconed Fraction as follwos 'Enter Numeratror then Denominator' : ");
                MultiFractionObject2.setNoem(reader.nextDouble());
                MultiFractionObject2.setdenom(reader.nextDouble());

                MultiFraction MultiFractionObject3 = MultiFractionObject1.reusltMlti(MultiFractionObject2);

                System.out.println( "Result of Multi:\n" +
                "Noem = " + MultiFractionObject3.getNoem() +
                "\nDenom = " + MultiFractionObject3.getdenom()
                );
            
            }
            
/*#################################
    this is part for Div Procces 
###################################*/
            
            else if (choiceProccess.equals("Div")){
                System.out.print("Enter First Fraction as follwos 'Enter Numeratror then Denominator' : ");
                DivFractionObject1.setNoem(reader.nextDouble());
                DivFractionObject1.setdenom(reader.nextDouble());

                System.out.print("Enter Seconed Fraction as follwos 'Enter Numeratror then Denominator' : ");
                DivFractionObject2.setNoem(reader.nextDouble());
                DivFractionObject2.setdenom(reader.nextDouble());

                DivFraction DivFractionObject3 = DivFractionObject1.reusltDiv(DivFractionObject2);

                System.out.println( "Result of Div: \n" +
                "Noem = " + DivFractionObject3.getNoem() +
                "\nDenom = " + DivFractionObject3.getdenom()
                );
        }
            
/*#################################
    this is part for Add Procces 
###################################*/
            
            else if (choiceProccess.equals("Add")){
                System.out.print("Enter First Fraction as follwos 'Enter Numeratror then Denominator' : ");
                AddFractionObject1.setNoem(reader.nextDouble());
                AddFractionObject1.setdenom(reader.nextDouble());

                System.out.print("Enter Seconed Fraction as follwos 'Enter Numeratror then Denominator' : ");
                AddFractionObject2.setNoem(reader.nextDouble());
                AddFractionObject2.setdenom(reader.nextDouble());

                AddFraction AddFractionObject3 = AddFractionObject1.reusltAdd(AddFractionObject2);

                System.out.println( "Result of Add: \n" +
                "Noem = " + AddFractionObject3.getNoem() +
                "\nDenom = " + AddFractionObject3.getdenom()
                );
        }
            
/*#################################
    this is part for Sub Procces 
###################################*/
            
            else if (choiceProccess.equals("Sub")){
                System.out.print("Enter First Fraction as follwos 'Enter Numeratror then Denominator' : ");
                SubFractionObject1.setNoem(reader.nextDouble());
                SubFractionObject1.setdenom(reader.nextDouble());

                System.out.print("Enter Seconed Fraction as follwos 'Enter Numeratror then Denominator' : ");
                SubFractionObject2.setNoem(reader.nextDouble());
                SubFractionObject2.setdenom(reader.nextDouble());

                SubFraction SubFractionObject3 = SubFractionObject1.reusltSub(SubFractionObject2);

                System.out.println( "Result of Sub: \n" +
                "Noem = " + SubFractionObject3.getNoem() +
                "\nDenom = " + SubFractionObject3.getdenom()
                );
        }
            
/*#############################################################
   If Input it is not Correct the program enter else-branching.
################################################################*/  
            
            else 
                System.out.println("The Input it isn't Correct, Try Again,..");

            
    }
    
}

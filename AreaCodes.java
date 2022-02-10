import java.util.Scanner;

public class AreaCodes
{
        //Instantiating Variables
        Scanner input = new Scanner(System.in);
        private String code;

        //Constructors
        public AreaCodes(String code)
        {
            this.code = code;
        }//end areaCodes constructor
        public AreaCodes()
        {
            code = "";
        }//end areaCodes constructor

        //Getters/Setters
        public String getCode()
        {
            return code;
        }//end getCode
        public void setCode(String code)
        {
            this.code = code;
        }//end setCode

        //Validation
        public String validateAreaCode()
        {
            //Utlizing the character class
            while (!code.matches("[\\p{Digit}][\\p{Digit}][\\p{Digit}]"))
            {
                System.out.println(code + " is incorrectly formatted");
                code = input.nextLine();
            }
            return code + " is correctly formatted." ;
        }//end validate AreaCode

        //toString
        @Override
        public String toString()
        {
            return"Code = " + code;
        }//end toString
}//end AreaCodes class

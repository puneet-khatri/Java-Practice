public class doWhile {
    public static void main(String[] args) throws java.io.IOException {
        char choice;
        do{
            System.out.println("Help on:");
            System.out.println("1 If");
            System.out.println("2 Switch");
            System.out.println("3 While");
            System.out.println("4 doWhile");
            System.out.println("5 For");
            System.out.println("Choose one:");
            choice = (char)System.in.read();
        }while(choice<'1'||choice>'5');
        System.out.println("\n");
        switch(choice){
            case '1':
            System.out.println("if statement: \n");
            System.out.println("if(condition){statement;}");
            System.out.println("else{statement;}");
            break;
            case '2':
            System.out.println("Switch statement: \n");
            System.out.println("switch(expression){case value: statement;}");
            break;
            case '3':
            System.out.println("While statement: \n");
            System.out.println("while(condition){statement;}");
            break;
            case '4':
            System.out.println("do while statement: \n");
            System.out.println("do{statement;}while(condition);");
            break;
            case '5':
            System.out.println("for statement: \n");
            System.out.println("for(initialization; condition; increment/decrement){statement;}");
            break;

        }
    }
    
}

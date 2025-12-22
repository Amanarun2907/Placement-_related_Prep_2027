import java.util.Scanner;
public class switch_statement {
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.println("Enter the number of button: ");
int press = sc.nextInt();
switch (press){
    case 10:System.out.println("switch on the tubelight");
    break;
    case 20:System.out.println("switch on the fan  ");
    break;
    case 30:System.out.println("switch on the ac ");
    break;
    case 40:System.out.println("switch on the microwave");
    break;
    default:System.out.println("Enter the correct number!! ");
    // it is not compulsory that type of variable in switch is always int.
}

    }
}
// syntax of switch statement 
// switch (variable){ // in this example the value of variable is 1 , 2 , 3 or anything except (1,2,3)
//     case 1: 
//     break;
//     case 2:
//     break;
//     case 3: 
//     break;
//     default:
// }
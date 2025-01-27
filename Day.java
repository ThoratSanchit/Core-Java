// class Day
// {

// 	void days(int n)
// 	{
// 		Switch (n)
// 		{
// 			case 1:
// 			System.out.println("Sunday");
// 			break;
// 			case 2:
// 			System.out.println("Tuesday");
//             break;
// 		    case 3:
// 			System.out.println("wenday");
// 			break;
// 			case 4:
// 			System.out.println("Thirsday");
// 			break;
// 			case 5:
// 			System.out.println("friday");
// 			break;
// 			case 6:
// 			System.out.println("saturday");
// 			break;
// 			case 7:
// 			System.out.println("sunday");
// 			break;
// 			default:
// 			System.out.println("Thirsday");
// 			break;
// 		}
// 	}

// 		public static void main(String[] k)
// 		{
//     			Day s=new Day(4);
// 		}

// }



class Day {
    void days(int n) {
        switch (n) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
                break;
        }
    }

    public static void main(String[] k) {
        Day s = new Day();
        s.days(4); // Example: Prints "Thursday"
    }
}

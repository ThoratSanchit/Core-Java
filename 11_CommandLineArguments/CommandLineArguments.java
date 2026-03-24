package CommandLineArguments;
// if not run then remove the package statement
public class CommandLineArguments {
    public static void main(String[] args) {
        for (int i=0;i<args.length;i++){
            System.out.println("The command line arguments are: "+args[i]);
        }
    }
}

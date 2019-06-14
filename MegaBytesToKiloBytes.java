//Write a method called printMegaBytesAndKiloBytes that has one parameter of type int with the name kiloBytes.
//The method should not return anything (void) and it needs to calculate the megabytes and remailing kilobytes from the KiloBytes parameter.
//Then it needs to print a message in the format "XX KB = YY MB and ZZ KB.
//XX represents the original value kiloBytes.
//YY represents the original value megabytes.
//ZZ represents the original value kilobytes.

//For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB and 452 KB".
//If the paramater kiloBytes is less than 0 then print the text "Invalid Value". 

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            long megabytes = kiloBytes / 1024;
            long R = kiloBytes % 1024;
            

            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + R + " KB");
        }
    }
}


//public class main {
//
//    public static void main(String[] args) {
//        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
//
//    }
//}
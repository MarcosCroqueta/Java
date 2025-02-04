public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");


    int[] edad = new int [5];
    
    edad[0] = 18;
    edad[1] = 19;
    edad[2] = 10;
    edad[3] = 11;
    edad[4] = 12;
    
     
       
        
//        for (int i = 0; i < 5; i++) {
//            System.out.println(edad[i]);
//        }
        for (int i : edad) {
            System.out.println(edad + "");
        }
        
    }
}
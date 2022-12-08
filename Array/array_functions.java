import java.util.*;

class array_functions {
    static void printarrr(int[] n){
      for (int n2 = 0; n2 < n.length; n2++) {
        System.out.println(n[n2]);
      }
    }
    public static void main(String[] args) {

        int[] n = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n.length; i++) {
            // insert into array
            System.out.println("Enter Number for " + (i + 1));
            n[i] = sc.nextInt();

        }

        System.out.println("Print array");
        printarrr(n);

        System.out.println("Delete  from array");
        System.out.println("Enter number to delete from array");
        var d = sc.nextInt();
        for (int i = 0; i < n.length; i++) {
          
            if(n[i] == d){
                System.out.println("FOUND");
               for (int j = i; j < n.length; j++)
               {
                    n[j] = n[j + 1];
               }
            }

        }
        printarrr(n);
      

    }
  
}
import java.util.Scanner;

class Demo{

public static void main(String args[])

{

Scanner sc=new Scanner(System.in);


int[] arr=new int[10];

for(int i=0;i<10;i++){

arr[i]=sc.nextInt();

}

for(int i=0;i<10;i++){

System.out.print(arr[i]);

if(arr[i]%2==0){

System.out.println(" Even");
}
else{

System.out.println(" Odd");
}

}

}
}







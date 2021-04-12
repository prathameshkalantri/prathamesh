import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);     
        String str = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
        
        String input = s.nextLine();
        char arr[] = input.toCharArray();
        
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i] != 'Q' && arr[i] != 'A' && arr[i] != 'Z' && arr[i] != '`')
            {
                if(arr[i] == ' ')
                    System.out.print(" ");
                else
                    System.out.print(str.charAt(str.indexOf(""+arr[i])-1));
            }
        }
        System.out.println();
    }
}
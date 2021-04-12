import java.util.Scanner;

class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner s = new Scanner(System.in);
        int fno,sno,i,start,end,max,cycleCount,num;

        while (s.hasNextInt())
        {
            fno = s.nextInt();
            sno = s.nextInt();
            start = Math.min(fno, sno);
            end = Math.max(fno, sno);
            max = 0;

            for(i=start ; i<=end ; i++)
            {
                num = i;
                cycleCount = 1;
                while(num>1)
                {
                    if(num % 2 == 0)
                        num = num / 2;
                    else
                        num = 3*num + 1;

                    cycleCount += 1;
                }
                if(cycleCount > max)
                    max = cycleCount;

            }
            System.out.println(fno+" "+sno+" "+max);

        }
    }
}

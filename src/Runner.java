public class Runner {
    public static void main(String[] args)
    {
        int [] arr={0,1,1,1,1,11,1,1,1,1,1,1,1,1,10,1,1,1,1,11,1,1,1,1,1,1,1,1,1};

        boolean done=false;
        while(!done)
        {
           done=true;
           for(int i=0;i<arr.length-1;i++)
           {
               int a=arr[i];
               int b=arr[i+1];
               if(a>b)
               {
                   done=false;
                   arr[i]=b;
                   arr[i+1]=a;

               }

               System.out.println();
           }
        }
    }
    public static String toString()
    {

    }


}

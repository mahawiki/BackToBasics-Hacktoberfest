
class _13_noPyramid 
{ 
    public static void main(String args[]) 
    { 
        int n = 5, i, j, num , gap; 
        gap = n - 1; 

        for ( j = 1 ; j <= n ; j++ ) //each row
        { 
            num = j; 

            for ( i = 1 ; i <= gap ; i++ ) //space
            {                                                   
                System.out.print(" "); 
            }
            gap --; 

            for ( i = 1 ; i <= j ; i++ ) //ascending order no
            { 
                System.out.print(num); 
                num++; 
            } 
            num-=2; 

            for ( i = 1 ; i < j ; i++) //descending order no
            { 
                System.out.print(num); 
                num--; 
            } 
            System.out.println(); 
        } 
    } 
}

class clonearray
{
    public static void main(String args[])
    {
        // declaring and initializing 2D array
        int arr[][] = { {2,7,9},{3,6,1},{7,4,2} };
        int clonearr[][]=arr.clone();
        // printing 2D array
        for (int i=0; i< 3 ; i++)
        {
            for (int j=0; j < 3 ; j++)
                System.out.print(clonearr[i][j] + " ");
 
            System.out.println();
        }
    }
}

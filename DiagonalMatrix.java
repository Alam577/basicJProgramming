    import java.util.Scanner;

public class DiagonalMatrix 
{
    /*    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int m=sc.nextInt();
            int n=sc.nextInt();

            int mat[][]=new int[m][n];

            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    mat[i][j]=sc.nextInt();
                }
            }
            System.out.println(" matrix is");

            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(i==j || (i+j+1)==n)
                    mat[i][j]=0;
                    
                }
            }


            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(mat[i][j]+" ");
                    
                }
                System.out.println();
            }
        }*/
        
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int m=sc.nextInt();
            int mat [][]=new int [n][m];

            InputMat(sc,mat,n,m);
            ZeroDiagnoal(mat,n,m);
            printMat(mat,n,m);
        }

        public  static void InputMat(Scanner sc,int mat[][],int n,int m)
        {//taking input matriz
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    mat[i][j]=sc.nextInt();
                }
            }   
        }


        public static void  ZeroDiagnoal(int mat[][],int n,int m)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(i==j || (i+j+1)==n)
                    {

                        mat[i][j]=0;
                    }
                }
             } 
        }      
            public static void printMat(int mat[][],int n,int m)
            {

            //taking input matriz
             for(int i=0;i<n;i++)
             {
                 for(int j=0;j<m;j++)
                 {
                     System.out.print( mat[i][j]+" ");
                 }
                 System.out.println();
            }
           }    
        

    }
    

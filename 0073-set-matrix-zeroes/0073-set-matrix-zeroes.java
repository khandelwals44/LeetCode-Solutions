class Solution {
     public void setZeroes(int[][] matrix) {
         int m = matrix.length;
         int n = matrix[0].length;
//         int index_i = 0;int index_j = 0;
//         int[][] ans = new int[matrix.length][matrix[0].length];        
//         for(int i = 0;i<matrix.length;i++){
//             for(int j = 0;j<matrix[0].length;j++){
//                 if(matrix[i][j]==0){
//                     markRow(i,matrix);
//                     markCol(j,matrix);
//                 }
//             }
//         }
//         System.out.print("[");
//         for(int i = 0;i<matrix.length;i++){
//             //System.out.print("[");
//             for(int j = 0;j<matrix[0].length;j++){
                
//                 if(matrix[i][j]==-1){
//                     matrix[i][j]=0;
//                 }
//                 else
//                 System.out.print(matrix[i][j]);
                
//             }
//         System.out.print("]");
//         }
//         System.out.print("]");
//     }
    
//     public void markRow(int i,int[][] matrix){
//         for(int j = 0;j<matrix[0].length;j++){
//             if(matrix[i][j]!=0)
//                 matrix[i][j]= -1;
//         }
//     }
    
    
//     public void markCol(int j,int[][] matrix){
//         for(int i = 0;i<matrix.length;i++){
//             if(matrix[i][j]!=0)
//                 matrix[i][j]=-1;
//         }
//     }  
         
         
         
         
     //brute force
//     int m= matrix.length, n= matrix[0].length;
//         int matrix2[][]= new int[m][n];
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++)
//                 matrix2[i][j]=matrix[i][j];
//         }
        
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(matrix[i][j]==0){
//                     for(int k=0;k<n;k++)
//                         matrix2[i][k]=0;

//                     for(int k=0;k<m;k++)
//                         matrix2[k][j]=0;
//                 }
//             }
//         }
    
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++)
//                 matrix[i][j]=matrix2[i][j];
//         }
         
   
        
         //better solution
        //  int[] row = new int[matrix.length];
        //  int[] coloumn = new int[matrix[0].length];
        //  Arrays. fill(row, 0);
        //  Arrays. fill(coloumn, 0);
        //  for(int i = 0;i<matrix.length;i++){
        //     for(int j = 0;j<matrix[0].length;j++){
        //         if(matrix[i][j]==0){
        //             row[i]=1;
        //             coloumn[j]=1;
        //         }
        //     }
        // }
        //  for(int i = 0;i<matrix.length;i++){
        //     for(int j = 0;j<matrix[0].length;j++){
        //         if(row[i]==1 || coloumn[j] ==1){
        //             matrix[i][j]=0;
        //         }
        //     }
        // }
         
         //Optimal Solution
         //int[] row = new int[matrix.length]; matrix[][0];
         //int[] coloumn = new int[matrix[0].length];matrix[0][];
         int col0=-1;
         //Arrays. fill(row, 0);
         //Arrays. fill(coloumn, 0);
         for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    if(j != 0)
                        matrix[0][j]=0;
                    else 
                        col0=0;
                }
            }
        }
         for(int i = 1;i<matrix.length;i++){
            for(int j = 1;j<matrix[0].length;j++){
                if(matrix[i][j]!=0){
                    
                    if(matrix[i][0] == 0 || matrix[0][j]==0)
                        matrix[i][j]=0;
                }
            }
        }
         if(matrix[0][0]==0)
         for(int i = 0;i<matrix[0].length;i++){
             matrix[0][i]=0;
         }
         
         if(col0==0)
         for(int i = 0;i<matrix.length;i++){
             matrix[i][0]=0;
         }
}
}
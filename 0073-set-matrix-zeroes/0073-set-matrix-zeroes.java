class Solution {
     public void setZeroes(int[][] matrix) {
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
    int m= matrix.length, n= matrix[0].length;
        int matrix2[][]= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                matrix2[i][j]=matrix[i][j];
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<n;k++)
                        matrix2[i][k]=0;

                    for(int k=0;k<m;k++)
                        matrix2[k][j]=0;
                }
            }
        }
    
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                matrix[i][j]=matrix2[i][j];
        }
}
}
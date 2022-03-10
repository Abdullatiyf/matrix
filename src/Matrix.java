public class Matrix {
    public static void main(String[] args) {
        int [][] mat={ {1,4,7},{12,87,9},{32,71,28} };
        int sum=0,sum1=0;

//      Program to find sum of diagonal of array's matrix

        for (int i=0; i< mat.length;i++){
          sum=sum+mat[i][i];

        }

//          Program to find sum of anti-diagonal of array's matrix

       for (int j=0;j< mat.length;j++){
            sum1+=mat[j][mat.length-j-1];
        }
        System.out.println("Result of 1 diagonal:"+sum);
        System.out.println("Result of 2 diagonal:"+sum1);
        System.out.println("Result of x shape diagonal:"+(sum+sum1));


        //      Program to find subtraction sum  of diagonal of array's matrix

        for (int k=0; k< mat.length;k++){
            sum+=mat[k][k];
            sum*=-1;

        }

//          Program to find subtraction sum subtraction of anti-diagonal of array's matrix

        for (int l=0;l< mat.length;l++){
            sum1+=mat[l][mat.length-l-1];
            sum1*=-1;
        }
        System.out.println("S Result of 1 diagonal:"+sum);
        System.out.println("S Result of 2 diagonal:"+sum1);
        System.out.println("S Result of x shape diagonal:"+(sum +sum1));
        sum=0;
        sum1=0;

//        Program to convert index of diagonal of array's matrix to 0
        for (int f=0; f< mat.length;f++){
            mat[f][f]=sum;
        }
//        Program to convert index of anti-diagonal of array's matrix to 0
        for (int d=0;d< mat.length;d++){
            mat[d][mat.length-d-1]=sum1;
        }
        System.out.println("0 Result of 1 diagonal:"+sum);
        System.out.println("0 Result of 2 diagonal:"+sum1);
    }
}

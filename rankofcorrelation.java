package parth;

class anju{
    public static int count = 0;
    public static void main(String[] args) {
        float[] arr1 = {3,5,8,4,7,10,2,1,6,9};
        float[] arr2 = {6,4,9,8,1,2,3,10,8,7};
        System.out.println(rankcorrelation(arr1,arr2));

    }
    static float dsquare(float[] arrx , float[] arry){
        float sum = 0;
        for (int i = 0; i < arrx.length; i++) {
            float temp = arrx[i] - arry[i];
            sum += temp * temp;
        }

        return sum;
    }
    static float rankcorrelation(float[] arrx , float[] arry){
        int n = arrx.length;
        float rightnumerator = 6 * dsquare(arrx,arry);
        float rightdenominator = n * ((n * n) - 1);
        float rightside = rightnumerator / rightdenominator;
        return 1 - rightside;

    }
    static void coffecientofrelatio(float yx , float xy){
        System.out.println("The coffecient of correlation is " + Math.sqrt(yx * xy));

    }
    static void answer(float[] arrx , float[] arry){
        float yx = correlation(arrx,arry ,true);
        float xy = correlation(arrx,arry ,false);
        System.out.println("The YX is " + yx);
        System.out.println("The XY is " + xy);

        coffecientofrelatio(yx,xy);
    }
    static float correlation(float[] arrx , float[] arry , boolean check){
        float n = arrx.length;

        float sumx = totalsum(arrx);
        if (count != 1){
            System.out.println("The total sum of x elements are " + sumx);
            System.out.println("The mean of x is " + sumx / n);
        }
        float sumy = totalsum(arry);

       if (count != 1){
           System.out.println("The total sum of y elements are " + sumy);
           System.out.println("The mean of y is " + sumy/ n);
       }
        count++;

        float productxy = combination(arrx,arry);
        float squaresumx = sumx * sumx;
        float squaresumy = sumy * sumy;
        float squareeveryx = square(arrx);
        float squareeveryy = square(arry);
        float numerator = (n * (productxy)  - (sumx * sumy));
        float denominator;
        if (check){ //yx
            denominator = (n * (squareeveryx)) - (squaresumx);
        }
        else{ //xy
            denominator = (n * (squareeveryy)) - (squaresumy);

        }
        return numerator / denominator;

    }
    static float square(float[] arr){
        float sum = 0;
        for (float v : arr) {
            sum += v * v;
        }
        return sum;
    }
    static float combination(float[] arr1 , float[] arr2){
        float sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i] * arr2[i];
        }
        return sum;
    }
    static float totalsum(float[] arr){
        float sum = 0;
        for (float v : arr) {
            sum += v;
        }
        return sum;
    }

}

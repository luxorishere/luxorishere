 double[] arr = {5,15,25,35,45};
        int[] frequncy = {4,8,10,6,7};
        filogxi(log(arr),frequncy);


    }

    static int[] mod(int[][] arr){
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = (arr[i][0] + arr[i][1]) / 2;

        }
        return array;
    }
    static void filogxi(double[] arr , int[] frequency){
        double[] filogxi = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            filogxi[i] = (arr[i] * frequency[i]);
        }
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += filogxi[i];
        }
        int N = 0;
        for (int i = 0; i < arr.length; i++) {
            N += frequency[i];
        }
        System.out.println("The logxi series is ");
        System.out.println(Arrays.toString(arr));
        System.out.println("The fi series is");
        System.out.println(Arrays.toString(frequency));
        System.out.println("The sum is " + sum);
        System.out.println("The Antilog total is " + Math.pow(10,(sum/N)));
        System.out.println(Arrays.toString(filogxi));
    }

    static double[] log(double[] arr){
        int length = arr.length;
        double[] log = new double[length];
        for (int i = 0; i < length; i++) {
            log[i] = Math.log10(arr[i]);
        }
        System.out.println("X series is ");
        System.out.println(Arrays.toString(arr));
        return log;
    }

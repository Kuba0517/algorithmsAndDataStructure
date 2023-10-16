package sumAlgorithms;

public class SumOfAnySets {


    static int[] sumOfAnySets(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int[] tmpSum = new int[n + m];

        int cLenght = 0;

        for(int i=0; i< n; i++){
            tmpSum[i] = arr1[i];
            cLenght++;
        }

        for(int i=0; i<m; i++){
            boolean duplicate = false;
            for(int j = 0; j < tmpSum.length; j++){
                if(arr2[i] == tmpSum[j]){
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate){
                tmpSum[n + i] = arr2[i];
                cLenght++;
            }
        }

        //System.out.println(cLenght);

        int[] c = new int[cLenght];
        for(int x = 0 ; x<cLenght; x++){
            c[x] = tmpSum[x];
            System.out.println(c[x]);
        }

        return c;
    }
}

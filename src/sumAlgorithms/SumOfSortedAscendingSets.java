package sumAlgorithms;

public class SumOfSortedAscendingSets {

    static int[] sumOfSortedAscendingSets(int[] tab1, int[] tab2){
        int n = tab1.length;
        int m = tab2.length;

        int[] tempSum = new int[n + m];
        int i = 0, k = 0, j = 0;

        while (k < n && j < m) {
            if (tab1[k] < tab2[j]) {
                tempSum[i] = tab1[k];
                i++; k++;
            } else if (tab2[j] < tab1[k]) {
                tempSum[i] = tab2[j];
                i++; j++;
            } else {
                tempSum[i] = tab1[k];
                i++; k++; j++;
            }
        }

        while (k < n) {
            tempSum[i] = tab1[k];
            i++; k++;
        }

        while (j < m) {
            tempSum[i] = tab2[j];
            i++; j++;
        }

        int[] sum = new int[i];
        for (int a = 0; a < i; a++) {
            sum[a] = tempSum[a];
        }

        return sum;
    }
}

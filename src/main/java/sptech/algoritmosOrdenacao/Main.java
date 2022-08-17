package sptech.algoritmosOrdenacao;

public class Main {

    public static void showArray(int[] array, int i) {
        if (i < array.length) {
            System.out.println(array[i]);
            showArray(array, i + 1);
        }
    }

    public static void main(String[] args) {
        int[] data = { 6, 13, 10, 7, 9, 18, 5, 11, 18, 5 };
        // insertSort(data);
        // mergeSort(data,0,data.length);
        // quickSort(data);
        showArray(data, 0);
    }

    public static void insertSort(int[] v) {
        int aux = 0;
        for (int i = 0; i < v.length; i++) {
            int j = i-1;
            aux = v[i];
            while(j>=0 && v[j]>aux) v[j+1] = v[j--];
            v[j+1] = aux;
        }
    }

    public static void mergeSort(int[] v, int start, int end) {
        if(start < end-1){
            int middle = (start + end) / 2;
            mergeSort(v,start,middle);
            mergeSort(v,middle,end);
            merge(v,start,middle,end);
        }
    }

    public static void merge(int[] v, int start, int middle, int end){
        int i = start;
        int j = middle;
        int k = 0;
        int[] w = new int[end-start];
        while(i<middle && j< end) {
            if(v[i] <= v[j]) w[k++] = v[i++];
            else w[k++] = v[j++];
        }
        while(i<middle) w[k++] = v[i++];
        while(j<end) w[k++] = v[j++];
        for(int q = start; q <= end-1; q++) v[q] = w[q-start];
    }

    public static void quickSort(int[] v){
        partition(v,0,v.length-1);
    }

    public static void partition(int v[], int indInicio, int indFim){
        int i = indInicio;
        int j = indFim;
        int pivo = v[(indInicio+indFim)/2];
        while(i<=j){
            while(i < indFim && v[i] < pivo) i = i + 1;
            while(j > indInicio && v[j] > pivo) j = j - 1;
            if(i<=j){
                int aux = v[i];
                v[i] = v[j];
                v[j] = aux;
                i = i + 1;
                j = j - 1;  
            }
        }        
        if(indInicio < j) partition(v,indInicio,j-1);
        if(i < indFim) partition(v,i,indFim);
    }

}

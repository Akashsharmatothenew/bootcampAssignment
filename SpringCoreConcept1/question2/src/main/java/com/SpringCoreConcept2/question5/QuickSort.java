package com.SpringCoreConcept2.question5;

import org.springframework.stereotype.Component;

/**
 * Created by ttn on 4/3/21.
 */
@Component
public class QuickSort implements SortAlgorithm{
    public int[] sort(int [] number, int low,int high){

        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(number, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(number, low, pi-1);
            sort(number, pi+1, high);
        }
        return number;
    }
    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}

package org.bank;

public class ArraySorting { // QuickSort
    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();

        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();

        as.sort(qs);
        as.sort(bs);

        Sorting quickSorting = () -> System.out.println("Quick sorting");
        as.sort(quickSorting);

        as.sort( () -> System.out.println("Quick sorting"));


    }
    //  Sorting Interface and obj then obj call the method sort()
    private void sort(Sorting sorting){
      sorting.sort();
    }
}
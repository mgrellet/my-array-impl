package com.arrays.own;

import java.util.Arrays;

public class MyArray {
    private int[] numbers;
    private int length;
    private int lastAdded = 0;

    public MyArray() {
    }

    public MyArray(int length) {
        this.length = length;
        this.numbers = new int[length];
    }

    public void print() {
        for (int i = 0; i < lastAdded; i++) {
            System.out.println(numbers[i]);
        }
    }

    public void insert(int item) {
        if (this.lastAdded == this.length) {
            int[] newItem = new int[this.length * 2];
            newItem = Arrays.copyOf(this.numbers, this.length * 2);
            this.numbers = newItem;
        }
        this.numbers[lastAdded] = item;
        this.lastAdded++;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= this.lastAdded) {
            throw new IllegalArgumentException();
        }

        for (int i = index; i < lastAdded; i++) {
            this.numbers[i] = this.numbers[i + 1];
            lastAdded--;
        }
    }

}

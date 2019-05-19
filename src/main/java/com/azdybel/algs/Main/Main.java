package com.azdybel.algs.Main;

import com.azdybel.algs.Algs.InsertionSort;
import com.azdybel.algs.Algs.ListInsertionSort;
import com.azdybel.algs.Algs.SimpleAlgorithm;
import com.azdybel.algs.Interfaces.IAlgorithmRunner;

import static com.azdybel.algs.Helpers.TimeMeasurementHelper.Compare;
import static com.azdybel.algs.Helpers.TimeMeasurementHelper.ExecutionTimeMeasure;

public class Main {
    public static void main(String[] args) {
        ListInsertionSort myListIn = new ListInsertionSort();
        myListIn.setup();
    }

}

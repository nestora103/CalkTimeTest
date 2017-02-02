package ru.geekbrains.java2.dz.dz5.gubenkoDM;

import java.util.ArrayList;

/**
 * Created by Nestor on 07.12.2016.
 */
public class QuickCalker extends Calker {
    private ArrayList<Double> arr1=new ArrayList<>();
    private ArrayList<Double> arr2=new ArrayList<>();

    public QuickCalker(long arrSize) {
        this.arrsize=arrSize;
    }

    @Override
    public String calk() {
        fillArr();
        timeBeg=getTime();
        //разобъем массив на 2 части
        arr1.addAll(testArr.subList(0,Math.round(testArr.size()/2)));
        arr2.addAll(testArr.subList(Math.round(testArr.size()/2),testArr.size()));
        //System.arraycopy(testArr,0,arr1,0,Math.round(testArr.size()/2));
        //System.arraycopy(testArr,0,arr2,Math.round(testArr.size()/2),testArr.size());
        ThreadCalcer thC1=new ThreadCalcer(arr1.size(),arr1);
        Thread thr1=new Thread(thC1);
        ThreadCalcer thC2=new ThreadCalcer(arr2.size(),arr2);
        Thread thr2=new Thread(thC2);
        thr1.start();        thr2.start();
        //соберем измененную коллекцию
        testArr.removeAll(testArr);
        testArr.addAll(0,arr1);
        testArr.addAll(arr1.size(),arr2);
        //System.arraycopy(arr1,0,testArr,0,arr1.size());
        //System.arraycopy(arr2,0,testArr,arr1.size(),arr2.size());
        timeEnd=getTime();
        return Double.toString(timeEnd-timeBeg);
    }
}

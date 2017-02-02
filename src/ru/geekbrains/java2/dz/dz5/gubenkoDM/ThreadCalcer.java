package ru.geekbrains.java2.dz.dz5.gubenkoDM;

import java.util.ArrayList;

/**
 * Created by Nestor on 07.12.2016.
 */
public class ThreadCalcer extends QuickCalker implements Runnable,Calcable {
    private ArrayList<Double> arrPart;

    public ThreadCalcer(int size, ArrayList<Double> arrPart) {
        super(size);
        this.arrPart=arrPart;
    }

    @Override
    public void run() {
        for (int i = 0; i <arrPart.size(); i++) {
            arrPart.set(i,calkElem(arrPart.get(i),i));
        }
    }
}

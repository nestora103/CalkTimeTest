package ru.geekbrains.java2.dz.dz5.gubenkoDM;

import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Nestor on 07.12.2016.
 */
public class Calker implements Calcable {
   protected long arrsize;
   protected ArrayList<Double> testArr;
   //protected Random rand=new Random();
   protected long timeBeg;
   protected long timeEnd;

   protected void fillArr(){
       //так как решил извернуться и сделать все на коллекции то
       //создаем временный массив значений
       Double[] tempArr=new Double[(int) arrsize];
       //заполняем массив нужными нам значениями
       Arrays.fill(tempArr,fConst);
       //запихиваем наш массив в коллекцию
       testArr=new ArrayList<>(Arrays.asList(tempArr));
//       for (int i = 0; i < arrsize; i++) {
//           //testArr.add(fConst);
//           testArr.set(i,fConst);
//           System.out.println(i);
//       }
   }

    @Override
    public String calk() {
        return null;
    }

    protected double calkElem(double arrVal,int arrNum){
        return arrVal*Math.sin(0.2*f+arrNum/5)*Math.cos(0.4*f+arrNum/5)*Math.cos(0.4*f+arrNum/2); //rand.nextDouble()
    }

    protected long getTime(){
        return System.currentTimeMillis();
    }
}

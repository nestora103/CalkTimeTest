package ru.geekbrains.java2.dz.dz5.gubenkoDM;

/**
 * Created by Nestor on 07.12.2016.
 */
public class SlowCalker extends Calker  {
    public SlowCalker(long arrSize) {
        this.arrsize=arrSize;
    }
    @Override
    public String calk() {
        //заполняем коллекцию выставленной константой
        fillArr();
        //засечем время начала
        timeBeg=getTime();
        //сделаем пересчет
        for (int i = 0; i <testArr.size(); i++) {
            testArr.set(i,calkElem(testArr.get(i),i));
        }
        //получим время конца
        timeEnd=getTime();
        return Double.toString(timeEnd-timeBeg);
    }
}

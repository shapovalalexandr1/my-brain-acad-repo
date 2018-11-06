package ua.zp.brainacad.brain.lab5;

/**
 * Created by Brain25 on 01.11.2018.
 */
public class Main {
    public static void main(String [] args){
        Aquarium aquarium = new Aquarium(40.0,30.0,25.0); // Создаём аквариум

        double vol= aquarium.getVol()/1000;                                   //Расчёт объёма аквариума
        System.out.println("Объём аквариума = " + vol +" л");

        Fish [] fish=new Fish[10];                                            //Добавляем рыб в аквариум
        int numFish=0;
        for (int i=0;i<fish.length;i++){
            fish[i]=new Fish(5.0,"Yellow");
            if(fish[i].getLength()<= 5.0){
                numFish=(int) vol/1;
            }
            if(fish[i].getLength()== 6.0){
                numFish=(int) vol/6;
            }
        }
        System.out.println("В аквариум поместится " +numFish+" рыб(а)");
        System.out.println("Создали 10 одиноковых рыб");
        Plant [] plant=new Plant[3];                                          //Добавляем растения в аквариум
        for (int i=0;i<plant.length;i++){
            plant[i]=new Plant(4.5,"Green");
        }
        System.out.println("Создали 3 одиноковых растений");
        Filtr filtr=new Filtr(100.0,100.0);                //Добавляем фильтр в аквариум
        if (filtr.getPower()<vol*3){
            System.out.println("Недостаточная мощность фильтра!");
        }else {
            System.out.println ("Добавлен правильный фильтр");
        }
        Feeder feeder=new Feeder(90.0);
        //Добавляем кормушку в аквариум
        //double food=0.0;
        if (feeder.getCapacity()<fish.length*6){
            System.out.println("Вместительность кормушки недостаточна!");
        }else {
            System.out.println("Добавлена подходящая кормушка");
        }
        LampDay lampDay=new LampDay(60.0,"white",false);
        LampDay lampNight=new LampDay(60.0,"yellow",false);


    }
}

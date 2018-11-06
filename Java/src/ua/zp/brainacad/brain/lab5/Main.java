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
                numFish=(int) vol/1;                                        //Проверка на кол-во рыб
            }
            if(fish[i].getLength()>= 6.0){
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
        Filtr filtr=new Filtr(100.0,60.0);                //Добавляем фильтр в аквариум
        if (filtr.getPower()<vol*3){
            System.out.println("Недостаточная мощность фильтра!");
        }else {
            System.out.println ("Добавлен правильный фильтр");
        }
        Feeder feeder=new Feeder(90.0);                                //Добавляем кормушку в аквариум
        if (feeder.getCapacity()<fish.length*6){
            System.out.println("Вместительность кормушки недостаточна!");
        }else {
            System.out.println("Добавлена подходящая кормушка");
        }
        LampDay lampDay=new LampDay(60.0,"white",false);//Добавляем дневную лампу в аквариум

        LampDay lampNight=new LampDay(100.0,"yellow",false);//Добавляем ночную лампу в аквариум

        Price price=new Price(1.2,5.89,1250.0);       // Задаём стоимость (кВт),(куб.м),(кг)
        double allPowerPrice=((filtr.getConsumption()*0.2)+(lampDay.getConsumption()*8)+(lampNight.getConsumption()*4))*30*1000;
        System.out.println("Затраты на аквариум за месяц :"+ '\n'+allPowerPrice+" кВт электроэнергии, стоимостью "+ allPowerPrice*price.getPowerPrice()+"грн");
        double allWaterPrice=(vol+(vol*0.25))*price.getWaterPrice()/1000;
        System.out.println(vol+(vol*0.25) +" литра(ов) воды, стоимостью "+allWaterPrice+"грн");
        double allFoodPrice=6*fish.length*30*(price.getFoodPrice()/1000);
        System.out.println(6*fish.length*30+" грамм корма, стоимостью "+allFoodPrice+"грн");
    }
}

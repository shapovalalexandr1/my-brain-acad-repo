package ua.zp.brainacad.brain.lab5;

/**
 * Created by Brain25 on 01.11.2018.
 */
public class Main {
    public static void main(String [] args){
        Aquarium aquarium = new Aquarium(40.0,30.0,25.0);
        Fish [] fish=new Fish[10];
        Plant [] plant=new Plant[3];
        Filtr filtr=new Filtr(50.0,100.0);
        Feeder feeder=new Feeder(100.0);
        LampDay lampDay=new LampDay(60.0,"white",false);
        LampDay lampNight=new LampDay(60.0,"yellow",false);
        double vo= aquarium.getVol()/1000;
        System.out.println("Объём аквариума = " + vo +" л");
       // double fishLenght=fish[]
      //  if()
        int numFish=0;
            for (int i=0;i<fish.length;i++){
            fish[i]=new Fish(5.0,"Yellow");
            if(fish[i].getLength()<= 5.0){
              numFish=(int) vo/1;
            }
            if(fish[i].getLength()== 6.0){
                numFish=(int) vo/6;
                }
        }
        System.out.println("В аквариум поместится " +numFish+" рыб(а)");
        System.out.println("Создали 10 одиноковых рыб");

        for (int i=0;i<plant.length;i++){
            plant[i]=new Plant(4.5,"Green");
        }
        System.out.println("Создали 3 одиноковых растений");
    }
}

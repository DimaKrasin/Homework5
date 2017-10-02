package com.goit.homework;

public class CarWheel {

    private double wheelconditional;

    CarWheel(){
        this.wheelconditional = 1;
    }

    CarWheel(double wheelconditional){
        if(wheelconditional>0||wheelconditional<=1){
        this.wheelconditional = wheelconditional;
        }else {System.out.println("wheelconditional need to be in(0;1]");}
    }

    public void newWheel(){wheelconditional =1; }

    public void earseWheel(double x){
        if(x > 100 || x < 0){
            System.out.println("Вы ввели неверное число");
        } else {wheelconditional -= x / 100;
        }

        if (wheelconditional <= 0){
            System.out.println("Вы спалили колесо, нужно ставить новое");
            wheelconditional = 1;
        }
    }

    public double GetWheelCondition(){
        return wheelconditional;
    }

    public void show(){
        System.out.println("Состояние шины = "+wheelconditional);
    }

    public double getWheelconditional() {
        return wheelconditional;
    }
}

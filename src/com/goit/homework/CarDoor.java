package com.goit.homework;

public class CarDoor {
    private boolean doorStatus;
    private boolean windowStatus;

    CarDoor(){
        this.doorStatus = true;
        this.windowStatus = true;
    }

    CarDoor(boolean doorStatus,boolean windowStatus){
        this.doorStatus = doorStatus;
        this.windowStatus = windowStatus;
    }

    public void openDoor(){ doorStatus = true; }

    public void closeDoor(){doorStatus = false; }

    public void changeDoorStatus(){

        if(doorStatus = true){doorStatus = false;
        }else {doorStatus = true;
        }
    }

    public void openWindow(){windowStatus = true; }

    public void closeWindow(){windowStatus = false; }

    public void changeWindowStatus(){
        if(windowStatus = true){windowStatus = false;
        }else {windowStatus = true;
        }
    }

    public void show(){
        System.out.println("doorStatus = "+doorStatus+"\n"+"windowStatus = "+windowStatus);
    }

    public boolean isDoorStatus() {
        return doorStatus;
    }

    public boolean isWindowStatus() {
        return windowStatus;
    }

}

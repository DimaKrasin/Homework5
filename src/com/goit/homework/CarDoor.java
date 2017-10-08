package com.goit.homework;

public class CarDoor {
    private boolean doorStatus;
    Window window = new Window();

    CarDoor(){
        this.doorStatus = true;
        window.windowStatus = true;
    }

    CarDoor(boolean doorStatus,boolean windowStatus){
        this.doorStatus = doorStatus;
        window.windowStatus = windowStatus;
    }

    public void openDoor(){ doorStatus = true; }

    public void closeDoor(){doorStatus = false; }

    public void changeDoorStatus(){

        if(doorStatus = true){doorStatus = false;
        }else {doorStatus = true;
        }
    }

    public void show(){
        System.out.println("doorStatus = "+doorStatus+"\n"+"windowStatus = "+window.windowStatus);
    }

    public boolean isDoorStatus() {
        return doorStatus;
    }

    public void openWindow(){window.windowStatus = true; }

    public void closeWindow(){window.windowStatus = false; }

    public void changeWindowStatus(){
        if(window.windowStatus = true){window.windowStatus = false;
        }else {window.windowStatus = true;
        }
    }

    public boolean isWindowStatus() {
        return window.windowStatus;
    }

    private class Window{
        private boolean windowStatus;
    }

}

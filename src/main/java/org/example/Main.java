package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (!isBarking || clock < 0 || clock > 23) {
            return false;
        } else if (clock >= 20 || clock < 8) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
            if (firstAge>= 13 && firstAge <= 19) {
                return true;
            } else if (secondAge >= 13 && secondAge <= 19) {
                return true;
            } else if (thirdAge >= 13 && thirdAge <= 19) {
                return true;
            } else {
                return false;
            }
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int maxTemp;
        if (isSummer) {
            maxTemp = 45;
        } else {
            maxTemp = 35;
        }

        if (temp >= 25 && temp <= maxTemp) {
            return true;
        } else {
            return false;
        }
    }

    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1;
    }   else {
            return width * height;
        }
}

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }
}


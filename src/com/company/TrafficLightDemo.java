package com.company;

enum TrafficLightColor
{
    Red, Green, Yellow
}

class TrafficLightSimulator
{
    TrafficLightColor tlc = TrafficLightColor.Red;

    public void changeColor()
    {
        switch (tlc)
        {
            case Red:
                tlc = TrafficLightColor.Green;
                break;
            case Yellow:
                tlc = TrafficLightColor.Red;
                break;
            case Green:
                tlc = TrafficLightColor.Yellow;
                break;
        }
    }

    public String toString(){return " " + tlc;}

}

public class TrafficLightDemo
{
    public static void main(String[] args)
    {
        TrafficLightSimulator TL = new TrafficLightSimulator();
        for(int i = 0; i < 9; i++)
        {
            System.out.println(TL);
            TL.changeColor();
        }
    }
}
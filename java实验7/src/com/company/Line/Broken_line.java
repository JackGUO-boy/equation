package com.company.Line;

import java.util.Scanner;

public class Broken_line  extends line{//折线
    @Override
    public void Draw() {

        System.out.println("请输入起点坐标:如100 100");
        Scanner input_x=new Scanner(System.in);//创建一个键盘扫描对象
        int coordinate_x=input_x.nextInt();

        System.out.println("请输入终点坐标:如200 200");
        Scanner input_y=new Scanner(System.in);//创建一个键盘扫描对象
        int coordinate_y=input_y.nextInt();
        System.out.println("绘制了一个折线");
    }

    @Override
    public void setCoordinate(int x, int y) {

    }
}

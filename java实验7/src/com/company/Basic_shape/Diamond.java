package com.company.Basic_shape;

import java.util.Scanner;

public class Diamond extends BasicShape {//菱形

    @Override
    public void Draw() {
        System.out.println("请输入起点坐标:如100 100");
        Scanner input_x=new Scanner(System.in);//创建一个键盘扫描对象
        int coordinate_x=input_x.nextInt();

        System.out.println("请输入终点坐标:如200 200");
        Scanner input_y=new Scanner(System.in);//创建一个键盘扫描对象
        int coordinate_y=input_y.nextInt();
        System.out.println("绘制了一个菱形");
    }

    @Override
    public void setCoordinate(int x, int y) {

    }
}

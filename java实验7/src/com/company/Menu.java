package com.company;

public  class Menu {//菜单

    public Menu() {
    }

    public  void First_level_menu(){
        System.out.println("请您选择需要绘制的形状类型:");
        System.out.println("1.线条；2.矩形；3.箭头总汇；4.公式形状；5.流程图；6.星与旗帜；7.标注；8.基本形状");
    }//一级菜单
    public void Line_meau(){
        System.out.println("请您选择需要绘制的线条类型(请输入1-7)：");
        System.out.println("1.直线 2.折线 3.箭头线 4.曲线 5.双箭头线6. 自由曲线 7.任意多边形");
    }//直线菜单
    public void Rectangle_menu(){
        System.out.println("请您选择需要绘制的矩形类型(请输入1-6)：");
        System.out.println("1.矩形 2.减去单角的矩形 3.减去同角的矩形 4.剪去对角的矩形 5.圆角矩形 6.单圆角矩形");
    }//矩形菜单
    public void Arrow_mueu(){
        System.out.println("请您选择需要绘制的箭头类型(请输入1-12)：");
        System.out.println("1.十字箭头 2.燕尾形箭头 3.下箭头 4.左弧形箭头 5.左箭头 6.右弧形箭头\n" +
                "7.右箭头 8.左右箭头 9.圆角右箭头 10.上箭头 11.上下箭头 12.垂直箭头");
    }//箭头菜单
    public void Formual_menu(){
        System.out.println("请您选择需要绘制的公式类型(请输入1-4)：");
        System.out.println("1.加法箭头 2.减法箭头 3.乘法箭头 4.除法箭头");
    }//公式菜单
    public void Flow_menu(){
        System.out.println("请您选择需要绘制的流程图类型(请输入1-13)：");
        System.out.println("1.流程图：数据 2.流程图：绝策 3.流程图：磁盘 4.流程图：显示 5.流程图：文档 6.流程图：合并\n" +
                "7.流程图：多文档 8.流程图：预定义过程 9.流程图：过程 10.流程图：排序 11.流程图：终止 12.流程图：内部贮存 13.流程图：可选课程");
    }//流程图菜单
    public void StarFlage_menu(){
        System.out.println("请您选择需要绘制的形状类型(请输入1-13)：");
        System.out.println("1.前凸性带 2.十字形 3.十二角形 4.双波形 5.爆炸形 6.七角形\n" +
                "7.六角形 8.八角形 9.五角形 10.横卷形 11.上凸性带 12.竖卷轴 13.波形");
    }//星形与旗帜菜单
    public void Tagging_munu(){
        System.out.println("请您选择需要绘制的标注类型(请输入1-5)：");
        System.out.println("1.云形标注 2.椭圆标注 3.线形标注 4.矩形标注 5.圆角矩形标注");
    }//标注菜单
    public void Basic_menu(){
        System.out.println("请您选择需要绘制的基本形状形状类型(请输入1-20)：");
        System.out.println("1.饼形 2.同心圆 3.十字形 4.立方体 5.圆柱体 6.菱形 7.十二边形\n" +
                "8.椭圆9. 心形 10.六边形 11.闪电型 12.新月形 13.平行四边形 14.正五边形 \n" +
                "15.直角三角形 16.笑脸 17.文本框 18.梯形 19.三角形 20.垂直文本框");
    }//基本图形菜单
    public void out_typle(){
        System.out.println("请您选择需要绘制的形状类型：");
    }
}

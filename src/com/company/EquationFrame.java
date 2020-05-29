package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EquationFrame extends Frame implements ActionListener//方程式框架
{  SquareEquation equation;

    JTextField textA,textB,textC;//文本字段

    JTextArea showRoots;//文本区域

    JButton controlButton;
    //改动的地方：因为编码问题，所以中文字符显示不出来，把button改为Jbutton
    //把Lable改为JLable就可以了
    public EquationFrame()

    { equation=new SquareEquation();//实例化一个平方方程

        textA=new JTextField(8);//二次项系数

        textB=new JTextField(8);//一次项系数

        textC=new JTextField(8);//常数项系数

        showRoots=new JTextArea();

        controlButton=new JButton("确定");

        //面板

        JPanel pNorth=new JPanel();
        //标签

        pNorth.add(new JLabel("二次项系数"));

        pNorth.add(textA);

        pNorth.add(new JLabel("一次项系数"));

        pNorth.add(textB);

        pNorth.add(new JLabel("常数项系数:"));

        pNorth.add(textC);

        pNorth.add(controlButton);


        //【代码1】  //当前窗口作为controlButton的ActionEvent事件的监视器

//增添一行：
        controlButton .addActionListener(this);

        add(pNorth,BorderLayout.NORTH);


        add(showRoots,BorderLayout.CENTER);

        this.setBounds(100,100,630,160);

        setVisible(true);

        validate();//验证

        addWindowListener(new WindowAdapter(){
                              public void windowClosing(WindowEvent e)

                              {
                                  System.exit(0);

                              }
                          }

        );

    }

    public void actionPerformed(ActionEvent e)//执行的操作

    { try{

        double a=Double.parseDouble(textA.getText());  //textA调用方法获取其中的文本

        double b =Double.parseDouble(textB.getText()); //textB调用方法获取其中的文本
        double c=Double.parseDouble(textC.getText());  // textC调用方法获取其中的文本

        equation.setA(a);

        equation.setB(b);

        equation.setC(c);

        textA.setText(""+a);

        textB.setText(""+b);

        textC.setText(""+c);

        showRoots.append("\n 根："+equation.getRootOne());

        showRoots.append("   根："+equation.getRootTwo());

    }

    catch(Exception ex)

    { showRoots.append("\n"+ex+"\n");

    }

    }

}

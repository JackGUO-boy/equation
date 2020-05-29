package com.company;


//这个class里面讲的是求根 以及无根的情况的异常处理（输出相关提示的message）
public class SquareEquation//意思：平方方程
//公式原型:ax²+bx+c=0（a≠0）
{   double a,b,c;

    double root1,root2;//根1 根2

    public void setA(double a)

    { this.a=a;

    }

    public void setB(double b)

    { this.b=b;

    }

    public void setC(double c)

    {this.c=c;

    }

    public double  getRootOne() throws NoRealRootException,NoSquareEquationException
//求第一个根
    {  if(a!=0)

    { double disk=b*b-4*a*c;//这里是b²-4ac

        if(disk>=0)

        {root1=(-b+Math.sqrt(disk))/(2*a);//root1=[-b±√(b²-4ac)]/2a

        }

        else//这里是disk<0的情况

        { throw new NoRealRootException("无实根");

        }

    }

    else//这里是a=0的情况

    {

        throw new NoRealRootException("非二次方程");

    }

        return root1;

    }

    public double  getRootTwo() throws NoRealRootException,NoSquareEquationException
//求第二个根
    {  if(a!=0)

    { double disk=b*b-4*a*c;

        if(disk>=0)

        {root2=(-b-Math.sqrt(disk))/(2*a);

        }

        else

        { throw new NoRealRootException("无实根");

        }

    }

    else

    {

        throw new NoRealRootException("非二次方程");

    }

        return root2;

    }

}

class NoRealRootException extends Exception{ //没有真正的根 （disk<0）异常处理
    String message;

    NoRealRootException(String s) {  message=s;

    }

    public String getMessage() {  return message;

    }

}

class NoSquareEquationException extends Exception

{  String message;

    NoSquareEquationException(String s) {  message=s;//不是平方方程(a=0)的异常情况处理

    }

    public String getMessage() {  return message;

    }

}

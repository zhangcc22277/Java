
/*
* A:案例演示
	* 需求：
		* 定义一个长方形类,定义 求周长和面积的方法，
		* 然后定义一个测试类进行测试。
	分析:
		成员变量:
			宽width,高high
		空参有参构造
		成员方法:
			setXxx和getXxx
			求周长:getLength()
			求面积:getArea()
**/

public class Test1_Rectangle {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.setWidth(10);
        r1.setHigh(10);
        //r1.getLength();
        //r1.getArea();
        System.out.println("面积是："+r1.getArea()+"周长是:"+r1.getLength());
        System.out.println("--------------");
        Rectangle r2 = new Rectangle(20,20);
       // r2.getArea();
        //r2.getLength();
        System.out.println("面积是："+r2.getArea()+"周长是："+r2.getLength());
    }
}

class Rectangle{
    private int width;          //宽
    private int high;           //高

    public Rectangle(){}            //空参构造
    public Rectangle(int width,int high){       //有参构造
        this.width = width;
        this.high = high;
    }
    public void setWidth(int width){           //设置长
        this.width = width;
    }
    public int getWidth(){              //获取长
        return width;
    }
    public void setHigh(int high){     //设置高
        this.high = high;
    }
    public int getHigh(){           //获取高
        return high;
    }
    public int  getLength(){        //获取周长
        return 2*(high+width);
    }
    public int getArea(){           //获取面积
        //System.out.println("面积是："+high*width);
        return width*high;
    }
}




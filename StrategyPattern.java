package Ex4;

public class StrategyPattern {
    public static void main(String[] args) {
        PaintBrush paintbrush=new PaintBrush();
        paintbrush.paint=new RedPaint();
        paintbrush.toPaint();
    }
}
class PaintBrush{
    Paint paint;
    public void toPaint(){
        paint.colour();
    }
}
abstract class Paint{
    public abstract void colour();
}
class RedPaint extends Paint{
    public void colour(){
        System.out.println("You have chosen RedPaint...!!!");
    }
}
class BluePaint extends Paint{
    public void colour(){
        System.out.println("You have chosen BluePaint...!!!");
}
}
class GreenPaint extends Paint{
    public void colour(){
        System.out.println("You have chosen GreenPaint...!!!");
}
}
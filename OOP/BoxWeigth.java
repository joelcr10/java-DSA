package OOP;

public class BoxWeigth extends Box{
    double weight;

    public BoxWeigth(){
        this.weight = -1;
    }

    public BoxWeigth(double l,double w,double h,double weight){
        super(l,w,h);
        this.weight = weight;                                                       
    }
}

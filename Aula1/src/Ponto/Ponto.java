package Ponto;

public class Ponto {
    private double x,y;
    
    public Ponto(double x,double y){
        this.x = x;
        this.y = y;
    }
    
    public double obtemX(){
        return x;
    }
    
    public double obtemY(){
        return y;
    }
    
    public void AlteraX(double x){
        this.x = x;
    }
    public void AlteraY(double y){
        this.y = y;
    }
    
    public void AlteraCordenadas(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public String obtemCordenadas(){
       return "("+x+" , "+y+")";
    }
    
    public double calculaDistancia(Ponto a){
        return (Math.sqrt((a.obtemX()-this.x)*(a.obtemX()-this.x) +
                ((a.obtemY()-this.y))*(a.obtemY()-this.y)));
    }

    public boolean alinhamento(Ponto p2, Ponto p3){
        double coef1 = coeficienteAngular(this,p2);

        double  coef2 = coeficienteAngular(p2,p3);
        
        return (coef1 == coef2);
    }

    private double coeficienteAngular (Ponto p1, Ponto p2){
        return (p2.obtemY() - p1.obtemY()) / (p2.obtemX() - p1.obtemX());
    }
}


package Racional;
public class Racional {
    private int numerador, denominador;

    public Racional(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public Racional soma(Racional fracao){
        if(denominador == fracao.getDenominador()){
             return new Racional(numerador + fracao.getNumerador(),denominador);
        }else{
            return new Racional((numerador*fracao.getDenominador()+fracao.getNumerador()*denominador),denominador*fracao.getDenominador());
        }
    }
    
    public Racional subtracao(Racional fracao){
        if(denominador == fracao.getDenominador()){
             return new Racional(numerador - fracao.getNumerador(),denominador);
        }else{
            return new Racional((numerador*fracao.getDenominador()-fracao.getNumerador()*denominador),(denominador*fracao.getDenominador()));
        }
    }
    
    public Racional multiplicacao(Racional fracao){
        return new Racional(numerador*fracao.getNumerador(),denominador*fracao.getDenominador());
    }
    
    public Racional divisao(Racional fracao){
        return new Racional(numerador*fracao.getDenominador(),denominador*fracao.getNumerador());
    }
    
    public String Apresentar(){
        return numerador+"/"+denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
}


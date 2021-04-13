/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasKedua;

/**
 *
 * @author hp
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{
    private int t;

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public Balok(int t, int p, int l) {
        super(p, l);
        this.t = t;
    }
    @Override
    public double Volume() {
        return this.Luas()*t;
    }

    @Override
    public double luasPermukaan() {
        return 2*(this.Luas()+(p*t)+(t*l));
    }
    
}

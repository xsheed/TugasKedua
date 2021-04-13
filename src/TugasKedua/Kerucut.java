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
public class Kerucut extends Lingkaran implements MenghitungRuang{
    private float t;

    public float getT() {
        return t;
    }

    public void setT(float t) {
        this.t = t;
    }
    @Override
    public double Volume() {
        return this.Luas()*(1.0/3.0)*t;
    }

    public Kerucut(float t, float r) {
        super(r);
        this.t = t;
    }

    @Override
    public double luasPermukaan() {
        double s = Math.sqrt((r*r) + (t*t));
        return this.Luas()+(((float)22/7)*s*r);
    }
    
}

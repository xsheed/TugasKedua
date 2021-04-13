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
public class Lingkaran implements MenghitungBidang {
    protected float r;

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public Lingkaran(float r) {
        this.r = r;
    }
    
    @Override
    public double Luas() {
        return ((float) 22/7)*r*r;
    }

    @Override
    public double Keliling() {
        return ((float) 22/7)*2*r;
    }
    
}

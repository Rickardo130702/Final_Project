package com.example.test;


import android.graphics.drawable.Drawable;

import java.io.Serializable;

public class PromoModel implements Serializable {
    public String teks;
    public Drawable ivpromoBurgerKing;

    public String getTeks() {
        return teks;
    }

    public void setTeks(String teks) {
        this.teks = teks;
    }

    public Drawable getIvpromoBurgerKing() {
        return ivpromoBurgerKing;
    }

    public void setIvpromoBurgerKing(Drawable ivpromoBurgerKing) {
        this.ivpromoBurgerKing = ivpromoBurgerKing;
    }

    public PromoModel(String teks, int ivpromoBurgerKing) {
        this.teks = teks;
        this.ivpromoBurgerKing = ivpromoBurgerKing;
    }
}


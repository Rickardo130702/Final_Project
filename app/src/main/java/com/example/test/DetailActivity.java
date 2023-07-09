package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView textPromodetail;
    ImageView ivpromodetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        PromoModel elments = (PromoModel) getIntent().getSerializableExtra("PromoModel");
        textPromodetail = findViewById(R.id.textPromodetail);
        ivpromodetail = findViewById(R.id.ivpromodetail);

        textPromodetail.setText(elments.getTeks());
        ivpromodetail.setImageDrawable(elments.getIvpromoBurgerKing());
    }
}
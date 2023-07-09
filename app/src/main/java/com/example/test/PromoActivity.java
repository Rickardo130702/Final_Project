package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class PromoActivity extends AppCompatActivity {

    List<PromoModel> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promo);

        addData();

    }

    private void addData() {
        elements = new ArrayList<>();
        elements.add(new PromoModel("BURGER KING Promo FRIYAY CHICKEN! Beli 8pcs Ayam Hanya Rp 88RB khusus di BK APP", R.drawable.burger_king_promo));
        elements.add(new PromoModel("Promo Sakabe BBQ Deal Package Rp 99K/Pax",R.drawable.bbq));
        elements.add(new PromoModel("Promo Emados Shawarma 1 Ayam Roastfry Hanya Rp 59.000 denga Grabfood",R.drawable.emados));
        elements.add(new PromoModel("Promo Fiesta Steak Combo Steak Mulai Dari Rp 75 Ribuan",R.drawable.steak));
        elements.add(new PromoModel("Promo KFC Takeaway Fest Rp 54 Ribuan",R.drawable.kfc_takeaway));

        PromoAdapter adapter = new PromoAdapter(elements, this, new PromoAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(PromoModel item) {
                detail(item);
            }
        });
        RecyclerView recyclerView = findViewById(R.id.rvPromo);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
    private void detail(PromoModel item) {
        Intent intent = new Intent(PromoActivity.this,DetailActivity.class);
        intent.putExtra("PromoModel", item);
        startActivity(intent);
    }

}
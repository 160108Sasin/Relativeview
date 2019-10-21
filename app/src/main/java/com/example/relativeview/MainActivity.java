package com.example.relativeview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView  viewone,viewtwo,viewthree,viewfour;
    Button btnclick;
    int clickcount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnclick=findViewById(R.id.clickhere);
        viewone= findViewById(R.id.iv1);
        viewtwo= findViewById(R.id.iv2);
        viewthree= findViewById(R.id.iv3);
        viewfour= findViewById(R.id.iv4);

        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clickcount++;
                if (clickcount == 5)
                {
                    clickcount=1;

                }



                if(clickcount==1)
                {
                    viewone.setImageResource(R.drawable.fall);
                    viewtwo.setImageDrawable(null);
                    viewthree.setImageDrawable(null);
                    viewfour.setImageDrawable(null);

                }
                else if(clickcount==2)
                {
                    viewtwo.setImageResource(R.drawable.man);
                    viewone.setImageDrawable(null);
                    viewthree.setImageDrawable(null);
                    viewfour.setImageDrawable(null);
                }
                else if(clickcount==3)
                {
                    viewthree.setImageResource(R.drawable.sky);
                    viewtwo.setImageDrawable(null);
                    viewone.setImageDrawable(null);
                    viewfour.setImageDrawable(null);
                }
                else if(clickcount==4)
                {
                    viewfour.setImageResource(R.drawable.water);
                    viewtwo.setImageDrawable(null);
                    viewthree.setImageDrawable(null);
                    viewone.setImageDrawable(null);
                }
//                else
//                {
//                    viewfour.setImageDrawable(null);
//                    Toast.makeText(getApplicationContext(),"You have clicked more than 4 times!", Toast.LENGTH_LONG).show();
//
//                }
            }
        });
    }
}


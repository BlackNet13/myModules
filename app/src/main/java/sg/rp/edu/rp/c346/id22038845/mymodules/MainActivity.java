package sg.rp.edu.rp.c346.id22038845.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mod1;
    TextView mod2;
    TextView mod3;
    TextView mod4;
    TextView mod5;
    TextView mod6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mod1=findViewById(R.id.m1);
        mod2=findViewById(R.id.m2);
        mod3=findViewById(R.id.m3);
        mod4=findViewById(R.id.m4);
        mod5=findViewById(R.id.m5);
        mod6=findViewById(R.id.m6);

        Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);

        mod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("module","mod1");
                intent.putExtra("mC","C235");
                intent.putExtra("mN","IT Security and Management");
                intent.putExtra("aY",2023);
                intent.putExtra("mCred",4);
                intent.putExtra("vN","W64P");
                startActivity(intent);
            }
        });

        mod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("module","mod2");
                intent.putExtra("mC","C346");
                intent.putExtra("mN","Mobile Application Development");
                intent.putExtra("aY",2023);
                intent.putExtra("mCred",4);
                intent.putExtra("vN","E63A");
                startActivity(intent);
            }
        });

        mod3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("module","mod3");
                intent.putExtra("mC","C206");
                intent.putExtra("mN","Software Development Process");
                intent.putExtra("aY",2023);
                intent.putExtra("mCred",4);
                intent.putExtra("vN","W64P");
                startActivity(intent);
            }
        });

        mod4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("module","mod4");
                intent.putExtra("mC","C218");
                intent.putExtra("mN","UI/UX Design for Applications");
                intent.putExtra("aY",2023);
                intent.putExtra("mCred",4);
                intent.putExtra("vN","W64P");
                startActivity(intent);
            }
        });

        mod5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("module","mod5");
                intent.putExtra("mC","C208");
                intent.putExtra("mN","Web Application Development in PHP");
                intent.putExtra("aY",2023);
                intent.putExtra("mCred",4);
                intent.putExtra("vN","W64P");
                startActivity(intent);
            }
        });

        mod6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("module","mod6");
                intent.putExtra("mC","C390");
                intent.putExtra("mN","Portfolio Development");
                intent.putExtra("aY",2023);
                intent.putExtra("mCred",4);
                intent.putExtra("vN","-");
                startActivity(intent);
            }
        });
    }
}
package sg.rp.edu.rp.c346.id22038845.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvDisplay;
    TextView returnBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvDisplay=findViewById(R.id.textView);
        returnBtn=findViewById(R.id.backBtn);

        Intent intentReceived =getIntent();
        String btnSelected = intentReceived.getStringExtra("module");
        String mC =intentReceived.getStringExtra("mC");
        String mN =intentReceived.getStringExtra("mN");
        int aY =intentReceived.getIntExtra("aY",0);
        int mCred = intentReceived.getIntExtra("mCred",0);
        String vN =intentReceived.getStringExtra("vN");

        String output="Module Code: "+mC+"\nModule Name: "+mN+"\nAcademic Year: "+aY+"\nModule Credit: "+mCred+"\nVenue: "+vN;

        if(btnSelected.equals("mod1")){
            tvDisplay.setText(output);
        }else if(btnSelected.equals("mod2")){
            tvDisplay.setText(output);
        }else if(btnSelected.equals("mod3")){
            tvDisplay.setText(output);
        }else if(btnSelected.equals("mod4")){
            tvDisplay.setText(output);
        }else if(btnSelected.equals("mod5")){
            tvDisplay.setText(output);
        }else{
            tvDisplay.setText(output);
        }

        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
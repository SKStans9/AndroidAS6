package th.ac.kmitl.assignment6;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  CustomOnOffButton btCustomOnOff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btCustomOnOff = findViewById(R.id.btCustomOnOff);
        btCustomOnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"ON: "+btCustomOnOff.isOn(),Toast.LENGTH_LONG).show();
            }
        });
    }
}


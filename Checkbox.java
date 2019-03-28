package e.windows10.praktek2_2mobiledev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Checkbox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox);
    }

    public void pesan (View view){
        Toast.makeText(this, "pesanan di kirim!", Toast.LENGTH_SHORT).show();
    }
}

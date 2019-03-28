package e.windows10.prak2_1mobiledev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class button extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button);
    }

    public void tekan(View view) {
        Toast.makeText(this, "Tombol di tekan!", Toast.LENGTH_SHORT).show();
    }
}

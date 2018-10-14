package kwonsoojeong.rockscissorspaper;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button webBtn,randomBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_button);

        webBtn = findViewById(R.id.webBtn);
        webBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://naver.com"));
                startActivity(intent);
                Toast.makeText(MainActivity.this, "go to naver!", Toast.LENGTH_SHORT).show();
            }
        });

        randomBtn = findViewById(R.id.randomBtn);
        randomBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent randomActivity = new Intent(getApplicationContext(), ramdom.class);
                startActivity(randomActivity);
            }
        });

    }
}

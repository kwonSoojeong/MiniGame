package kwonsoojeong.rockscissorspaper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class ramdom extends AppCompatActivity implements View.OnClickListener {
    ArrayList<String> inputStringList = new ArrayList<>();
    EditText editText1;
    LinearLayout inputListLayout;
    TextView resultTextView;
    Button startBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.random_main);
        editText1 = findViewById(R.id.editText1);
        inputListLayout = findViewById(R.id.inputListLayout);
        resultTextView = (TextView)findViewById(R.id.resultText);
        findViewById(R.id.button1).setOnClickListener(this);
        startBtn = findViewById(R.id.startBtn);
        startBtn.setOnClickListener(this);
        findViewById(R.id.resetBtn).setOnClickListener(this);


    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
               String inputStr = editText1.getText().toString();
                inputStringList.add(inputStr);
                TextView inputText = new TextView(this);
                inputText.setText(inputStr);

                inputListLayout.addView(inputText);
                editText1.setText(null);
//                editText1.setEnabled(false);
                break;


            case R.id.resetBtn:
                editText1.setText("");
                editText1.setEnabled(true);
                resultTextView.setText("Result");
                startBtn.setEnabled(true);
                inputStringList = new ArrayList<>();
                inputListLayout.removeAllViews();
                break;

            case R.id.startBtn:
                int randomNum= new Random().nextInt(2);//0.1.2
                CharSequence s = inputStringList.get(randomNum);
                Log.d("test",randomNum+"," + s);
                if(s != null) startBtn.setEnabled(false);



                resultTextView.setText("Result : "+s);
                break;
        }
    }
}

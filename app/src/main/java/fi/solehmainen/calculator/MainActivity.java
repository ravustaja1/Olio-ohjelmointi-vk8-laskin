package fi.solehmainen.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText input1;
    private EditText input2;

    private TextView output;

    private int answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.inputField1);
        input2 = findViewById(R.id.inputField2);
        output = findViewById(R.id.outPutField);
    }

    public void addIntegers(View view) {
        answer = Integer.parseInt(String.valueOf(input1.getText())) + Integer.parseInt(String.valueOf(input2.getText()));
        System.out.println(answer);

        output.setText(Integer.toString(answer));
    }

    public void minusIntegers(View view) {

        answer = Integer.parseInt(String.valueOf(input1.getText())) - Integer.parseInt(String.valueOf(input2.getText()));
        System.out.println(answer);

        output.setText(Integer.toString(answer));

    }

    public void multiplyIntegers(View view) {

        answer = Integer.parseInt(String.valueOf(input1.getText())) * Integer.parseInt(String.valueOf(input2.getText()));
        System.out.println(answer);

        output.setText(Integer.toString(answer));

    }

    public void divideIntegers(View view) {
        float answer2;
        answer2 = Float.parseFloat(String.valueOf(input1.getText())) / Float.parseFloat(String.valueOf(input2.getText()));
        System.out.println(answer2);

        output.setText(Float.toString(answer2));

    }
}
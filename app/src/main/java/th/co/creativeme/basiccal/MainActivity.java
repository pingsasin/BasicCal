package th.co.creativeme.basiccal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int num1;
    int num2;
    double sum;


    private EditText mInput1;
    private EditText mInput2;
    private ImageView mActionCal;
    private EditText mOutput;
    private ImageView mEqualBtn;
    private ImageView mPlusIconBtn;
    private ImageView mMinusIconBtn;
    private ImageView mMultiplyIconBtn;
    private ImageView mDivideIconBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindWidgets();
        setEvent();
    }
    private void bindWidgets() {
        mInput1 = (EditText) findViewById(R.id.input1);
        mInput2 = (EditText) findViewById(R.id.input2);
        mActionCal = (ImageView) findViewById(R.id.actionCal);
        mOutput = (EditText) findViewById(R.id.output);
        mEqualBtn = (ImageView) findViewById(R.id.equalBtn);
        mPlusIconBtn = (ImageView) findViewById(R.id.plusBtn);
        mMinusIconBtn = (ImageView) findViewById(R.id.minusBtn);
        mMultiplyIconBtn = (ImageView) findViewById(R.id.multiplyBtn);
        mDivideIconBtn = (ImageView) findViewById(R.id.divideBtn);

    }

    private void setEvent() {

        num1 = Integer.parseInt(mInput1.getText().toString());
        num2 = Integer.parseInt(mInput2.getText().toString());

        mPlusIconBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum = num1 + num2;
                mOutput.setText(num1 + " + " + num2 + " = " + sum);
            }
        });

        mMinusIconBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum = num1 - num2;
                mOutput.setText(num1 + " - " + num2 + " = " + sum);
            }
        });
        mMultiplyIconBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum = num1 * num2;
                mOutput.setText(num1 + " * " + num2 + " = " + sum);
            }
        });
        mDivideIconBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum = num1 / num2;
                mOutput.setText(num1 + " / " + num2 + " = " + sum);
            }
        });
    }

}

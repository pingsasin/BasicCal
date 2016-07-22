package th.co.creativeme.basiccal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText mInput1 = (EditText) findViewById(R.id.input1);
        final EditText mInput2 = (EditText) findViewById(R.id.input2);
        final TextView mOutPut = (TextView) findViewById(R.id.output);
        final Button mPlusBtn = (Button) findViewById(R.id.plusBtn);
        Button mMinusBtn = (Button) findViewById(R.id.minusBtn);
        Button mMultiplyBtn = (Button) findViewById(R.id.multiplyBtn);
        Button mDivideBtn = (Button) findViewById(R.id.divideBtn);
        //Button mEqualBtn = (Button) findViewById(R.id.equalBtn);
        Button mClearBtn = (Button) findViewById(R.id.clearBtn);

        final TextView mActionCal = (TextView) findViewById(R.id.actionCal);


       /** if (TextUtils.isEmpty(mInput1.getText().toString())
                || TextUtils.isEmpty(mInput2.getText().toString())) {
            return;
        }*/

        mPlusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(mInput1.getText().toString())|| TextUtils.isEmpty(mInput2.getText().toString())) {
                    return;
                }
                double num1 = Double.parseDouble(mInput1.getText().toString());
                double num2 = Double.parseDouble(mInput2.getText().toString());
                double sum = num1 + num2;
                mActionCal.setText("+");
                mOutPut.setText(String.valueOf(sum));
                Toast.makeText(MainActivity.this, "Answered", Toast.LENGTH_SHORT).show();
            }
        });

        mMinusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(mInput1.getText().toString()) || TextUtils.isEmpty(mInput2.getText().toString())) {
                    return;
                }
                double num1 = Double.parseDouble(mInput1.getText().toString());
                double num2 = Double.parseDouble(mInput2.getText().toString());
                double sum = num1 - num2;
                mActionCal.setText("-");
                mOutPut.setText(String.valueOf(sum));
                Toast.makeText(MainActivity.this, "Answered", Toast.LENGTH_SHORT).show();
            }
        });
        mMultiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(mInput1.getText().toString())|| TextUtils.isEmpty(mInput2.getText().toString())) {
                    return;
                }
                double num1 = Double.parseDouble(mInput1.getText().toString());
                double num2 = Double.parseDouble(mInput2.getText().toString());
                double sum = num1 * num2;
                mActionCal.setText("*");
                mOutPut.setText(String.valueOf(sum));
                Toast.makeText(MainActivity.this, "Answered", Toast.LENGTH_SHORT).show();
            }
        });
        mDivideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(mInput1.getText().toString())|| TextUtils.isEmpty(mInput2.getText().toString())) {
                    return;
                }
                double num1 = Double.parseDouble(mInput1.getText().toString());
                double num2 = Double.parseDouble(mInput2.getText().toString());
                double sum = num1 / num2;
                mActionCal.setText("/");
                mOutPut.setText(String.valueOf(sum));
                Toast.makeText(MainActivity.this, "Answered", Toast.LENGTH_SHORT).show();
            }
        });
        mClearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mInput1.setText("");
                mInput2.setText("");
                mOutPut.setText("");
                mActionCal.setText("");
                Toast.makeText(MainActivity.this, "Cleared", Toast.LENGTH_SHORT).show();
            }
        });
        /**mEqualBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(mInput1.getText().toString());
                double num2 = Double.parseDouble(mInput2.getText().toString());
                switch (view.getId()){
                    case R.id.plusBtn:
                        double sum = num1 + num2;
                        mOutPut.setText(String.valueOf(sum));
                        break;
                    case R.id.minusBtn:
                        sum = num1 - num2;
                        mOutPut.setText(String.valueOf(sum));
                        break;
                    case R.id.multiplyBtn:
                        sum = num1 * num2;
                        mOutPut.setText(String.valueOf(sum));
                        break;
                    case R.id.divideBtn:
                        sum = num1 / num2;
                        mOutPut.setText(String.valueOf(sum));
                        break;
                    default:
                        break;
                }
            }
        });*/
    }

}

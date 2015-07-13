package com.example.administrator.bmi1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    private Button countButton;
    private EditText heightText;
    private RadioButton maleBtn, femaleBtn;
    String sex = "";
    double height;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //调用创建视图的函数
        createView();
        //调用性别选择的函数
        sexChoose();
        //调用Button注册监听器的函数
        setListener();
    }
    private void setListener() {
        countButton.setOnClickListener(countListener);
    }

    private View.OnClickListener countListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            Toast.makeText(MainActivity.this, "你是一位" + sexChoose() + "\n"
                    + "你的身高为" + Double.parseDouble(heightText.getText().toString()) + "cm"
                    + "\n你的标准体重为" + getWeight(sexChoose(), height) + "kg", Toast.LENGTH_LONG)
                    .show();
        }
    };
    private String sexChoose(){
        if (maleBtn.isChecked()) {
            sex = "男性";
        }
        else if(femaleBtn.isChecked()){
            sex = "女性";
        }
        return sex;
    }

    //创建视图的函数
    public void createView(){
        //txt=(TextView)findViewById(R.id.txt);
        countButton=(Button)findViewById(R.id.btn);
        heightText=(EditText)findViewById(R.id.etx);
        maleBtn=(RadioButton)findViewById(R.id.male);
        femaleBtn=(RadioButton)findViewById(R.id.female);
        //txt.setBackgroundResource(R.drawable.bg);
    }

    //标准体重格式化输出的函数
    private String format(double num) {
        NumberFormat formatter = new DecimalFormat("0.00");
        String str = formatter.format(num);
        return str;
    }

    //得到标准体重的函数
    private String getWeight(String sex, double height) {
        height = Double.parseDouble(heightText.getText().toString());
        String weight = "";
        if (sex.equals("男性")) {
            weight =format((height - 80) * 0.7);
        }
        else {
            weight = format((height - 70) * 0.6);
        }
        return weight;
    }
}

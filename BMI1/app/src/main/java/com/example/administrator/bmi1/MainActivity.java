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
        //���ô�����ͼ�ĺ���
        createView();
        //�����Ա�ѡ��ĺ���
        sexChoose();
        //����Buttonע��������ĺ���
        setListener();
    }
    private void setListener() {
        countButton.setOnClickListener(countListener);
    }

    private View.OnClickListener countListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            Toast.makeText(MainActivity.this, "����һλ" + sexChoose() + "\n"
                    + "������Ϊ" + Double.parseDouble(heightText.getText().toString()) + "cm"
                    + "\n��ı�׼����Ϊ" + getWeight(sexChoose(), height) + "kg", Toast.LENGTH_LONG)
                    .show();
        }
    };
    private String sexChoose(){
        if (maleBtn.isChecked()) {
            sex = "����";
        }
        else if(femaleBtn.isChecked()){
            sex = "Ů��";
        }
        return sex;
    }

    //������ͼ�ĺ���
    public void createView(){
        //txt=(TextView)findViewById(R.id.txt);
        countButton=(Button)findViewById(R.id.btn);
        heightText=(EditText)findViewById(R.id.etx);
        maleBtn=(RadioButton)findViewById(R.id.male);
        femaleBtn=(RadioButton)findViewById(R.id.female);
        //txt.setBackgroundResource(R.drawable.bg);
    }

    //��׼���ظ�ʽ������ĺ���
    private String format(double num) {
        NumberFormat formatter = new DecimalFormat("0.00");
        String str = formatter.format(num);
        return str;
    }

    //�õ���׼���صĺ���
    private String getWeight(String sex, double height) {
        height = Double.parseDouble(heightText.getText().toString());
        String weight = "";
        if (sex.equals("����")) {
            weight =format((height - 80) * 0.7);
        }
        else {
            weight = format((height - 70) * 0.6);
        }
        return weight;
    }
}

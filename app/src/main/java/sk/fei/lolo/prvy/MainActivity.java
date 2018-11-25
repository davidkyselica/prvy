package sk.fei.lolo.prvy;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
 //toto je 10
    private Button mainButton;
    private EditText mainEdit;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private ListView lv1;
    private int i;
    //private Random rnd = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.textView);
        tv1.setText(getString(R.string.text));

        mainButton = new Button(this);
        mainButton = (Button) findViewById(R.id.main_button);
        mainEdit = (EditText) findViewById(R.id.edit_text);

        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);

       // lv1 = (ListView) findViewById(R.id.list_view);
      //  mainButton.setOnClickListener((View.OnClickListener) this);
        //Log.v("EditText",mainEdit.getText().toString());
        mainButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                onClicked();
                String in = mainEdit.getText().toString();

                tv2.setText(in);
            }
        });
    }
    @SuppressLint("ResourceAsColor")
    private void onClicked(){
        mainButton.setText(getString(R.string.mainButton2));
        mainButton.setBackgroundColor(Color.WHITE);
        mainButton.setTextColor(Color.RED);
        if (i==0){
        tv3.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
        i=1;}
        else{
            tv3.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
            i=0;}

    }
}
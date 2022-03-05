package ru.mirea.gribkova.layouttype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button buttonOk;
    private Button buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextView = (TextView) findViewById(R.id.textView);
        myTextView.setText("New text in MIREA");
        Button button = findViewById(R.id.button);
        button.setText("MireaButton");
        CheckBox checkBox = findViewById(R.id.check_box);
        checkBox.setChecked(true);

        textView = (TextView) findViewById(R.id.tvOut);
        buttonOk = (Button) findViewById(R.id.btnOk);
        buttonCancel = (Button) findViewById(R.id.btnCancel);

        View.OnClickListener oclBtnOk = new View.OnClickListener(){
            public void onClick(View v){
                textView.setText("Нажата кнопка Ok");
            }
        };
        buttonOk.setOnClickListener(oclBtnOk);

        View.OnClickListener oclBtnCl = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Нажата кнопка Cancel");
            }
        };

        buttonCancel.setOnClickListener(oclBtnCl);
    }
}
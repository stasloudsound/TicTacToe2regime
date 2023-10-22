package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityPlayerPlayer extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    String krestic, nolic;
    TextView textView;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_player);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);

        textView = findViewById(R.id.textView);

        krestic = "X";
        nolic = "O";
        textView.setText("");

    }

    public void first_0(View view)
    {
        count ++;
    }
    public void backActivityMain(View view) {
        Intent intent = new Intent();
        setResult(1000, intent);
        finish();

    }

    public void btn1_click(View view) {
        count++;
        if (btn1.getText() == "" && textView.getText() == "" && count % 2 == 1) {
            btn1.setText(krestic);
            winnerPlayer1();
        } else if (btn1.getText() == "" && textView.getText() == "" && count % 2 == 0) {
            btn1.setText(nolic);
            winnerPlayer2();
        }
    }

    public void btn2_click(View view) {
        count++;
        if (btn2.getText() == "" && textView.getText() == "" && count % 2 == 1) {
            btn2.setText(krestic);
            winnerPlayer1();
        } else if (btn2.getText() == "" && textView.getText() == "" && count % 2 == 0) {
            btn2.setText(nolic);
            winnerPlayer2();
        }
    }

    public void btn3_click(View view) {
        count++;
        if (btn3.getText() == "" && textView.getText() == "" && count % 2 == 1) {
            btn3.setText(krestic);
            winnerPlayer1();
        } else if (btn3.getText() == "" && textView.getText() == "" && count % 2 == 0) {
            btn3.setText(nolic);
            winnerPlayer2();
        }
    }

    public void btn4_click(View view) {
        count++;
        if (btn4.getText() == "" && textView.getText() == "" && count % 2 == 1) {
            btn4.setText(krestic);
            winnerPlayer1();
        } else if (btn4.getText() == "" && textView.getText() == "" && count % 2 == 0) {
            btn4.setText(nolic);
            winnerPlayer2();
        }
    }

    public void btn5_click(View view) {
        count++;
        if (btn5.getText() == "" && textView.getText() == "" && count % 2 == 1) {
            btn5.setText(krestic);
            winnerPlayer1();
        } else if (btn5.getText() == "" && textView.getText() == "" && count % 2 == 0) {
            btn5.setText(nolic);
            winnerPlayer2();
        }
    }

    public void btn6_click(View view) {
        count++;
        if (btn6.getText() == "" && textView.getText() == "" && count % 2 == 1) {
            btn6.setText(krestic);
            winnerPlayer1();
        } else if (btn6.getText() == "" && textView.getText() == "" && count % 2 == 0) {
            btn6.setText(nolic);
            winnerPlayer2();
        }
    }

    public void btn7_click(View view) {
        count++;
        if (btn7.getText() == "" && textView.getText() == "" && count % 2 == 1) {
            btn7.setText(krestic);
            winnerPlayer1();
        } else if (btn7.getText() == "" && textView.getText() == "" && count % 2 == 0) {
            btn7.setText(nolic);
            winnerPlayer2();
        }
    }

    public void btn8_click(View view) {
        count++;
        if (btn8.getText() == "" && textView.getText() == "" && count % 2 == 1) {
            btn8.setText(krestic);
            winnerPlayer1();
        } else if (btn8.getText() == "" && textView.getText() == "" && count % 2 == 0) {
            btn8.setText(nolic);
            winnerPlayer2();
        }
    }

    public void btn9_click(View view) {
        count++;
        if (btn9.getText() == "" && textView.getText() == "" && count % 2 == 1) {
            btn9.setText(krestic);
            winnerPlayer1();
        } else if (btn9.getText() == "" && textView.getText() == "" && count % 2 == 0) {
            btn9.setText(nolic);
            winnerPlayer2();
        }
    }

    public void winnerPlayer1(){
        if(btn1.getText() == krestic && btn2.getText() == krestic && btn3.getText() == krestic){
            textView.setText(R.string.winner_massage);
        }

        else
        if(btn4.getText() == krestic && btn5.getText() == krestic && btn6.getText() == krestic){
            textView.setText(R.string.winner_massage);
        }

        else
        if(btn7.getText() == krestic && btn8.getText() == krestic && btn9.getText() == krestic){
            textView.setText(R.string.winner_massage);
        }

        else
        if(btn1.getText() == krestic && btn4.getText() == krestic && btn7.getText() == krestic){
            textView.setText(R.string.winner_massage);
        }

        else
        if(btn2.getText() == krestic && btn5.getText() == krestic && btn8.getText() == krestic){
            textView.setText(R.string.winner_massage);
        }

        else
        if(btn3.getText() == krestic && btn6.getText() == krestic && btn9.getText() == krestic){
            textView.setText(R.string.winner_massage);
        }

        else
        if(btn1.getText() == krestic && btn5.getText() == krestic && btn9.getText() == krestic){
            textView.setText(R.string.winner_massage);
        }

        else
        if(btn3.getText() == krestic && btn5.getText() == krestic && btn7.getText() == krestic){
            textView.setText(R.string.winner_massage);
        }
        else
        if (btn1.getText() != "" && btn2.getText() != "" && btn3.getText() != "" &&
                btn4.getText() != "" && btn5.getText() != "" && btn6.getText() != "" &&
                btn7.getText() != "" && btn8.getText() != "" && btn9.getText() != ""){
            textView.setText(R.string.draw_massage);
        }


    }
    public void winnerPlayer2(){
        if(btn1.getText() == nolic && btn2.getText() == nolic && btn3.getText() == nolic){
            textView.setText(R.string.pc_winner_massage);
        }
        if(btn4.getText() == nolic && btn5.getText() == nolic && btn6.getText() == nolic){
            textView.setText(R.string.pc_winner_massage);
        }
        if(btn7.getText() == nolic && btn8.getText() == nolic && btn9.getText() == nolic){
            textView.setText(R.string.pc_winner_massage);
        }

        if(btn1.getText() == nolic && btn4.getText() == nolic && btn7.getText() == nolic){
            textView.setText(R.string.pc_winner_massage);
        }
        if(btn2.getText() == nolic && btn5.getText() == nolic && btn8.getText() == nolic){
            textView.setText(R.string.pc_winner_massage);
        }
        if(btn3.getText() == nolic && btn6.getText() == nolic && btn9.getText() == nolic){
            textView.setText(R.string.pc_winner_massage);
        }

        if(btn1.getText() == nolic && btn5.getText() == nolic && btn9.getText() == nolic){
            textView.setText(R.string.pc_winner_massage);
        }
        if(btn3.getText() == nolic && btn5.getText() == nolic && btn7.getText() == nolic){
            textView.setText(R.string.pc_winner_massage);
        }

    }


    public void onClickRestart(View view) {
        count = 0;
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        textView.setText("");
    }
}





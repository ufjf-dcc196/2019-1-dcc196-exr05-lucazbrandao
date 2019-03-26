package ufjf.br.dcc196;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button[][] matrix = new Button[3][3];
    Boolean player_x_turn = true;
    int roundCounts = 0;
    int player_x_wins = 0;
    int player_o_wins = 0;

    TextView txt_player_x_points;
    TextView txt_player_o_points;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_player_x_points = findViewById(R.id.txt_result_x);
        txt_player_o_points = findViewById(R.id.txt_result_o);

        matrix[0][0] = findViewById(R.id.button1);
        matrix[0][1] = findViewById(R.id.button2);
        matrix[0][2] = findViewById(R.id.button3);
        matrix[1][0] = findViewById(R.id.button4);
        matrix[1][1] = findViewById(R.id.button5);
        matrix[1][2] = findViewById(R.id.button6);
        matrix[2][0] = findViewById(R.id.button7);
        matrix[2][1] = findViewById(R.id.button8);
        matrix[2][2] = findViewById(R.id.button9);

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matrix[i][j].setOnClickListener(this);
            }
        }

    }

    @Override
    public void onClick(View v) {



    }

   
}

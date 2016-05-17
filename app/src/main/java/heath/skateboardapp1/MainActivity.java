package heath.skateboardapp1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textview = (TextView) findViewById(R.id.textView1);
        textview.setOnTouchListener(new View.OnTouchListener() {
            private float startY;
            private float startX;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    startX = event.getX();
                    startY = event.getY();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    //TODO set speed to zero
                    float deltaY = 0;
                    textview.setText(deltaY + "");
                } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    float deltaY = startY - event.getY();
//                    if (deltaY<0f){
//                        deltaY = 0f;
//                        startY=event.getY();
//                    }
                    textview.setText(deltaY + "");
                }
                return true;
            }
        });
    }
}

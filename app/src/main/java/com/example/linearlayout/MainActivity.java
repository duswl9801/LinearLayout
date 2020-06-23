package com.example.linearlayout;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.constraintlayout.widget.ConstraintLayout;

        import android.app.SearchManager;
        import android.content.Context;
        import android.content.Intent;
        import android.os.Bundle;
        import android.service.autofill.OnClickAction;
        import android.view.LayoutInflater;
        import android.view.View;

public class MainActivity extends AppCompatActivity {

    // 어레이리스트 쓸 수도 있음.
//    ConstraintLayout one_layout = findViewById(R.id.container1) ;
//    LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//    View one_container = inflater.inflate(R.layout.activity_main, one_layout, true);
//    ConstraintLayout two_layout = (ConstraintLayout)findViewById(R.id.container2) ;
//    ConstraintLayout three_layout = (ConstraintLayout)findViewById(R.id.container3) ;
//    ConstraintLayout four_layout = (ConstraintLayout)findViewById(R.id.container4) ;
//    ConstraintLayout five_layout = (ConstraintLayout)findViewById(R.id.container5) ;

    @Override
    //savedInstanceState는 액티비티의 이전 저장 상태가 포함된 번들 객체. 처음 생성된 액티비티인 경우 Bundle 객체의 값은 null이다.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 레이아웃 xml파일을 불러오는 함수
        setContentView(R.layout.activity_main);

        ConstraintLayout one_layout = findViewById(R.id.container1) ;
//        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        inflater.inflate(R.layout.activity_main, one_layout, true);

        one_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CalculatorActivity.class);
                startActivity(intent);
            }
        });
    }

//    // 사용자가 원하는 기능이 써져있는는 화면 터치하면 화면 전환해주는 메소드
//    public void switchScreen(ConstraintLayout touched_layout){
//
//        if(touched_layout == one_layout){
//            touched_layout.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent intent = new Intent(getApplicationContext(), CalculatorActivity.class);
//                    startActivity(intent);
//                }
//            });
//        }
//
//    }

}

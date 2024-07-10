package com.example.homework8;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    EditText inputName;
    EditText inputPhone;

    TextView dogCountText;

    ImageView outputImage;
    TextView outputName;
    TextView outputPhone;

    int dogCount = 0;

    Dog dog;

    // 강아지를 담아둘 변수상자
    ArrayList<Dog> dogs = new ArrayList<>();
    int selected = 0;

    ImageButton imageButton1;
    ImageButton imageButton2;
    ImageButton imageButton3;

//    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


    }

    public void init() {

        // 화면에 보이는 것들 중 필요한 거 변수상자에 넣기
        inputName = findViewById(R.id.inputName);
        inputPhone = findViewById(R.id.inputPhone);

        dogCountText = findViewById(R.id.dogCountText);

        outputImage = findViewById(R.id.outputImage);
        outputName = findViewById(R.id.outputName);
        outputPhone = findViewById(R.id.outputPhone);


        imageButton1 = findViewById(R.id.imageButton1);
        imageButton2 = findViewById(R.id.imageButton2);
        imageButton3 = findViewById(R.id.imageButton3);


        //버튼 눌렀을 때 동작시키기

        // 강아지 만들기 버튼
        Button createDogButton = findViewById(R.id.createDogButton);
        createDogButton.setOnClickListener(v -> {

                    // 강아지만들기 함수 호출
                    createDog();
                    dogCount++;
                    dogs.add(dog);
                    dogCountText.setText("총 : " + dogCount);
                    // 강아지 만들면 해당 강아지의 사진을 컨테이너에 넣기
                    if (dogCount == 1) {


                        imageButton1.setImageResource(R.drawable.standupdog);
                        imageButton1.setOnClickListener(a -> {
                            outputImage.setImageResource(R.drawable.standupdog);
                            outputName.setText(dogs.get(0).name);
                            outputPhone.setText(dogs.get(0).phone);
                        });
                    } else if (dogCount == 2) {


                    imageButton2.setImageResource(R.drawable.sitdowndog);
                    imageButton2.setOnClickListener(a -> {
                        outputImage.setImageResource(R.drawable.sitdowndog);
                        outputName.setText(dogs.get(1).name);
                        outputPhone.setText(dogs.get(1).phone);

                    });
                } else if (dogCount == 3) {


                        imageButton3.setImageResource(R.drawable.rundog);
                        imageButton3.setOnClickListener(a -> {
                            outputImage.setImageResource(R.drawable.rundog);
                            outputName.setText(dogs.get(2).name);
                            outputPhone.setText(dogs.get(2).phone);
                        });
                    }
        });




    }

    void createDog() {

        String name = inputName.getText().toString();
        String phone = inputPhone.getText().toString();

        dog = new Dog(name, phone);

    }
}
package banana.digital.sharedelementstransition;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout button = findViewById(R.id.button);
        final ImageView imageView = findViewById(R.id.imageView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    Intent intent = new Intent(MainActivity.this, Activity2.class);
                    final ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, imageView, "transitionName");
                    final Bundle bundle = options.toBundle();
                    startActivity(intent, bundle);
                }
            }
        });
    }
}

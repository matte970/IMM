package e.justyna.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity11 extends AppCompatActivity {
    private static final String[] Hours = new String[]{"1 hour", "6 hours", "12 hours", "24 hours", "48 hours", "7days"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        AutoCompleteTextView editText = findViewById(R.id.autoCompleteTextView);
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Hours );
        editText.setAdapter(adapter);
    }
}

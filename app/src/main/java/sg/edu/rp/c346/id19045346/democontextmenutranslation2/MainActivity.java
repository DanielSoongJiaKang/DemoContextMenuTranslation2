package sg.edu.rp.c346.id19045346.democontextmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTextTranslatedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTextTranslatedText = findViewById(R.id.textViewTranslatedText);

        registerForContextMenu(tvTextTranslatedText);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.menu_main, menu);

        //…
    }


    @Override
    public boolean onContextItemSelected(MenuItem item) {
        // …

        int id = item.getItemId();
        if(id == R.id.Englishh) {
            tvTextTranslatedText.setText("Hello");
            return  true;
        }
        else if (id == R.id.italian) {
            tvTextTranslatedText.setText("Ciao");
            return  true;
        }
        else {
            tvTextTranslatedText.setText("Error Translation");
        }

        return super.onContextItemSelected(item);
    }

}

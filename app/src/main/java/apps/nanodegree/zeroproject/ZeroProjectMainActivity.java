package apps.nanodegree.zeroproject;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.graphics.drawable.shapes.Shape;
import android.widget.Toast;

public class ZeroProjectMainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zero_project_main);

       /* final Button button_spotify = (Button)findViewById(R.id.spotify_button);
        button_spotify.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {

            }
        });*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_zero_project_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void showToast(int toastMsg)
    {
        Toast toast = Toast.makeText(this, toastMsg, Toast.LENGTH_SHORT);
        toast.show();


        return;
    }

    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.spotify_button: {
                showToast(R.string.spotify_click_string);
                break;
            }
            case R.id.scores_button: {
                showToast(R.string.scores_click_string);
                break;
            }
            case R.id.capstone_button: {
                showToast(R.string.capstone_click_string);
                break;
            }
            case R.id.xyz_button: {
                showToast(R.string.reader_click_string);
                break;
            }
            case R.id.library_button: {
                showToast(R.string.library_click_string);
                break;
            }
            case R.id.build_button: {
                showToast(R.string.build_click_string);
                break;
            }


        }
        return;

    }
}

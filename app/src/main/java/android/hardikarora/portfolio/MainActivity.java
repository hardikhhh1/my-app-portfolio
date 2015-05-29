package android.hardikarora.portfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    public static final String TOAST_CONST = "This button will launch ";
    public static final String TOAST_CONST_CAPSTONE = "my capstone app";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    /**
     * Method to display the message as a toast on the screen.
     * @param view : Android view
     */
    public void showMessage(View view){
        Button button = (Button) view;
        String buttonText = ((Button) view).getText().toString().toLowerCase();
        CharSequence toastText = TOAST_CONST + buttonText;
        if(buttonText.equals(getString(R.string.capstone_app).toLowerCase())){
            toastText = TOAST_CONST + TOAST_CONST_CAPSTONE;
        }
        Context context = getApplicationContext();
        int toastDuration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, toastText, toastDuration);
        toast.show();
    }
}

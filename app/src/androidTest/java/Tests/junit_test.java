package Tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import blahblah.testie.MainActivity;
import blahblah.testie.R;

/**
 * Created by GravityGoose on 4/13/2016.
 */
public class junit_test extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;

    public junit_test(){
        super(MainActivity.class);
    }

    //this is the first test
    public void test_first(){
        mainActivity = getActivity();
        TextView textView = (TextView)mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Hello World!",tester);
    }
}

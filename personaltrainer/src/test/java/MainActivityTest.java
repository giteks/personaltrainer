import android.app.Activity;
import com.wasyl.personaltrainer.MainActivity;
import com.wasyl.personaltrainer.R;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    @Test
    public void shouldHaveProperAppName() {
        Activity activity = Robolectric.buildActivity(MainActivity.class).create().get();
        String appName = activity.getResources().getString(R.string.app_name);
        assertThat(appName, equalTo("Personal Trainer"));
    }
}

package online.magicbox.desktop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import online.magicbox.lib.PluginActivity;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        PluginActivity.init("online.magicbox.desktop","magicbox");
        Intent intent = PluginActivity.buildIntent(MainSlice.class);
        startActivity(intent);

        finish();
    }
}

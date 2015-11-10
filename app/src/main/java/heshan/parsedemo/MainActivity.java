package heshan.parsedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.parse.Parse;
import com.parse.ParseObject;

public class MainActivity extends AppCompatActivity {

    ParseObject parseObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "H3qPI9yTucyDYkqJzA3gjUjxc7cJlYMQspxCrWpN", "pzyrUa5gOwMyhRodky4Gp0v7HQrzN5o1dKVxouWJ");

        parseObject = new ParseObject("User");
        parseObject.put("id", 123);
        parseObject.put("name", "Heshan");
        parseObject.saveInBackground();
    }
}

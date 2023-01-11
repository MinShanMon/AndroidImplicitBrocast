package sg.nus.iss.team3.brocastreceiverimplicit;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import java.util.Random;

public class MyReceiver extends BroadcastReceiver {



    protected final String[] quotes = {
            "Life is the sum of our choices.",
            "What hurts more - the pain of hard work or the pain of regret?",
            "Knowledge is knowing what to say. Wisdom is knowing when to say it",
            "quote 4",
            "quote 5",
            "quote 6", "quote 7", "quote 8"
    };
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if(action == null){
            return;

        }
        if(action.equals(Intent.ACTION_BOOT_COMPLETED)){
            Random rand = new Random();
            Toast.makeText(context, quotes[rand.nextInt(quotes.length)], Toast.LENGTH_LONG).show();
        }


    }
}
package cm.aptoide.pt.installer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class Start extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);

    	String weburl = "http://m.aptoide.com/installer";
    	Intent myintent = new Intent(Intent.ACTION_VIEW);
    	myintent.setData(Uri.parse(weburl));
    	startActivity(myintent);
    	
    	finish();
    }
}
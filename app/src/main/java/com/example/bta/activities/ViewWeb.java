package com.example.bta.activities;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.example.bta.R;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

public class ViewWeb extends AppCompatActivity {
protected WebView webView;
FusedLocationProviderClient fusedLocationProviderClient;
Location currentLocation;
public static final int REQUEST_CODE = 101;
double mid_latitude, mid_longitude;
protected String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_web);

        Bundle bundle= getIntent().getExtras();
        int key = bundle.getInt("key");

        webView = findViewById(R.id.viewWeb);
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        switch (key){
            case 1:
                webView.loadUrl("https://en.wikipedia.org/wiki/Nyatapola_Temple");
                break;
            case 2:
                webView.loadUrl("https://en.wikipedia.org/wiki/Dattatreya");
                break;
            case 3:
                webView.loadUrl("https://www.thelongestwayhome.com/blog/nepal/pottery-square-in-bhaktapur/");
                break;
            case 4:
            case 10:
                webView.loadUrl("https://en.wikipedia.org/wiki/Bhaktapur_Durbar_Square");
                break;
            case 11:
            case 22:
                webView.loadUrl("https://en.wikipedia.org/wiki/Changu_Narayan_Temple");
                break;

            case 12:
                webView.loadUrl("https://en.wikipedia.org/wiki/Gai_Jatra");
                break;
            case 13:
                webView.loadUrl("https://gramho.com/explore-hashtag/Tahamacha");
                break;
            case 14:
                webView.loadUrl("https://en.wikipedia.org/wiki/Yomari");
                break;
            case 15:
                webView.loadUrl("http://www.weallnepali.com/blogs/Bijaya-Ghimire/gathe-mangal--ghantakarna-chaturdasi");
                break;
            case 16:
                webView.loadUrl("https://en.wikipedia.org/wiki/Bisket_Jatra");
                break;
            case 17:
                webView.loadUrl("https://www.youtube.com/watch?v=R0DHH1uZeJI");
                break;
            case 18:
                webView.loadUrl("https://www.google.com/maps/dir/27.6694853,85.4400925/Nagarkot+View+Tower,+44804/@27.6832663,85.4628323,14z/data=!3m1!4b1!4m9!4m8!1m0!1m5!1m1!1s0x39eb05df7d3eff5b:0xdf125feb925fb7d4!2m2!1d85.5199324!2d27.692168!3e2");
                break;
            case 19:
                webView.loadUrl("https://www.nepalsanctuarytreks.com/package/suryabinayak-pilot-baba-ashram-hiking/");
                break;
            case 20:
                webView.loadUrl("https://www.youtube.com/watch?v=u1tzN6K_520");
                break;
            case 21:
                webView.loadUrl("https://www.youtube.com/watch?v=TlGKciHku4c");
                break;
            case 23:
                webView.loadUrl("https://www.youtube.com/watch?v=AOSSSUL7LMQ");
                break;
            case 24:
                webView.loadUrl("https://www.youtube.com/watch?v=C_3d-p3OhOU");
                break;
            case 1003:
                webView.loadUrl("https://www.google.com/maps/search/restaurants/@27.6766147,85.4353258,16z/data=!3m1!4b1");
                break;
//            case 40:
//                webView.loadUrl("https://www.google.com/maps/place/Nyatapola+Temple/@27.6713593,85.4271398,17z/data=!3m1!4b1!4m5!3m4!1s0x39eb1aafaf52a8d9:0x8552bfb072200f12!8m2!3d27.6713593!4d85.4293285");
//                break;
            case 2000:
                fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
                fetchLastLocation(27.6775259,85.4378709);
                break;
            case 2001:
                fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
                fetchLastLocation(27.6736493,85.4399309);
                break;
            case 2002:
                fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
                fetchLastLocation(27.6764997,85.4326782);
                break;
            case 2003:
                fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
                fetchLastLocation(27.6733098,85.4382718);
                break;
            case 2004:
                fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
                fetchLastLocation(27.6733098,85.4382717);
                break;
            case 2005:
                fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
                fetchLastLocation(27.6762717,85.4372272);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + key);
        }
    }
    private void fetchLastLocation(final double destination_latitude, final double destination_longitude) {
        final double[] current_latitude = new double[1];
        final double[] current_longitude = new double[1];
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,new String[]
                    {Manifest.permission.ACCESS_FINE_LOCATION},REQUEST_CODE);
            return;
        }
        Task<Location> task = fusedLocationProviderClient.getLastLocation();
        task.addOnSuccessListener(new OnSuccessListener<Location>() {
            @Override
            public void onSuccess(Location location) {
                if(location != null){
                    currentLocation = location;
                    current_latitude[0] = currentLocation.getLatitude();
                    current_longitude[0] = currentLocation.getLongitude();
                    mid_latitude = (destination_latitude + current_latitude[0])/2;
                    mid_longitude = (destination_longitude + current_longitude[0])/2;
                    url = "https://www.google.com/maps/dir/'"+ current_latitude[0] +","+ current_longitude[0] +"'/'"+destination_latitude+","+destination_longitude+"'/@"+mid_latitude+","+mid_longitude+",12z";
                    webView.loadUrl(url);
                }
            }
        });
    }

}

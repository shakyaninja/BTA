package com.example.bta.activities;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.example.bta.R;
import com.example.bta.modals.GetShortestLatLag;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

import java.util.ArrayList;

public class ViewWeb extends AppCompatActivity {
protected WebView webView;
FusedLocationProviderClient fusedLocationProviderClient;
Location currentLocation;
    private ArrayList<LatLng> markerPoints = new ArrayList();
    private GetShortestLatLag getShortestLatLag;
    LatLng shortest;

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
                fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
                fetchLastLocation(27.67116,85.42921);
                break;
            case 2:
                fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
                fetchLastLocation(27.6735732,85.4352401);
                break;
            case 3:
                fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
                fetchLastLocation(27.66986,85.42762);
                break;
            case 4:
            case 10:
                fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
                fetchLastLocation(27.6720221,85.4283008);
                break;
            case 11:
            case 22:
                fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
                fetchLastLocation(27.7167038,85.4288589);
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
                fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
                fetchLastLocation(27.692472,85.5205439);
                break;
            case 19:
                fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
                fetchLastLocation(27.6401489,85.4204704);
                break;
            case 20:
                fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
                fetchLastLocation(27.6247445,85.4272971);
                break;
            case 21:
                fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
                fetchLastLocation(27.6912664,85.4918565);
                break;
            case 23:
                fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
                fetchLastLocation(27.7037671,85.4339727);
                break;
            case 24:
                fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
                fetchLastLocation(27.7051032,85.4830467);
                break;
            case 1000:
                LatLng kamalbinayak1 = new LatLng(27.676372,85.4376489);
                LatLng kamalbinayak2 = new LatLng(27.6770153,85.439282);
                LatLng chayamasingh = new LatLng(27.6736984,85.4393027);
                LatLng Siddhapokhari = new LatLng(27.6719787,85.421788);
                LatLng khasibazar = new LatLng(27.6707015,85.4298535);
                LatLng dbsq = new LatLng(27.6726737,85.4290403);
                LatLng ram = new LatLng(27.6687115,85.4277505);
                LatLng dudpati = new LatLng(27.6712024,85.4240544);
                markerPoints.add(kamalbinayak1);
                markerPoints.add(kamalbinayak2);
                markerPoints.add(chayamasingh);
                markerPoints.add(Siddhapokhari);
                markerPoints.add(khasibazar);
                markerPoints.add(dbsq);
                markerPoints.add(ram);
                markerPoints.add(dudpati);
                fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
                fetchLastLocation2();
                break;
            case 1003:
                fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
                fetchLastLocation1();
                break;
            case 1005:
                webView.loadUrl("https://www.google.com/search?&q=currency+converter");
                break;
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
                webView.loadUrl("https://en.wikipedia.org/wiki/Nyatapola_Temple");
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
    private void fetchLastLocation1() {
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
                    url = "https://www.google.com/maps/search/restaurants/@"+current_latitude[0]+","+current_longitude[0]+",16z/data=!3m1!4b1";
                    webView.loadUrl(url);
                }
            }
        });
    }
    private void fetchLastLocation2() {
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
                    getShortestLatLag = new GetShortestLatLag(markerPoints,new LatLng(current_latitude[0],current_longitude[0]));
                    shortest = getShortestLatLag.result();
                    mid_latitude = (shortest.latitude + current_latitude[0])/2;
                    mid_longitude = (shortest.longitude + current_longitude[0])/2;
                    url = "https://www.google.com/maps/dir/'"+ current_latitude[0] +","+ current_longitude[0] +"'/'"+shortest.latitude+","+shortest.longitude+"'/@"+mid_latitude+","+mid_longitude+",12z";
                    Toast.makeText(ViewWeb.this, url, Toast.LENGTH_SHORT).show();
                    webView.loadUrl(url);
                }
            }
        });
    }


}

package com.example.bta.activities;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import com.example.bta.R;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

public class FindusActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    Location currentLocation;
    FusedLocationProviderClient fusedLocationProviderClient;
    private static final int REQUEST_CODE = 101;
    double current_latitude,current_longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findus);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
        fetchLastLocation();
    }

    private void fetchLastLocation() {
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
                    current_latitude = currentLocation.getLatitude();
                    current_longitude = currentLocation.getLongitude();
                    Toast.makeText(getApplicationContext(), "You are at:"+current_latitude+" "+current_longitude, Toast.LENGTH_LONG).show();
                }
            }
        });
    }



    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        Bundle bundle= getIntent().getExtras();
        int key = bundle.getInt("KEY");
        switch (key){
            case 40:
                Toast.makeText(this, "bhaktapur", Toast.LENGTH_SHORT).show();
                LatLng bhaktapur = new LatLng(27.671890, 85.428913);
                mMap.addMarker(new MarkerOptions().position(bhaktapur).title("Marker in bhaktapur"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(bhaktapur));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(bhaktapur,16));
                break;
            case 30:
//                LatLng current_location = new LatLng( currentLocation.getLatitude(),currentLocation.getLongitude());//get current latitude and longitude
                LatLng current_location = new LatLng(current_latitude, current_longitude);
                mMap.addMarker(new MarkerOptions().position(current_location).title("You are here!!"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(current_location));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(current_location,16));
//                mMap.addMarker(markerOptions);
                break;
            case 1:
                Toast.makeText(this, "Nyatapola Mandin", Toast.LENGTH_SHORT).show();
                LatLng Nyatapola = new LatLng(27.6715018,85.4291461);
                mMap.addMarker(new MarkerOptions().position(Nyatapola).title("Nyatapola Mandir"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(Nyatapola));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Nyatapola,16));
                break;
            case 2:
                Toast.makeText(this, "Dattatraya Mandir", Toast.LENGTH_SHORT).show();
                LatLng dattatraya = new LatLng(27.6735732,85.4352401);
                mMap.addMarker(new MarkerOptions().position(dattatraya).title("Dattatraya Mandir"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(dattatraya));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(dattatraya,17));
                break;
            case 3:
                Toast.makeText(this, "Pottery Square", Toast.LENGTH_SHORT).show();
                LatLng pottery = new LatLng(27.6698678,85.4261262);
                mMap.addMarker(new MarkerOptions().position(pottery).title("Pottery Square"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(pottery));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(pottery,16));
                break;
            case 4:
            case 10:
                Toast.makeText(this, "Bhaktapur Durbar Square", Toast.LENGTH_SHORT).show();
                LatLng DurbarSquare = new LatLng(27.6720649,85.4282954);
                mMap.addMarker(new MarkerOptions().position(DurbarSquare).title("Bhaktapur Durbar Square"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(DurbarSquare));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(DurbarSquare,17));
                break;
            case 11:
            case 22:
                Toast.makeText(this, "Changu Narayan Temple", Toast.LENGTH_SHORT).show();
                LatLng Changu = new LatLng(27.7167038,85.4288589);
                mMap.addMarker(new MarkerOptions().position(Changu).title("Changu Narayan Temple"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(Changu));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Changu,16));
                break;
            case 18:
                Toast.makeText(this, "Nagarkot", Toast.LENGTH_SHORT).show();
                LatLng nagarkot = new LatLng(27.692168,85.5177437);
                mMap.addMarker(new MarkerOptions().position(nagarkot).title("Nagarkot"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(nagarkot));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(nagarkot,16));
                break;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case REQUEST_CODE:
                if(grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    fetchLastLocation();
                }
                break;
        }
    }
}


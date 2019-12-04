package com.example.bta.activities;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.widget.Toast;

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
                    LatLng you = new LatLng(current_latitude,current_longitude);
                    mMap.addMarker(new MarkerOptions().position(you).title("You Are here"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(you));
                    mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(you,15));
                }
            }
        });
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        Bundle bundle= getIntent().getExtras();
        int key = bundle.getInt("KEY");
        switch (key){
            case 1:
                Toast.makeText(this, "Nyatapola Mandir", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(this, "Changu Narayan Temple", Toast.LENGTH_SHORT).show();
                LatLng Changu = new LatLng(27.7167038,85.4288589);
                mMap.addMarker(new MarkerOptions().position(Changu).title("Changu Narayan Temple"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(Changu));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Changu,16));
                break;
            case 1000:
                Toast.makeText(this, "Toilet", Toast.LENGTH_SHORT).show();
                LatLng kamalbinayak1 = new LatLng(27.676372,85.4376489);
                LatLng kamalbinayak2 = new LatLng(27.6770153,85.439282);
                LatLng chayamasingh = new LatLng(27.6736984,85.4393027);
                LatLng Siddhapokhari = new LatLng(27.6719787,85.421788);
                LatLng khasibazar = new LatLng(27.6707015,85.4298535);
                LatLng dbsq = new LatLng(27.6726737,85.4290403);
                LatLng ram = new LatLng(27.6687115,85.4277505);
                LatLng dudpati = new LatLng(27.6712024,85.4240544);
                LatLng you = new LatLng(current_latitude,current_longitude);
                mMap.addMarker(new MarkerOptions().position(you).title("You are Here"));
                mMap.addMarker(new MarkerOptions().position(kamalbinayak1).title("Kamal Binayak Bus Park"));
                mMap.addMarker(new MarkerOptions().position(kamalbinayak2).title(("Kamal Pokhari")));
                mMap.addMarker(new MarkerOptions().position(chayamasingh).title(("Chayamasingh")));
                mMap.addMarker(new MarkerOptions().position(Siddhapokhari).title(("Siddha Pokhari")));
                mMap.addMarker(new MarkerOptions().position(khasibazar).title(("Khasi Bazar")));
                mMap.addMarker(new MarkerOptions().position(dbsq).title(("Durbar Square")));
                mMap.addMarker(new MarkerOptions().position(ram).title(("Ram Mandir")));
                mMap.addMarker(new MarkerOptions().position(dudpati).title(("Dudhpati")));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(khasibazar));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(khasibazar,14));
                break;
            case 1001:
                Toast.makeText(this, "Hospital", Toast.LENGTH_SHORT).show();
                LatLng HumanOrganTransplant = new LatLng(27.6729373,85.4216275);
                LatLng bhaktapur1 = new LatLng(27.6719396,85.4219601);
                LatLng bktcancerhospital = new LatLng(27.6732317,85.4222822);
                LatLng memorial = new LatLng(27.6681797,85.4326653);
                LatLng iwamura = new LatLng(27.6725332,85.4119414);
                LatLng madhayapur = new LatLng(27.6722159,85.3881812);
                LatLng korea = new LatLng(27.6790287,85.3838219);
                LatLng kmc = new LatLng(27.6844899,85.4110025);
                LatLng cec = new LatLng(27.6780417,85.4240238);
                LatLng kcc = new LatLng(27.6693382,85.4654877);
                LatLng jsc = new LatLng(27.6737042,85.4390963);
                LatLng jskb = new LatLng(27.6706365,85.4299722);
                mMap.addMarker(new MarkerOptions().position(HumanOrganTransplant).title("Human Organ Transplant Center (01-6614709)"));
                mMap.addMarker(new MarkerOptions().position(bhaktapur1).title(("Bhaktapur Hospital (01-6610798)")));
                mMap.addMarker(new MarkerOptions().position(bktcancerhospital).title(("Bhaktapur Cancer Hospital (01-6611532)")));
                mMap.addMarker(new MarkerOptions().position(memorial).title(("Siddhi Memorial Children and Women Hospital (01-6612945)")));
                mMap.addMarker(new MarkerOptions().position(iwamura).title(("Dr. Iwamura Hospital (01-6612705)")));
                mMap.addMarker(new MarkerOptions().position(madhayapur).title("Madhayapur Hospita (01-5093388)"));
                mMap.addMarker(new MarkerOptions().position(korea).title(("Nepal Korea Friendship Hospital (01-6633442)")));
                mMap.addMarker(new MarkerOptions().position(kmc).title(("Kathmandu Modal College (01-4476152)")));
                mMap.addMarker(new MarkerOptions().position(cec).title(("District Communiy Eye Center (01-6618058)")));
                mMap.addMarker(new MarkerOptions().position(kcc).title(("Kathmandu Cancer Center(01-5091629)")));
                mMap.addMarker(new MarkerOptions().position(jsc).title(("Jana Swastha(01-6610317)")));
                mMap.addMarker(new MarkerOptions().position(jskb).title(("Jana Swastha ")));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(bhaktapur1));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(bhaktapur1,13));
                break;
            case 1002:
                Toast.makeText(this, "Currency Conversion", Toast.LENGTH_SHORT).show();
                LatLng bme = new LatLng(27.671432, 85.430115);
                LatLng dmc = new LatLng(27.673291, 85.434976);
                LatLng tmc = new LatLng(27.672308, 85.427224);
                LatLng nme = new LatLng(27.671472, 85.429118);
                LatLng nbl = new LatLng(27.672308, 85.427224);
                mMap.addMarker(new MarkerOptions().position(bme).title("Bhaktapur Money Exchange"));
                mMap.addMarker(new MarkerOptions().position(dmc).title("Dattatraya Money Changer"));
                mMap.addMarker(new MarkerOptions().position(tmc).title("Temple Money Changer"));
                mMap.addMarker(new MarkerOptions().position(nme).title("Nyatapola Money Exchange"));
                mMap.addMarker(new MarkerOptions().position(nbl).title("Nepal Bank Ltd."));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(bme));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(bme,15));
                break;
            default:
                fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
                fetchLastLocation();
        }
    }
}


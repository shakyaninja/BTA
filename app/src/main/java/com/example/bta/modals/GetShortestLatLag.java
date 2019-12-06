package com.example.bta.modals;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public class GetShortestLatLag {
    ArrayList arrayList;
    LatLng latLng;
    float distance;
    float newdistance;

    public GetShortestLatLag(ArrayList arrayList, LatLng latLng) {
        this.arrayList = arrayList;
        this.latLng = latLng;
    }

    public LatLng result(){
        LatLng shortest = (LatLng) arrayList.get(0);
        distance = (float) ((latLng.latitude-shortest.latitude) *(latLng.latitude-shortest.latitude) +
                (latLng.longitude-shortest.longitude)*(latLng.longitude-shortest.longitude));
        for(int i = 1; i<arrayList.size();i++){
            LatLng obj = (LatLng) arrayList.get(i);
            newdistance = (float) ((latLng.latitude-obj.latitude) *(latLng.latitude-obj.latitude) +
                    (latLng.longitude-obj.longitude)*(latLng.longitude-obj.longitude));
            if(newdistance<distance){
                shortest = obj;
            }
        }
        return shortest;
    }
}

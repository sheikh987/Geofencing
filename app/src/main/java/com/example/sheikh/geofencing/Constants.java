package com.example.sheikh.geofencing;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Created by sheikh on 26/3/17.
 */

public final class Constants {
    private Constants() {}

    /**
     * Used to set an expiration time for a geofence. After this amount of time Location Services
     * stops tracking the geofence.
     */
    public static final long GEOFENCE_EXPIRATION_IN_HOURS = 12;

    /**
     * For this sample, geofences expire after twelve hours.
     */
    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS =
            GEOFENCE_EXPIRATION_IN_HOURS * 60 * 60 * 1000;

    public static final float GEOFENCE_RADIUS_IN_METERS = 100; // 1 mile, 1.6 km

    public static final HashMap<String, LatLng> BAY_AREA_LANDMARKS =
            new HashMap<String, LatLng>();
    static {
        BAY_AREA_LANDMARKS.put("HOME", new LatLng(28.644871, 77.2394825));
        BAY_AREA_LANDMARKS.put("GOLCHA CINEMA", new LatLng(28.644411, 77.240324));
        BAY_AREA_LANDMARKS.put("RAJ GHAT", new LatLng(28.640682, 77.247467));
    }
}

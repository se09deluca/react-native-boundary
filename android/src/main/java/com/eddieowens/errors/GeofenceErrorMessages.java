package com.eddieowens.errors;

import com.google.android.gms.location.GeofenceStatusCodes;

public class GeofenceErrorMessages {
    private GeofenceErrorMessages() {}


    /**
     * Returns the error string for a geofencing error code.
     */
    public static String getErrorString(int errorCode) {
        switch (errorCode) {
            case GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE:
                return "Geofence is not available";
            case GeofenceStatusCodes.GEOFENCE_TOO_MANY_GEOFENCES:
                return "Too many geofences";
            case GeofenceStatusCodes.GEOFENCE_TOO_MANY_PENDING_INTENTS:
                return "Too many pending intents";
            case GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION:
                return "GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION";
            case GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT:
                return "GEOFENCE_REQUEST_TOO_FREQUENT";
            default:
                return "Unknown error: " + Integer.toString(errorCode);
        }
    }
}

package pl.tajchert.nammu;

/**
 * Created by Michal Tajchert on 2015-06-04.
 */
public interface PermissionCallback {
    public void onPermissionGranted();
    public void onPermissionRefused();
}

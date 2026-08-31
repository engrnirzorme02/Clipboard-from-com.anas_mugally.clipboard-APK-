package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.AbstractC2439e;
import java.util.Calendar;

/* JADX INFO: renamed from: androidx.appcompat.app.w */
/* JADX INFO: loaded from: classes.dex */
class C2262w {

    /* JADX INFO: renamed from: d */
    private static C2262w f7456d;

    /* JADX INFO: renamed from: a */
    private final Context f7457a;

    /* JADX INFO: renamed from: b */
    private final LocationManager f7458b;

    /* JADX INFO: renamed from: c */
    private final a f7459c = new a();

    /* JADX INFO: renamed from: androidx.appcompat.app.w$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        boolean f7460a;

        /* JADX INFO: renamed from: b */
        long f7461b;

        a() {
        }
    }

    C2262w(Context context, LocationManager locationManager) {
        this.f7457a = context;
        this.f7458b = locationManager;
    }

    /* JADX INFO: renamed from: a */
    static C2262w m9322a(Context context) {
        if (f7456d == null) {
            Context applicationContext = context.getApplicationContext();
            f7456d = new C2262w(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f7456d;
    }

    /* JADX INFO: renamed from: b */
    private Location m9323b() {
        Location locationM9324c = AbstractC2439e.m10600b(this.f7457a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m9324c("network") : null;
        Location locationM9324c2 = AbstractC2439e.m10600b(this.f7457a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? m9324c("gps") : null;
        if (locationM9324c2 == null || locationM9324c == null) {
            return locationM9324c2 != null ? locationM9324c2 : locationM9324c;
        }
        return locationM9324c2.getTime() > locationM9324c.getTime() ? locationM9324c2 : locationM9324c;
    }

    /* JADX INFO: renamed from: c */
    private Location m9324c(String str) {
        try {
            if (this.f7458b.isProviderEnabled(str)) {
                return this.f7458b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e7) {
            Log.d("TwilightManager", "Failed to get last known location", e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private boolean m9325e() {
        return this.f7459c.f7461b > System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: f */
    private void m9326f(Location location) {
        long j7;
        a aVar = this.f7459c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2261v c2261vM9320b = C2261v.m9320b();
        c2261vM9320b.m9321a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        c2261vM9320b.m9321a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z7 = c2261vM9320b.f7455c == 1;
        long j8 = c2261vM9320b.f7454b;
        long j9 = c2261vM9320b.f7453a;
        c2261vM9320b.m9321a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j10 = c2261vM9320b.f7454b;
        if (j8 == -1 || j9 == -1) {
            j7 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j9) {
                j8 = j10;
            } else if (jCurrentTimeMillis > j8) {
                j8 = j9;
            }
            j7 = j8 + 60000;
        }
        aVar.f7460a = z7;
        aVar.f7461b = j7;
    }

    /* JADX INFO: renamed from: d */
    boolean m9327d() {
        a aVar = this.f7459c;
        if (m9325e()) {
            return aVar.f7460a;
        }
        Location locationM9323b = m9323b();
        if (locationM9323b != null) {
            m9326f(locationM9323b);
            return aVar.f7460a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i7 = Calendar.getInstance().get(11);
        return i7 < 6 || i7 >= 22;
    }
}

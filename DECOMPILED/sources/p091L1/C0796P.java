package p091L1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p183Y1.AbstractC2023l;

/* JADX INFO: renamed from: L1.P */
/* JADX INFO: loaded from: classes.dex */
public final class C0796P {

    /* JADX INFO: renamed from: e */
    public static final boolean f3193e;

    /* JADX INFO: renamed from: f */
    public static final boolean f3194f;

    /* JADX INFO: renamed from: g */
    private static final File f3195g;

    /* JADX INFO: renamed from: h */
    private static volatile C0796P f3196h;

    /* JADX INFO: renamed from: b */
    private int f3198b;

    /* JADX INFO: renamed from: c */
    private boolean f3199c = true;

    /* JADX INFO: renamed from: d */
    private final AtomicBoolean f3200d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    private final int f3197a = 20000;

    static {
        int i7 = Build.VERSION.SDK_INT;
        f3193e = i7 < 29;
        f3194f = i7 >= 28;
        f3195g = new File("/proc/self/fd");
    }

    C0796P() {
    }

    /* JADX INFO: renamed from: a */
    private boolean m3725a() {
        return f3193e && !this.f3200d.get();
    }

    /* JADX INFO: renamed from: b */
    public static C0796P m3726b() {
        if (f3196h == null) {
            synchronized (C0796P.class) {
                try {
                    if (f3196h == null) {
                        f3196h = new C0796P();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f3196h;
    }

    /* JADX INFO: renamed from: c */
    private int m3727c() {
        if (m3729e()) {
            return 500;
        }
        return this.f3197a;
    }

    /* JADX INFO: renamed from: d */
    private synchronized boolean m3728d() {
        try {
            boolean z7 = true;
            int i7 = this.f3198b + 1;
            this.f3198b = i7;
            if (i7 >= 50) {
                this.f3198b = 0;
                int length = f3195g.list().length;
                long jM3727c = m3727c();
                if (length >= jM3727c) {
                    z7 = false;
                }
                this.f3199c = z7;
                if (!z7 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jM3727c);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f3199c;
    }

    /* JADX INFO: renamed from: e */
    private static boolean m3729e() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m3730f(int i7, int i8, boolean z7, boolean z8) {
        if (!z7) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!f3194f) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (m3725a()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z8) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i7 < 0 || i8 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
        if (m3728d()) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    boolean m3731g(int i7, int i8, BitmapFactory.Options options, boolean z7, boolean z8) {
        boolean zM3730f = m3730f(i7, i8, z7, z8);
        if (zM3730f) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zM3730f;
    }

    /* JADX INFO: renamed from: h */
    public void m3732h() {
        AbstractC2023l.m8410a();
        this.f3200d.set(true);
    }
}

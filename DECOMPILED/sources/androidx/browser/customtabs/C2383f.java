package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import p205b.InterfaceC2917a;
import p205b.InterfaceC2918b;

/* JADX INFO: renamed from: androidx.browser.customtabs.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2383f {

    /* JADX INFO: renamed from: a */
    private final Object f8419a = new Object();

    /* JADX INFO: renamed from: b */
    private final InterfaceC2918b f8420b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC2917a f8421c;

    /* JADX INFO: renamed from: d */
    private final ComponentName f8422d;

    /* JADX INFO: renamed from: e */
    private final PendingIntent f8423e;

    C2383f(InterfaceC2918b interfaceC2918b, InterfaceC2917a interfaceC2917a, ComponentName componentName, PendingIntent pendingIntent) {
        this.f8420b = interfaceC2918b;
        this.f8421c = interfaceC2917a;
        this.f8422d = componentName;
        this.f8423e = pendingIntent;
    }

    /* JADX INFO: renamed from: a */
    private void m10210a(Bundle bundle) {
        PendingIntent pendingIntent = this.f8423e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    /* JADX INFO: renamed from: b */
    private Bundle m10211b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        m10210a(bundle2);
        return bundle2;
    }

    /* JADX INFO: renamed from: c */
    private Bundle m10212c(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable("target_origin", uri);
        }
        if (this.f8423e != null) {
            m10210a(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    /* JADX INFO: renamed from: d */
    IBinder m10213d() {
        return this.f8421c.asBinder();
    }

    /* JADX INFO: renamed from: e */
    ComponentName m10214e() {
        return this.f8422d;
    }

    /* JADX INFO: renamed from: f */
    PendingIntent m10215f() {
        return this.f8423e;
    }

    /* JADX INFO: renamed from: g */
    public int m10216g(String str, Bundle bundle) {
        int iMo14645l;
        Bundle bundleM10211b = m10211b(bundle);
        synchronized (this.f8419a) {
            try {
                try {
                    iMo14645l = this.f8420b.mo14645l(this.f8421c, str, bundleM10211b);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iMo14645l;
    }

    /* JADX INFO: renamed from: h */
    public boolean m10217h(Uri uri) {
        return m10218i(uri, null, new Bundle());
    }

    /* JADX INFO: renamed from: i */
    public boolean m10218i(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle bundleM10212c = m10212c(uri2);
            if (bundleM10212c == null) {
                return this.f8420b.mo14642S(this.f8421c, uri);
            }
            bundle.putAll(bundleM10212c);
            return this.f8420b.mo14644h(this.f8421c, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }
}

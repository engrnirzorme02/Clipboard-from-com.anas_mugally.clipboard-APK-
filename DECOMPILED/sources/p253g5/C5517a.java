package p253g5;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.core.content.AbstractC2436b;
import p116O4.InterfaceC1147c;

/* JADX INFO: renamed from: g5.a */
/* JADX INFO: loaded from: classes.dex */
public class C5517a {

    /* JADX INFO: renamed from: a */
    private final Context f20945a;

    /* JADX INFO: renamed from: b */
    private final SharedPreferences f20946b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1147c f20947c;

    /* JADX INFO: renamed from: d */
    private boolean f20948d;

    public C5517a(Context context, String str, InterfaceC1147c interfaceC1147c) {
        Context contextM24925a = m24925a(context);
        this.f20945a = contextM24925a;
        this.f20946b = contextM24925a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f20947c = interfaceC1147c;
        this.f20948d = m24926c();
    }

    /* JADX INFO: renamed from: a */
    private static Context m24925a(Context context) {
        return AbstractC2436b.createDeviceProtectedStorageContext(context);
    }

    /* JADX INFO: renamed from: c */
    private boolean m24926c() {
        return this.f20946b.contains("firebase_data_collection_default_enabled") ? this.f20946b.getBoolean("firebase_data_collection_default_enabled", true) : m24927d();
    }

    /* JADX INFO: renamed from: d */
    private boolean m24927d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f20945a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f20945a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized boolean m24928b() {
        return this.f20948d;
    }
}

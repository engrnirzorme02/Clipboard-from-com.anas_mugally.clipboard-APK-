package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.AbstractC3760o;
import java.util.List;
import p164V3.C1762g;

/* JADX INFO: renamed from: com.google.firebase.messaging.G */
/* JADX INFO: loaded from: classes.dex */
class C4957G {

    /* JADX INFO: renamed from: a */
    private final Context f18809a;

    /* JADX INFO: renamed from: b */
    private String f18810b;

    /* JADX INFO: renamed from: c */
    private String f18811c;

    /* JADX INFO: renamed from: d */
    private int f18812d;

    /* JADX INFO: renamed from: e */
    private int f18813e = 0;

    C4957G(Context context) {
        this.f18809a = context;
    }

    /* JADX INFO: renamed from: c */
    static String m22341c(C1762g c1762g) {
        String strM7425e = c1762g.m7407p().m7425e();
        if (strM7425e != null) {
            return strM7425e;
        }
        String strM7423c = c1762g.m7407p().m7423c();
        if (!strM7423c.startsWith("1:")) {
            return strM7423c;
        }
        String[] strArrSplit = strM7423c.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: f */
    private PackageInfo m22342f(String str) {
        try {
            return this.f18809a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e7) {
            Log.w("FirebaseMessaging", "Failed to find package " + e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    private synchronized void m22343h() {
        PackageInfo packageInfoM22342f = m22342f(this.f18809a.getPackageName());
        if (packageInfoM22342f != null) {
            this.f18810b = Integer.toString(packageInfoM22342f.versionCode);
            this.f18811c = packageInfoM22342f.versionName;
        }
    }

    /* JADX INFO: renamed from: a */
    synchronized String m22344a() {
        try {
            if (this.f18810b == null) {
                m22343h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f18810b;
    }

    /* JADX INFO: renamed from: b */
    synchronized String m22345b() {
        try {
            if (this.f18811c == null) {
                m22343h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f18811c;
    }

    /* JADX INFO: renamed from: d */
    synchronized int m22346d() {
        PackageInfo packageInfoM22342f;
        try {
            if (this.f18812d == 0 && (packageInfoM22342f = m22342f("com.google.android.gms")) != null) {
                this.f18812d = packageInfoM22342f.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f18812d;
    }

    /* JADX INFO: renamed from: e */
    synchronized int m22347e() {
        int i7 = this.f18813e;
        if (i7 != 0) {
            return i7;
        }
        PackageManager packageManager = this.f18809a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!AbstractC3760o.m18199g()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f18813e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f18813e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (AbstractC3760o.m18199g()) {
            this.f18813e = 2;
        } else {
            this.f18813e = 1;
        }
        return this.f18813e;
    }

    /* JADX INFO: renamed from: g */
    boolean m22348g() {
        return m22347e() != 0;
    }
}

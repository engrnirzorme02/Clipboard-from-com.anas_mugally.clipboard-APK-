package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: renamed from: com.google.firebase.messaging.V */
/* JADX INFO: loaded from: classes.dex */
public class C4971V {

    /* JADX INFO: renamed from: e */
    private static C4971V f18855e;

    /* JADX INFO: renamed from: a */
    private String f18856a = null;

    /* JADX INFO: renamed from: b */
    private Boolean f18857b = null;

    /* JADX INFO: renamed from: c */
    private Boolean f18858c = null;

    /* JADX INFO: renamed from: d */
    private final Queue f18859d = new ArrayDeque();

    private C4971V() {
    }

    /* JADX INFO: renamed from: a */
    private int m22402a(Context context, Intent intent) {
        ComponentName componentNameStartService;
        String strM22404f = m22404f(context, intent);
        if (strM22404f != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + strM22404f);
            }
            intent.setClassName(context.getPackageName(), strM22404f);
        }
        try {
            if (m22407e(context)) {
                componentNameStartService = AbstractC4989g0.m22512g(context, intent);
            } else {
                componentNameStartService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentNameStartService != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e7) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e7);
            return 402;
        } catch (SecurityException e8) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e8);
            return 401;
        }
    }

    /* JADX INFO: renamed from: b */
    static synchronized C4971V m22403b() {
        try {
            if (f18855e == null) {
                f18855e = new C4971V();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f18855e;
    }

    /* JADX INFO: renamed from: f */
    private synchronized String m22404f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        try {
            String str2 = this.f18856a;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(".")) {
                        this.f18856a = context.getPackageName() + serviceInfo.name;
                    } else {
                        this.f18856a = serviceInfo.name;
                    }
                    return this.f18856a;
                }
                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                return null;
            }
            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    Intent m22405c() {
        return (Intent) this.f18859d.poll();
    }

    /* JADX INFO: renamed from: d */
    boolean m22406d(Context context) {
        if (this.f18858c == null) {
            this.f18858c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f18857b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f18858c.booleanValue();
    }

    /* JADX INFO: renamed from: e */
    boolean m22407e(Context context) {
        if (this.f18857b == null) {
            this.f18857b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f18857b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f18857b.booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public int m22408g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f18859d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m22402a(context, intent2);
    }
}

package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import p170W2.C1837b;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3715q0 {

    /* JADX INFO: renamed from: f */
    private static final Uri f14825f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: a */
    private final String f14826a;

    /* JADX INFO: renamed from: b */
    private final String f14827b;

    /* JADX INFO: renamed from: c */
    private final ComponentName f14828c;

    /* JADX INFO: renamed from: d */
    private final int f14829d;

    /* JADX INFO: renamed from: e */
    private final boolean f14830e;

    public C3715q0(String str, String str2, int i7, boolean z7) {
        AbstractC3718s.m18077f(str);
        this.f14826a = str;
        AbstractC3718s.m18077f(str2);
        this.f14827b = str2;
        this.f14828c = null;
        this.f14829d = 4225;
        this.f14830e = z7;
    }

    /* JADX INFO: renamed from: a */
    public final ComponentName m18057a() {
        return this.f14828c;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1 A[RETURN] */
    /* JADX INFO: renamed from: b */
    public final Intent m18058b(Context context) throws C3691e0 {
        Bundle bundleCall;
        PendingIntent pendingIntent;
        if (this.f14826a == null) {
            return new Intent().setComponent(this.f14828c);
        }
        Intent intent = null;
        if (this.f14830e) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", this.f14826a);
            try {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f14825f);
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new RemoteException("Failed to acquire ContentProviderClient");
                }
                try {
                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                    try {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                    } catch (RemoteException e7) {
                        e = e7;
                        Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                    } catch (IllegalArgumentException e8) {
                        e = e8;
                        Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                    }
                    if (bundleCall == null && (intent = (Intent) bundleCall.getParcelable("serviceResponseIntentKey")) == null && (pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey")) != null) {
                        Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action " + this.f14826a + " but has possible resolution");
                        throw new C3691e0(new C1837b(25, pendingIntent));
                    }
                    if (intent == null) {
                        Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f14826a)));
                    }
                } catch (Throwable th) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th;
                }
            } catch (RemoteException e9) {
                e = e9;
                bundleCall = null;
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                if (bundleCall == null) {
                }
                if (intent == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f14826a)));
                }
                if (intent == null) {
                    return new Intent(this.f14826a).setPackage(this.f14827b);
                }
                return intent;
            } catch (IllegalArgumentException e10) {
                e = e10;
                bundleCall = null;
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                if (bundleCall == null) {
                }
                if (intent == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f14826a)));
                }
                if (intent == null) {
                    return new Intent(this.f14826a).setPackage(this.f14827b);
                }
                return intent;
            }
        }
        if (intent == null) {
            return new Intent(this.f14826a).setPackage(this.f14827b);
        }
        return intent;
    }

    /* JADX INFO: renamed from: c */
    public final String m18059c() {
        return this.f14827b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3715q0)) {
            return false;
        }
        C3715q0 c3715q0 = (C3715q0) obj;
        return AbstractC3714q.m18053b(this.f14826a, c3715q0.f14826a) && AbstractC3714q.m18053b(this.f14827b, c3715q0.f14827b) && AbstractC3714q.m18053b(this.f14828c, c3715q0.f14828c) && this.f14830e == c3715q0.f14830e;
    }

    public final int hashCode() {
        return AbstractC3714q.m18054c(this.f14826a, this.f14827b, this.f14828c, 4225, Boolean.valueOf(this.f14830e));
    }

    public final String toString() {
        String str = this.f14826a;
        if (str != null) {
            return str;
        }
        AbstractC3718s.m18083l(this.f14828c);
        return this.f14828c.flattenToString();
    }
}

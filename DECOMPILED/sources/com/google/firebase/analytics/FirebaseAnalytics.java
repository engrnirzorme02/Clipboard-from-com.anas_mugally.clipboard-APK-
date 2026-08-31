package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.C4943c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p283k3.InterfaceC6022E;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: b */
    private static volatile FirebaseAnalytics f18409b;

    /* JADX INFO: renamed from: a */
    private final zzfb f18410a;

    /* JADX INFO: renamed from: com.google.firebase.analytics.FirebaseAnalytics$a */
    public enum EnumC4806a {
        GRANTED,
        DENIED
    }

    /* JADX INFO: renamed from: com.google.firebase.analytics.FirebaseAnalytics$b */
    public enum EnumC4807b {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    public FirebaseAnalytics(zzfb zzfbVar) {
        AbstractC3718s.m18083l(zzfbVar);
        this.f18410a = zzfbVar;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (f18409b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f18409b == null) {
                        f18409b = new FirebaseAnalytics(zzfb.zza(context, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f18409b;
    }

    public static InterfaceC6022E getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzfb zzfbVarZza = zzfb.zza(context, bundle);
        if (zzfbVarZza == null) {
            return null;
        }
        return new C4808a(zzfbVarZza);
    }

    /* JADX INFO: renamed from: a */
    public void m21956a(String str, Bundle bundle) {
        this.f18410a.zzh(str, bundle);
    }

    /* JADX INFO: renamed from: b */
    public void m21957b(String str) {
        this.f18410a.zzo(str);
    }

    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(C4943c.m22220p().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            throw new IllegalStateException(e7);
        } catch (ExecutionException e8) {
            throw new IllegalStateException(e8.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f18410a.zzp(zzdf.zza(activity), str, str2);
    }
}

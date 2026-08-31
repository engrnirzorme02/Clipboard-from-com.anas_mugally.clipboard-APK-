package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Objects;
import p283k3.InterfaceC6019B;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.l4 */
/* JADX INFO: loaded from: classes2.dex */
final class C4275l4 implements Application.ActivityLifecycleCallbacks, InterfaceC6019B {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4371x4 f15870a;

    C4275l4(C4371x4 c4371x4) {
        Objects.requireNonNull(c4371x4);
        this.f15870a = c4371x4;
    }

    @Override // p283k3.InterfaceC6019B
    /* JADX INFO: renamed from: a */
    public final void mo18782a(zzdf zzdfVar) {
        C4164X2 c4164x2 = this.f15870a.f15066a;
        c4164x2.m18667I().m18557x(zzdfVar);
        C4098N5 c4098n5M18689z = c4164x2.m18689z();
        C4164X2 c4164x3 = c4098n5M18689z.f15066a;
        c4164x3.mo18422b().m18639t(new RunnableC4037F5(c4098n5M18689z, c4164x3.mo18425f().mo18161c()));
    }

    @Override // p283k3.InterfaceC6019B
    /* JADX INFO: renamed from: b */
    public final void mo18783b(zzdf zzdfVar) {
        this.f15870a.f15066a.m18667I().m18559z(zzdfVar);
    }

    @Override // p283k3.InterfaceC6019B
    /* JADX INFO: renamed from: c */
    public final void mo18784c(zzdf zzdfVar, Bundle bundle) {
        this.f15870a.f15066a.m18667I().m18558y(zzdfVar, bundle);
    }

    @Override // p283k3.InterfaceC6019B
    /* JADX INFO: renamed from: d */
    public final void mo18785d(zzdf zzdfVar) {
        C4164X2 c4164x2 = this.f15870a.f15066a;
        C4098N5 c4098n5M18689z = c4164x2.m18689z();
        C4164X2 c4164x3 = c4098n5M18689z.f15066a;
        c4164x3.mo18422b().m18639t(new RunnableC4029E5(c4098n5M18689z, c4164x3.mo18425f().mo18161c()));
        c4164x2.m18667I().m18556w(zzdfVar);
    }

    @Override // p283k3.InterfaceC6019B
    /* JADX INFO: renamed from: e */
    public final void mo18786e(zzdf zzdfVar, Bundle bundle) throws Throwable {
        C4275l4 c4275l4;
        C4164X2 c4164x2;
        Uri uri;
        try {
            try {
                C4371x4 c4371x4 = this.f15870a;
                C4164X2 c4164x3 = c4371x4.f15066a;
                c4164x3.mo18421a().m18859w().m18834a("onActivityCreated");
                Intent intent = zzdfVar.zzc;
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        uri = null;
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                                uri = data;
                            }
                        }
                    } else {
                        uri = data;
                    }
                    if (uri != null && uri.isHierarchical()) {
                        c4164x3.m18661C();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        String str = ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : "auto";
                        String queryParameter = uri.getQueryParameter("referrer");
                        c4275l4 = this;
                        try {
                            c4164x3.mo18422b().m18639t(new RunnableC4267k4(c4275l4, bundle == null, uri, str, queryParameter));
                        } catch (RuntimeException e7) {
                            e = e7;
                            c4275l4.f15870a.f15066a.mo18421a().m18851o().m18835b("Throwable caught in onActivityCreated", e);
                        }
                        c4164x2 = c4275l4.f15870a.f15066a;
                    }
                    c4164x2.m18667I().m18555v(zzdfVar, bundle);
                }
                c4164x2 = c4371x4.f15066a;
            } catch (Throwable th) {
                th = th;
                c4275l4.f15870a.f15066a.m18667I().m18555v(zzdfVar, bundle);
                throw th;
            }
        } catch (RuntimeException e8) {
            e = e8;
            c4275l4 = this;
        } catch (Throwable th2) {
            th = th2;
            c4275l4 = this;
            c4275l4.f15870a.f15066a.m18667I().m18555v(zzdfVar, bundle);
            throw th;
        }
        c4164x2.m18667I().m18555v(zzdfVar, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
        mo18786e(zzdf.zza(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        mo18783b(zzdf.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        mo18782a(zzdf.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        mo18785d(zzdf.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        mo18784c(zzdf.zza(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}

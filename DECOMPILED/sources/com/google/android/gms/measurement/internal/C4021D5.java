package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.measurement.zzfb;
import java.util.Objects;
import p283k3.InterfaceC6026I;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.D5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4021D5 {

    /* JADX INFO: renamed from: a */
    private final Context f15164a;

    public C4021D5(Context context) {
        AbstractC3718s.m18083l(context);
        this.f15164a = context;
    }

    /* JADX INFO: renamed from: i */
    public static final void m18468i(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m18469j(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    /* JADX INFO: renamed from: k */
    private final void m18470k(C4317q6 c4317q6, Runnable runnable) {
        c4317q6.mo18422b().m18639t(new RunnableC4388z5(this, c4317q6, runnable));
    }

    /* JADX INFO: renamed from: a */
    public final void m18471a() {
        Log.v("FA", this.f15164a.getClass().getSimpleName().concat(" is starting up."));
    }

    /* JADX INFO: renamed from: b */
    public final void m18472b() {
        Log.v("FA", this.f15164a.getClass().getSimpleName().concat(" is shutting down."));
    }

    /* JADX INFO: renamed from: c */
    public final int m18473c(final Intent intent, int i7, final int i8) {
        if (intent == null) {
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Context context = this.f15164a;
        C4164X2 c4164x2M18653O = C4164X2.m18653O(context, null, null);
        final C4313q2 c4313q2Mo18421a = c4164x2M18653O.mo18421a();
        String action = intent.getAction();
        c4164x2M18653O.mo18423c();
        c4313q2Mo18421a.m18859w().m18836c("Local AppMeasurementService called. startId, action", Integer.valueOf(i8), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m18470k(C4317q6.m18866F(context), new Runnable() { // from class: com.google.android.gms.measurement.internal.C5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f15147a.m18476f(i8, c4313q2Mo18421a, intent);
                }
            });
        }
        return 2;
    }

    /* JADX INFO: renamed from: d */
    public final IBinder m18474d(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC4386z3(C4317q6.m18866F(this.f15164a), null);
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m18475e(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            String str = (String) AbstractC3718s.m18083l(string);
            C4317q6 c4317q6M18866F = C4317q6.m18866F(this.f15164a);
            final C4313q2 c4313q2Mo18421a = c4317q6M18866F.mo18421a();
            c4317q6M18866F.mo18423c();
            c4313q2Mo18421a.m18859w().m18835b("Local AppMeasurementJobService called. action", str);
            m18470k(c4317q6M18866F, new Runnable() { // from class: com.google.android.gms.measurement.internal.A5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f15073a.m18477g(c4313q2Mo18421a, jobParameters);
                }
            });
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        zzfb.zza(this.f15164a, null).zzw(new Runnable() { // from class: com.google.android.gms.measurement.internal.B5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f15094a.m18478h(jobParameters);
            }
        });
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    final /* synthetic */ void m18476f(int i7, C4313q2 c4313q2, Intent intent) {
        Context context = this.f15164a;
        InterfaceC6026I interfaceC6026I = (InterfaceC6026I) context;
        if (interfaceC6026I.zza(i7)) {
            c4313q2.m18859w().m18835b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i7));
            C4164X2.m18653O(context, null, null).mo18421a().m18859w().m18834a("Completed wakeful intent.");
            interfaceC6026I.mo18408a(intent);
        }
    }

    /* JADX INFO: renamed from: g */
    final /* synthetic */ void m18477g(C4313q2 c4313q2, JobParameters jobParameters) {
        c4313q2.m18859w().m18834a("AppMeasurementJobService processed last upload request.");
        ((InterfaceC6026I) this.f15164a).mo18409b(jobParameters, false);
    }

    /* JADX INFO: renamed from: h */
    final /* synthetic */ void m18478h(JobParameters jobParameters) {
        Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((InterfaceC6026I) this.f15164a).mo18409b(jobParameters, false);
    }
}

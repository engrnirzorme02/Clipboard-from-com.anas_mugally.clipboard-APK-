package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.collection.C2390a;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.internal.measurement.zzcq;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.internal.measurement.zzcx;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.internal.measurement.zzdc;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Map;
import p283k3.InterfaceC6018A;

/* JADX INFO: loaded from: classes2.dex */
public class AppMeasurementDynamiteService extends zzcq {

    /* JADX INFO: renamed from: a */
    C4164X2 f15078a = null;

    /* JADX INFO: renamed from: b */
    private final Map f15079b = new C2390a();

    /* JADX INFO: renamed from: L0 */
    private final void m18431L0(zzcu zzcuVar, String str) {
        zzb();
        this.f15078a.m18661C().m19390a0(zzcuVar, str);
    }

    private final void zzb() {
        if (this.f15078a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void beginAdUnitExposure(String str, long j7) {
        zzb();
        this.f15078a.m18671M().m18446i(str, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        zzb();
        this.f15078a.m18660B().m19270O(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void clearMeasurementEnabled(long j7) {
        zzb();
        this.f15078a.m18660B().m19292n0(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void endAdUnitExposure(String str, long j7) {
        zzb();
        this.f15078a.m18671M().m18447j(str, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void generateEventId(zzcu zzcuVar) {
        zzb();
        long jM19401p0 = this.f15078a.m18661C().m19401p0();
        zzb();
        this.f15078a.m18661C().m19391b0(zzcuVar, jM19401p0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getAppInstanceId(zzcu zzcuVar) {
        zzb();
        this.f15078a.mo18422b().m18639t(new RunnableC4143U2(this, zzcuVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getCachedAppInstanceId(zzcu zzcuVar) {
        zzb();
        m18431L0(zzcuVar, this.f15078a.m18660B().m19259D());
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getConditionalUserProperties(String str, String str2, zzcu zzcuVar) {
        zzb();
        this.f15078a.mo18422b().m18639t(new RunnableC4076K4(this, zzcuVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getCurrentScreenClass(zzcu zzcuVar) {
        zzb();
        m18431L0(zzcuVar, this.f15078a.m18660B().m19273R());
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getCurrentScreenName(zzcu zzcuVar) {
        zzb();
        m18431L0(zzcuVar, this.f15078a.m18660B().m19272Q());
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getGmpAppId(zzcu zzcuVar) {
        zzb();
        m18431L0(zzcuVar, this.f15078a.m18660B().m19274S());
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getMaxUserProperties(String str, zzcu zzcuVar) {
        zzb();
        this.f15078a.m18660B().m19267L(str);
        zzb();
        this.f15078a.m18661C().m19392c0(zzcuVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getSessionId(zzcu zzcuVar) {
        zzb();
        C4371x4 c4371x4M18660B = this.f15078a.m18660B();
        c4371x4M18660B.f15066a.mo18422b().m18639t(new RunnableC4187a4(c4371x4M18660B, zzcuVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getTestFlag(zzcu zzcuVar, int i7) {
        zzb();
        if (i7 == 0) {
            this.f15078a.m18661C().m19390a0(zzcuVar, this.f15078a.m18660B().m19288j0());
            return;
        }
        if (i7 == 1) {
            this.f15078a.m18661C().m19391b0(zzcuVar, this.f15078a.m18660B().m19289k0().longValue());
            return;
        }
        if (i7 != 2) {
            if (i7 == 3) {
                this.f15078a.m18661C().m19392c0(zzcuVar, this.f15078a.m18660B().m19290l0().intValue());
                return;
            } else {
                if (i7 != 4) {
                    return;
                }
                this.f15078a.m18661C().m19394e0(zzcuVar, this.f15078a.m18660B().m19287i0().booleanValue());
                return;
            }
        }
        C4389z6 c4389z6M18661C = this.f15078a.m18661C();
        double dDoubleValue = this.f15078a.m18660B().m19291m0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e7) {
            c4389z6M18661C.f15066a.mo18421a().m18854r().m18835b("Error returning double value to wrapper", e7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getUserProperties(String str, String str2, boolean z7, zzcu zzcuVar) {
        zzb();
        this.f15078a.mo18422b().m18639t(new RunnableC4103O3(this, zzcuVar, str, str2, z7));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void initForTests(Map map) {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void initialize(InterfaceC3772a interfaceC3772a, zzdd zzddVar, long j7) {
        C4164X2 c4164x2 = this.f15078a;
        if (c4164x2 == null) {
            this.f15078a = C4164X2.m18653O((Context) AbstractC3718s.m18083l((Context) BinderC3773b.m18220M0(interfaceC3772a)), zzddVar, Long.valueOf(j7));
        } else {
            c4164x2.mo18421a().m18854r().m18834a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void isDataCollectionEnabled(zzcu zzcuVar) {
        zzb();
        this.f15078a.mo18422b().m18639t(new RunnableC4268k5(this, zzcuVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void logEvent(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j7) {
        zzb();
        this.f15078a.m18660B().m19297q(str, str2, bundle, z7, z8, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void logEventAndBundle(String str, String str2, Bundle bundle, zzcu zzcuVar, long j7) {
        zzb();
        AbstractC3718s.m18077f(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f15078a.mo18422b().m18639t(new RunnableC4354v3(this, zzcuVar, new C4039G(str2, new C4023E(bundle), "app", j7), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void logHealthData(int i7, String str, InterfaceC3772a interfaceC3772a, InterfaceC3772a interfaceC3772a2, InterfaceC3772a interfaceC3772a3) {
        zzb();
        this.f15078a.mo18421a().m18860y(i7, true, false, str, interfaceC3772a == null ? null : BinderC3773b.m18220M0(interfaceC3772a), interfaceC3772a2 == null ? null : BinderC3773b.m18220M0(interfaceC3772a2), interfaceC3772a3 != null ? BinderC3773b.m18220M0(interfaceC3772a3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityCreated(InterfaceC3772a interfaceC3772a, Bundle bundle, long j7) {
        zzb();
        onActivityCreatedByScionActivityInfo(zzdf.zza((Activity) AbstractC3718s.m18083l((Activity) BinderC3773b.m18220M0(interfaceC3772a))), bundle, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j7) {
        zzb();
        C4275l4 c4275l4 = this.f15078a.m18660B().f16204c;
        if (c4275l4 != null) {
            this.f15078a.m18660B().m19286h0();
            c4275l4.mo18786e(zzdfVar, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityDestroyed(InterfaceC3772a interfaceC3772a, long j7) {
        zzb();
        onActivityDestroyedByScionActivityInfo(zzdf.zza((Activity) AbstractC3718s.m18083l((Activity) BinderC3773b.m18220M0(interfaceC3772a))), j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j7) {
        zzb();
        C4275l4 c4275l4 = this.f15078a.m18660B().f16204c;
        if (c4275l4 != null) {
            this.f15078a.m18660B().m19286h0();
            c4275l4.mo18783b(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityPaused(InterfaceC3772a interfaceC3772a, long j7) {
        zzb();
        onActivityPausedByScionActivityInfo(zzdf.zza((Activity) AbstractC3718s.m18083l((Activity) BinderC3773b.m18220M0(interfaceC3772a))), j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j7) {
        zzb();
        C4275l4 c4275l4 = this.f15078a.m18660B().f16204c;
        if (c4275l4 != null) {
            this.f15078a.m18660B().m19286h0();
            c4275l4.mo18782a(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityResumed(InterfaceC3772a interfaceC3772a, long j7) {
        zzb();
        onActivityResumedByScionActivityInfo(zzdf.zza((Activity) AbstractC3718s.m18083l((Activity) BinderC3773b.m18220M0(interfaceC3772a))), j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j7) {
        zzb();
        C4275l4 c4275l4 = this.f15078a.m18660B().f16204c;
        if (c4275l4 != null) {
            this.f15078a.m18660B().m19286h0();
            c4275l4.mo18785d(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivitySaveInstanceState(InterfaceC3772a interfaceC3772a, zzcu zzcuVar, long j7) {
        zzb();
        onActivitySaveInstanceStateByScionActivityInfo(zzdf.zza((Activity) AbstractC3718s.m18083l((Activity) BinderC3773b.m18220M0(interfaceC3772a))), zzcuVar, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, zzcu zzcuVar, long j7) {
        zzb();
        C4275l4 c4275l4 = this.f15078a.m18660B().f16204c;
        Bundle bundle = new Bundle();
        if (c4275l4 != null) {
            this.f15078a.m18660B().m19286h0();
            c4275l4.mo18784c(zzdfVar, bundle);
        }
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e7) {
            this.f15078a.mo18421a().m18854r().m18835b("Error returning bundle value to wrapper", e7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityStarted(InterfaceC3772a interfaceC3772a, long j7) {
        zzb();
        onActivityStartedByScionActivityInfo(zzdf.zza((Activity) AbstractC3718s.m18083l((Activity) BinderC3773b.m18220M0(interfaceC3772a))), j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j7) {
        zzb();
        if (this.f15078a.m18660B().f16204c != null) {
            this.f15078a.m18660B().m19286h0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityStopped(InterfaceC3772a interfaceC3772a, long j7) {
        zzb();
        onActivityStoppedByScionActivityInfo(zzdf.zza((Activity) AbstractC3718s.m18083l((Activity) BinderC3773b.m18220M0(interfaceC3772a))), j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j7) {
        zzb();
        if (this.f15078a.m18660B().f16204c != null) {
            this.f15078a.m18660B().m19286h0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void performAction(Bundle bundle, zzcu zzcuVar, long j7) {
        zzb();
        zzcuVar.zzb(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void registerOnMeasurementEventListener(zzda zzdaVar) {
        InterfaceC6018A c3998a6;
        zzb();
        Map map = this.f15079b;
        synchronized (map) {
            try {
                c3998a6 = (InterfaceC6018A) map.get(Integer.valueOf(zzdaVar.zzf()));
                if (c3998a6 == null) {
                    c3998a6 = new C3998A6(this, zzdaVar);
                    map.put(Integer.valueOf(zzdaVar.zzf()), c3998a6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f15078a.m18660B().m19265J(c3998a6);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void resetAnalyticsData(long j7) {
        zzb();
        this.f15078a.m18660B().m19262G(j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void retrieveAndUploadBatches(final zzcx zzcxVar) {
        zzb();
        this.f15078a.m18660B().m19300r0(new Runnable() { // from class: com.google.android.gms.measurement.internal.K5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    zzcxVar.zze();
                } catch (RemoteException e7) {
                    ((C4164X2) AbstractC3718s.m18083l(this.f15291a.f15078a)).mo18421a().m18854r().m18835b("Failed to call IDynamiteUploadBatchesCallback", e7);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setConditionalUserProperty(Bundle bundle, long j7) {
        zzb();
        if (bundle == null) {
            this.f15078a.mo18421a().m18851o().m18834a("Conditional user property must not be null");
        } else {
            this.f15078a.m18660B().m19269N(bundle, j7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setConsent(Bundle bundle, long j7) {
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setConsentThirdParty(Bundle bundle, long j7) {
        zzb();
        this.f15078a.m18660B().m19294o0(bundle, -20, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setCurrentScreen(InterfaceC3772a interfaceC3772a, String str, String str2, long j7) {
        zzb();
        setCurrentScreenByScionActivityInfo(zzdf.zza((Activity) AbstractC3718s.m18083l((Activity) BinderC3773b.m18220M0(interfaceC3772a))), str, str2, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j7) {
        zzb();
        this.f15078a.m18667I().m18553t(zzdfVar, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setDataCollectionEnabled(boolean z7) {
        zzb();
        C4371x4 c4371x4M18660B = this.f15078a.m18660B();
        c4371x4M18660B.m18748j();
        c4371x4M18660B.f15066a.mo18422b().m18639t(new RunnableC4089M3(c4371x4M18660B, z7));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setDefaultEventParameters(Bundle bundle) {
        zzb();
        final C4371x4 c4371x4M18660B = this.f15078a.m18660B();
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        c4371x4M18660B.f15066a.mo18422b().m18639t(new Runnable() { // from class: com.google.android.gms.measurement.internal.t4
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                c4371x4M18660B.m19276U(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setEventInterceptor(zzda zzdaVar) {
        zzb();
        C4261j6 c4261j6 = new C4261j6(this, zzdaVar);
        if (this.f15078a.mo18422b().m18635p()) {
            this.f15078a.m18660B().m19264I(c4261j6);
        } else {
            this.f15078a.mo18422b().m18639t(new RunnableC4291n4(this, c4261j6));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setInstanceIdProvider(zzdc zzdcVar) {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setMeasurementEnabled(boolean z7, long j7) {
        zzb();
        this.f15078a.m18660B().m19292n0(Boolean.valueOf(z7));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setMinimumSessionDuration(long j7) {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setSessionTimeoutDuration(long j7) {
        zzb();
        C4371x4 c4371x4M18660B = this.f15078a.m18660B();
        c4371x4M18660B.f15066a.mo18422b().m18639t(new RunnableC4110P3(c4371x4M18660B, j7));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setSgtmDebugInfo(Intent intent) {
        zzb();
        C4371x4 c4371x4M18660B = this.f15078a.m18660B();
        Uri data = intent.getData();
        if (data == null) {
            c4371x4M18660B.f15066a.mo18421a().m18857u().m18834a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            C4164X2 c4164x2 = c4371x4M18660B.f15066a;
            c4164x2.mo18421a().m18857u().m18834a("[sgtm] Preview Mode was not enabled.");
            c4164x2.m18686w().m18809Q(null);
        } else {
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            C4164X2 c4164x3 = c4371x4M18660B.f15066a;
            c4164x3.mo18421a().m18857u().m18835b("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            c4164x3.m18686w().m18809Q(queryParameter2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setUserId(final String str, long j7) {
        zzb();
        final C4371x4 c4371x4M18660B = this.f15078a.m18660B();
        if (str != null && TextUtils.isEmpty(str)) {
            c4371x4M18660B.f15066a.mo18421a().m18854r().m18834a("User ID must be non-empty or null");
        } else {
            c4371x4M18660B.f15066a.mo18422b().m18639t(new Runnable() { // from class: com.google.android.gms.measurement.internal.u4
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    C4164X2 c4164x2 = c4371x4M18660B.f15066a;
                    if (c4164x2.m18670L().m18761x(str)) {
                        c4164x2.m18670L().m18753p();
                    }
                }
            });
            c4371x4M18660B.m19314z(null, "_id", str, true, j7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setUserProperty(String str, String str2, InterfaceC3772a interfaceC3772a, boolean z7, long j7) {
        zzb();
        this.f15078a.m18660B().m19314z(str, str2, BinderC3773b.m18220M0(interfaceC3772a), z7, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void unregisterOnMeasurementEventListener(zzda zzdaVar) {
        InterfaceC6018A c3998a6;
        zzb();
        Map map = this.f15079b;
        synchronized (map) {
            c3998a6 = (InterfaceC6018A) map.remove(Integer.valueOf(zzdaVar.zzf()));
        }
        if (c3998a6 == null) {
            c3998a6 = new C3998A6(this, zzdaVar);
        }
        this.f15078a.m18660B().m19266K(c3998a6);
    }
}

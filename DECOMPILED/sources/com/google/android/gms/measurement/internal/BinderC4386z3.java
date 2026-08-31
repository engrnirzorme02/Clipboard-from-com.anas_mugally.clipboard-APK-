package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3766u;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzhz;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzic;
import com.google.android.gms.internal.measurement.zzmr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p170W2.AbstractC1845j;
import p170W2.C1846k;
import p283k3.AbstractBinderC6032c;
import p283k3.AbstractC6052w;
import p283k3.C6027J;
import p283k3.C6030a;
import p283k3.InterfaceC6036g;
import p283k3.InterfaceC6039j;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.z3 */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC4386z3 extends AbstractBinderC6032c {

    /* JADX INFO: renamed from: a */
    private final C4317q6 f16263a;

    /* JADX INFO: renamed from: b */
    private Boolean f16264b;

    /* JADX INFO: renamed from: c */
    private String f16265c;

    public BinderC4386z3(C4317q6 c4317q6, String str) {
        AbstractC3718s.m18083l(c4317q6);
        this.f16263a = c4317q6;
        this.f16265c = null;
    }

    /* JADX INFO: renamed from: T0 */
    private final void m19335T0(C4039G c4039g, C4006B6 c4006b6) {
        C4317q6 c4317q6 = this.f16263a;
        c4317q6.m18896E();
        c4317q6.m18928k(c4039g, c4006b6);
    }

    /* JADX INFO: renamed from: U0 */
    private final void m19336U0(C4006B6 c4006b6, boolean z7) {
        AbstractC3718s.m18083l(c4006b6);
        String str = c4006b6.f15112a;
        AbstractC3718s.m18077f(str);
        m19337V0(str, false);
        this.f16263a.m18906N0().m19399o(c4006b6.f15113b);
    }

    /* JADX INFO: renamed from: V0 */
    private final void m19337V0(String str, boolean z7) {
        if (TextUtils.isEmpty(str)) {
            this.f16263a.mo18421a().m18851o().m18834a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z7) {
            try {
                if (this.f16264b == null) {
                    boolean z8 = true;
                    if (!"com.google.android.gms".equals(this.f16265c)) {
                        C4317q6 c4317q6 = this.f16263a;
                        if (!AbstractC3766u.m18210a(c4317q6.mo18424e(), Binder.getCallingUid()) && !C1846k.m7641a(c4317q6.mo18424e()).m7646c(Binder.getCallingUid())) {
                            z8 = false;
                        }
                    }
                    this.f16264b = Boolean.valueOf(z8);
                }
                if (this.f16264b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e7) {
                this.f16263a.mo18421a().m18851o().m18835b("Measurement Service called with invalid calling package. appId", C4313q2.m18846x(str));
                throw e7;
            }
        }
        if (this.f16265c == null && AbstractC1845j.m7639k(this.f16263a.mo18424e(), Binder.getCallingUid(), str)) {
            this.f16265c = str;
        }
        if (str.equals(this.f16265c)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: D */
    public final void mo18724D(final C4006B6 c4006b6) {
        AbstractC3718s.m18077f(c4006b6.f15112a);
        AbstractC3718s.m18083l(c4006b6.f15099D);
        m19340L0(new Runnable() { // from class: com.google.android.gms.measurement.internal.y3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f16244a.m19341M0(c4006b6);
            }
        });
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: E */
    public final void mo18725E(final C4006B6 c4006b6, final Bundle bundle, final InterfaceC6036g interfaceC6036g) {
        m19336U0(c4006b6, false);
        final String str = (String) AbstractC3718s.m18083l(c4006b6.f15112a);
        this.f16263a.mo18422b().m18639t(new Runnable() { // from class: com.google.android.gms.measurement.internal.t3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f16065a.m19343O0(c4006b6, bundle, interfaceC6036g, str);
            }
        });
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: H0 */
    public final void mo18726H0(C4006B6 c4006b6) {
        AbstractC3718s.m18077f(c4006b6.f15112a);
        AbstractC3718s.m18083l(c4006b6.f15099D);
        m19340L0(new RunnableC4266k3(this, c4006b6));
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: I */
    public final List mo19338I(C4006B6 c4006b6, Bundle bundle) {
        m19336U0(c4006b6, false);
        AbstractC3718s.m18083l(c4006b6.f15112a);
        C4317q6 c4317q6 = this.f16263a;
        if (!c4317q6.m18891B0().m18800H(null, AbstractC4209d2.f15647Z0)) {
            try {
                return (List) this.f16263a.mo18422b().m18637r(new CallableC4322r3(this, c4006b6, bundle)).get();
            } catch (InterruptedException | ExecutionException e7) {
                this.f16263a.mo18421a().m18851o().m18836c("Failed to get trigger URIs. appId", C4313q2.m18846x(c4006b6.f15112a), e7);
                return Collections.EMPTY_LIST;
            }
        }
        try {
            return (List) c4317q6.mo18422b().m18638s(new CallableC4314q3(this, c4006b6, bundle)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e8) {
            this.f16263a.mo18421a().m18851o().m18836c("Failed to get trigger URIs. appId", C4313q2.m18846x(c4006b6.f15112a), e8);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: I0 */
    public final List mo19339I0(C4006B6 c4006b6, boolean z7) {
        m19336U0(c4006b6, false);
        String str = c4006b6.f15112a;
        AbstractC3718s.m18083l(str);
        try {
            List<C4373x6> list = (List) this.f16263a.mo18422b().m18637r(new CallableC4171Y2(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C4373x6 c4373x6 : list) {
                if (z7 || !C4389z6.m19357N(c4373x6.f16230c)) {
                    arrayList.add(new C4357v6(c4373x6));
                }
            }
            return arrayList;
        } catch (InterruptedException e7) {
            e = e7;
            this.f16263a.mo18421a().m18851o().m18836c("Failed to get user properties. appId", C4313q2.m18846x(c4006b6.f15112a), e);
            return null;
        } catch (ExecutionException e8) {
            e = e8;
            this.f16263a.mo18421a().m18851o().m18836c("Failed to get user properties. appId", C4313q2.m18846x(c4006b6.f15112a), e);
            return null;
        }
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: L */
    public final void mo18727L(C4039G c4039g, C4006B6 c4006b6) {
        AbstractC3718s.m18083l(c4039g);
        m19336U0(c4006b6, false);
        m19351Y0(new RunnableC4282m3(this, c4039g, c4006b6));
    }

    /* JADX INFO: renamed from: L0 */
    final void m19340L0(Runnable runnable) {
        AbstractC3718s.m18083l(runnable);
        C4317q6 c4317q6 = this.f16263a;
        if (c4317q6.mo18422b().m18635p()) {
            runnable.run();
        } else {
            c4317q6.mo18422b().m18641v(runnable);
        }
    }

    /* JADX INFO: renamed from: M0 */
    final /* synthetic */ void m19341M0(C4006B6 c4006b6) {
        C4317q6 c4317q6 = this.f16263a;
        c4317q6.m18896E();
        c4317q6.m18908P0(c4006b6);
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: N */
    public final void mo18728N(C4006B6 c4006b6) {
        m19336U0(c4006b6, false);
        m19351Y0(new RunnableC4250i3(this, c4006b6));
    }

    /* JADX INFO: renamed from: N0 */
    final /* synthetic */ void m19342N0(C4006B6 c4006b6) {
        C4317q6 c4317q6 = this.f16263a;
        c4317q6.m18896E();
        c4317q6.m18909Q0(c4006b6);
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: O */
    public final void mo18729O(final C4006B6 c4006b6) {
        AbstractC3718s.m18077f(c4006b6.f15112a);
        AbstractC3718s.m18083l(c4006b6.f15099D);
        m19340L0(new Runnable() { // from class: com.google.android.gms.measurement.internal.s3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f16040a.m19342N0(c4006b6);
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    final /* synthetic */ void m19343O0(C4006B6 c4006b6, Bundle bundle, InterfaceC6036g interfaceC6036g, String str) {
        C4317q6 c4317q6 = this.f16263a;
        c4317q6.m18896E();
        try {
            interfaceC6036g.zze(c4317q6.m18941q0(c4006b6, bundle));
        } catch (RemoteException e7) {
            this.f16263a.mo18421a().m18851o().m18836c("Failed to return trigger URIs for app", str, e7);
        }
    }

    /* JADX INFO: renamed from: P0 */
    final /* synthetic */ void m19344P0(String str, C6027J c6027j, InterfaceC6039j interfaceC6039j) {
        C4317q6 c4317q6 = this.f16263a;
        c4317q6.m18896E();
        c4317q6.mo18422b().mo18427h();
        c4317q6.m18907O0();
        List<C4341t6> listM19041o = c4317q6.m18898F0().m19041o(str, c6027j, ((Integer) AbstractC4209d2.f15598B.m18706b(null)).intValue());
        ArrayList arrayList = new ArrayList();
        for (C4341t6 c4341t6 : listM19041o) {
            if (c4317q6.m18946t(str, c4341t6.m18976e())) {
                int iM18980i = c4341t6.m18980i();
                if (iM18980i > 0) {
                    if (iM18980i <= ((Integer) AbstractC4209d2.f15710z.m18706b(null)).intValue()) {
                        if (c4317q6.mo18425f().mo18159a() >= c4341t6.m18979h() + Math.min(((Long) AbstractC4209d2.f15706x.m18706b(null)).longValue() * (1 << (iM18980i - 1)), ((Long) AbstractC4209d2.f15708y.m18706b(null)).longValue())) {
                        }
                    }
                    c4317q6.mo18421a().m18859w().m18837d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(c4341t6.m18974c()), Long.valueOf(c4341t6.m18979h()));
                }
                C4167X5 c4167x5M18973b = c4341t6.m18973b();
                try {
                    zzhz zzhzVar = (zzhz) C4349u6.m19071W(zzib.zzh(), c4167x5M18973b.f15505b);
                    for (int i7 = 0; i7 < zzhzVar.zzb(); i7++) {
                        zzic zzicVar = (zzic) zzhzVar.zzc(i7).zzcl();
                        zzicVar.zzs(c4317q6.mo18425f().mo18159a());
                        zzhzVar.zzd(i7, zzicVar);
                    }
                    c4167x5M18973b.f15505b = ((zzib) zzhzVar.zzbc()).zzcc();
                    if (Log.isLoggable(c4317q6.mo18421a().m18861z(), 2)) {
                        c4167x5M18973b.f15510r = c4317q6.m18903K0().m19090K((zzib) zzhzVar.zzbc());
                    }
                    arrayList.add(c4167x5M18973b);
                } catch (zzmr unused) {
                    c4317q6.mo18421a().m18854r().m18835b("Failed to parse queued batch. appId", str);
                }
            } else {
                c4317q6.mo18421a().m18859w().m18837d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(c4341t6.m18974c()), c4341t6.m18976e());
            }
        }
        C4181Z5 c4181z5 = new C4181Z5(arrayList);
        try {
            interfaceC6039j.mo18612m0(c4181z5);
            this.f16263a.mo18421a().m18859w().m18836c("[sgtm] Sending queued upload batches to client. appId, count", str, Integer.valueOf(c4181z5.f15539a.size()));
        } catch (RemoteException e7) {
            this.f16263a.mo18421a().m18851o().m18836c("[sgtm] Failed to return upload batches for app", str, e7);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    final /* synthetic */ void m19345Q0(C4006B6 c4006b6, C4230g c4230g) {
        C4317q6 c4317q6 = this.f16263a;
        c4317q6.m18896E();
        c4317q6.m18943r0((String) AbstractC3718s.m18083l(c4006b6.f15112a), c4230g);
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: R */
    public final void mo18730R(final C4006B6 c4006b6, final C4230g c4230g) {
        m19336U0(c4006b6, false);
        m19351Y0(new Runnable() { // from class: com.google.android.gms.measurement.internal.w3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f16179a.m19345Q0(c4006b6, c4230g);
            }
        });
    }

    /* JADX INFO: renamed from: R0 */
    final /* synthetic */ void m19346R0(Bundle bundle, String str, C4006B6 c4006b6) {
        C4317q6 c4317q6 = this.f16263a;
        boolean zM18800H = c4317q6.m18891B0().m18800H(null, AbstractC4209d2.f15641W0);
        if (bundle.isEmpty() && zM18800H) {
            C4342u c4342uM18898F0 = this.f16263a.m18898F0();
            c4342uM18898F0.mo18427h();
            c4342uM18898F0.m18696j();
            try {
                c4342uM18898F0.m19051u0().execSQL("delete from default_event_params where app_id=?", new String[]{str});
                return;
            } catch (SQLiteException e7) {
                c4342uM18898F0.f15066a.mo18421a().m18851o().m18835b("Error clearing default event params", e7);
                return;
            }
        }
        C4342u c4342uM18898F1 = c4317q6.m18898F0();
        c4342uM18898F1.mo18427h();
        c4342uM18898F1.m18696j();
        byte[] bArrZzcc = c4342uM18898F1.f15465b.m18903K0().m19089J(new C3999B(c4342uM18898F1.f15066a, "", str, "dep", 0L, 0L, bundle)).zzcc();
        C4164X2 c4164x2 = c4342uM18898F1.f15066a;
        c4164x2.mo18421a().m18859w().m18836c("Saving default event parameters, appId, data size", str, Integer.valueOf(bArrZzcc.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrZzcc);
        try {
            if (c4342uM18898F1.m19051u0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                c4164x2.mo18421a().m18851o().m18835b("Failed to insert default event parameters (got -1). appId", C4313q2.m18846x(str));
            }
        } catch (SQLiteException e8) {
            c4342uM18898F1.f15066a.mo18421a().m18851o().m18836c("Error storing default event parameters. appId", C4313q2.m18846x(str), e8);
        }
        C4317q6 c4317q7 = this.f16263a;
        C4342u c4342uM18898F2 = c4317q7.m18898F0();
        long j7 = c4006b6.f15110O;
        if (c4342uM18898F2.m19016H(str, j7)) {
            c4317q7.m18898F0().m19018I(str, Long.valueOf(j7), null, bundle);
        }
    }

    /* JADX INFO: renamed from: S0 */
    final /* synthetic */ C4317q6 m19347S0() {
        return this.f16263a;
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: T */
    public final byte[] mo18731T(C4039G c4039g, String str) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18083l(c4039g);
        m19337V0(str, true);
        C4317q6 c4317q6 = this.f16263a;
        C4297o2 c4297o2M18858v = c4317q6.mo18421a().m18858v();
        C4257j2 c4257j2M18905M0 = c4317q6.m18905M0();
        String str2 = c4039g.f15219a;
        c4297o2M18858v.m18835b("Log and bundle. event", c4257j2M18905M0.m18775a(str2));
        long jMo18160b = c4317q6.mo18425f().mo18160b() / 1000000;
        try {
            byte[] bArr = (byte[]) c4317q6.mo18422b().m18638s(new CallableC4298o3(this, c4039g, str)).get();
            if (bArr == null) {
                c4317q6.mo18421a().m18851o().m18835b("Log and bundle returned null. appId", C4313q2.m18846x(str));
                bArr = new byte[0];
            }
            c4317q6.mo18421a().m18858v().m18837d("Log and bundle processed. event, size, time_ms", c4317q6.m18905M0().m18775a(str2), Integer.valueOf(bArr.length), Long.valueOf((c4317q6.mo18425f().mo18160b() / 1000000) - jMo18160b));
            return bArr;
        } catch (InterruptedException e7) {
            e = e7;
            C4317q6 c4317q7 = this.f16263a;
            c4317q7.mo18421a().m18851o().m18837d("Failed to log and bundle. appId, event, error", C4313q2.m18846x(str), c4317q7.m18905M0().m18775a(c4039g.f15219a), e);
            return null;
        } catch (ExecutionException e8) {
            e = e8;
            C4317q6 c4317q8 = this.f16263a;
            c4317q8.mo18421a().m18851o().m18837d("Failed to log and bundle. appId, event, error", C4313q2.m18846x(str), c4317q8.m18905M0().m18775a(c4039g.f15219a), e);
            return null;
        }
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: V */
    public final void mo19348V(C4246i c4246i) {
        AbstractC3718s.m18083l(c4246i);
        AbstractC3718s.m18083l(c4246i.f15808c);
        AbstractC3718s.m18077f(c4246i.f15806a);
        m19337V0(c4246i.f15806a, true);
        m19351Y0(new RunnableC4210d3(this, new C4246i(c4246i)));
    }

    /* JADX INFO: renamed from: W0 */
    final void m19349W0(C4039G c4039g, C4006B6 c4006b6) {
        C4317q6 c4317q6 = this.f16263a;
        C4109P2 c4109p2M18895D0 = c4317q6.m18895D0();
        String str = c4006b6.f15112a;
        zzc zzcVar = TextUtils.isEmpty(str) ? null : (zzc) c4109p2M18895D0.f15358j.get(str);
        if (zzcVar == null) {
            this.f16263a.mo18421a().m18859w().m18835b("EES not loaded for", c4006b6.f15112a);
            m19335T0(c4039g, c4006b6);
            return;
        }
        try {
            Map mapM19099Z = c4317q6.m18903K0().m19099Z(c4039g.f15220b.m18484Y(), true);
            String str2 = c4039g.f15219a;
            String strM27059a = AbstractC6052w.m27059a(str2);
            if (strM27059a != null) {
                str2 = strM27059a;
            }
            if (zzcVar.zzb(new zzaa(str2, c4039g.f15222d, mapM19099Z))) {
                if (zzcVar.zzc()) {
                    C4317q6 c4317q7 = this.f16263a;
                    c4317q7.mo18421a().m18859w().m18835b("EES edited event", c4039g.f15219a);
                    m19335T0(c4317q7.m18903K0().m19100m(zzcVar.zze().zzc()), c4006b6);
                } else {
                    m19335T0(c4039g, c4006b6);
                }
                if (zzcVar.zzd()) {
                    for (zzaa zzaaVar : zzcVar.zze().zzf()) {
                        C4317q6 c4317q8 = this.f16263a;
                        c4317q8.mo18421a().m18859w().m18835b("EES logging created event", zzaaVar.zzb());
                        m19335T0(c4317q8.m18903K0().m19100m(zzaaVar), c4006b6);
                    }
                    return;
                }
                return;
            }
        } catch (zzd unused) {
            this.f16263a.mo18421a().m18851o().m18836c("EES error. appId, eventName", c4006b6.f15113b, c4039g.f15219a);
        }
        this.f16263a.mo18421a().m18859w().m18835b("EES was not applied to event", c4039g.f15219a);
        m19335T0(c4039g, c4006b6);
    }

    /* JADX INFO: renamed from: X0 */
    final C4039G m19350X0(C4039G c4039g, C4006B6 c4006b6) {
        C4023E c4023e;
        if ("_cmp".equals(c4039g.f15219a) && (c4023e = c4039g.f15220b) != null && c4023e.m18483X() != 0) {
            String strM18482W = c4023e.m18482W("_cis");
            if ("referrer broadcast".equals(strM18482W) || "referrer API".equals(strM18482W)) {
                this.f16263a.mo18421a().m18857u().m18835b("Event has been filtered ", c4039g.toString());
                return new C4039G("_cmpx", c4023e, c4039g.f15221c, c4039g.f15222d);
            }
        }
        return c4039g;
    }

    /* JADX INFO: renamed from: Y0 */
    final void m19351Y0(Runnable runnable) {
        AbstractC3718s.m18083l(runnable);
        C4317q6 c4317q6 = this.f16263a;
        if (c4317q6.mo18422b().m18635p()) {
            runnable.run();
        } else {
            c4317q6.mo18422b().m18639t(runnable);
        }
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: Z */
    public final void mo18732Z(C4357v6 c4357v6, C4006B6 c4006b6) {
        AbstractC3718s.m18083l(c4357v6);
        m19336U0(c4006b6, false);
        m19351Y0(new RunnableC4306p3(this, c4357v6, c4006b6));
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: a0 */
    public final C6030a mo18733a0(C4006B6 c4006b6) {
        m19336U0(c4006b6, false);
        AbstractC3718s.m18077f(c4006b6.f15112a);
        try {
            return (C6030a) this.f16263a.mo18422b().m18638s(new CallableC4274l3(this, c4006b6)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e7) {
            this.f16263a.mo18421a().m18851o().m18836c("Failed to get consent. appId", C4313q2.m18846x(c4006b6.f15112a), e7);
            return new C6030a(null);
        }
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: b0 */
    public final void mo18734b0(final Bundle bundle, final C4006B6 c4006b6) {
        m19336U0(c4006b6, false);
        final String str = c4006b6.f15112a;
        AbstractC3718s.m18083l(str);
        m19351Y0(new Runnable() { // from class: com.google.android.gms.measurement.internal.x3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f16200a.m19346R0(bundle, str, c4006b6);
            }
        });
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: d */
    public final List mo18735d(String str, String str2, String str3, boolean z7) {
        m19337V0(str, true);
        try {
            List<C4373x6> list = (List) this.f16263a.mo18422b().m18637r(new CallableC4226f3(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C4373x6 c4373x6 : list) {
                if (z7 || !C4389z6.m19357N(c4373x6.f16230c)) {
                    arrayList.add(new C4357v6(c4373x6));
                }
            }
            return arrayList;
        } catch (InterruptedException e7) {
            e = e7;
            this.f16263a.mo18421a().m18851o().m18836c("Failed to get user properties as. appId", C4313q2.m18846x(str), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e8) {
            e = e8;
            this.f16263a.mo18421a().m18851o().m18836c("Failed to get user properties as. appId", C4313q2.m18846x(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: e */
    public final void mo18736e(C4246i c4246i, C4006B6 c4006b6) {
        AbstractC3718s.m18083l(c4246i);
        AbstractC3718s.m18083l(c4246i.f15808c);
        m19336U0(c4006b6, false);
        C4246i c4246i2 = new C4246i(c4246i);
        c4246i2.f15806a = c4006b6.f15112a;
        m19351Y0(new RunnableC4202c3(this, c4246i2, c4006b6));
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: k */
    public final void mo19352k(C4039G c4039g, String str, String str2) {
        AbstractC3718s.m18083l(c4039g);
        AbstractC3718s.m18077f(str);
        m19337V0(str, true);
        m19351Y0(new RunnableC4290n3(this, c4039g, str));
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: k0 */
    public final void mo18737k0(C4006B6 c4006b6) {
        m19336U0(c4006b6, false);
        m19351Y0(new RunnableC4178Z2(this, c4006b6));
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: q */
    public final void mo18738q(long j7, String str, String str2, String str3) {
        m19351Y0(new RunnableC4194b3(this, str2, str3, str, j7));
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: r0 */
    public final void mo18739r0(C4006B6 c4006b6) {
        m19336U0(c4006b6, false);
        m19351Y0(new RunnableC4186a3(this, c4006b6));
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: t0 */
    public final List mo18740t0(String str, String str2, boolean z7, C4006B6 c4006b6) {
        m19336U0(c4006b6, false);
        String str3 = c4006b6.f15112a;
        AbstractC3718s.m18083l(str3);
        try {
            List<C4373x6> list = (List) this.f16263a.mo18422b().m18637r(new CallableC4218e3(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C4373x6 c4373x6 : list) {
                if (z7 || !C4389z6.m19357N(c4373x6.f16230c)) {
                    arrayList.add(new C4357v6(c4373x6));
                }
            }
            return arrayList;
        } catch (InterruptedException e7) {
            e = e7;
            this.f16263a.mo18421a().m18851o().m18836c("Failed to query user properties. appId", C4313q2.m18846x(c4006b6.f15112a), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e8) {
            e = e8;
            this.f16263a.mo18421a().m18851o().m18836c("Failed to query user properties. appId", C4313q2.m18846x(c4006b6.f15112a), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: u */
    public final void mo18741u(C4006B6 c4006b6) {
        String str = c4006b6.f15112a;
        AbstractC3718s.m18077f(str);
        m19337V0(str, false);
        m19351Y0(new RunnableC4258j3(this, c4006b6));
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: w */
    public final void mo18742w(C4006B6 c4006b6, final C6027J c6027j, final InterfaceC6039j interfaceC6039j) {
        m19336U0(c4006b6, false);
        final String str = (String) AbstractC3718s.m18083l(c4006b6.f15112a);
        this.f16263a.mo18422b().m18639t(new Runnable() { // from class: com.google.android.gms.measurement.internal.u3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f16106a.m19344P0(str, c6027j, interfaceC6039j);
            }
        });
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: x0 */
    public final String mo18743x0(C4006B6 c4006b6) {
        m19336U0(c4006b6, false);
        return this.f16263a.m18939p0(c4006b6);
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: y */
    public final List mo18744y(String str, String str2, String str3) {
        m19337V0(str, true);
        try {
            return (List) this.f16263a.mo18422b().m18637r(new CallableC4242h3(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e7) {
            this.f16263a.mo18421a().m18851o().m18835b("Failed to get conditional user properties as", e7);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: y0 */
    public final List mo18745y0(String str, String str2, C4006B6 c4006b6) {
        m19336U0(c4006b6, false);
        String str3 = c4006b6.f15112a;
        AbstractC3718s.m18083l(str3);
        try {
            return (List) this.f16263a.mo18422b().m18637r(new CallableC4234g3(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e7) {
            this.f16263a.mo18421a().m18851o().m18835b("Failed to get conditional user properties", e7);
            return Collections.EMPTY_LIST;
        }
    }
}

package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.measurement.zzcu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import p177X2.AbstractC1945a;
import p209b3.C2959a;
import p283k3.C6027J;
import p283k3.C6030a;
import p283k3.C6040k;
import p283k3.InterfaceC6033d;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.w5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4364w5 extends AbstractC4225f2 {

    /* JADX INFO: renamed from: c */
    private final ServiceConnectionC4316q5 f16184c;

    /* JADX INFO: renamed from: d */
    private InterfaceC6033d f16185d;

    /* JADX INFO: renamed from: e */
    private volatile Boolean f16186e;

    /* JADX INFO: renamed from: f */
    private final AbstractC4366x f16187f;

    /* JADX INFO: renamed from: g */
    private ScheduledExecutorService f16188g;

    /* JADX INFO: renamed from: h */
    private final C4125R5 f16189h;

    /* JADX INFO: renamed from: i */
    private final List f16190i;

    /* JADX INFO: renamed from: j */
    private final AbstractC4366x f16191j;

    protected C4364w5(C4164X2 c4164x2) {
        super(c4164x2);
        this.f16190i = new ArrayList();
        this.f16189h = new C4125R5(c4164x2.mo18425f());
        this.f16184c = new ServiceConnectionC4316q5(this);
        this.f16187f = new C4159W4(this, c4164x2);
        this.f16191j = new C4188a5(this, c4164x2);
    }

    /* JADX INFO: renamed from: R */
    private final boolean m19197R() {
        this.f15066a.mo18423c();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void m19211J() {
        mo18427h();
        this.f16189h.m18622a();
        this.f15066a.m18686w();
        this.f16187f.m19249b(((Long) AbstractC4209d2.f15646Z.m18706b(null)).longValue());
    }

    /* JADX INFO: renamed from: T */
    private final void m19199T(Runnable runnable) {
        mo18427h();
        if (m19219W()) {
            runnable.run();
            return;
        }
        List list = this.f16190i;
        long size = list.size();
        C4164X2 c4164x2 = this.f15066a;
        c4164x2.m18686w();
        if (size >= 1000) {
            c4164x2.mo18421a().m18851o().m18834a("Discarding data. Max runnable queue size reached");
            return;
        }
        list.add(runnable);
        this.f16191j.m19249b(60000L);
        m19243w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final void m19213L() {
        mo18427h();
        C4297o2 c4297o2M18859w = this.f15066a.mo18421a().m18859w();
        List list = this.f16190i;
        c4297o2M18859w.m18835b("Processing queued up service tasks", Integer.valueOf(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e7) {
                this.f15066a.mo18421a().m18851o().m18835b("Task exception while flushing queue", e7);
            }
        }
        this.f16190i.clear();
        this.f16191j.m19251d();
    }

    /* JADX INFO: renamed from: V */
    private final C4006B6 m19201V(boolean z7) {
        Pair pairM18455b;
        C4164X2 c4164x2 = this.f15066a;
        c4164x2.mo18423c();
        C4233g2 c4233g2M18670L = this.f15066a.m18670L();
        String string = null;
        if (z7) {
            C4164X2 c4164x3 = c4164x2.mo18421a().f15066a;
            if (c4164x3.m18687x().f15171e != null && (pairM18455b = c4164x3.m18687x().f15171e.m18455b()) != null && pairM18455b != C4026E2.f15168A) {
                String strValueOf = String.valueOf(pairM18455b.second);
                String str = (String) pairM18455b.first;
                StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length());
                sb.append(strValueOf);
                sb.append(":");
                sb.append(str);
                string = sb.toString();
            }
        }
        return c4233g2M18670L.m18752o(string);
    }

    /* JADX INFO: renamed from: A */
    public final void m19202A() {
        mo18427h();
        m18748j();
        ServiceConnectionC4316q5 serviceConnectionC4316q5 = this.f16184c;
        serviceConnectionC4316q5.m18863b();
        try {
            C2959a.m14804b().m14810c(this.f15066a.mo18424e(), serviceConnectionC4316q5);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f16185d = null;
    }

    /* JADX INFO: renamed from: B */
    public final void m19203B(zzcu zzcuVar, C4039G c4039g, String str) {
        mo18427h();
        m18748j();
        C4164X2 c4164x2 = this.f15066a;
        if (c4164x2.m18661C().m19387X(12451000) == 0) {
            m19199T(new RunnableC4180Z4(this, c4039g, str, zzcuVar));
        } else {
            c4164x2.mo18421a().m18854r().m18834a("Not bundling data. Service unavailable or out of date");
            c4164x2.m18661C().m19393d0(zzcuVar, new byte[0]);
        }
    }

    /* JADX INFO: renamed from: C */
    final boolean m19204C() {
        mo18427h();
        m18748j();
        return !m19245y() || this.f15066a.m18661C().m19386W() >= ((Integer) AbstractC4209d2.f15617K0.m18706b(null)).intValue();
    }

    /* JADX INFO: renamed from: D */
    final boolean m19205D() {
        mo18427h();
        m18748j();
        return !m19245y() || this.f15066a.m18661C().m19386W() >= 241200;
    }

    /* JADX INFO: renamed from: E */
    final /* synthetic */ void m19206E() {
        InterfaceC6033d interfaceC6033d = this.f16185d;
        if (interfaceC6033d == null) {
            this.f15066a.mo18421a().m18851o().m18834a("Failed to send storage consent settings to service");
            return;
        }
        try {
            C4006B6 c4006b6M19201V = m19201V(false);
            AbstractC3718s.m18083l(c4006b6M19201V);
            interfaceC6033d.mo18724D(c4006b6M19201V);
            m19211J();
        } catch (RemoteException e7) {
            this.f15066a.mo18421a().m18851o().m18835b("Failed to send storage consent settings to the service", e7);
        }
    }

    /* JADX INFO: renamed from: F */
    final /* synthetic */ void m19207F() {
        InterfaceC6033d interfaceC6033d = this.f16185d;
        if (interfaceC6033d == null) {
            this.f15066a.mo18421a().m18851o().m18834a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            C4006B6 c4006b6M19201V = m19201V(false);
            AbstractC3718s.m18083l(c4006b6M19201V);
            interfaceC6033d.mo18729O(c4006b6M19201V);
            m19211J();
        } catch (RemoteException e7) {
            this.f15066a.mo18421a().m18851o().m18835b("Failed to send Dma consent settings to the service", e7);
        }
    }

    /* JADX INFO: renamed from: G */
    final /* synthetic */ void m19208G(AtomicReference atomicReference, C4006B6 c4006b6, Bundle bundle) {
        synchronized (atomicReference) {
            try {
                InterfaceC6033d interfaceC6033d = this.f16185d;
                if (interfaceC6033d == null) {
                    this.f15066a.mo18421a().m18851o().m18834a("Failed to request trigger URIs; not connected to service");
                    return;
                }
                AbstractC3718s.m18083l(c4006b6);
                interfaceC6033d.mo18725E(c4006b6, bundle, new BinderC4104O4(this, atomicReference));
                m19211J();
            } catch (RemoteException e7) {
                this.f15066a.mo18421a().m18851o().m18835b("Failed to request trigger URIs; remote exception", e7);
                atomicReference.notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: H */
    final /* synthetic */ void m19209H(AtomicReference atomicReference, C4006B6 c4006b6, C6027J c6027j) {
        synchronized (atomicReference) {
            try {
                InterfaceC6033d interfaceC6033d = this.f16185d;
                if (interfaceC6033d == null) {
                    this.f15066a.mo18421a().m18851o().m18834a("[sgtm] Failed to get upload batches; not connected to service");
                    return;
                }
                AbstractC3718s.m18083l(c4006b6);
                interfaceC6033d.mo18742w(c4006b6, c6027j, new BinderC4111P4(this, atomicReference));
                m19211J();
            } catch (RemoteException e7) {
                this.f15066a.mo18421a().m18851o().m18835b("[sgtm] Failed to get upload batches; remote exception", e7);
                atomicReference.notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: I */
    final /* synthetic */ void m19210I(C4006B6 c4006b6, C4230g c4230g) {
        InterfaceC6033d interfaceC6033d = this.f16185d;
        if (interfaceC6033d == null) {
            this.f15066a.mo18421a().m18851o().m18834a("[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            interfaceC6033d.mo18730R(c4006b6, c4230g);
            m19211J();
        } catch (RemoteException e7) {
            this.f15066a.mo18421a().m18851o().m18836c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(c4230g.f15756a), e7);
        }
    }

    /* JADX INFO: renamed from: K */
    final /* synthetic */ void m19212K(ComponentName componentName) {
        mo18427h();
        if (this.f16185d != null) {
            this.f16185d = null;
            this.f15066a.mo18421a().m18859w().m18835b("Disconnected from device MeasurementService", componentName);
            mo18427h();
            m19243w();
        }
    }

    /* JADX INFO: renamed from: M */
    final /* synthetic */ ServiceConnectionC4316q5 m19214M() {
        return this.f16184c;
    }

    /* JADX INFO: renamed from: N */
    final /* synthetic */ InterfaceC6033d m19215N() {
        return this.f16185d;
    }

    /* JADX INFO: renamed from: O */
    final /* synthetic */ void m19216O(InterfaceC6033d interfaceC6033d) {
        this.f16185d = null;
    }

    /* JADX INFO: renamed from: P */
    final /* synthetic */ ScheduledExecutorService m19217P() {
        return this.f16188g;
    }

    /* JADX INFO: renamed from: Q */
    final /* synthetic */ void m19218Q(ScheduledExecutorService scheduledExecutorService) {
        this.f16188g = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m19219W() {
        mo18427h();
        m18748j();
        return this.f16185d != null;
    }

    /* JADX INFO: renamed from: X */
    protected final void m19220X() {
        mo18427h();
        m18748j();
        m19199T(new RunnableC4196b5(this, m19201V(true)));
    }

    /* JADX INFO: renamed from: Y */
    protected final void m19221Y(boolean z7) {
        mo18427h();
        m18748j();
        if (m19204C()) {
            m19199T(new RunnableC4204c5(this, m19201V(false)));
        }
    }

    /* JADX INFO: renamed from: Z */
    protected final void m19222Z(boolean z7) {
        mo18427h();
        m18748j();
        m19199T(new Runnable() { // from class: com.google.android.gms.measurement.internal.v5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f16122a.m19206E();
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    protected final void m19223a0() {
        mo18427h();
        m18748j();
        m19199T(new Runnable() { // from class: com.google.android.gms.measurement.internal.r5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f16033a.m19207F();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00fe  */
    /* JADX INFO: renamed from: b0 */
    final void m19224b0(InterfaceC6033d interfaceC6033d, AbstractC1945a abstractC1945a, C4006B6 c4006b6) {
        C4006B6 c4006b7;
        String str;
        long jMo18161c;
        long j7;
        mo18427h();
        m18748j();
        m19197R();
        C4164X2 c4164x2 = this.f15066a;
        c4164x2.m18686w();
        C4006B6 c4006b8 = c4006b6;
        int size = 100;
        int i7 = 0;
        for (int i8 = 100; i7 < 1001 && size == i8; i8 = 100) {
            C4164X2 c4164x3 = this.f15066a;
            ArrayList arrayList = new ArrayList();
            List listM18769t = c4164x3.m18663E().m18769t(i8);
            if (listM18769t != null) {
                arrayList.addAll(listM18769t);
                size = listM18769t.size();
            } else {
                size = 0;
            }
            if (abstractC1945a != 0 && size < i8) {
                arrayList.add(new C6040k(abstractC1945a, c4006b8.f15114c, c4006b8.f15121u));
            }
            String str2 = null;
            boolean zM18800H = c4164x2.m18686w().m18800H(null, AbstractC4209d2.f15627P0);
            int size2 = arrayList.size();
            int i9 = 0;
            while (i9 < size2) {
                C6040k c6040k = (C6040k) arrayList.get(i9);
                AbstractC1945a abstractC1945a2 = c6040k.f23809a;
                C4278m c4278mM18686w = c4164x2.m18686w();
                C4201c2 c4201c2 = AbstractC4209d2.f15656c1;
                if (c4278mM18686w.m18800H(str2, c4201c2)) {
                    String str3 = c6040k.f23810b;
                    if (TextUtils.isEmpty(str3)) {
                        c4006b7 = c4006b8;
                    } else {
                        c4006b7 = new C4006B6(c4006b8.f15112a, c4006b8.f15113b, str3, c6040k.f23811c, c4006b8.f15115d, c4006b8.f15116e, c4006b8.f15117f, c4006b8.f15118r, c4006b8.f15119s, c4006b8.f15120t, c4006b8.f15122v, c4006b8.f15123w, c4006b8.f15124x, c4006b8.f15125y, c4006b8.f15126z, c4006b8.f15096A, c4006b8.f15097B, c4006b8.f15098C, c4006b8.f15099D, c4006b8.f15100E, c4006b8.f15101F, c4006b8.f15102G, c4006b8.f15103H, c4006b8.f15104I, c4006b8.f15105J, c4006b8.f15106K, c4006b8.f15107L, c4006b8.f15108M, c4006b8.f15109N, c4006b8.f15110O, c4006b8.f15111P);
                    }
                } else {
                    c4006b7 = c4006b8;
                }
                if (abstractC1945a2 instanceof C4039G) {
                    if (zM18800H) {
                        try {
                            C4164X2 c4164x4 = this.f15066a;
                            long jMo18159a = c4164x4.mo18425f().mo18159a();
                            try {
                                j7 = jMo18159a;
                                jMo18161c = c4164x4.mo18425f().mo18161c();
                            } catch (RemoteException e7) {
                                e = e7;
                                j7 = jMo18159a;
                                jMo18161c = 0;
                                this.f15066a.mo18421a().m18851o().m18835b("Failed to send event to the service", e);
                                if (zM18800H && j7 != 0) {
                                    C4164X2 c4164x5 = this.f15066a;
                                    C4281m2.m18823a(c4164x5).m18824b(36301, 13, j7, c4164x5.mo18425f().mo18159a(), (int) (c4164x5.mo18425f().mo18161c() - jMo18161c));
                                }
                                str = null;
                                i9++;
                                c4006b8 = c4006b7;
                                str2 = str;
                                c4164x2 = c4164x2;
                            }
                        } catch (RemoteException e8) {
                            e = e8;
                            jMo18161c = 0;
                            j7 = 0;
                        }
                    } else {
                        jMo18161c = 0;
                        j7 = 0;
                    }
                    try {
                        interfaceC6033d.mo18727L((C4039G) abstractC1945a2, c4006b7);
                        if (zM18800H) {
                            c4164x2.mo18421a().m18859w().m18834a("Logging telemetry for logEvent from database");
                            C4164X2 c4164x6 = this.f15066a;
                            C4281m2.m18823a(c4164x6).m18824b(36301, 0, j7, c4164x6.mo18425f().mo18159a(), (int) (c4164x6.mo18425f().mo18161c() - jMo18161c));
                        }
                    } catch (RemoteException e9) {
                        e = e9;
                        this.f15066a.mo18421a().m18851o().m18835b("Failed to send event to the service", e);
                        if (zM18800H) {
                            C4164X2 c4164x7 = this.f15066a;
                            C4281m2.m18823a(c4164x7).m18824b(36301, 13, j7, c4164x7.mo18425f().mo18159a(), (int) (c4164x7.mo18425f().mo18161c() - jMo18161c));
                        }
                    }
                } else if (abstractC1945a2 instanceof C4357v6) {
                    try {
                        interfaceC6033d.mo18732Z((C4357v6) abstractC1945a2, c4006b7);
                    } catch (RemoteException e10) {
                        this.f15066a.mo18421a().m18851o().m18835b("Failed to send user property to the service", e10);
                    }
                } else {
                    if (abstractC1945a2 instanceof C4246i) {
                        try {
                            interfaceC6033d.mo18736e((C4246i) abstractC1945a2, c4006b7);
                        } catch (RemoteException e11) {
                            this.f15066a.mo18421a().m18851o().m18835b("Failed to send conditional user property to the service", e11);
                        }
                    } else {
                        C4164X2 c4164x8 = this.f15066a;
                        str = null;
                        if (c4164x8.m18686w().m18800H(null, c4201c2) && (abstractC1945a2 instanceof C4023E)) {
                            try {
                                interfaceC6033d.mo18734b0(((C4023E) abstractC1945a2).m18484Y(), c4006b7);
                            } catch (RemoteException e12) {
                                this.f15066a.mo18421a().m18851o().m18835b("Failed to send default event parameters to the service", e12);
                            }
                        } else {
                            c4164x8.mo18421a().m18851o().m18834a("Discarding data. Unrecognized parcel type.");
                        }
                    }
                    i9++;
                    c4006b8 = c4006b7;
                    str2 = str;
                    c4164x2 = c4164x2;
                }
                str = null;
                i9++;
                c4006b8 = c4006b7;
                str2 = str;
                c4164x2 = c4164x2;
            }
            i7++;
        }
    }

    /* JADX INFO: renamed from: c0 */
    protected final void m19225c0(C4039G c4039g, String str) {
        AbstractC3718s.m18083l(c4039g);
        mo18427h();
        m18748j();
        m19197R();
        m19199T(new RunnableC4212d5(this, true, m19201V(true), this.f15066a.m18663E().m18765p(c4039g), c4039g, str));
    }

    /* JADX INFO: renamed from: d0 */
    protected final void m19226d0(C4246i c4246i) {
        AbstractC3718s.m18083l(c4246i);
        mo18427h();
        m18748j();
        this.f15066a.mo18423c();
        m19199T(new RunnableC4220e5(this, true, m19201V(true), this.f15066a.m18663E().m18767r(c4246i), new C4246i(c4246i), c4246i));
    }

    /* JADX INFO: renamed from: e0 */
    protected final void m19227e0(AtomicReference atomicReference, String str, String str2, String str3) {
        mo18427h();
        m18748j();
        m19199T(new RunnableC4228f5(this, atomicReference, null, str2, str3, m19201V(false)));
    }

    /* JADX INFO: renamed from: f0 */
    protected final void m19228f0(zzcu zzcuVar, String str, String str2) {
        mo18427h();
        m18748j();
        m19199T(new RunnableC4236g5(this, str, str2, m19201V(false), zzcuVar));
    }

    /* JADX INFO: renamed from: g0 */
    protected final void m19229g0(AtomicReference atomicReference, String str, String str2, String str3, boolean z7) {
        mo18427h();
        m18748j();
        m19199T(new RunnableC4244h5(this, atomicReference, null, str2, str3, m19201V(false), z7));
    }

    /* JADX INFO: renamed from: h0 */
    protected final void m19230h0(zzcu zzcuVar, String str, String str2, boolean z7) {
        mo18427h();
        m18748j();
        m19199T(new RunnableC4097N4(this, str, str2, m19201V(false), z7, zzcuVar));
    }

    /* JADX INFO: renamed from: i0 */
    protected final void m19231i0(final AtomicReference atomicReference, final Bundle bundle) {
        mo18427h();
        m18748j();
        final C4006B6 c4006b6M19201V = m19201V(false);
        m19199T(new Runnable() { // from class: com.google.android.gms.measurement.internal.s5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f16043a.m19208G(atomicReference, c4006b6M19201V, bundle);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    protected final void m19232j0(final AtomicReference atomicReference, final C6027J c6027j) {
        mo18427h();
        m18748j();
        final C4006B6 c4006b6M19201V = m19201V(false);
        m19199T(new Runnable() { // from class: com.google.android.gms.measurement.internal.t5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f16072a.m19209H(atomicReference, c4006b6M19201V, c6027j);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    protected final void m19233k0(final C4230g c4230g) {
        mo18427h();
        m18748j();
        final C4006B6 c4006b6M19201V = m19201V(true);
        AbstractC3718s.m18083l(c4006b6M19201V);
        m19199T(new Runnable() { // from class: com.google.android.gms.measurement.internal.u5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f16112a.m19210I(c4006b6M19201V, c4230g);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    protected final C6030a m19234l0() {
        mo18427h();
        m18748j();
        InterfaceC6033d interfaceC6033d = this.f16185d;
        if (interfaceC6033d == null) {
            m19243w();
            this.f15066a.mo18421a().m18858v().m18834a("Failed to get consents; not connected to service yet.");
            return null;
        }
        C4006B6 c4006b6M19201V = m19201V(false);
        AbstractC3718s.m18083l(c4006b6M19201V);
        try {
            C6030a c6030aMo18733a0 = interfaceC6033d.mo18733a0(c4006b6M19201V);
            m19211J();
            return c6030aMo18733a0;
        } catch (RemoteException e7) {
            this.f15066a.mo18421a().m18851o().m18835b("Failed to get consents; remote exception", e7);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4225f2
    /* JADX INFO: renamed from: m */
    protected final boolean mo18463m() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    protected final void m19235o(C4357v6 c4357v6) {
        mo18427h();
        m18748j();
        m19197R();
        m19199T(new RunnableC4118Q4(this, m19201V(true), this.f15066a.m18663E().m18766q(c4357v6), c4357v6));
    }

    /* JADX INFO: renamed from: p */
    protected final void m19236p() {
        mo18427h();
        m18748j();
        C4006B6 c4006b6M19201V = m19201V(false);
        m19197R();
        this.f15066a.m18663E().m18764o();
        m19199T(new RunnableC4124R4(this, c4006b6M19201V));
    }

    /* JADX INFO: renamed from: q */
    public final void m19237q(AtomicReference atomicReference) {
        mo18427h();
        m18748j();
        m19199T(new RunnableC4131S4(this, atomicReference, m19201V(false)));
    }

    /* JADX INFO: renamed from: r */
    public final void m19238r(zzcu zzcuVar) {
        mo18427h();
        m18748j();
        m19199T(new RunnableC4138T4(this, m19201V(false), zzcuVar));
    }

    /* JADX INFO: renamed from: s */
    protected final void m19239s() {
        mo18427h();
        m18748j();
        C4006B6 c4006b6M19201V = m19201V(true);
        m19197R();
        this.f15066a.m18686w().m18800H(null, AbstractC4209d2.f15656c1);
        this.f15066a.m18663E().m18770u();
        m19199T(new RunnableC4145U4(this, c4006b6M19201V, true));
    }

    /* JADX INFO: renamed from: t */
    protected final void m19240t() {
        mo18427h();
        m18748j();
        m19199T(new RunnableC4152V4(this, m19201V(true)));
    }

    /* JADX INFO: renamed from: u */
    protected final void m19241u(C4028E4 c4028e4) {
        mo18427h();
        m18748j();
        m19199T(new RunnableC4166X4(this, c4028e4));
    }

    /* JADX INFO: renamed from: v */
    public final void m19242v(Bundle bundle) {
        mo18427h();
        m18748j();
        C4023E c4023e = new C4023E(bundle);
        m19197R();
        m19199T(new RunnableC4173Y4(this, true, m19201V(false), this.f15066a.m18686w().m18800H(null, AbstractC4209d2.f15656c1) && this.f15066a.m18663E().m18768s(c4023e), c4023e, bundle));
    }

    /* JADX INFO: renamed from: w */
    final void m19243w() {
        mo18427h();
        m18748j();
        if (m19219W()) {
            return;
        }
        if (m19245y()) {
            this.f16184c.m18864c();
            return;
        }
        C4164X2 c4164x2 = this.f15066a;
        if (c4164x2.m18686w().m18815m()) {
            return;
        }
        c4164x2.mo18423c();
        List<ResolveInfo> listQueryIntentServices = c4164x2.mo18424e().getPackageManager().queryIntentServices(new Intent().setClassName(c4164x2.mo18424e(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            c4164x2.mo18421a().m18851o().m18834a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context contextMo18424e = c4164x2.mo18424e();
        c4164x2.mo18423c();
        intent.setComponent(new ComponentName(contextMo18424e, "com.google.android.gms.measurement.AppMeasurementService"));
        this.f16184c.m18862a(intent);
    }

    /* JADX INFO: renamed from: x */
    final Boolean m19244x() {
        return this.f16186e;
    }

    /* JADX INFO: renamed from: y */
    final boolean m19245y() {
        mo18427h();
        m18748j();
        if (this.f16186e == null) {
            mo18427h();
            m18748j();
            C4164X2 c4164x2 = this.f15066a;
            C4026E2 c4026e2M18687x = c4164x2.m18687x();
            c4026e2M18687x.mo18427h();
            boolean z7 = false;
            Boolean boolValueOf = !c4026e2M18687x.m18488p().contains("use_service") ? null : Boolean.valueOf(c4026e2M18687x.m18488p().getBoolean("use_service", false));
            boolean z8 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                c4164x2.mo18423c();
                if (this.f15066a.m18670L().m18759v() == 1) {
                    z7 = true;
                } else {
                    c4164x2.mo18421a().m18859w().m18834a("Checking service availability");
                    int iM19387X = c4164x2.m18661C().m19387X(12451000);
                    if (iM19387X == 0) {
                        c4164x2.mo18421a().m18859w().m18834a("Service available");
                    } else if (iM19387X == 1) {
                        c4164x2.mo18421a().m18859w().m18834a("Service missing");
                    } else if (iM19387X != 2) {
                        if (iM19387X == 3) {
                            c4164x2.mo18421a().m18854r().m18834a("Service disabled");
                        } else if (iM19387X == 9) {
                            c4164x2.mo18421a().m18854r().m18834a("Service invalid");
                        } else if (iM19387X != 18) {
                            c4164x2.mo18421a().m18854r().m18835b("Unexpected service status", Integer.valueOf(iM19387X));
                        } else {
                            c4164x2.mo18421a().m18854r().m18834a("Service updating");
                        }
                        z8 = false;
                    } else {
                        c4164x2.mo18421a().m18858v().m18834a("Service container out of date");
                        if (c4164x2.m18661C().m19386W() >= 17443) {
                            z7 = boolValueOf == null;
                            z8 = false;
                        }
                    }
                    z7 = true;
                }
                if (!z7 && c4164x2.m18686w().m18815m()) {
                    c4164x2.mo18421a().m18851o().m18834a("No way to upload. Consider using the full version of Analytics");
                } else if (z8) {
                    C4026E2 c4026e2M18687x2 = c4164x2.m18687x();
                    c4026e2M18687x2.mo18427h();
                    SharedPreferences.Editor editorEdit = c4026e2M18687x2.m18488p().edit();
                    editorEdit.putBoolean("use_service", z7);
                    editorEdit.apply();
                }
                z8 = z7;
            }
            this.f16186e = Boolean.valueOf(z8);
        }
        return this.f16186e.booleanValue();
    }

    /* JADX INFO: renamed from: z */
    protected final void m19246z(InterfaceC6033d interfaceC6033d) {
        mo18427h();
        AbstractC3718s.m18083l(interfaceC6033d);
        this.f16185d = interfaceC6033d;
        m19211J();
        m19213L();
    }
}

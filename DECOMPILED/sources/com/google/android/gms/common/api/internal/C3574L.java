package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.appcompat.app.AbstractC2263x;
import androidx.collection.C2390a;
import com.google.android.gms.common.api.AbstractC3559g;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.api.C3647q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3747b;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import p170W2.C1837b;
import p170W2.C1839d;
import p184Y2.C2028e;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.L */
/* JADX INFO: loaded from: classes.dex */
public final class C3574L implements AbstractC3560h.b, AbstractC3560h.c {

    /* JADX INFO: renamed from: b */
    private final C3553a.f f14579b;

    /* JADX INFO: renamed from: c */
    private final C3590b f14580c;

    /* JADX INFO: renamed from: d */
    private final C3563B f14581d;

    /* JADX INFO: renamed from: r */
    private final int f14584r;

    /* JADX INFO: renamed from: s */
    private final BinderC3597e0 f14585s;

    /* JADX INFO: renamed from: t */
    private boolean f14586t;

    /* JADX INFO: renamed from: x */
    final /* synthetic */ C3600g f14590x;

    /* JADX INFO: renamed from: a */
    private final Queue f14578a = new LinkedList();

    /* JADX INFO: renamed from: e */
    private final Set f14582e = new HashSet();

    /* JADX INFO: renamed from: f */
    private final Map f14583f = new HashMap();

    /* JADX INFO: renamed from: u */
    private final List f14587u = new ArrayList();

    /* JADX INFO: renamed from: v */
    private C1837b f14588v = null;

    /* JADX INFO: renamed from: w */
    private int f14589w = 0;

    public C3574L(C3600g c3600g, AbstractC3559g abstractC3559g) {
        this.f14590x = c3600g;
        C3553a.f fVarZab = abstractC3559g.zab(c3600g.f14657y.getLooper(), this);
        this.f14579b = fVarZab;
        this.f14580c = abstractC3559g.getApiKey();
        this.f14581d = new C3563B();
        this.f14584r = abstractC3559g.zaa();
        if (fVarZab.requiresSignIn()) {
            this.f14585s = abstractC3559g.zac(c3600g.f14648e, c3600g.f14657y);
        } else {
            this.f14585s = null;
        }
    }

    /* JADX INFO: renamed from: c */
    private final C1839d m17801c(C1839d[] c1839dArr) {
        if (c1839dArr != null && c1839dArr.length != 0) {
            C1839d[] availableFeatures = this.f14579b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new C1839d[0];
            }
            C2390a c2390a = new C2390a(availableFeatures.length);
            for (C1839d c1839d : availableFeatures) {
                c2390a.put(c1839d.m7602T(), Long.valueOf(c1839d.m7603U()));
            }
            for (C1839d c1839d2 : c1839dArr) {
                Long l7 = (Long) c2390a.get(c1839d2.m7602T());
                if (l7 == null || l7.longValue() < c1839d2.m7603U()) {
                    return c1839d2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private final void m17802d(C1837b c1837b) {
        Iterator it = this.f14582e.iterator();
        if (!it.hasNext()) {
            this.f14582e.clear();
            return;
        }
        AbstractC2263x.m9328a(it.next());
        if (AbstractC3714q.m18053b(c1837b, C1837b.f5972e)) {
            this.f14579b.getEndpointPackageName();
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final void m17803e(Status status) {
        AbstractC3718s.m18075d(this.f14590x.f14657y);
        m17804f(status, null, false);
    }

    /* JADX INFO: renamed from: f */
    private final void m17804f(Status status, Exception exc, boolean z7) {
        AbstractC3718s.m18075d(this.f14590x.f14657y);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f14578a.iterator();
        while (it.hasNext()) {
            AbstractC3617o0 abstractC3617o0 = (AbstractC3617o0) it.next();
            if (!z7 || abstractC3617o0.f14679a == 2) {
                if (status != null) {
                    abstractC3617o0.mo17908a(status);
                } else {
                    abstractC3617o0.mo17909b(exc);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m17805g() {
        ArrayList arrayList = new ArrayList(this.f14578a);
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC3617o0 abstractC3617o0 = (AbstractC3617o0) arrayList.get(i7);
            if (!this.f14579b.isConnected()) {
                return;
            }
            if (m17811m(abstractC3617o0)) {
                this.f14578a.remove(abstractC3617o0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final void m17806h() {
        m17821A();
        m17802d(C1837b.f5972e);
        m17810l();
        Iterator it = this.f14583f.values().iterator();
        if (it.hasNext()) {
            ((AbstractC3589a0) it.next()).getClass();
            throw null;
        }
        m17805g();
        m17808j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final void m17807i(int i7) {
        m17821A();
        this.f14586t = true;
        this.f14581d.m17785e(i7, this.f14579b.getLastDisconnectMessage());
        C3590b c3590b = this.f14580c;
        C3600g c3600g = this.f14590x;
        c3600g.f14657y.sendMessageDelayed(Message.obtain(c3600g.f14657y, 9, c3590b), 5000L);
        C3590b c3590b2 = this.f14580c;
        C3600g c3600g2 = this.f14590x;
        c3600g2.f14657y.sendMessageDelayed(Message.obtain(c3600g2.f14657y, 11, c3590b2), 120000L);
        this.f14590x.f14650r.m17987c();
        Iterator it = this.f14583f.values().iterator();
        while (it.hasNext()) {
            ((AbstractC3589a0) it.next()).f14618a.run();
        }
    }

    /* JADX INFO: renamed from: j */
    private final void m17808j() {
        this.f14590x.f14657y.removeMessages(12, this.f14580c);
        C3590b c3590b = this.f14580c;
        C3600g c3600g = this.f14590x;
        c3600g.f14657y.sendMessageDelayed(c3600g.f14657y.obtainMessage(12, c3590b), this.f14590x.f14644a);
    }

    /* JADX INFO: renamed from: k */
    private final void m17809k(AbstractC3617o0 abstractC3617o0) {
        abstractC3617o0.mo17930d(this.f14581d, m17830a());
        try {
            abstractC3617o0.mo17910c(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.f14579b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    /* JADX INFO: renamed from: l */
    private final void m17810l() {
        if (this.f14586t) {
            C3600g c3600g = this.f14590x;
            c3600g.f14657y.removeMessages(11, this.f14580c);
            C3600g c3600g2 = this.f14590x;
            c3600g2.f14657y.removeMessages(9, this.f14580c);
            this.f14586t = false;
        }
    }

    /* JADX INFO: renamed from: m */
    private final boolean m17811m(AbstractC3617o0 abstractC3617o0) {
        if (!(abstractC3617o0 instanceof AbstractC3583V)) {
            m17809k(abstractC3617o0);
            return true;
        }
        AbstractC3583V abstractC3583V = (AbstractC3583V) abstractC3617o0;
        C1839d c1839dM17801c = m17801c(abstractC3583V.mo17851g(this));
        if (c1839dM17801c == null) {
            m17809k(abstractC3617o0);
            return true;
        }
        Log.w("GoogleApiManager", this.f14579b.getClass().getName() + " could not execute call because it requires feature (" + c1839dM17801c.m7602T() + ", " + c1839dM17801c.m7603U() + ").");
        if (!this.f14590x.f14658z || !abstractC3583V.mo17850f(this)) {
            abstractC3583V.mo17909b(new C3647q(c1839dM17801c));
            return true;
        }
        C3576N c3576n = new C3576N(this.f14580c, c1839dM17801c, null);
        int iIndexOf = this.f14587u.indexOf(c3576n);
        if (iIndexOf >= 0) {
            C3576N c3576n2 = (C3576N) this.f14587u.get(iIndexOf);
            this.f14590x.f14657y.removeMessages(15, c3576n2);
            C3600g c3600g = this.f14590x;
            c3600g.f14657y.sendMessageDelayed(Message.obtain(c3600g.f14657y, 15, c3576n2), 5000L);
            return false;
        }
        this.f14587u.add(c3576n);
        C3600g c3600g2 = this.f14590x;
        c3600g2.f14657y.sendMessageDelayed(Message.obtain(c3600g2.f14657y, 15, c3576n), 5000L);
        C3600g c3600g3 = this.f14590x;
        c3600g3.f14657y.sendMessageDelayed(Message.obtain(c3600g3.f14657y, 16, c3576n), 120000L);
        C1837b c1837b = new C1837b(2, null);
        if (m17812n(c1837b)) {
            return false;
        }
        this.f14590x.m17899f(c1837b, this.f14584r);
        return false;
    }

    /* JADX INFO: renamed from: n */
    private final boolean m17812n(C1837b c1837b) {
        synchronized (C3600g.f14642C) {
            try {
                C3600g c3600g = this.f14590x;
                if (c3600g.f14654v == null || !c3600g.f14655w.contains(this.f14580c)) {
                    return false;
                }
                this.f14590x.f14654v.m17941h(c1837b, this.f14584r);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final boolean m17813o(boolean z7) {
        AbstractC3718s.m18075d(this.f14590x.f14657y);
        if (!this.f14579b.isConnected() || !this.f14583f.isEmpty()) {
            return false;
        }
        if (!this.f14581d.m17787g()) {
            this.f14579b.disconnect("Timing out service connection.");
            return true;
        }
        if (!z7) {
            return false;
        }
        m17808j();
        return false;
    }

    /* JADX INFO: renamed from: y */
    static /* bridge */ /* synthetic */ void m17819y(C3574L c3574l, C3576N c3576n) {
        if (c3574l.f14587u.contains(c3576n) && !c3574l.f14586t) {
            if (c3574l.f14579b.isConnected()) {
                c3574l.m17805g();
            } else {
                c3574l.m17822B();
            }
        }
    }

    /* JADX INFO: renamed from: z */
    static /* bridge */ /* synthetic */ void m17820z(C3574L c3574l, C3576N c3576n) {
        C1839d[] c1839dArrMo17851g;
        if (c3574l.f14587u.remove(c3576n)) {
            c3574l.f14590x.f14657y.removeMessages(15, c3576n);
            c3574l.f14590x.f14657y.removeMessages(16, c3576n);
            C1839d c1839d = c3576n.f14592b;
            ArrayList arrayList = new ArrayList(c3574l.f14578a.size());
            for (AbstractC3617o0 abstractC3617o0 : c3574l.f14578a) {
                if ((abstractC3617o0 instanceof AbstractC3583V) && (c1839dArrMo17851g = ((AbstractC3583V) abstractC3617o0).mo17851g(c3574l)) != null && AbstractC3747b.m18145b(c1839dArrMo17851g, c1839d)) {
                    arrayList.add(abstractC3617o0);
                }
            }
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                AbstractC3617o0 abstractC3617o1 = (AbstractC3617o0) arrayList.get(i7);
                c3574l.f14578a.remove(abstractC3617o1);
                abstractC3617o1.mo17909b(new C3647q(c1839d));
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m17821A() {
        AbstractC3718s.m18075d(this.f14590x.f14657y);
        this.f14588v = null;
    }

    /* JADX INFO: renamed from: B */
    public final void m17822B() {
        AbstractC3718s.m18075d(this.f14590x.f14657y);
        if (this.f14579b.isConnected() || this.f14579b.isConnecting()) {
            return;
        }
        try {
            C3600g c3600g = this.f14590x;
            int iM17986b = c3600g.f14650r.m17986b(c3600g.f14648e, this.f14579b);
            if (iM17986b == 0) {
                C3600g c3600g2 = this.f14590x;
                C3553a.f fVar = this.f14579b;
                C3578P c3578p = new C3578P(c3600g2, fVar, this.f14580c);
                if (fVar.requiresSignIn()) {
                    ((BinderC3597e0) AbstractC3718s.m18083l(this.f14585s)).m17867N0(c3578p);
                }
                try {
                    this.f14579b.connect(c3578p);
                    return;
                } catch (SecurityException e7) {
                    m17825E(new C1837b(10), e7);
                    return;
                }
            }
            C1837b c1837b = new C1837b(iM17986b, null);
            Log.w("GoogleApiManager", "The service for " + this.f14579b.getClass().getName() + " is not available: " + c1837b.toString());
            m17825E(c1837b, null);
        } catch (IllegalStateException e8) {
            m17825E(new C1837b(10), e8);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m17823C(AbstractC3617o0 abstractC3617o0) {
        AbstractC3718s.m18075d(this.f14590x.f14657y);
        if (this.f14579b.isConnected()) {
            if (m17811m(abstractC3617o0)) {
                m17808j();
                return;
            } else {
                this.f14578a.add(abstractC3617o0);
                return;
            }
        }
        this.f14578a.add(abstractC3617o0);
        C1837b c1837b = this.f14588v;
        if (c1837b == null || !c1837b.m7599W()) {
            m17822B();
        } else {
            m17825E(this.f14588v, null);
        }
    }

    /* JADX INFO: renamed from: D */
    final void m17824D() {
        this.f14589w++;
    }

    /* JADX INFO: renamed from: E */
    public final void m17825E(C1837b c1837b, Exception exc) {
        AbstractC3718s.m18075d(this.f14590x.f14657y);
        BinderC3597e0 binderC3597e0 = this.f14585s;
        if (binderC3597e0 != null) {
            binderC3597e0.m17868O0();
        }
        m17821A();
        this.f14590x.f14650r.m17987c();
        m17802d(c1837b);
        if ((this.f14579b instanceof C2028e) && c1837b.m7596T() != 24) {
            this.f14590x.f14645b = true;
            C3600g c3600g = this.f14590x;
            c3600g.f14657y.sendMessageDelayed(c3600g.f14657y.obtainMessage(19), 300000L);
        }
        if (c1837b.m7596T() == 4) {
            m17803e(C3600g.f14641B);
            return;
        }
        if (this.f14578a.isEmpty()) {
            this.f14588v = c1837b;
            return;
        }
        if (exc != null) {
            AbstractC3718s.m18075d(this.f14590x.f14657y);
            m17804f(null, exc, false);
            return;
        }
        if (!this.f14590x.f14658z) {
            m17803e(C3600g.m17874g(this.f14580c, c1837b));
            return;
        }
        m17804f(C3600g.m17874g(this.f14580c, c1837b), null, true);
        if (this.f14578a.isEmpty() || m17812n(c1837b) || this.f14590x.m17899f(c1837b, this.f14584r)) {
            return;
        }
        if (c1837b.m7596T() == 18) {
            this.f14586t = true;
        }
        if (!this.f14586t) {
            m17803e(C3600g.m17874g(this.f14580c, c1837b));
            return;
        }
        C3600g c3600g2 = this.f14590x;
        c3600g2.f14657y.sendMessageDelayed(Message.obtain(c3600g2.f14657y, 9, this.f14580c), 5000L);
    }

    /* JADX INFO: renamed from: F */
    public final void m17826F(C1837b c1837b) {
        AbstractC3718s.m18075d(this.f14590x.f14657y);
        C3553a.f fVar = this.f14579b;
        fVar.disconnect("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(c1837b));
        m17825E(c1837b, null);
    }

    /* JADX INFO: renamed from: G */
    public final void m17827G() {
        AbstractC3718s.m18075d(this.f14590x.f14657y);
        if (this.f14586t) {
            m17822B();
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m17828H() {
        AbstractC3718s.m18075d(this.f14590x.f14657y);
        m17803e(C3600g.f14640A);
        this.f14581d.m17786f();
        for (C3610l.a aVar : (C3610l.a[]) this.f14583f.keySet().toArray(new C3610l.a[0])) {
            m17823C(new C3615n0(aVar, new TaskCompletionSource()));
        }
        m17802d(new C1837b(4));
        if (this.f14579b.isConnected()) {
            this.f14579b.onUserSignOut(new C3573K(this));
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m17829I() {
        AbstractC3718s.m18075d(this.f14590x.f14657y);
        if (this.f14586t) {
            m17810l();
            C3600g c3600g = this.f14590x;
            m17803e(c3600g.f14649f.mo7608g(c3600g.f14648e) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f14579b.disconnect("Timing out connection while resuming.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m17830a() {
        return this.f14579b.requiresSignIn();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m17831b() {
        return m17813o(true);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3598f
    public final void onConnected(Bundle bundle) {
        if (Looper.myLooper() == this.f14590x.f14657y.getLooper()) {
            m17806h();
        } else {
            this.f14590x.f14657y.post(new RunnableC3570H(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3616o
    public final void onConnectionFailed(C1837b c1837b) {
        m17825E(c1837b, null);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3598f
    public final void onConnectionSuspended(int i7) {
        if (Looper.myLooper() == this.f14590x.f14657y.getLooper()) {
            m17807i(i7);
        } else {
            this.f14590x.f14657y.post(new RunnableC3571I(this, i7));
        }
    }

    /* JADX INFO: renamed from: p */
    public final int m17832p() {
        return this.f14584r;
    }

    /* JADX INFO: renamed from: q */
    final int m17833q() {
        return this.f14589w;
    }

    /* JADX INFO: renamed from: s */
    public final C3553a.f m17834s() {
        return this.f14579b;
    }

    /* JADX INFO: renamed from: u */
    public final Map m17835u() {
        return this.f14583f;
    }
}

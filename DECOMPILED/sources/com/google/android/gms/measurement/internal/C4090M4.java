package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.M4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4090M4 extends AbstractC4225f2 {

    /* JADX INFO: renamed from: c */
    private volatile C4028E4 f15310c;

    /* JADX INFO: renamed from: d */
    private volatile C4028E4 f15311d;

    /* JADX INFO: renamed from: e */
    protected C4028E4 f15312e;

    /* JADX INFO: renamed from: f */
    private final Map f15313f;

    /* JADX INFO: renamed from: g */
    private zzdf f15314g;

    /* JADX INFO: renamed from: h */
    private volatile boolean f15315h;

    /* JADX INFO: renamed from: i */
    private volatile C4028E4 f15316i;

    /* JADX INFO: renamed from: j */
    private C4028E4 f15317j;

    /* JADX INFO: renamed from: k */
    private boolean f15318k;

    /* JADX INFO: renamed from: l */
    private final Object f15319l;

    public C4090M4(C4164X2 c4164x2) {
        super(c4164x2);
        this.f15319l = new Object();
        this.f15313f = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: F */
    private final void m18541F(String str, C4028E4 c4028e4, boolean z7) {
        C4028E4 c4028e5;
        C4028E4 c4028e6 = this.f15310c == null ? this.f15311d : this.f15310c;
        if (c4028e4.f15197b == null) {
            c4028e5 = new C4028E4(c4028e4.f15196a, str != null ? m18551r(str, "Activity") : null, c4028e4.f15198c, c4028e4.f15200e, c4028e4.f15201f);
        } else {
            c4028e5 = c4028e4;
        }
        this.f15311d = this.f15310c;
        this.f15310c = c4028e5;
        C4164X2 c4164x2 = this.f15066a;
        c4164x2.mo18422b().m18639t(new RunnableC4044G4(this, c4028e5, c4028e6, c4164x2.mo18425f().mo18161c(), z7));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    /* JADX INFO: renamed from: G */
    private final void m18542G(C4028E4 c4028e4, C4028E4 c4028e5, long j7, boolean z7, Bundle bundle) {
        boolean z8;
        long j8;
        mo18427h();
        boolean z9 = false;
        if (c4028e5 != null) {
            if (c4028e5.f15198c == c4028e4.f15198c && Objects.equals(c4028e5.f15197b, c4028e4.f15197b) && Objects.equals(c4028e5.f15196a, c4028e4.f15196a)) {
                z8 = false;
            } else {
                z8 = true;
            }
        } else {
            z8 = true;
        }
        if (z7 && this.f15312e != null) {
            z9 = true;
        }
        if (z8) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            C4389z6.m19362k0(c4028e4, bundle2, true);
            if (c4028e5 != null) {
                String str = c4028e5.f15196a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = c4028e5.f15197b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", c4028e5.f15198c);
            }
            if (z9) {
                C4084L5 c4084l5 = this.f15066a.m18689z().f15335f;
                long j9 = j7 - c4084l5.f15301b;
                c4084l5.f15301b = j7;
                if (j9 > 0) {
                    this.f15066a.m18661C().m19389Z(bundle2, j9);
                }
            }
            C4164X2 c4164x2 = this.f15066a;
            if (!c4164x2.m18686w().m18806N()) {
                bundle2.putLong("_mst", 1L);
            }
            boolean z10 = c4028e4.f15200e;
            String str3 = true != z10 ? "auto" : "app";
            long jMo18159a = c4164x2.mo18425f().mo18159a();
            if (z10) {
                long j10 = c4028e4.f15201f;
                if (j10 == 0) {
                    j8 = jMo18159a;
                } else {
                    j8 = j10;
                }
            } else {
                j8 = jMo18159a;
            }
            this.f15066a.m18660B().m19305u(str3, "_vs", j8, bundle2);
        }
        if (z9) {
            m18543o(this.f15312e, true, j7);
        }
        this.f15312e = c4028e4;
        if (c4028e4.f15200e) {
            this.f15317j = c4028e4;
        }
        this.f15066a.m18668J().m19241u(c4028e4);
    }

    /* JADX INFO: renamed from: o */
    private final void m18543o(C4028E4 c4028e4, boolean z7, long j7) {
        C4164X2 c4164x2 = this.f15066a;
        c4164x2.m18671M().m18448k(c4164x2.mo18425f().mo18161c());
        if (!c4164x2.m18689z().f15335f.m18540d(c4028e4 != null && c4028e4.f15199d, z7, j7) || c4028e4 == null) {
            return;
        }
        c4028e4.f15199d = false;
    }

    /* JADX INFO: renamed from: p */
    private final C4028E4 m18544p(zzdf zzdfVar) {
        AbstractC3718s.m18083l(zzdfVar);
        Integer numValueOf = Integer.valueOf(zzdfVar.zza);
        Map map = this.f15313f;
        C4028E4 c4028e4 = (C4028E4) map.get(numValueOf);
        if (c4028e4 == null) {
            C4028E4 c4028e5 = new C4028E4(null, m18551r(zzdfVar.zzb, "Activity"), this.f15066a.m18661C().m19401p0());
            map.put(numValueOf, c4028e5);
            c4028e4 = c4028e5;
        }
        return this.f15316i != null ? this.f15316i : c4028e4;
    }

    /* JADX INFO: renamed from: A */
    final /* synthetic */ void m18545A(Bundle bundle, C4028E4 c4028e4, C4028E4 c4028e5, long j7) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        m18542G(c4028e4, c4028e5, j7, true, this.f15066a.m18661C().m19407t(null, "screen_view", bundle, null, false));
    }

    /* JADX INFO: renamed from: B */
    final /* synthetic */ void m18546B(C4028E4 c4028e4, C4028E4 c4028e5, long j7, boolean z7, Bundle bundle) {
        m18542G(c4028e4, c4028e5, j7, z7, null);
    }

    /* JADX INFO: renamed from: C */
    final /* synthetic */ void m18547C(C4028E4 c4028e4, boolean z7, long j7) {
        m18543o(c4028e4, false, j7);
    }

    /* JADX INFO: renamed from: D */
    final /* synthetic */ C4028E4 m18548D() {
        return this.f15317j;
    }

    /* JADX INFO: renamed from: E */
    final /* synthetic */ void m18549E(C4028E4 c4028e4) {
        this.f15317j = null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4225f2
    /* JADX INFO: renamed from: m */
    protected final boolean mo18463m() {
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final C4028E4 m18550q(boolean z7) {
        m18748j();
        mo18427h();
        if (!z7) {
            return this.f15312e;
        }
        C4028E4 c4028e4 = this.f15312e;
        return c4028e4 != null ? c4028e4 : this.f15317j;
    }

    /* JADX INFO: renamed from: r */
    final String m18551r(String str, String str2) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str3 = length > 0 ? strArrSplit[length - 1] : "";
        C4164X2 c4164x2 = this.f15066a;
        return str3.length() > c4164x2.m18686w().m18820x(null, false) ? str3.substring(0, c4164x2.m18686w().m18820x(null, false)) : str3;
    }

    /* JADX INFO: renamed from: s */
    public final void m18552s(Bundle bundle, long j7) {
        synchronized (this.f15319l) {
            try {
                if (!this.f15318k) {
                    this.f15066a.mo18421a().m18856t().m18834a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > this.f15066a.m18686w().m18820x(null, false))) {
                    this.f15066a.mo18421a().m18856t().m18835b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > this.f15066a.m18686w().m18820x(null, false))) {
                    this.f15066a.mo18421a().m18856t().m18835b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    zzdf zzdfVar = this.f15314g;
                    string2 = zzdfVar != null ? m18551r(zzdfVar.zzb, "Activity") : "Activity";
                }
                C4028E4 c4028e4 = this.f15310c;
                if (this.f15315h && c4028e4 != null) {
                    this.f15315h = false;
                    boolean zEquals = Objects.equals(c4028e4.f15197b, string2);
                    boolean zEquals2 = Objects.equals(c4028e4.f15196a, string);
                    if (zEquals && zEquals2) {
                        this.f15066a.mo18421a().m18856t().m18834a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                C4164X2 c4164x2 = this.f15066a;
                c4164x2.mo18421a().m18859w().m18836c("Logging screen view with name, class", string == null ? "null" : string, string2 == null ? "null" : string2);
                C4028E4 c4028e5 = this.f15310c == null ? this.f15311d : this.f15310c;
                C4028E4 c4028e6 = new C4028E4(string, string2, c4164x2.m18661C().m19401p0(), true, j7);
                this.f15310c = c4028e6;
                this.f15311d = c4028e5;
                this.f15316i = c4028e6;
                c4164x2.mo18422b().m18639t(new RunnableC4036F4(this, bundle, c4028e6, c4028e5, c4164x2.mo18425f().mo18161c()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m18553t(zzdf zzdfVar, String str, String str2) {
        C4164X2 c4164x2 = this.f15066a;
        if (!c4164x2.m18686w().m18806N()) {
            c4164x2.mo18421a().m18856t().m18834a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C4028E4 c4028e4 = this.f15310c;
        if (c4028e4 == null) {
            c4164x2.mo18421a().m18856t().m18834a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Map map = this.f15313f;
        Integer numValueOf = Integer.valueOf(zzdfVar.zza);
        if (map.get(numValueOf) == null) {
            c4164x2.mo18421a().m18856t().m18834a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = m18551r(zzdfVar.zzb, "Activity");
        }
        String str3 = c4028e4.f15197b;
        String str4 = c4028e4.f15196a;
        boolean zEquals = Objects.equals(str3, str2);
        boolean zEquals2 = Objects.equals(str4, str);
        if (zEquals && zEquals2) {
            c4164x2.mo18421a().m18856t().m18834a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > c4164x2.m18686w().m18820x(null, false))) {
            c4164x2.mo18421a().m18856t().m18835b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > c4164x2.m18686w().m18820x(null, false))) {
            c4164x2.mo18421a().m18856t().m18835b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        c4164x2.mo18421a().m18859w().m18836c("Setting current screen to name, class", str == null ? "null" : str, str2);
        C4028E4 c4028e5 = new C4028E4(str, str2, c4164x2.m18661C().m19401p0());
        map.put(numValueOf, c4028e5);
        m18541F(zzdfVar.zzb, c4028e5, true);
    }

    /* JADX INFO: renamed from: u */
    public final C4028E4 m18554u() {
        return this.f15310c;
    }

    /* JADX INFO: renamed from: v */
    public final void m18555v(zzdf zzdfVar, Bundle bundle) {
        Bundle bundle2;
        if (!this.f15066a.m18686w().m18806N() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f15313f.put(Integer.valueOf(zzdfVar.zza), new C4028E4(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    /* JADX INFO: renamed from: w */
    public final void m18556w(zzdf zzdfVar) {
        Object obj = this.f15319l;
        synchronized (obj) {
            this.f15318k = true;
            if (!Objects.equals(zzdfVar, this.f15314g)) {
                synchronized (obj) {
                    this.f15314g = zzdfVar;
                    this.f15315h = false;
                    C4164X2 c4164x2 = this.f15066a;
                    if (c4164x2.m18686w().m18806N()) {
                        this.f15316i = null;
                        c4164x2.mo18422b().m18639t(new RunnableC4083L4(this));
                    }
                }
            }
        }
        C4164X2 c4164x3 = this.f15066a;
        if (!c4164x3.m18686w().m18806N()) {
            this.f15310c = this.f15316i;
            c4164x3.mo18422b().m18639t(new RunnableC4052H4(this));
            return;
        }
        m18541F(zzdfVar.zzb, m18544p(zzdfVar), false);
        C4008C0 c4008c0M18671M = this.f15066a.m18671M();
        C4164X2 c4164x4 = c4008c0M18671M.f15066a;
        c4164x4.mo18422b().m18639t(new RunnableC4191b0(c4008c0M18671M, c4164x4.mo18425f().mo18161c()));
    }

    /* JADX INFO: renamed from: x */
    public final void m18557x(zzdf zzdfVar) {
        synchronized (this.f15319l) {
            this.f15318k = false;
            this.f15315h = true;
        }
        C4164X2 c4164x2 = this.f15066a;
        long jMo18161c = c4164x2.mo18425f().mo18161c();
        if (!c4164x2.m18686w().m18806N()) {
            this.f15310c = null;
            c4164x2.mo18422b().m18639t(new RunnableC4060I4(this, jMo18161c));
        } else {
            C4028E4 c4028e4M18544p = m18544p(zzdfVar);
            this.f15311d = this.f15310c;
            this.f15310c = null;
            c4164x2.mo18422b().m18639t(new RunnableC4068J4(this, c4028e4M18544p, jMo18161c));
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m18558y(zzdf zzdfVar, Bundle bundle) {
        C4028E4 c4028e4;
        if (!this.f15066a.m18686w().m18806N() || bundle == null || (c4028e4 = (C4028E4) this.f15313f.get(Integer.valueOf(zzdfVar.zza))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c4028e4.f15198c);
        bundle2.putString("name", c4028e4.f15196a);
        bundle2.putString("referrer_name", c4028e4.f15197b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX INFO: renamed from: z */
    public final void m18559z(zzdf zzdfVar) {
        synchronized (this.f15319l) {
            try {
                if (Objects.equals(this.f15314g, zzdfVar)) {
                    this.f15314g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f15066a.m18686w().m18806N()) {
            this.f15313f.remove(Integer.valueOf(zzdfVar.zza));
        }
    }
}

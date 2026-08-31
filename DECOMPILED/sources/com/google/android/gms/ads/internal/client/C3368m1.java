package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzfoa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p314o2.C6570v;
import p404z2.C7590g;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.m1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3368m1 {

    /* JADX INFO: renamed from: a */
    private final String f14007a;

    /* JADX INFO: renamed from: b */
    private final List f14008b;

    /* JADX INFO: renamed from: c */
    private final Set f14009c;

    /* JADX INFO: renamed from: d */
    private final Bundle f14010d;

    /* JADX INFO: renamed from: e */
    private final String f14011e;

    /* JADX INFO: renamed from: f */
    private final String f14012f;

    /* JADX INFO: renamed from: g */
    private final int f14013g;

    /* JADX INFO: renamed from: h */
    private final Set f14014h;

    /* JADX INFO: renamed from: i */
    private final Bundle f14015i;

    /* JADX INFO: renamed from: j */
    private final Set f14016j;

    /* JADX INFO: renamed from: k */
    private final boolean f14017k;

    /* JADX INFO: renamed from: l */
    private final String f14018l;

    /* JADX INFO: renamed from: m */
    private final int f14019m;

    /* JADX INFO: renamed from: n */
    private long f14020n = 0;

    /* JADX INFO: renamed from: o */
    private long f14021o;

    public C3368m1(C3364l1 c3364l1, zzfoa zzfoaVar) {
        this.f14021o = 0L;
        this.f14007a = c3364l1.m17267y();
        this.f14008b = c3364l1.m17268z();
        this.f14009c = Collections.unmodifiableSet(c3364l1.m17261s());
        this.f14010d = c3364l1.m17262t();
        Collections.unmodifiableMap(c3364l1.m17263u());
        this.f14011e = c3364l1.m17242A();
        this.f14012f = c3364l1.m17243a();
        this.f14013g = c3364l1.m17244b();
        this.f14014h = Collections.unmodifiableSet(c3364l1.m17264v());
        this.f14015i = c3364l1.m17265w();
        this.f14016j = Collections.unmodifiableSet(c3364l1.m17266x());
        this.f14017k = c3364l1.m17245c();
        this.f14018l = c3364l1.m17246d();
        this.f14019m = c3364l1.m17247e();
        this.f14021o = c3364l1.m17248f();
    }

    /* JADX INFO: renamed from: a */
    public final String m17270a() {
        return this.f14007a;
    }

    /* JADX INFO: renamed from: b */
    public final List m17271b() {
        return new ArrayList(this.f14008b);
    }

    /* JADX INFO: renamed from: c */
    public final Set m17272c() {
        return this.f14009c;
    }

    /* JADX INFO: renamed from: d */
    public final Bundle m17273d(Class cls) {
        return this.f14010d.getBundle(cls.getName());
    }

    /* JADX INFO: renamed from: e */
    public final String m17274e() {
        return this.f14011e;
    }

    /* JADX INFO: renamed from: f */
    public final String m17275f() {
        return this.f14012f;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m17276g(Context context) {
        C6570v c6570vM17336j = C3407w1.m17330e().m17336j();
        C3244B.m17190a();
        Set set = this.f14014h;
        String strM33277d = C7590g.m33277d(context);
        return set.contains(strM33277d) || c6570vM17336j.m27858e().contains(strM33277d);
    }

    /* JADX INFO: renamed from: h */
    public final Bundle m17277h() {
        return this.f14010d;
    }

    /* JADX INFO: renamed from: i */
    public final int m17278i() {
        return this.f14013g;
    }

    /* JADX INFO: renamed from: j */
    public final Bundle m17279j() {
        return this.f14015i;
    }

    /* JADX INFO: renamed from: k */
    public final Set m17280k() {
        return this.f14016j;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m17281l() {
        return this.f14017k;
    }

    /* JADX INFO: renamed from: m */
    public final String m17282m() {
        return this.f14018l;
    }

    /* JADX INFO: renamed from: n */
    public final int m17283n() {
        return this.f14019m;
    }

    /* JADX INFO: renamed from: o */
    public final void m17284o(long j7) {
        this.f14020n = j7;
    }

    /* JADX INFO: renamed from: p */
    public final long m17285p() {
        return this.f14020n;
    }

    /* JADX INFO: renamed from: q */
    public final long m17286q() {
        return this.f14021o;
    }
}

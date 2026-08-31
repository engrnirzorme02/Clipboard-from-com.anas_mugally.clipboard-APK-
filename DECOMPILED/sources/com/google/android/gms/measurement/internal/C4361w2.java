package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.w2 */
/* JADX INFO: loaded from: classes2.dex */
final class C4361w2 {

    /* JADX INFO: renamed from: A */
    private Long f16134A;

    /* JADX INFO: renamed from: B */
    private long f16135B;

    /* JADX INFO: renamed from: C */
    private String f16136C;

    /* JADX INFO: renamed from: D */
    private int f16137D;

    /* JADX INFO: renamed from: E */
    private int f16138E;

    /* JADX INFO: renamed from: F */
    private long f16139F;

    /* JADX INFO: renamed from: G */
    private String f16140G;

    /* JADX INFO: renamed from: H */
    private byte[] f16141H;

    /* JADX INFO: renamed from: I */
    private int f16142I;

    /* JADX INFO: renamed from: J */
    private long f16143J;

    /* JADX INFO: renamed from: K */
    private long f16144K;

    /* JADX INFO: renamed from: L */
    private long f16145L;

    /* JADX INFO: renamed from: M */
    private long f16146M;

    /* JADX INFO: renamed from: N */
    private long f16147N;

    /* JADX INFO: renamed from: O */
    private long f16148O;

    /* JADX INFO: renamed from: P */
    private String f16149P;

    /* JADX INFO: renamed from: Q */
    private boolean f16150Q;

    /* JADX INFO: renamed from: R */
    private long f16151R;

    /* JADX INFO: renamed from: S */
    private long f16152S;

    /* JADX INFO: renamed from: a */
    private final C4164X2 f16153a;

    /* JADX INFO: renamed from: b */
    private final String f16154b;

    /* JADX INFO: renamed from: c */
    private String f16155c;

    /* JADX INFO: renamed from: d */
    private String f16156d;

    /* JADX INFO: renamed from: e */
    private String f16157e;

    /* JADX INFO: renamed from: f */
    private String f16158f;

    /* JADX INFO: renamed from: g */
    private long f16159g;

    /* JADX INFO: renamed from: h */
    private long f16160h;

    /* JADX INFO: renamed from: i */
    private long f16161i;

    /* JADX INFO: renamed from: j */
    private String f16162j;

    /* JADX INFO: renamed from: k */
    private long f16163k;

    /* JADX INFO: renamed from: l */
    private String f16164l;

    /* JADX INFO: renamed from: m */
    private long f16165m;

    /* JADX INFO: renamed from: n */
    private long f16166n;

    /* JADX INFO: renamed from: o */
    private boolean f16167o;

    /* JADX INFO: renamed from: p */
    private boolean f16168p;

    /* JADX INFO: renamed from: q */
    private Boolean f16169q;

    /* JADX INFO: renamed from: r */
    private long f16170r;

    /* JADX INFO: renamed from: s */
    private List f16171s;

    /* JADX INFO: renamed from: t */
    private String f16172t;

    /* JADX INFO: renamed from: u */
    private boolean f16173u;

    /* JADX INFO: renamed from: v */
    private long f16174v;

    /* JADX INFO: renamed from: w */
    private long f16175w;

    /* JADX INFO: renamed from: x */
    private int f16176x;

    /* JADX INFO: renamed from: y */
    private boolean f16177y;

    /* JADX INFO: renamed from: z */
    private Long f16178z;

    C4361w2(C4164X2 c4164x2, String str) {
        AbstractC3718s.m18083l(c4164x2);
        AbstractC3718s.m18077f(str);
        this.f16153a = c4164x2;
        this.f16154b = str;
        c4164x2.mo18422b().mo18427h();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m19107A() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16150Q;
    }

    /* JADX INFO: renamed from: A0 */
    public final void m19108A0(long j7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16160h != j7;
        this.f16160h = j7;
    }

    /* JADX INFO: renamed from: B */
    public final int m19109B() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16137D;
    }

    /* JADX INFO: renamed from: B0 */
    public final long m19110B0() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16161i;
    }

    /* JADX INFO: renamed from: C */
    public final void m19111C(int i7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16137D != i7;
        this.f16137D = i7;
    }

    /* JADX INFO: renamed from: C0 */
    public final void m19112C0(long j7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16161i != j7;
        this.f16161i = j7;
    }

    /* JADX INFO: renamed from: D */
    public final int m19113D() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16138E;
    }

    /* JADX INFO: renamed from: D0 */
    public final String m19114D0() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16162j;
    }

    /* JADX INFO: renamed from: E */
    public final void m19115E(int i7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16138E != i7;
        this.f16138E = i7;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m19116E0(String str) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= !Objects.equals(this.f16162j, str);
        this.f16162j = str;
    }

    /* JADX INFO: renamed from: F */
    public final void m19117F(long j7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16139F != j7;
        this.f16139F = j7;
    }

    /* JADX INFO: renamed from: F0 */
    public final long m19118F0() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16163k;
    }

    /* JADX INFO: renamed from: G */
    public final long m19119G() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16139F;
    }

    /* JADX INFO: renamed from: G0 */
    public final void m19120G0(long j7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16163k != j7;
        this.f16163k = j7;
    }

    /* JADX INFO: renamed from: H */
    public final void m19121H(String str) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16140G != str;
        this.f16140G = str;
    }

    /* JADX INFO: renamed from: H0 */
    public final String m19122H0() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16164l;
    }

    /* JADX INFO: renamed from: I */
    public final String m19123I() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16140G;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m19124I0(String str) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= !Objects.equals(this.f16164l, str);
        this.f16164l = str;
    }

    /* JADX INFO: renamed from: J */
    public final void m19125J(byte[] bArr) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16141H != bArr;
        this.f16141H = bArr;
    }

    /* JADX INFO: renamed from: J0 */
    public final long m19126J0() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16165m;
    }

    /* JADX INFO: renamed from: K */
    public final byte[] m19127K() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16141H;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m19128K0(long j7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16165m != j7;
        this.f16165m = j7;
    }

    /* JADX INFO: renamed from: L */
    public final void m19129L(int i7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16142I != i7;
        this.f16142I = i7;
    }

    /* JADX INFO: renamed from: L0 */
    public final long m19130L0() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16166n;
    }

    /* JADX INFO: renamed from: M */
    public final int m19131M() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16142I;
    }

    /* JADX INFO: renamed from: N */
    public final String m19132N() {
        this.f16153a.mo18422b().mo18427h();
        String str = this.f16149P;
        m19133O(null);
        return str;
    }

    /* JADX INFO: renamed from: O */
    public final void m19133O(String str) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= !Objects.equals(this.f16149P, str);
        this.f16149P = str;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m19134P() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16168p;
    }

    /* JADX INFO: renamed from: Q */
    public final void m19135Q(boolean z7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16168p != z7;
        this.f16168p = z7;
    }

    /* JADX INFO: renamed from: R */
    public final Boolean m19136R() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16169q;
    }

    /* JADX INFO: renamed from: S */
    public final void m19137S(Boolean bool) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= !Objects.equals(this.f16169q, bool);
        this.f16169q = bool;
    }

    /* JADX INFO: renamed from: T */
    public final List m19138T() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16171s;
    }

    /* JADX INFO: renamed from: U */
    public final void m19139U(List list) {
        this.f16153a.mo18422b().mo18427h();
        if (Objects.equals(this.f16171s, list)) {
            return;
        }
        this.f16150Q = true;
        this.f16171s = list != null ? new ArrayList(list) : null;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m19140V() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16173u;
    }

    /* JADX INFO: renamed from: W */
    public final void m19141W(boolean z7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16173u != z7;
        this.f16173u = z7;
    }

    /* JADX INFO: renamed from: X */
    public final long m19142X() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16174v;
    }

    /* JADX INFO: renamed from: Y */
    public final void m19143Y(long j7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16174v != j7;
        this.f16174v = j7;
    }

    /* JADX INFO: renamed from: Z */
    public final long m19144Z() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16175w;
    }

    /* JADX INFO: renamed from: a */
    public final void m19145a(long j7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16166n != j7;
        this.f16166n = j7;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m19146a0(long j7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16175w != j7;
        this.f16175w = j7;
    }

    /* JADX INFO: renamed from: b */
    public final long m19147b() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16170r;
    }

    /* JADX INFO: renamed from: b0 */
    public final int m19148b0() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16176x;
    }

    /* JADX INFO: renamed from: c */
    public final void m19149c(long j7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16170r != j7;
        this.f16170r = j7;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m19150c0(int i7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16176x != i7;
        this.f16176x = i7;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m19151d() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16167o;
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m19152d0() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16177y;
    }

    /* JADX INFO: renamed from: e */
    public final void m19153e(boolean z7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16167o != z7;
        this.f16167o = z7;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m19154e0(boolean z7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16177y != z7;
        this.f16177y = z7;
    }

    /* JADX INFO: renamed from: f */
    public final void m19155f(long j7) {
        AbstractC3718s.m18072a(j7 >= 0);
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16159g != j7;
        this.f16159g = j7;
    }

    /* JADX INFO: renamed from: f0 */
    public final Long m19156f0() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16178z;
    }

    /* JADX INFO: renamed from: g */
    public final long m19157g() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16159g;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m19158g0(Long l7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= !Objects.equals(this.f16178z, l7);
        this.f16178z = l7;
    }

    /* JADX INFO: renamed from: h */
    public final long m19159h() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16151R;
    }

    /* JADX INFO: renamed from: h0 */
    public final Long m19160h0() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16134A;
    }

    /* JADX INFO: renamed from: i */
    public final void m19161i(long j7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16151R != j7;
        this.f16151R = j7;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m19162i0(Long l7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= !Objects.equals(this.f16134A, l7);
        this.f16134A = l7;
    }

    /* JADX INFO: renamed from: j */
    public final long m19163j() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16152S;
    }

    /* JADX INFO: renamed from: j0 */
    public final long m19164j0() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16135B;
    }

    /* JADX INFO: renamed from: k */
    public final void m19165k(long j7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16152S != j7;
        this.f16152S = j7;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m19166k0(long j7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16135B != j7;
        this.f16135B = j7;
    }

    /* JADX INFO: renamed from: l */
    public final void m19167l() {
        C4164X2 c4164x2 = this.f16153a;
        c4164x2.mo18422b().mo18427h();
        long j7 = this.f16159g + 1;
        if (j7 > 2147483647L) {
            c4164x2.mo18421a().m18854r().m18835b("Bundle index overflow. appId", C4313q2.m18846x(this.f16154b));
            j7 = 0;
        }
        this.f16150Q = true;
        this.f16159g = j7;
    }

    /* JADX INFO: renamed from: l0 */
    public final String m19168l0() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16136C;
    }

    /* JADX INFO: renamed from: m */
    public final void m19169m(long j7) {
        C4164X2 c4164x2 = this.f16153a;
        c4164x2.mo18422b().mo18427h();
        long j8 = this.f16159g + j7;
        if (j8 > 2147483647L) {
            c4164x2.mo18421a().m18854r().m18835b("Bundle index overflow. appId", C4313q2.m18846x(this.f16154b));
            j8 = (-1) + j7;
        }
        long j9 = this.f16139F + 1;
        if (j9 > 2147483647L) {
            c4164x2.mo18421a().m18854r().m18835b("Delivery index overflow. appId", C4313q2.m18846x(this.f16154b));
            j9 = 0;
        }
        this.f16150Q = true;
        this.f16159g = j8;
        this.f16139F = j9;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m19170m0(String str) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16136C != str;
        this.f16136C = str;
    }

    /* JADX INFO: renamed from: n */
    public final long m19171n() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16143J;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m19172n0() {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q = false;
    }

    /* JADX INFO: renamed from: o */
    public final void m19173o(long j7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16143J != j7;
        this.f16143J = j7;
    }

    /* JADX INFO: renamed from: o0 */
    public final String m19174o0() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16154b;
    }

    /* JADX INFO: renamed from: p */
    public final long m19175p() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16144K;
    }

    /* JADX INFO: renamed from: p0 */
    public final String m19176p0() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16155c;
    }

    /* JADX INFO: renamed from: q */
    public final void m19177q(long j7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16144K != j7;
        this.f16144K = j7;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m19178q0(String str) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= !Objects.equals(this.f16155c, str);
        this.f16155c = str;
    }

    /* JADX INFO: renamed from: r */
    public final long m19179r() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16145L;
    }

    /* JADX INFO: renamed from: r0 */
    public final String m19180r0() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16156d;
    }

    /* JADX INFO: renamed from: s */
    public final void m19181s(long j7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16145L != j7;
        this.f16145L = j7;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m19182s0(String str) {
        this.f16153a.mo18422b().mo18427h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f16150Q |= true ^ Objects.equals(this.f16156d, str);
        this.f16156d = str;
    }

    /* JADX INFO: renamed from: t */
    public final long m19183t() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16146M;
    }

    /* JADX INFO: renamed from: t0 */
    public final String m19184t0() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16172t;
    }

    /* JADX INFO: renamed from: u */
    public final void m19185u(long j7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16146M != j7;
        this.f16146M = j7;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m19186u0(String str) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= !Objects.equals(this.f16172t, str);
        this.f16172t = str;
    }

    /* JADX INFO: renamed from: v */
    public final long m19187v() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16148O;
    }

    /* JADX INFO: renamed from: v0 */
    public final String m19188v0() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16157e;
    }

    /* JADX INFO: renamed from: w */
    public final void m19189w(long j7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16148O != j7;
        this.f16148O = j7;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m19190w0(String str) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= !Objects.equals(this.f16157e, str);
        this.f16157e = str;
    }

    /* JADX INFO: renamed from: x */
    public final long m19191x() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16147N;
    }

    /* JADX INFO: renamed from: x0 */
    public final String m19192x0() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16158f;
    }

    /* JADX INFO: renamed from: y */
    public final void m19193y(long j7) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= this.f16147N != j7;
        this.f16147N = j7;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m19194y0(String str) {
        this.f16153a.mo18422b().mo18427h();
        this.f16150Q |= !Objects.equals(this.f16158f, str);
        this.f16158f = str;
    }

    /* JADX INFO: renamed from: z */
    public final String m19195z() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16149P;
    }

    /* JADX INFO: renamed from: z0 */
    public final long m19196z0() {
        this.f16153a.mo18422b().mo18427h();
        return this.f16160h;
    }
}

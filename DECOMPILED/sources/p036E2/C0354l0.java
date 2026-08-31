package p036E2;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzdsr;
import p060H2.AbstractC0497b;
import p060H2.C0496a;
import p314o2.EnumC6551c;
import p380w2.C7351t;

/* JADX INFO: renamed from: E2.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0354l0 extends AbstractC0497b {

    /* JADX INFO: renamed from: a */
    private final C0352k0 f1418a;

    /* JADX INFO: renamed from: b */
    private final zzdsr f1419b;

    /* JADX INFO: renamed from: c */
    private final boolean f1420c;

    /* JADX INFO: renamed from: d */
    private final int f1421d;

    /* JADX INFO: renamed from: e */
    private final long f1422e = C7351t.m32357o().mo18159a();

    /* JADX INFO: renamed from: f */
    private final Boolean f1423f;

    public C0354l0(C0352k0 c0352k0, boolean z7, int i7, Boolean bool, zzdsr zzdsrVar) {
        this.f1418a = c0352k0;
        this.f1420c = z7;
        this.f1421d = i7;
        this.f1423f = bool;
        this.f1419b = zzdsrVar;
    }

    /* JADX INFO: renamed from: a */
    private static long m1541a() {
        return C7351t.m32357o().mo18159a() + ((Long) zzben.zzh.zze()).longValue();
    }

    /* JADX INFO: renamed from: b */
    private final long m1542b() {
        return C7351t.m32357o().mo18159a() - this.f1422e;
    }

    @Override // p060H2.AbstractC0497b
    public final void onFailure(String str) {
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", EnumC6551c.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        Pair pair6 = new Pair("lat_ms", Long.toString(m1542b()));
        int i7 = this.f1421d;
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(i7));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.f1423f));
        boolean z7 = this.f1420c;
        AbstractC0335c.m1523e(this.f1419b, null, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", true != z7 ? "0" : "1"));
        this.f1418a.m1536c(z7, new C0356m0(null, str, m1541a(), i7));
    }

    @Override // p060H2.AbstractC0497b
    public final void onSuccess(C0496a c0496a) {
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair("ad_format", EnumC6551c.BANNER.name());
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        Pair pair5 = new Pair("lat_ms", Long.toString(m1542b()));
        int i7 = this.f1421d;
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(i7));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.f1423f));
        boolean z7 = this.f1420c;
        AbstractC0335c.m1523e(this.f1419b, null, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", true != z7 ? "0" : "1"));
        this.f1418a.m1536c(z7, new C0356m0(c0496a, "", m1541a(), i7));
    }
}

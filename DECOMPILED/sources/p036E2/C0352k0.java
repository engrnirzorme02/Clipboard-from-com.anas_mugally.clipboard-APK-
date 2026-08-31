package p036E2;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzdsr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import p060H2.AbstractC0497b;
import p060H2.C0496a;
import p314o2.C6555g;
import p314o2.EnumC6551c;
import p380w2.C7351t;

/* JADX INFO: renamed from: E2.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0352k0 {

    /* JADX INFO: renamed from: a */
    private final Map f1411a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Map f1412b = new HashMap();

    /* JADX INFO: renamed from: c */
    private final Context f1413c;

    /* JADX INFO: renamed from: d */
    private final zzdsr f1414d;

    /* JADX INFO: renamed from: e */
    private final ExecutorService f1415e;

    C0352k0(Context context, zzdsr zzdsrVar, ExecutorService executorService) {
        this.f1413c = context;
        this.f1414d = zzdsrVar;
        this.f1415e = executorService;
    }

    /* JADX INFO: renamed from: h */
    private final void m1531h(final boolean z7) {
        Map map = this.f1412b;
        Boolean boolValueOf = Boolean.valueOf(z7);
        if (map.containsKey(boolValueOf)) {
            return;
        }
        map.put(boolValueOf, new ArrayList());
        this.f1415e.submit(new Runnable() { // from class: E2.h0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws Throwable {
                this.f1398a.m1539f(z7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final synchronized void m1538e(boolean z7, boolean z8) throws Throwable {
        Throwable th;
        try {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("query_info_type", "requester_type_6");
                bundle.putBoolean("accept_3p_cookie", z7);
                Map map = this.f1411a;
                Boolean boolValueOf = Boolean.valueOf(z7);
                C0356m0 c0356m0 = (C0356m0) map.get(boolValueOf);
                int iM1546d = 0;
                if (z8 && c0356m0 != null) {
                    try {
                        iM1546d = c0356m0.m1546d() + 1;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                C0356m0 c0356m1 = (C0356m0) map.get(boolValueOf);
                final C0354l0 c0354l0 = new C0354l0(this, z7, iM1546d, c0356m1 == null ? null : Boolean.valueOf(c0356m1.m1547e()), this.f1414d);
                final C6555g c6555gM27825k = ((C6555g.a) new C6555g.a().m27799c(AdMobAdapter.class, bundle)).m27825k();
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlS)).booleanValue()) {
                    this.f1415e.submit(new Callable() { // from class: E2.i0
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return this.f1401a.m1540g(c6555gM27825k, c0354l0);
                        }
                    });
                } else {
                    C0496a.m2107a(this.f1413c, EnumC6551c.BANNER, c6555gM27825k, c0354l0);
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: j */
    private final void m1533j(C0356m0 c0356m0, Pair pair, boolean z7) {
        c0356m0.m1548f();
        C0496a c0496aM1543a = c0356m0.m1543a();
        if (c0496aM1543a != null) {
            ((AbstractC0497b) pair.first).onSuccess(c0496aM1543a);
        } else {
            ((AbstractC0497b) pair.first).onFailure(c0356m0.m1544b());
        }
        AbstractC0335c.m1523e(this.f1414d, null, "sgpcr", new Pair("se", "query_g"), new Pair("ad_format", EnumC6551c.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("lat_ms", Long.toString(C7351t.m32357o().mo18159a() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z7)), new Pair("sgpc_rs", Boolean.toString(c0356m0.m1543a() != null)));
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m1534a() {
        m1531h(true);
        m1531h(false);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m1535b(final Object obj, AbstractC0497b abstractC0497b) {
        final Pair pair = new Pair(abstractC0497b, Long.valueOf(C7351t.m32357o().mo18159a()));
        zzbzh.zzf.execute(new Runnable() { // from class: E2.j0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f1405a.m1537d(obj, pair);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    final synchronized void m1536c(final boolean z7, C0356m0 c0356m0) {
        try {
            Map map = this.f1411a;
            Boolean boolValueOf = Boolean.valueOf(z7);
            C0356m0 c0356m1 = (C0356m0) map.get(boolValueOf);
            if (c0356m1 == null || c0356m1.m1545c() || c0356m1.m1543a() == null || c0356m0.m1543a() != null) {
                map.put(boolValueOf, c0356m0);
            }
            long jLongValue = (c0356m0.m1543a() != null ? (Long) zzben.zzf.zze() : (Long) zzben.zzg.zze()).longValue();
            final boolean z8 = c0356m0.m1543a() == null;
            zzbzh.zzd.schedule(new Runnable() { // from class: E2.g0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() throws Throwable {
                    this.f1392a.m1538e(z7, z8);
                }
            }, jLongValue, TimeUnit.SECONDS);
            Map map2 = this.f1412b;
            List list = (List) map2.get(boolValueOf);
            map2.put(boolValueOf, new ArrayList());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m1533j(c0356m0, (Pair) it.next(), false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    final /* synthetic */ void m1537d(Object obj, Pair pair) {
        boolean zAcceptThirdPartyCookies = false;
        if (obj instanceof WebView) {
            CookieManager cookieManagerMo17452a = C7351t.m32352j().mo17452a(this.f1413c);
            if (cookieManagerMo17452a != null) {
                zAcceptThirdPartyCookies = cookieManagerMo17452a.acceptThirdPartyCookies((WebView) obj);
            }
        }
        Map map = this.f1411a;
        Boolean boolValueOf = Boolean.valueOf(zAcceptThirdPartyCookies);
        C0356m0 c0356m0 = (C0356m0) map.get(boolValueOf);
        if (c0356m0 != null && !c0356m0.m1545c()) {
            m1533j(c0356m0, pair, true);
            return;
        }
        Map map2 = this.f1412b;
        List arrayList = (List) map2.get(boolValueOf);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map2.put(boolValueOf, arrayList);
        }
        arrayList.add(pair);
    }

    /* JADX INFO: renamed from: f */
    final /* synthetic */ void m1539f(boolean z7) throws Throwable {
        m1538e(z7, false);
    }

    /* JADX INFO: renamed from: g */
    final /* synthetic */ Object m1540g(C6555g c6555g, C0354l0 c0354l0) {
        C0496a.m2107a(this.f1413c, EnumC6551c.BANNER, c6555g, c0354l0);
        return Boolean.TRUE;
    }
}

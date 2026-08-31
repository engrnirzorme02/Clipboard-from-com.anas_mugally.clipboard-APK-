package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.collection.C2390a;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.C0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4008C0 extends AbstractC4025E1 {

    /* JADX INFO: renamed from: b */
    private final Map f15138b;

    /* JADX INFO: renamed from: c */
    private final Map f15139c;

    /* JADX INFO: renamed from: d */
    private long f15140d;

    public C4008C0(C4164X2 c4164x2) {
        super(c4164x2);
        this.f15139c = new C2390a();
        this.f15138b = new C2390a();
    }

    /* JADX INFO: renamed from: o */
    private final void m18443o(long j7, C4028E4 c4028e4) {
        if (c4028e4 == null) {
            this.f15066a.mo18421a().m18859w().m18834a("Not logging ad exposure. No active activity");
            return;
        }
        if (j7 < 1000) {
            this.f15066a.mo18421a().m18859w().m18835b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j7));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j7);
        C4389z6.m19362k0(c4028e4, bundle, true);
        this.f15066a.m18660B().m19303t("am", "_xa", bundle);
    }

    /* JADX INFO: renamed from: p */
    private final void m18444p(String str, long j7, C4028E4 c4028e4) {
        if (c4028e4 == null) {
            this.f15066a.mo18421a().m18859w().m18834a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j7 < 1000) {
            this.f15066a.mo18421a().m18859w().m18835b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j7));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j7);
        C4389z6.m19362k0(c4028e4, bundle, true);
        this.f15066a.m18660B().m19303t("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void m18451n(long j7) {
        Map map = this.f15138b;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            map.put((String) it.next(), Long.valueOf(j7));
        }
        if (map.isEmpty()) {
            return;
        }
        this.f15140d = j7;
    }

    /* JADX INFO: renamed from: i */
    public final void m18446i(String str, long j7) {
        if (str == null || str.length() == 0) {
            this.f15066a.mo18421a().m18851o().m18834a("Ad unit id must be a non-empty string");
        } else {
            this.f15066a.mo18422b().m18639t(new RunnableC4182a(this, str, j7));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m18447j(String str, long j7) {
        if (str == null || str.length() == 0) {
            this.f15066a.mo18421a().m18851o().m18834a("Ad unit id must be a non-empty string");
        } else {
            this.f15066a.mo18422b().m18639t(new RunnableC4382z(this, str, j7));
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m18448k(long j7) {
        C4028E4 c4028e4M18550q = this.f15066a.m18667I().m18550q(false);
        Map map = this.f15138b;
        for (String str : map.keySet()) {
            m18444p(str, j7 - ((Long) map.get(str)).longValue(), c4028e4M18550q);
        }
        if (!map.isEmpty()) {
            m18443o(j7 - this.f15140d, c4028e4M18550q);
        }
        m18451n(j7);
    }

    /* JADX INFO: renamed from: l */
    final /* synthetic */ void m18449l(String str, long j7) {
        mo18427h();
        AbstractC3718s.m18077f(str);
        Map map = this.f15139c;
        if (map.isEmpty()) {
            this.f15140d = j7;
        }
        Integer num = (Integer) map.get(str);
        if (num != null) {
            map.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (map.size() >= 100) {
            this.f15066a.mo18421a().m18854r().m18834a("Too many ads visible");
        } else {
            map.put(str, 1);
            this.f15138b.put(str, Long.valueOf(j7));
        }
    }

    /* JADX INFO: renamed from: m */
    final /* synthetic */ void m18450m(String str, long j7) {
        mo18427h();
        AbstractC3718s.m18077f(str);
        Map map = this.f15139c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            this.f15066a.mo18421a().m18851o().m18835b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        C4028E4 c4028e4M18550q = this.f15066a.m18667I().m18550q(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            map.put(str, Integer.valueOf(iIntValue));
            return;
        }
        map.remove(str);
        Map map2 = this.f15138b;
        Long l7 = (Long) map2.get(str);
        if (l7 == null) {
            this.f15066a.mo18421a().m18851o().m18834a("First ad unit exposure time was never set");
        } else {
            long jLongValue = j7 - l7.longValue();
            map2.remove(str);
            m18444p(str, jLongValue, c4028e4M18550q);
        }
        if (map.isEmpty()) {
            long j8 = this.f15140d;
            if (j8 == 0) {
                this.f15066a.mo18421a().m18851o().m18834a("First ad exposure time was never set");
            } else {
                m18443o(j7 - j8, c4028e4M18550q);
                this.f15140d = 0L;
            }
        }
    }
}

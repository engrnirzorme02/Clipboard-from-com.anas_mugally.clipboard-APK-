package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.H6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4054H6 {

    /* JADX INFO: renamed from: a */
    private final C4164X2 f15249a;

    public C4054H6(C4164X2 c4164x2) {
        this.f15249a = c4164x2;
    }

    /* JADX INFO: renamed from: a */
    final void m18524a() {
        C4164X2 c4164x2 = this.f15249a;
        c4164x2.mo18422b().mo18427h();
        if (m18528e()) {
            if (m18527d()) {
                c4164x2.m18687x().f15190x.m18460b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                c4164x2.m18660B().m19303t("auto", "_cmpx", bundle);
            } else {
                String strM18459a = c4164x2.m18687x().f15190x.m18459a();
                if (TextUtils.isEmpty(strM18459a)) {
                    c4164x2.mo18421a().m18852p().m18834a("Cache still valid but referrer not found");
                } else {
                    long jM18433a = c4164x2.m18687x().f15191y.m18433a() / 3600000;
                    Uri uri = Uri.parse(strM18459a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", (jM18433a - 1) * 3600000);
                    Object obj = pair.first;
                    c4164x2.m18660B().m19303t(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                c4164x2.m18687x().f15190x.m18460b(null);
            }
            c4164x2.m18687x().f15191y.m18434b(0L);
        }
    }

    /* JADX INFO: renamed from: b */
    final void m18525b(String str, Bundle bundle) {
        String string;
        C4164X2 c4164x2 = this.f15249a;
        c4164x2.mo18422b().mo18427h();
        if (c4164x2.m18675g()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        c4164x2.m18687x().f15190x.m18460b(string);
        c4164x2.m18687x().f15191y.m18434b(c4164x2.mo18425f().mo18159a());
    }

    /* JADX INFO: renamed from: c */
    final void m18526c() {
        if (m18528e() && m18527d()) {
            this.f15249a.m18687x().f15190x.m18460b(null);
        }
    }

    /* JADX INFO: renamed from: d */
    final boolean m18527d() {
        if (!m18528e()) {
            return false;
        }
        C4164X2 c4164x2 = this.f15249a;
        return c4164x2.mo18425f().mo18159a() - c4164x2.m18687x().f15191y.m18433a() > c4164x2.m18686w().m18796D(null, AbstractC4209d2.f15679k0);
    }

    /* JADX INFO: renamed from: e */
    final boolean m18528e() {
        return this.f15249a.m18687x().f15191y.m18433a() > 0;
    }
}

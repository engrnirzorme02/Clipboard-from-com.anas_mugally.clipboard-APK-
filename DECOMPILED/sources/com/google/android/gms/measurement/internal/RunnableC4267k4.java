package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.k4 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4267k4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ boolean f15853a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Uri f15854b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f15855c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ String f15856d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C4275l4 f15857e;

    RunnableC4267k4(C4275l4 c4275l4, boolean z7, Uri uri, String str, String str2) {
        this.f15853a = z7;
        this.f15854b = uri;
        this.f15855c = str;
        this.f15856d = str2;
        Objects.requireNonNull(c4275l4);
        this.f15857e = c4275l4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleM19406s0;
        Bundle bundleM19406s1;
        C4275l4 c4275l4 = this.f15857e;
        C4371x4 c4371x4 = c4275l4.f15870a;
        c4371x4.mo18427h();
        String str = this.f15856d;
        Uri uri = this.f15854b;
        try {
            C4164X2 c4164x2 = c4371x4.f15066a;
            C4389z6 c4389z6M18661C = c4164x2.m18661C();
            if (TextUtils.isEmpty(str)) {
                bundleM19406s0 = null;
            } else if (str.contains("gclid") || str.contains("gbraid") || str.contains("utm_campaign") || str.contains("utm_source") || str.contains("utm_medium") || str.contains("utm_id") || str.contains("dclid") || str.contains("srsltid") || str.contains("sfmc_id")) {
                bundleM19406s0 = c4389z6M18661C.m19406s0(Uri.parse("https://google.com/search?".concat(str)));
                if (bundleM19406s0 != null) {
                    bundleM19406s0.putString("_cis", "referrer");
                }
            } else {
                c4389z6M18661C.f15066a.mo18421a().m18858v().m18834a("Activity created with data 'referrer' without required params");
                bundleM19406s0 = null;
            }
            String str2 = this.f15855c;
            if (this.f15853a && (bundleM19406s1 = c4164x2.m18661C().m19406s0(uri)) != null) {
                bundleM19406s1.putString("_cis", "intent");
                if (!bundleM19406s1.containsKey("gclid") && bundleM19406s0 != null && bundleM19406s0.containsKey("gclid")) {
                    bundleM19406s1.putString("_cer", String.format("gclid=%s", bundleM19406s0.getString("gclid")));
                }
                c4371x4.m19303t(str2, "_cmp", bundleM19406s1);
                c4371x4.f16219r.m18525b(str2, bundleM19406s1);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c4164x2.mo18421a().m18858v().m18835b("Activity created with referrer", str);
            if (c4164x2.m18686w().m18800H(null, AbstractC4209d2.f15611H0)) {
                if (bundleM19406s0 != null) {
                    c4371x4.m19303t(str2, "_cmp", bundleM19406s0);
                    c4371x4.f16219r.m18525b(str2, bundleM19406s0);
                } else {
                    c4164x2.mo18421a().m18858v().m18835b("Referrer does not contain valid parameters", str);
                }
                c4371x4.m19313y("auto", "_ldl", null, true);
                return;
            }
            if (!str.contains("gclid") || (!str.contains("utm_campaign") && !str.contains("utm_source") && !str.contains("utm_medium") && !str.contains("utm_term") && !str.contains("utm_content"))) {
                c4164x2.mo18421a().m18858v().m18834a("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                c4371x4.m19313y("auto", "_ldl", str, true);
            }
        } catch (RuntimeException e7) {
            c4275l4.f15870a.f15066a.mo18421a().m18851o().m18835b("Throwable caught in handleReferrerForOnActivityCreated", e7);
        }
    }
}

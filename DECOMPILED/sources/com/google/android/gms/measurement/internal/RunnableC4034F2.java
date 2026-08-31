package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzbq;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p209b3.C2959a;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.F2 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4034F2 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ zzbq f15207a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ServiceConnection f15208b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ ServiceConnectionC4042G2 f15209c;

    RunnableC4034F2(ServiceConnectionC4042G2 serviceConnectionC4042G2, zzbq zzbqVar, ServiceConnection serviceConnection) {
        this.f15207a = zzbqVar;
        this.f15208b = serviceConnection;
        Objects.requireNonNull(serviceConnectionC4042G2);
        this.f15209c = serviceConnectionC4042G2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleZze;
        ServiceConnectionC4042G2 serviceConnectionC4042G2 = this.f15209c;
        C4050H2 c4050h2 = serviceConnectionC4042G2.f15226b;
        C4164X2 c4164x2 = c4050h2.f15243a;
        c4164x2.mo18422b().mo18427h();
        Bundle bundle = new Bundle();
        String strM18520a = serviceConnectionC4042G2.m18520a();
        bundle.putString("package_name", strM18520a);
        try {
            bundleZze = this.f15207a.zze(bundle);
            if (bundleZze == null) {
                c4164x2.mo18421a().m18851o().m18834a("Install Referrer Service returned a null response");
                bundleZze = null;
            }
        } catch (Exception e7) {
            c4050h2.f15243a.mo18421a().m18851o().m18835b("Exception occurred while retrieving the Install Referrer", e7.getMessage());
        }
        C4164X2 c4164x3 = c4050h2.f15243a;
        c4164x3.mo18422b().mo18427h();
        C4164X2.m18654q();
        if (bundleZze != null) {
            long j7 = bundleZze.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j7 == 0) {
                c4164x3.mo18421a().m18854r().m18834a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundleZze.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    c4164x3.mo18421a().m18851o().m18834a("No referrer defined in Install Referrer response");
                } else {
                    c4164x3.mo18421a().m18859w().m18835b("InstallReferrer API result", string);
                    Bundle bundleM19406s0 = c4164x3.m18661C().m19406s0(Uri.parse("?".concat(string)));
                    if (bundleM19406s0 == null) {
                        c4164x3.mo18421a().m18851o().m18834a("No campaign params defined in Install Referrer result");
                    } else {
                        List listAsList = Arrays.asList(((String) AbstractC4209d2.f15671h1.m18706b(null)).split(","));
                        Iterator<String> it = bundleM19406s0.keySet().iterator();
                        while (it.hasNext()) {
                            if (listAsList.contains(it.next())) {
                                long j8 = bundleZze.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                                if (j8 <= 0) {
                                    break;
                                }
                                bundleM19406s0.putLong("click_timestamp", j8);
                                break;
                            }
                        }
                        if (j7 == c4164x3.m18687x().f15173g.m18433a()) {
                            c4164x3.mo18421a().m18859w().m18834a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (c4164x3.m18675g()) {
                            c4164x3.m18687x().f15173g.m18434b(j7);
                            c4164x3.mo18421a().m18859w().m18835b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            bundleM19406s0.putString("_cis", "referrer API v2");
                            c4164x3.m18660B().m19309w("auto", "_cmp", bundleM19406s0, strM18520a);
                        }
                    }
                }
            }
        }
        C2959a.m14804b().m14810c(c4164x3.mo18424e(), this.f15208b);
    }
}

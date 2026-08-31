package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.M5 */
/* JADX INFO: loaded from: classes2.dex */
final class C4091M5 {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4098N5 f15320a;

    C4091M5(C4098N5 c4098n5) {
        Objects.requireNonNull(c4098n5);
        this.f15320a = c4098n5;
    }

    /* JADX INFO: renamed from: a */
    final void m18560a() {
        C4098N5 c4098n5 = this.f15320a;
        c4098n5.mo18427h();
        C4164X2 c4164x2 = c4098n5.f15066a;
        if (c4164x2.m18687x().m18486A(c4164x2.mo18425f().mo18159a())) {
            c4164x2.m18687x().f15179m.m19334b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                c4164x2.mo18421a().m18859w().m18834a("Detected application was in foreground");
                m18562c(c4164x2.mo18425f().mo18159a(), false);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    final void m18561b(long j7, boolean z7) {
        C4098N5 c4098n5 = this.f15320a;
        c4098n5.mo18427h();
        c4098n5.m18566q();
        C4164X2 c4164x2 = c4098n5.f15066a;
        if (c4164x2.m18687x().m18486A(j7)) {
            c4164x2.m18687x().f15179m.m19334b(true);
            c4098n5.f15066a.m18670L().m18753p();
        }
        c4164x2.m18687x().f15183q.m18434b(j7);
        if (c4164x2.m18687x().f15179m.m19333a()) {
            m18562c(j7, z7);
        }
    }

    /* JADX INFO: renamed from: c */
    final void m18562c(long j7, boolean z7) {
        C4098N5 c4098n5 = this.f15320a;
        c4098n5.mo18427h();
        if (c4098n5.f15066a.m18675g()) {
            C4164X2 c4164x2 = c4098n5.f15066a;
            c4164x2.m18687x().f15183q.m18434b(j7);
            c4164x2.mo18421a().m18859w().m18835b("Session started, time", Long.valueOf(c4164x2.mo18425f().mo18161c()));
            long j8 = j7 / 1000;
            C4164X2 c4164x3 = c4098n5.f15066a;
            c4164x3.m18660B().m19257B("auto", "_sid", Long.valueOf(j8), j7);
            c4164x2.m18687x().f15184r.m18434b(j8);
            c4164x2.m18687x().f15179m.m19334b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j8);
            c4164x3.m18660B().m19305u("auto", "_s", j7, bundle);
            String strM18459a = c4164x2.m18687x().f15189w.m18459a();
            if (TextUtils.isEmpty(strM18459a)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strM18459a);
            c4164x3.m18660B().m19305u("auto", "_ssr", j7, bundle2);
        }
    }
}

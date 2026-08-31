package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.C2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4010C2 {

    /* JADX INFO: renamed from: a */
    final String f15142a;

    /* JADX INFO: renamed from: b */
    private final String f15143b;

    /* JADX INFO: renamed from: c */
    private final String f15144c;

    /* JADX INFO: renamed from: d */
    private final long f15145d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C4026E2 f15146e;

    /* synthetic */ C4010C2(C4026E2 c4026e2, String str, long j7, byte[] bArr) {
        Objects.requireNonNull(c4026e2);
        this.f15146e = c4026e2;
        AbstractC3718s.m18077f("health_monitor");
        AbstractC3718s.m18072a(j7 > 0);
        this.f15142a = "health_monitor:start";
        this.f15143b = "health_monitor:count";
        this.f15144c = "health_monitor:value";
        this.f15145d = j7;
    }

    /* JADX INFO: renamed from: c */
    private final void m18452c() {
        C4026E2 c4026e2 = this.f15146e;
        c4026e2.mo18427h();
        long jMo18159a = c4026e2.f15066a.mo18425f().mo18159a();
        SharedPreferences.Editor editorEdit = c4026e2.m18488p().edit();
        editorEdit.remove(this.f15143b);
        editorEdit.remove(this.f15144c);
        editorEdit.putLong(this.f15142a, jMo18159a);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: d */
    private final long m18453d() {
        return this.f15146e.m18488p().getLong(this.f15142a, 0L);
    }

    /* JADX INFO: renamed from: a */
    public final void m18454a(String str, long j7) {
        C4026E2 c4026e2 = this.f15146e;
        c4026e2.mo18427h();
        if (m18453d() == 0) {
            m18452c();
        }
        if (str == null) {
            str = "";
        }
        SharedPreferences sharedPreferencesM18488p = c4026e2.m18488p();
        String str2 = this.f15143b;
        long j8 = sharedPreferencesM18488p.getLong(str2, 0L);
        if (j8 <= 0) {
            SharedPreferences.Editor editorEdit = c4026e2.m18488p().edit();
            editorEdit.putString(this.f15144c, str);
            editorEdit.putLong(str2, 1L);
            editorEdit.apply();
            return;
        }
        long jNextLong = c4026e2.f15066a.m18661C().m19403q0().nextLong() & Long.MAX_VALUE;
        long j9 = j8 + 1;
        long j10 = Long.MAX_VALUE / j9;
        SharedPreferences.Editor editorEdit2 = c4026e2.m18488p().edit();
        if (jNextLong < j10) {
            editorEdit2.putString(this.f15144c, str);
        }
        editorEdit2.putLong(str2, j9);
        editorEdit2.apply();
    }

    /* JADX INFO: renamed from: b */
    public final Pair m18455b() {
        long jAbs;
        C4026E2 c4026e2 = this.f15146e;
        c4026e2.mo18427h();
        c4026e2.mo18427h();
        long jM18453d = m18453d();
        if (jM18453d == 0) {
            m18452c();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jM18453d - c4026e2.f15066a.mo18425f().mo18159a());
        }
        long j7 = this.f15145d;
        if (jAbs < j7) {
            return null;
        }
        if (jAbs > j7 + j7) {
            m18452c();
            return null;
        }
        String string = c4026e2.m18488p().getString(this.f15144c, null);
        long j8 = c4026e2.m18488p().getLong(this.f15143b, 0L);
        m18452c();
        return (string == null || j8 <= 0) ? C4026E2.f15168A : new Pair(string, Long.valueOf(j8));
    }
}

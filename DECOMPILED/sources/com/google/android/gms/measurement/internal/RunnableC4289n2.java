package com.google.android.gms.measurement.internal;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.n2 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4289n2 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f15910a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f15911b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f15912c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ Object f15913d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ Object f15914e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ C4313q2 f15915f;

    RunnableC4289n2(C4313q2 c4313q2, int i7, String str, Object obj, Object obj2, Object obj3) {
        this.f15910a = i7;
        this.f15911b = str;
        this.f15912c = obj;
        this.f15913d = obj2;
        this.f15914e = obj3;
        Objects.requireNonNull(c4313q2);
        this.f15915f = c4313q2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4313q2 c4313q2 = this.f15915f;
        C4026E2 c4026e2M18687x = c4313q2.f15066a.m18687x();
        if (!c4026e2M18687x.m18436k()) {
            Log.println(6, c4313q2.m18861z(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (c4313q2.m18847D() == 0) {
            C4164X2 c4164x2 = c4313q2.f15066a;
            if (c4164x2.m18686w().m18794B()) {
                c4164x2.mo18423c();
                c4313q2.m18848E('C');
            } else {
                c4164x2.mo18423c();
                c4313q2.m18848E('c');
            }
        }
        if (c4313q2.m18849F() < 0) {
            c4313q2.f15066a.m18686w().m18793A();
            c4313q2.m18850G(133005L);
        }
        int i7 = this.f15910a;
        char cM18847D = c4313q2.m18847D();
        long jM18849F = c4313q2.m18849F();
        String str = this.f15911b;
        Object obj = this.f15912c;
        Object obj2 = this.f15913d;
        Object obj3 = this.f15914e;
        char cCharAt = "01VDIWEA?".charAt(i7);
        String strM18843A = C4313q2.m18843A(true, str, obj, obj2, obj3);
        int length = String.valueOf(cCharAt).length();
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(cM18847D).length() + String.valueOf(jM18849F).length() + 1 + strM18843A.length());
        sb.append("2");
        sb.append(cCharAt);
        sb.append(cM18847D);
        sb.append(jM18849F);
        sb.append(":");
        sb.append(strM18843A);
        String string = sb.toString();
        if (string.length() > 1024) {
            string = str.substring(0, 1024);
        }
        C4010C2 c4010c2 = c4026e2M18687x.f15171e;
        if (c4010c2 != null) {
            c4010c2.m18454a(string, 1L);
        }
    }
}

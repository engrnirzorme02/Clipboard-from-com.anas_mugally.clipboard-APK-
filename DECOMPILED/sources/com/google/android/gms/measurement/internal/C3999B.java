package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.B */
/* JADX INFO: loaded from: classes2.dex */
public final class C3999B {

    /* JADX INFO: renamed from: a */
    final String f15080a;

    /* JADX INFO: renamed from: b */
    final String f15081b;

    /* JADX INFO: renamed from: c */
    final String f15082c;

    /* JADX INFO: renamed from: d */
    final long f15083d;

    /* JADX INFO: renamed from: e */
    final long f15084e;

    /* JADX INFO: renamed from: f */
    final C4023E f15085f;

    C3999B(C4164X2 c4164x2, String str, String str2, String str3, long j7, long j8, Bundle bundle) {
        C4023E c4023e;
        AbstractC3718s.m18077f(str2);
        AbstractC3718s.m18077f(str3);
        this.f15080a = str2;
        this.f15081b = str3;
        this.f15082c = true == TextUtils.isEmpty(str) ? null : str;
        this.f15083d = j7;
        this.f15084e = j8;
        if (j8 != 0 && j8 > j7) {
            c4164x2.mo18421a().m18854r().m18835b("Event created with reverse previous/current timestamps. appId", C4313q2.m18846x(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            c4023e = new C4023E(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    c4164x2.mo18421a().m18851o().m18834a("Param name can't be null");
                    it.remove();
                } else {
                    Object objM19405s = c4164x2.m18661C().m19405s(next, bundle2.get(next));
                    if (objM19405s == null) {
                        c4164x2.mo18421a().m18854r().m18835b("Param value can't be null", c4164x2.m18662D().m18776b(next));
                        it.remove();
                    } else {
                        c4164x2.m18661C().m19367A(bundle2, next, objM19405s);
                    }
                }
            }
            c4023e = new C4023E(bundle2);
        }
        this.f15085f = c4023e;
    }

    /* JADX INFO: renamed from: a */
    final C3999B m18432a(C4164X2 c4164x2, long j7) {
        return new C3999B(c4164x2, this.f15082c, this.f15080a, this.f15081b, this.f15083d, j7, this.f15085f);
    }

    public final String toString() {
        String string = this.f15085f.toString();
        String str = this.f15080a;
        int length = String.valueOf(str).length();
        String str2 = this.f15081b;
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }

    private C3999B(C4164X2 c4164x2, String str, String str2, String str3, long j7, long j8, C4023E c4023e) {
        AbstractC3718s.m18077f(str2);
        AbstractC3718s.m18077f(str3);
        AbstractC3718s.m18083l(c4023e);
        this.f15080a = str2;
        this.f15081b = str3;
        this.f15082c = true == TextUtils.isEmpty(str) ? null : str;
        this.f15083d = j7;
        this.f15084e = j8;
        if (j8 != 0 && j8 > j7) {
            c4164x2.mo18421a().m18854r().m18836c("Event created with reverse previous/current timestamps. appId, name", C4313q2.m18846x(str2), C4313q2.m18846x(str3));
        }
        this.f15085f = c4023e;
    }
}

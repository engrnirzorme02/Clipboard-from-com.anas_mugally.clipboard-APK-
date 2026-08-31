package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p283k3.AbstractC6052w;
import p283k3.AbstractC6053x;
import p283k3.AbstractC6054y;
import p283k3.InterfaceC6041l;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.j2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4257j2 {

    /* JADX INFO: renamed from: b */
    protected static final AtomicReference f15834b = new AtomicReference();

    /* JADX INFO: renamed from: c */
    protected static final AtomicReference f15835c = new AtomicReference();

    /* JADX INFO: renamed from: d */
    protected static final AtomicReference f15836d = new AtomicReference();

    /* JADX INFO: renamed from: a */
    private final InterfaceC6041l f15837a;

    public C4257j2(InterfaceC6041l interfaceC6041l) {
        this.f15837a = interfaceC6041l;
    }

    /* JADX INFO: renamed from: g */
    private static final String m18774g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        AbstractC3718s.m18083l(strArr);
        AbstractC3718s.m18083l(strArr2);
        AbstractC3718s.m18083l(atomicReference);
        AbstractC3718s.m18072a(strArr.length == strArr2.length);
        for (int i7 = 0; i7 < strArr.length; i7++) {
            if (Objects.equals(str, strArr[i7])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i7];
                        if (str2 == null) {
                            str2 = strArr2[i7] + "(" + strArr[i7] + ")";
                            strArr3[i7] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    protected final String m18775a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f15837a.zza() ? str : m18774g(str, AbstractC6052w.f23827c, AbstractC6052w.f23825a, f15834b);
    }

    /* JADX INFO: renamed from: b */
    protected final String m18776b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f15837a.zza() ? str : m18774g(str, AbstractC6053x.f23830b, AbstractC6053x.f23829a, f15835c);
    }

    /* JADX INFO: renamed from: c */
    protected final String m18777c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f15837a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m18774g(str, AbstractC6054y.f23834b, AbstractC6054y.f23833a, f15836d);
        }
        return "experiment_id(" + str + ")";
    }

    /* JADX INFO: renamed from: d */
    protected final String m18778d(C4039G c4039g) {
        String string;
        InterfaceC6041l interfaceC6041l = this.f15837a;
        if (!interfaceC6041l.zza()) {
            return c4039g.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(c4039g.f15221c);
        sb.append(",name=");
        sb.append(m18775a(c4039g.f15219a));
        sb.append(",params=");
        C4023E c4023e = c4039g.f15220b;
        if (c4023e == null) {
            string = null;
        } else {
            string = !interfaceC6041l.zza() ? c4023e.toString() : m18779e(c4023e.m18484Y());
        }
        sb.append(string);
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    protected final String m18779e(Bundle bundle) {
        String strM18780f;
        if (bundle == null) {
            return null;
        }
        if (!this.f15837a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(m18776b(str));
            sb.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strM18780f = m18780f(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strM18780f = m18780f((Object[]) obj);
            } else {
                strM18780f = obj instanceof ArrayList ? m18780f(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sb.append(strM18780f);
        }
        sb.append("}]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    protected final String m18780f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String strM18779e = obj instanceof Bundle ? m18779e((Bundle) obj) : String.valueOf(obj);
            if (strM18779e != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strM18779e);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

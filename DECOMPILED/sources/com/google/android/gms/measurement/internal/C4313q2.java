package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3718s;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.q2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4313q2 extends AbstractC4003B3 {

    /* JADX INFO: renamed from: c */
    private char f15963c;

    /* JADX INFO: renamed from: d */
    private long f15964d;

    /* JADX INFO: renamed from: e */
    private String f15965e;

    /* JADX INFO: renamed from: f */
    private final C4297o2 f15966f;

    /* JADX INFO: renamed from: g */
    private final C4297o2 f15967g;

    /* JADX INFO: renamed from: h */
    private final C4297o2 f15968h;

    /* JADX INFO: renamed from: i */
    private final C4297o2 f15969i;

    /* JADX INFO: renamed from: j */
    private final C4297o2 f15970j;

    /* JADX INFO: renamed from: k */
    private final C4297o2 f15971k;

    /* JADX INFO: renamed from: l */
    private final C4297o2 f15972l;

    /* JADX INFO: renamed from: m */
    private final C4297o2 f15973m;

    /* JADX INFO: renamed from: n */
    private final C4297o2 f15974n;

    C4313q2(C4164X2 c4164x2) {
        super(c4164x2);
        this.f15963c = (char) 0;
        this.f15964d = -1L;
        this.f15966f = new C4297o2(this, 6, false, false);
        this.f15967g = new C4297o2(this, 6, true, false);
        this.f15968h = new C4297o2(this, 6, false, true);
        this.f15969i = new C4297o2(this, 5, false, false);
        this.f15970j = new C4297o2(this, 5, true, false);
        this.f15971k = new C4297o2(this, 5, false, true);
        this.f15972l = new C4297o2(this, 4, false, false);
        this.f15973m = new C4297o2(this, 3, false, false);
        this.f15974n = new C4297o2(this, 2, false, false);
    }

    /* JADX INFO: renamed from: A */
    static String m18843A(boolean z7, String str, Object obj, Object obj2, Object obj3) {
        String strM18844B = m18844B(z7, obj);
        String strM18844B2 = m18844B(z7, obj2);
        String strM18844B3 = m18844B(z7, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strM18844B)) {
            sb.append(str2);
            sb.append(strM18844B);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strM18844B2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strM18844B2);
        }
        if (!TextUtils.isEmpty(strM18844B3)) {
            sb.append(str3);
            sb.append(strM18844B3);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: B */
    static String m18844B(boolean z7, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z7) {
                return obj.toString();
            }
            Long l7 = (Long) obj;
            if (Math.abs(l7.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l7.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb = new StringBuilder(str.length() + length + 3 + str.length() + String.valueOf(jRound2).length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof C4305p2) {
                return ((C4305p2) obj).m18842a();
            }
            return z7 ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z7 ? th.getClass().getName() : th.toString());
        String strM18845C = m18845C(C4164X2.class.getCanonicalName());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m18845C(className).equals(strM18845C)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: C */
    static String m18845C(String str) {
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(46)) == -1) ? "" : str.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: x */
    protected static Object m18846x(String str) {
        if (str == null) {
            return null;
        }
        return new C4305p2(str);
    }

    /* JADX INFO: renamed from: D */
    final /* synthetic */ char m18847D() {
        return this.f15963c;
    }

    /* JADX INFO: renamed from: E */
    final /* synthetic */ void m18848E(char c7) {
        this.f15963c = c7;
    }

    /* JADX INFO: renamed from: F */
    final /* synthetic */ long m18849F() {
        return this.f15964d;
    }

    /* JADX INFO: renamed from: G */
    final /* synthetic */ void m18850G(long j7) {
        this.f15964d = 133005L;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4003B3
    /* JADX INFO: renamed from: i */
    protected final boolean mo18416i() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final C4297o2 m18851o() {
        return this.f15966f;
    }

    /* JADX INFO: renamed from: p */
    public final C4297o2 m18852p() {
        return this.f15967g;
    }

    /* JADX INFO: renamed from: q */
    public final C4297o2 m18853q() {
        return this.f15968h;
    }

    /* JADX INFO: renamed from: r */
    public final C4297o2 m18854r() {
        return this.f15969i;
    }

    /* JADX INFO: renamed from: s */
    public final C4297o2 m18855s() {
        return this.f15970j;
    }

    /* JADX INFO: renamed from: t */
    public final C4297o2 m18856t() {
        return this.f15971k;
    }

    /* JADX INFO: renamed from: u */
    public final C4297o2 m18857u() {
        return this.f15972l;
    }

    /* JADX INFO: renamed from: v */
    public final C4297o2 m18858v() {
        return this.f15973m;
    }

    /* JADX INFO: renamed from: w */
    public final C4297o2 m18859w() {
        return this.f15974n;
    }

    /* JADX INFO: renamed from: y */
    protected final void m18860y(int i7, boolean z7, boolean z8, String str, Object obj, Object obj2, Object obj3) {
        if (!z7 && Log.isLoggable(m18861z(), i7)) {
            Log.println(i7, m18861z(), m18843A(false, str, obj, obj2, obj3));
        }
        if (z8 || i7 < 5) {
            return;
        }
        AbstractC3718s.m18083l(str);
        C4136T2 c4136t2M18659A = this.f15066a.m18659A();
        if (c4136t2M18659A == null) {
            Log.println(6, m18861z(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!c4136t2M18659A.m18436k()) {
                Log.println(6, m18861z(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i7 >= 9) {
                i7 = 8;
            }
            c4136t2M18659A.m18639t(new RunnableC4289n2(this, i7, str, obj, obj2, obj3));
        }
    }

    /* JADX INFO: renamed from: z */
    protected final String m18861z() {
        String str;
        synchronized (this) {
            try {
                if (this.f15965e == null) {
                    this.f15965e = this.f15066a.m18686w().m18817u();
                }
                AbstractC3718s.m18083l(this.f15965e);
                str = this.f15965e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}

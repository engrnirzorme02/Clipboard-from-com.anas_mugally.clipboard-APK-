package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import p283k3.EnumC6050u;
import p283k3.EnumC6051v;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.E3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4027E3 {

    /* JADX INFO: renamed from: c */
    public static final C4027E3 f15193c = new C4027E3(null, null, 100);

    /* JADX INFO: renamed from: a */
    private final EnumMap f15194a;

    /* JADX INFO: renamed from: b */
    private final int f15195b;

    public C4027E3(Boolean bool, Boolean bool2, int i7) {
        EnumMap enumMap = new EnumMap(EnumC6051v.class);
        this.f15194a = enumMap;
        enumMap.put(EnumC6051v.AD_STORAGE, m18504h(null));
        enumMap.put(EnumC6051v.ANALYTICS_STORAGE, m18504h(null));
        this.f15195b = i7;
    }

    /* JADX INFO: renamed from: a */
    public static C4027E3 m18499a(EnumC6050u enumC6050u, EnumC6050u enumC6050u2, int i7) {
        EnumMap enumMap = new EnumMap(EnumC6051v.class);
        enumMap.put(EnumC6051v.AD_STORAGE, enumC6050u);
        enumMap.put(EnumC6051v.ANALYTICS_STORAGE, enumC6050u2);
        return new C4027E3(enumMap, -10);
    }

    /* JADX INFO: renamed from: d */
    static String m18500d(int i7) {
        if (i7 == -30) {
            return "TCF";
        }
        if (i7 == -20) {
            return "API";
        }
        if (i7 == -10) {
            return "MANIFEST";
        }
        if (i7 == 0) {
            return "1P_API";
        }
        if (i7 == 30) {
            return "1P_INIT";
        }
        if (i7 != 90) {
            return i7 != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    /* JADX INFO: renamed from: e */
    public static C4027E3 m18501e(Bundle bundle, int i7) {
        if (bundle == null) {
            return new C4027E3(null, null, i7);
        }
        EnumMap enumMap = new EnumMap(EnumC6051v.class);
        for (EnumC6051v enumC6051v : EnumC4019D3.STORAGE.m18462d()) {
            enumMap.put(enumC6051v, m18503g(bundle.getString(enumC6051v.f23824a)));
        }
        return new C4027E3(enumMap, i7);
    }

    /* JADX INFO: renamed from: f */
    public static C4027E3 m18502f(String str, int i7) {
        EnumMap enumMap = new EnumMap(EnumC6051v.class);
        EnumC6051v[] enumC6051vArrM18461c = EnumC4019D3.STORAGE.m18461c();
        for (int i8 = 0; i8 < enumC6051vArrM18461c.length; i8++) {
            String str2 = str == null ? "" : str;
            EnumC6051v enumC6051v = enumC6051vArrM18461c[i8];
            int i9 = i8 + 2;
            if (i9 < str2.length()) {
                enumMap.put(enumC6051v, m18506j(str2.charAt(i9)));
            } else {
                enumMap.put(enumC6051v, EnumC6050u.UNINITIALIZED);
            }
        }
        return new C4027E3(enumMap, i7);
    }

    /* JADX INFO: renamed from: g */
    static EnumC6050u m18503g(String str) {
        if (str == null) {
            return EnumC6050u.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return EnumC6050u.GRANTED;
        }
        return str.equals("denied") ? EnumC6050u.DENIED : EnumC6050u.UNINITIALIZED;
    }

    /* JADX INFO: renamed from: h */
    static EnumC6050u m18504h(Boolean bool) {
        if (bool == null) {
            return EnumC6050u.UNINITIALIZED;
        }
        return bool.booleanValue() ? EnumC6050u.GRANTED : EnumC6050u.DENIED;
    }

    /* JADX INFO: renamed from: i */
    static String m18505i(EnumC6050u enumC6050u) {
        int iOrdinal = enumC6050u.ordinal();
        if (iOrdinal == 2) {
            return "denied";
        }
        if (iOrdinal != 3) {
            return null;
        }
        return "granted";
    }

    /* JADX INFO: renamed from: j */
    static EnumC6050u m18506j(char c7) {
        if (c7 == '+') {
            return EnumC6050u.POLICY;
        }
        if (c7 != '0') {
            return c7 != '1' ? EnumC6050u.UNINITIALIZED : EnumC6050u.GRANTED;
        }
        return EnumC6050u.DENIED;
    }

    /* JADX INFO: renamed from: m */
    static char m18507m(EnumC6050u enumC6050u) {
        if (enumC6050u == null) {
            return '-';
        }
        int iOrdinal = enumC6050u.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    /* JADX INFO: renamed from: u */
    public static boolean m18508u(int i7, int i8) {
        int i9 = -30;
        if (i7 == -20) {
            if (i8 == -30) {
                return true;
            }
            i7 = -20;
        }
        if (i7 != -30) {
            i9 = i7;
        } else if (i8 == -20) {
            return true;
        }
        return i9 == i8 || i7 < i8;
    }

    /* JADX INFO: renamed from: b */
    public final int m18509b() {
        return this.f15195b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m18510c() {
        Iterator it = this.f15194a.values().iterator();
        while (it.hasNext()) {
            if (((EnumC6050u) it.next()) != EnumC6050u.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4027E3)) {
            return false;
        }
        C4027E3 c4027e3 = (C4027E3) obj;
        for (EnumC6051v enumC6051v : EnumC4019D3.STORAGE.m18462d()) {
            if (this.f15194a.get(enumC6051v) != c4027e3.f15194a.get(enumC6051v)) {
                return false;
            }
        }
        return this.f15195b == c4027e3.f15195b;
    }

    public final int hashCode() {
        Iterator it = this.f15194a.values().iterator();
        int iHashCode = this.f15195b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((EnumC6050u) it.next()).hashCode();
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX INFO: renamed from: k */
    public final String m18511k() {
        int iOrdinal;
        StringBuilder sb = new StringBuilder("G1");
        for (EnumC6051v enumC6051v : EnumC4019D3.STORAGE.m18461c()) {
            EnumC6050u enumC6050u = (EnumC6050u) this.f15194a.get(enumC6051v);
            char c7 = '-';
            if (enumC6050u != null && (iOrdinal = enumC6050u.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c7 = '1';
                } else if (iOrdinal == 2) {
                    c7 = '0';
                } else if (iOrdinal == 3) {
                    c7 = '1';
                }
            }
            sb.append(c7);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: l */
    public final String m18512l() {
        StringBuilder sb = new StringBuilder("G1");
        for (EnumC6051v enumC6051v : EnumC4019D3.STORAGE.m18461c()) {
            sb.append(m18507m((EnumC6050u) this.f15194a.get(enumC6051v)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: n */
    public final Bundle m18513n() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f15194a.entrySet()) {
            String strM18505i = m18505i((EnumC6050u) entry.getValue());
            if (strM18505i != null) {
                bundle.putString(((EnumC6051v) entry.getKey()).f23824a, strM18505i);
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m18514o(EnumC6051v enumC6051v) {
        return ((EnumC6050u) this.f15194a.get(enumC6051v)) != EnumC6050u.DENIED;
    }

    /* JADX INFO: renamed from: p */
    public final EnumC6050u m18515p() {
        EnumC6050u enumC6050u = (EnumC6050u) this.f15194a.get(EnumC6051v.AD_STORAGE);
        return enumC6050u == null ? EnumC6050u.UNINITIALIZED : enumC6050u;
    }

    /* JADX INFO: renamed from: q */
    public final EnumC6050u m18516q() {
        EnumC6050u enumC6050u = (EnumC6050u) this.f15194a.get(EnumC6051v.ANALYTICS_STORAGE);
        return enumC6050u == null ? EnumC6050u.UNINITIALIZED : enumC6050u;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m18517r(C4027E3 c4027e3) {
        EnumMap enumMap = this.f15194a;
        for (EnumC6051v enumC6051v : (EnumC6051v[]) enumMap.keySet().toArray(new EnumC6051v[0])) {
            EnumC6050u enumC6050u = (EnumC6050u) enumMap.get(enumC6051v);
            EnumC6050u enumC6050u2 = (EnumC6050u) c4027e3.f15194a.get(enumC6051v);
            EnumC6050u enumC6050u3 = EnumC6050u.DENIED;
            if (enumC6050u == enumC6050u3 && enumC6050u2 != enumC6050u3) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX INFO: renamed from: s */
    public final C4027E3 m18518s(C4027E3 c4027e3) {
        EnumMap enumMap = new EnumMap(EnumC6051v.class);
        for (EnumC6051v enumC6051v : EnumC4019D3.STORAGE.m18462d()) {
            EnumC6050u enumC6050u = (EnumC6050u) this.f15194a.get(enumC6051v);
            EnumC6050u enumC6050u2 = (EnumC6050u) c4027e3.f15194a.get(enumC6051v);
            if (enumC6050u == null) {
                enumC6050u = enumC6050u2;
            } else if (enumC6050u2 != null) {
                EnumC6050u enumC6050u3 = EnumC6050u.UNINITIALIZED;
                if (enumC6050u == enumC6050u3) {
                    enumC6050u = enumC6050u2;
                } else if (enumC6050u2 != enumC6050u3) {
                    EnumC6050u enumC6050u4 = EnumC6050u.POLICY;
                    if (enumC6050u == enumC6050u4) {
                        enumC6050u = enumC6050u2;
                    } else if (enumC6050u2 != enumC6050u4) {
                        EnumC6050u enumC6050u5 = EnumC6050u.DENIED;
                        enumC6050u = (enumC6050u == enumC6050u5 || enumC6050u2 == enumC6050u5) ? enumC6050u5 : EnumC6050u.GRANTED;
                    }
                }
            }
            if (enumC6050u != null) {
                enumMap.put(enumC6051v, enumC6050u);
            }
        }
        return new C4027E3(enumMap, 100);
    }

    /* JADX INFO: renamed from: t */
    public final C4027E3 m18519t(C4027E3 c4027e3) {
        EnumMap enumMap = new EnumMap(EnumC6051v.class);
        for (EnumC6051v enumC6051v : EnumC4019D3.STORAGE.m18462d()) {
            EnumC6050u enumC6050u = (EnumC6050u) this.f15194a.get(enumC6051v);
            if (enumC6050u == EnumC6050u.UNINITIALIZED) {
                enumC6050u = (EnumC6050u) c4027e3.f15194a.get(enumC6051v);
            }
            if (enumC6050u != null) {
                enumMap.put(enumC6051v, enumC6050u);
            }
        }
        return new C4027E3(enumMap, this.f15195b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(m18500d(this.f15195b));
        for (EnumC6051v enumC6051v : EnumC4019D3.STORAGE.m18462d()) {
            sb.append(",");
            sb.append(enumC6051v.f23824a);
            sb.append("=");
            EnumC6050u enumC6050u = (EnumC6050u) this.f15194a.get(enumC6051v);
            if (enumC6050u == null) {
                enumC6050u = EnumC6050u.UNINITIALIZED;
            }
            sb.append(enumC6050u);
        }
        return sb.toString();
    }

    private C4027E3(EnumMap enumMap, int i7) {
        EnumMap enumMap2 = new EnumMap(EnumC6051v.class);
        this.f15194a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f15195b = i7;
    }
}

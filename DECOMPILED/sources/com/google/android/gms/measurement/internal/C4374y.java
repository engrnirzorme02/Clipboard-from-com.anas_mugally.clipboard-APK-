package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p283k3.EnumC6050u;
import p283k3.EnumC6051v;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C4374y {

    /* JADX INFO: renamed from: f */
    public static final C4374y f16233f = new C4374y((Boolean) null, 100, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: a */
    private final int f16234a;

    /* JADX INFO: renamed from: b */
    private final String f16235b;

    /* JADX INFO: renamed from: c */
    private final Boolean f16236c;

    /* JADX INFO: renamed from: d */
    private final String f16237d;

    /* JADX INFO: renamed from: e */
    private final EnumMap f16238e;

    C4374y(Boolean bool, int i7, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(EnumC6051v.class);
        this.f16238e = enumMap;
        enumMap.put(EnumC6051v.AD_USER_DATA, C4027E3.m18504h(bool));
        this.f16234a = i7;
        this.f16235b = m19319l();
        this.f16236c = bool2;
        this.f16237d = str;
    }

    /* JADX INFO: renamed from: a */
    static C4374y m19315a(EnumC6050u enumC6050u, int i7) {
        EnumMap enumMap = new EnumMap(EnumC6051v.class);
        enumMap.put(EnumC6051v.AD_USER_DATA, enumC6050u);
        return new C4374y(enumMap, -10, (Boolean) null, (String) null);
    }

    /* JADX INFO: renamed from: g */
    public static C4374y m19316g(String str) {
        if (str == null || str.length() <= 0) {
            return f16233f;
        }
        String[] strArrSplit = str.split(":");
        int i7 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(EnumC6051v.class);
        EnumC6051v[] enumC6051vArrM18461c = EnumC4019D3.DMA.m18461c();
        int length = enumC6051vArrM18461c.length;
        int i8 = 1;
        int i9 = 0;
        while (i9 < length) {
            enumMap.put(enumC6051vArrM18461c[i9], C4027E3.m18506j(strArrSplit[i8].charAt(0)));
            i9++;
            i8++;
        }
        return new C4374y(enumMap, i7, (Boolean) null, (String) null);
    }

    /* JADX INFO: renamed from: h */
    public static C4374y m19317h(Bundle bundle, int i7) {
        if (bundle == null) {
            return new C4374y((Boolean) null, i7, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(EnumC6051v.class);
        for (EnumC6051v enumC6051v : EnumC4019D3.DMA.m18461c()) {
            enumMap.put(enumC6051v, C4027E3.m18503g(bundle.getString(enumC6051v.f23824a)));
        }
        return new C4374y(enumMap, i7, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    /* JADX INFO: renamed from: i */
    public static Boolean m19318i(Bundle bundle) {
        EnumC6050u enumC6050uM18503g;
        if (bundle == null || (enumC6050uM18503g = C4027E3.m18503g(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int iOrdinal = enumC6050uM18503g.ordinal();
        if (iOrdinal == 2) {
            return Boolean.FALSE;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: l */
    private final String m19319l() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16234a);
        for (EnumC6051v enumC6051v : EnumC4019D3.DMA.m18461c()) {
            sb.append(":");
            sb.append(C4027E3.m18507m((EnumC6050u) this.f16238e.get(enumC6051v)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public final int m19320b() {
        return this.f16234a;
    }

    /* JADX INFO: renamed from: c */
    public final EnumC6050u m19321c() {
        EnumC6050u enumC6050u = (EnumC6050u) this.f16238e.get(EnumC6051v.AD_USER_DATA);
        return enumC6050u == null ? EnumC6050u.UNINITIALIZED : enumC6050u;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m19322d() {
        Iterator it = this.f16238e.values().iterator();
        while (it.hasNext()) {
            if (((EnumC6050u) it.next()) != EnumC6050u.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final String m19323e() {
        return this.f16235b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4374y)) {
            return false;
        }
        C4374y c4374y = (C4374y) obj;
        if (this.f16235b.equalsIgnoreCase(c4374y.f16235b) && Objects.equals(this.f16236c, c4374y.f16236c)) {
            return Objects.equals(this.f16237d, c4374y.f16237d);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Bundle m19324f() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f16238e.entrySet()) {
            String strM18505i = C4027E3.m18505i((EnumC6050u) entry.getValue());
            if (strM18505i != null) {
                bundle.putString(((EnumC6051v) entry.getKey()).f23824a, strM18505i);
            }
        }
        Boolean bool = this.f16236c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f16237d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final int hashCode() {
        int i7;
        Boolean bool = this.f16236c;
        if (bool == null) {
            i7 = 3;
        } else {
            i7 = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.f16237d;
        return this.f16235b.hashCode() + (i7 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    /* JADX INFO: renamed from: j */
    public final Boolean m19325j() {
        return this.f16236c;
    }

    /* JADX INFO: renamed from: k */
    public final String m19326k() {
        return this.f16237d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(C4027E3.m18500d(this.f16234a));
        for (EnumC6051v enumC6051v : EnumC4019D3.DMA.m18461c()) {
            sb.append(",");
            sb.append(enumC6051v.f23824a);
            sb.append("=");
            EnumC6050u enumC6050u = (EnumC6050u) this.f16238e.get(enumC6051v);
            if (enumC6050u == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = enumC6050u.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.f16236c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.f16237d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    private C4374y(EnumMap enumMap, int i7, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(EnumC6051v.class);
        this.f16238e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f16234a = i7;
        this.f16235b = m19319l();
        this.f16236c = bool;
        this.f16237d = str;
    }
}

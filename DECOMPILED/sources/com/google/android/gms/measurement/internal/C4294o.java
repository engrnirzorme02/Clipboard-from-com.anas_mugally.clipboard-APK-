package com.google.android.gms.measurement.internal;

import java.util.EnumMap;
import p283k3.EnumC6051v;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.o */
/* JADX INFO: loaded from: classes2.dex */
final class C4294o {

    /* JADX INFO: renamed from: a */
    private final EnumMap f15924a;

    C4294o() {
        this.f15924a = new EnumMap(EnumC6051v.class);
    }

    /* JADX INFO: renamed from: d */
    public static C4294o m18830d(String str) {
        EnumMap enumMap = new EnumMap(EnumC6051v.class);
        if (str.length() >= EnumC6051v.values().length) {
            int i7 = 0;
            if (str.charAt(0) == '1') {
                EnumC6051v[] enumC6051vArrValues = EnumC6051v.values();
                int length = enumC6051vArrValues.length;
                int i8 = 1;
                while (i7 < length) {
                    enumMap.put(enumC6051vArrValues[i7], EnumC4286n.m18828c(str.charAt(i8)));
                    i7++;
                    i8++;
                }
                return new C4294o(enumMap);
            }
        }
        return new C4294o();
    }

    /* JADX INFO: renamed from: a */
    public final EnumC4286n m18831a(EnumC6051v enumC6051v) {
        EnumC4286n enumC4286n = (EnumC4286n) this.f15924a.get(enumC6051v);
        return enumC4286n == null ? EnumC4286n.UNSET : enumC4286n;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    /* JADX INFO: renamed from: b */
    public final void m18832b(EnumC6051v enumC6051v, int i7) {
        EnumC4286n enumC4286n = EnumC4286n.UNSET;
        if (i7 == -30) {
            enumC4286n = EnumC4286n.TCF;
        } else if (i7 == -20) {
            enumC4286n = EnumC4286n.API;
        } else if (i7 == -10) {
            enumC4286n = EnumC4286n.MANIFEST;
        } else if (i7 == 0) {
            enumC4286n = EnumC4286n.API;
        } else if (i7 == 30) {
            enumC4286n = EnumC4286n.INITIALIZATION;
        }
        this.f15924a.put(enumC6051v, enumC4286n);
    }

    /* JADX INFO: renamed from: c */
    public final void m18833c(EnumC6051v enumC6051v, EnumC4286n enumC4286n) {
        this.f15924a.put(enumC6051v, enumC4286n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("1");
        for (EnumC6051v enumC6051v : EnumC6051v.values()) {
            EnumC4286n enumC4286n = (EnumC4286n) this.f15924a.get(enumC6051v);
            if (enumC4286n == null) {
                enumC4286n = EnumC4286n.UNSET;
            }
            sb.append(enumC4286n.m18829d());
        }
        return sb.toString();
    }

    private C4294o(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(EnumC6051v.class);
        this.f15924a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}

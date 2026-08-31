package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.n */
/* JADX INFO: loaded from: classes2.dex */
enum EnumC4286n {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');


    /* JADX INFO: renamed from: a */
    private final char f15907a;

    EnumC4286n(char c7) {
        this.f15907a = c7;
    }

    /* JADX INFO: renamed from: c */
    public static EnumC4286n m18828c(char c7) {
        for (EnumC4286n enumC4286n : values()) {
            if (enumC4286n.f15907a == c7) {
                return enumC4286n;
            }
        }
        return UNSET;
    }

    /* JADX INFO: renamed from: d */
    final /* synthetic */ char m18829d() {
        return this.f15907a;
    }
}

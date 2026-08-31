package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.internal.ads.zzbbn;

/* JADX INFO: loaded from: classes2.dex */
public enum zzlq implements zznf {
    EDITION_UNKNOWN(0),
    EDITION_LEGACY(900),
    EDITION_PROTO2(998),
    EDITION_PROTO3(999),
    EDITION_2023(zzbbn.zzq.zzf),
    EDITION_2024(1001),
    EDITION_1_TEST_ONLY(1),
    EDITION_2_TEST_ONLY(2),
    EDITION_99997_TEST_ONLY(99997),
    EDITION_99998_TEST_ONLY(99998),
    EDITION_99999_TEST_ONLY(99999),
    EDITION_MAX(C3553a.e.API_PRIORITY_OTHER);

    private final int zzn;

    zzlq(int i7) {
        this.zzn = i7;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzn);
    }

    @Override // com.google.android.recaptcha.internal.zznf
    public final int zza() {
        return this.zzn;
    }
}

package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzo;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.K2 */
/* JADX INFO: loaded from: classes2.dex */
final class C4074K2 implements zzo {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f15283a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4109P2 f15284b;

    C4074K2(C4109P2 c4109p2, String str) {
        this.f15283a = str;
        Objects.requireNonNull(c4109p2);
        this.f15284b = c4109p2;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map = (Map) this.f15284b.m18607p().get(this.f15283a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}

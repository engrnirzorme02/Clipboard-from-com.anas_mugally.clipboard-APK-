package com.google.android.gms.measurement.internal;

import androidx.collection.C2399j;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.I2 */
/* JADX INFO: loaded from: classes2.dex */
final class C4058I2 extends C2399j {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4109P2 f15253a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4058I2(C4109P2 c4109p2, int i7) {
        super(20);
        Objects.requireNonNull(c4109p2);
        this.f15253a = c4109p2;
    }

    @Override // androidx.collection.C2399j
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        AbstractC3718s.m18077f(str);
        return this.f15253a.m18606o(str);
    }
}

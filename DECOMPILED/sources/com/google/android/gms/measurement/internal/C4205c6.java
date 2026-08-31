package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzis;
import java.util.Collections;
import java.util.Map;
import p283k3.EnumC6024G;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.c6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4205c6 {

    /* JADX INFO: renamed from: a */
    private final String f15588a;

    /* JADX INFO: renamed from: b */
    private final Map f15589b;

    /* JADX INFO: renamed from: c */
    private final EnumC6024G f15590c;

    /* JADX INFO: renamed from: d */
    private final zzis f15591d;

    C4205c6(String str, Map map, EnumC6024G enumC6024G, zzis zzisVar) {
        this.f15588a = str;
        this.f15589b = map;
        this.f15590c = enumC6024G;
        this.f15591d = zzisVar;
    }

    /* JADX INFO: renamed from: a */
    public final String m18707a() {
        return this.f15588a;
    }

    /* JADX INFO: renamed from: b */
    public final Map m18708b() {
        Map map = this.f15589b;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    /* JADX INFO: renamed from: c */
    public final EnumC6024G m18709c() {
        return this.f15590c;
    }

    /* JADX INFO: renamed from: d */
    public final zzis m18710d() {
        return this.f15591d;
    }
}

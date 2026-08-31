package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzib;
import java.util.Map;
import p283k3.EnumC6024G;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.t6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4341t6 {

    /* JADX INFO: renamed from: a */
    private final long f16076a;

    /* JADX INFO: renamed from: b */
    private final zzib f16077b;

    /* JADX INFO: renamed from: c */
    private final String f16078c;

    /* JADX INFO: renamed from: d */
    private final Map f16079d;

    /* JADX INFO: renamed from: e */
    private final EnumC6024G f16080e;

    /* JADX INFO: renamed from: f */
    private final long f16081f;

    /* JADX INFO: renamed from: g */
    private final long f16082g;

    /* JADX INFO: renamed from: h */
    private final long f16083h;

    /* JADX INFO: renamed from: i */
    private final int f16084i;

    /* synthetic */ C4341t6(long j7, zzib zzibVar, String str, Map map, EnumC6024G enumC6024G, long j8, long j9, long j10, int i7, byte[] bArr) {
        this.f16076a = j7;
        this.f16077b = zzibVar;
        this.f16078c = str;
        this.f16079d = map;
        this.f16080e = enumC6024G;
        this.f16081f = j8;
        this.f16082g = j9;
        this.f16083h = j10;
        this.f16084i = i7;
    }

    /* JADX INFO: renamed from: a */
    public final C4205c6 m18972a() {
        return new C4205c6(this.f16078c, this.f16079d, this.f16080e, null);
    }

    /* JADX INFO: renamed from: b */
    public final C4167X5 m18973b() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f16079d.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        long j7 = this.f16076a;
        zzib zzibVar = this.f16077b;
        String str = this.f16078c;
        EnumC6024G enumC6024G = this.f16080e;
        return new C4167X5(j7, zzibVar.zzcc(), str, bundle, enumC6024G.zza(), this.f16082g, "");
    }

    /* JADX INFO: renamed from: c */
    public final long m18974c() {
        return this.f16076a;
    }

    /* JADX INFO: renamed from: d */
    public final zzib m18975d() {
        return this.f16077b;
    }

    /* JADX INFO: renamed from: e */
    public final String m18976e() {
        return this.f16078c;
    }

    /* JADX INFO: renamed from: f */
    public final EnumC6024G m18977f() {
        return this.f16080e;
    }

    /* JADX INFO: renamed from: g */
    public final long m18978g() {
        return this.f16081f;
    }

    /* JADX INFO: renamed from: h */
    public final long m18979h() {
        return this.f16083h;
    }

    /* JADX INFO: renamed from: i */
    public final int m18980i() {
        return this.f16084i;
    }
}

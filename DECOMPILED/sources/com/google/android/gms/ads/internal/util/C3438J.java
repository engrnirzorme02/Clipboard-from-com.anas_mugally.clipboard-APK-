package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzapl;
import com.google.android.gms.internal.ads.zzapm;
import com.google.android.gms.internal.ads.zzaqk;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import p404z2.C7596m;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.J */
/* JADX INFO: loaded from: classes.dex */
final class C3438J extends zzaqk {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ byte[] f14202a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Map f14203b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C7596m f14204c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3438J(C3446N c3446n, int i7, String str, zzapm zzapmVar, zzapl zzaplVar, byte[] bArr, Map map, C7596m c7596m) {
        super(i7, str, zzapmVar, zzaplVar);
        this.f14202a = bArr;
        this.f14203b = map;
        this.f14204c = c7596m;
        Objects.requireNonNull(c3446n);
    }

    @Override // com.google.android.gms.internal.ads.zzaph
    public final Map zzm() {
        Map map = this.f14203b;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    @Override // com.google.android.gms.internal.ads.zzaph
    public final byte[] zzn() {
        byte[] bArr = this.f14202a;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaqk, com.google.android.gms.internal.ads.zzaph
    protected final /* bridge */ /* synthetic */ void zzs(Object obj) {
        zzs((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaqk
    /* JADX INFO: renamed from: zzz */
    public final void zzs(String str) {
        this.f14204c.m33317e(str);
        super.zzs(str);
    }
}

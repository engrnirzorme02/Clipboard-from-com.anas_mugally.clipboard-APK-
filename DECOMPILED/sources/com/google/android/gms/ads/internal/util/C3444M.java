package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzapd;
import com.google.android.gms.internal.ads.zzaph;
import com.google.android.gms.internal.ads.zzapn;
import com.google.android.gms.internal.ads.zzaqe;
import com.google.android.gms.internal.ads.zzbzm;
import java.util.Map;
import p404z2.C7596m;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.M */
/* JADX INFO: loaded from: classes.dex */
public final class C3444M extends zzaph {

    /* JADX INFO: renamed from: a */
    private final zzbzm f14207a;

    /* JADX INFO: renamed from: b */
    private final C7596m f14208b;

    public C3444M(String str, Map map, zzbzm zzbzmVar) {
        super(0, str, new C3442L(zzbzmVar));
        this.f14207a = zzbzmVar;
        C7596m c7596m = new C7596m(null);
        this.f14208b = c7596m;
        c7596m.m33314b(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaph
    protected final zzapn zzr(zzapd zzapdVar) {
        return zzapn.zza(zzapdVar, zzaqe.zza(zzapdVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaph
    protected final /* bridge */ /* synthetic */ void zzs(Object obj) {
        zzapd zzapdVar = (zzapd) obj;
        Map map = zzapdVar.zzc;
        int i7 = zzapdVar.zza;
        C7596m c7596m = this.f14208b;
        c7596m.m33316d(map, i7);
        byte[] bArr = zzapdVar.zzb;
        if (C7596m.m33304j() && bArr != null) {
            c7596m.m33318f(bArr);
        }
        this.f14207a.zzc(zzapdVar);
    }
}

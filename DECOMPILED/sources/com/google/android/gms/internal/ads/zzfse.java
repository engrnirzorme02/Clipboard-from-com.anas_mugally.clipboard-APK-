package com.google.android.gms.internal.ads;

import android.content.Context;
import kotlin.jvm.internal.AbstractC6118n;
import p167W.AbstractC1798a;
import p174X.C1906j;
import p174X.InterfaceC1905i;
import p238e6.InterfaceC5356a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfse implements zzhpx {
    private final zzhqg zza;

    private zzfse(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzfse zza(zzhqg zzhqgVar) {
        return new zzfse(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = ((zzchb) this.zza).zza();
        AbstractC6118n.m27187e(context, "context");
        InterfaceC1905i interfaceC1905iM7851c = C1906j.m7851c(C1906j.f6125a, zzfsc.zza, null, null, null, new InterfaceC5356a() { // from class: com.google.android.gms.internal.ads.zzfsd
            @Override // p238e6.InterfaceC5356a
            public final /* synthetic */ Object invoke() {
                return AbstractC1798a.m7509a(context, "ad_quality_data.pb");
            }
        }, 14, null);
        zzhqf.zzb(interfaceC1905iM7851c);
        return interfaceC1905iM7851c;
    }
}

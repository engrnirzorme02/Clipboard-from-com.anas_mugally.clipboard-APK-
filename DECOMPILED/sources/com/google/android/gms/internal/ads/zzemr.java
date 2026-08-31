package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import p036E2.AbstractC0335c;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzemr implements zzeup {
    private final zzgpd zza;
    private final zzfdc zzb;
    private final int zzc;

    zzemr(zzgpd zzgpdVar, zzfdc zzfdcVar, zzfds zzfdsVar, int i7) {
        this.zza = zzgpdVar;
        this.zzb = zzfdcVar;
        this.zzc = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzemq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 5;
    }

    final /* synthetic */ zzems zzc() {
        List listAsList;
        String strZza = null;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhv)).booleanValue()) {
            zzfdc zzfdcVar = this.zzb;
            if (this.zzc != 2) {
                String strM1521c = AbstractC0335c.m1521c(zzfdcVar.zzd);
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhx)).booleanValue()) {
                    listAsList = Arrays.asList(((String) C3250D.m17200c().zzd(zzbci.zzhy)).split(","));
                } else {
                    listAsList = Arrays.asList(((String) C3250D.m17200c().zzd(zzbci.zzhw)).split(","));
                }
                if (listAsList.contains(AbstractC0335c.m1520b(strM1521c))) {
                    strZza = zzfds.zza();
                }
            }
        }
        return new zzems(strZza);
    }
}

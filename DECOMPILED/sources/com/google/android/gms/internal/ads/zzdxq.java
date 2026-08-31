package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.concurrent.Callable;
import p036E2.AbstractC0335c;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdxq implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;

    private zzdxq(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
        this.zzd = zzhqgVar4;
    }

    public static zzdxq zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5) {
        return new zzdxq(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x004f  */
    /* JADX WARN: Code duplicated, block: B:8:0x006d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0077  */
    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        InterfaceFutureC1673e interfaceFutureC1673eSubmit;
        final zzauu zzauuVar = (zzauu) this.zza.zzb();
        final Context contextZza = ((zzchd) this.zzb).zza();
        zzfdc zzfdcVarZza = ((zzcvj) this.zzc).zza();
        long jLongValue = ((Long) this.zzd.zzb()).longValue();
        zzgpd zzgpdVarZzc = zzfgc.zzc();
        int iIntValue = ((Integer) C3250D.m17200c().zzd(zzbci.zzcZ)).intValue();
        if (iIntValue != -1) {
            if (Integer.toString(iIntValue).equals(AbstractC0335c.m1520b(AbstractC0335c.m1521c(zzfdcVarZza.zzd)))) {
                if (C7351t.m32357o().mo18159a() - jLongValue < ((Integer) C3250D.m17200c().zzd(zzbci.zzdb)).intValue()) {
                    interfaceFutureC1673eSubmit = zzgpdVarZzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxl
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return zzauuVar.zzb().zzk(contextZza);
                        }
                    });
                } else {
                    interfaceFutureC1673eSubmit = zzgpdVarZzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxk
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return zzauuVar.zzb().zzl(contextZza);
                        }
                    });
                }
            } else {
                interfaceFutureC1673eSubmit = zzgpdVarZzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxk
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzauuVar.zzb().zzl(contextZza);
                    }
                });
            }
        } else {
            if (C7351t.m32357o().mo18159a() - jLongValue < ((Integer) C3250D.m17200c().zzd(zzbci.zzdb)).intValue()) {
                interfaceFutureC1673eSubmit = zzgpdVarZzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxl
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzauuVar.zzb().zzk(contextZza);
                    }
                });
            } else {
                interfaceFutureC1673eSubmit = zzgpdVarZzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxk
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzauuVar.zzb().zzl(contextZza);
                    }
                });
            }
        }
        zzhqf.zzb(interfaceFutureC1673eSubmit);
        return interfaceFutureC1673eSubmit;
    }
}

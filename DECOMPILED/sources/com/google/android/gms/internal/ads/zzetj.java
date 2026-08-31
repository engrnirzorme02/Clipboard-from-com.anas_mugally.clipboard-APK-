package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import java.io.IOException;
import java.util.concurrent.Callable;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzetj implements zzeup {
    private final Context zza;
    private final zzgpd zzb;
    private final zzfdc zzc;
    private final C7584a zzd;

    zzetj(Context context, zzgpd zzgpdVar, zzfdc zzfdcVar, C7584a c7584a) {
        this.zza = context;
        this.zzb = zzgpdVar;
        this.zzc = zzfdcVar;
        this.zzd = c7584a;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeti
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 53;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x0046 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00f1, B:31:0x0115, B:33:0x0120, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0058 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00f1, B:31:0x0115, B:33:0x0120, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x00c1 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00f1, B:31:0x0115, B:33:0x0120, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00d3 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00f1, B:31:0x0115, B:33:0x0120, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00f1 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00f1, B:31:0x0115, B:33:0x0120, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    final /* synthetic */ zzetk zzc() {
        zzfti zzftiVar;
        boolean z7;
        boolean zZze;
        zzftn zzftnVarZzh;
        zzftj zzftjVarZza;
        try {
            Context context = this.zza;
            boolean zZza = this.zzc.zza();
            zzfti zzftiVar2 = new zzfti();
            zzfti zzftiVar3 = new zzfti();
            boolean zZzc = true;
            if (zZza) {
                if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzdz)).booleanValue()) {
                    return new zzetk(true);
                }
            }
            if (!zZza) {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdv)).booleanValue()) {
                    zzftiVar2 = zzftm.zzh(context).zzi(((Long) C3250D.m17200c().zzd(zzbci.zzdG)).longValue(), C7351t.m32354l().zzo().zzx());
                } else if (zZza) {
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdx)).booleanValue()) {
                        zzftiVar2 = zzftm.zzh(context).zzi(((Long) C3250D.m17200c().zzd(zzbci.zzdG)).longValue(), C7351t.m32354l().zzo().zzx());
                    }
                }
            } else if (zZza) {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdx)).booleanValue()) {
                    zzftiVar2 = zzftm.zzh(context).zzi(((Long) C3250D.m17200c().zzd(zzbci.zzdG)).longValue(), C7351t.m32354l().zzo().zzx());
                }
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdD)).booleanValue()) {
                if (this.zzd.f30228c < ((Integer) C3250D.m17200c().zzd(zzbci.zzdC)).intValue()) {
                    zzftn.zzh(context).zzj();
                }
            }
            if (zZza) {
                if (zZza) {
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdy)).booleanValue()) {
                        zzftnVarZzh = zzftn.zzh(context);
                        zzftjVarZza = zzftj.zza(context);
                        if (this.zzd.f30228c >= ((Integer) C3250D.m17200c().zzd(zzbci.zzdC)).intValue()) {
                            zzftiVar3 = zzftnVarZzh.zzi(((Long) C3250D.m17200c().zzd(zzbci.zzdH)).longValue(), C7351t.m32354l().zzo().zzx());
                            zZzc = zzftjVarZza.zzc();
                        }
                        zZze = zzftjVarZza.zze();
                        zzftiVar = zzftiVar3;
                        z7 = zZzc;
                    }
                }
                zzftiVar = zzftiVar3;
                z7 = true;
                zZze = true;
            } else {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdw)).booleanValue()) {
                    zzftnVarZzh = zzftn.zzh(context);
                    zzftjVarZza = zzftj.zza(context);
                    if (this.zzd.f30228c >= ((Integer) C3250D.m17200c().zzd(zzbci.zzdC)).intValue()) {
                        zzftiVar3 = zzftnVarZzh.zzi(((Long) C3250D.m17200c().zzd(zzbci.zzdH)).longValue(), C7351t.m32354l().zzo().zzx());
                        zZzc = zzftjVarZza.zzc();
                    }
                    zZze = zzftjVarZza.zze();
                    zzftiVar = zzftiVar3;
                    z7 = zZzc;
                } else {
                    if (zZza) {
                        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdy)).booleanValue()) {
                            zzftnVarZzh = zzftn.zzh(context);
                            zzftjVarZza = zzftj.zza(context);
                            if (this.zzd.f30228c >= ((Integer) C3250D.m17200c().zzd(zzbci.zzdC)).intValue()) {
                                zzftiVar3 = zzftnVarZzh.zzi(((Long) C3250D.m17200c().zzd(zzbci.zzdH)).longValue(), C7351t.m32354l().zzo().zzx());
                                zZzc = zzftjVarZza.zzc();
                            }
                            zZze = zzftjVarZza.zze();
                            zzftiVar = zzftiVar3;
                            z7 = zZzc;
                        }
                    }
                    zzftiVar = zzftiVar3;
                    z7 = true;
                    zZze = true;
                }
            }
            return new zzetk(zzftiVar2, zzftiVar, z7, zZze, zZza);
        } catch (IOException e7) {
            C7351t.m32354l().zzg(e7, "PerAppIdSignal");
            return new zzetk(this.zzc.zza());
        }
    }
}

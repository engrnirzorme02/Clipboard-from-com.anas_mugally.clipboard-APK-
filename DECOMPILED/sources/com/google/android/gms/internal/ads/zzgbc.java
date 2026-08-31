package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final class zzgbc {
    private final zzgcu zza;
    private final zzgbx zzb;
    private final zzgcg zzc;
    private final zzgea zzd;
    private final long zze;
    private long zzf = 0;

    zzgbc(zzgcu zzgcuVar, zzgbx zzgbxVar, zzgcg zzgcgVar, zzgea zzgeaVar, zzftp zzftpVar, long j7) {
        this.zza = zzgcuVar;
        this.zzb = zzgbxVar;
        this.zzc = zzgcgVar;
        this.zzd = zzgeaVar;
        this.zze = j7;
    }

    final InterfaceFutureC1673e zza() {
        synchronized (this) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.zzf < this.zze) {
                    return zzgot.zza(zzgbb.RESULT_NOOP_TOO_FREQUENT);
                }
                this.zzf = jCurrentTimeMillis;
                return (zzgol) zzgot.zzg((zzgol) zzgot.zzg((zzgol) zzgot.zzg((zzgol) zzgot.zzj((zzgol) zzgot.zzk((zzgol) zzgot.zzg(zzgol.zzw(this.zzc.zza()), Throwable.class, zzgba.zza, zzgpk.zza()), new zzggr() { // from class: com.google.android.gms.internal.ads.zzgar
                    @Override // com.google.android.gms.internal.ads.zzggr
                    public final /* synthetic */ Object apply(Object obj) {
                        this.zza.zzb((zzfwm) obj);
                        return new Integer(0);
                    }
                }, zzgpk.zza()), new zzgob() { // from class: com.google.android.gms.internal.ads.zzgas
                    @Override // com.google.android.gms.internal.ads.zzgob
                    public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                        return this.zza.zzc((Integer) obj);
                    }
                }, zzgpk.zza()), zzgap.class, zzgat.zza, zzgpk.zza()), zzgao.class, zzgau.zza, zzgpk.zza()), zzgaq.class, zzgav.zza, zzgpk.zza());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ int zzb(zzfwm zzfwmVar) {
        if (this.zza.zza(zzfwmVar)) {
            return 0;
        }
        throw new zzgap(null);
    }

    final /* synthetic */ InterfaceFutureC1673e zzc(Integer num) {
        zzgol zzgolVar = (zzgol) zzgot.zzk((zzgol) zzgot.zzj((zzgol) zzgot.zzk(zzgol.zzw(this.zzb.zza()), new zzggr(this) { // from class: com.google.android.gms.internal.ads.zzgaw
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                zzfwk zzfwkVar = (zzfwk) obj;
                int iZzj = zzfwkVar.zzj() - 1;
                if (iZzj == 1 || iZzj == 2) {
                    return zzfwkVar;
                }
                if (iZzj != 3) {
                    throw new zzgao(zzfwkVar.zzj() - 1);
                }
                throw new zzgaq(zzfwkVar.zzj() - 1);
            }
        }, zzgpk.zza()), new zzgob() { // from class: com.google.android.gms.internal.ads.zzgax
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.zza.zzd((zzfwk) obj);
            }
        }, zzgpk.zza()), zzgay.zza, zzgpk.zza());
        this.zzd.zze(1002, zzgolVar);
        return zzgolVar;
    }

    final /* synthetic */ InterfaceFutureC1673e zzd(zzfwk zzfwkVar) {
        ArrayList arrayList = new ArrayList();
        zzgcg zzgcgVar = this.zzc;
        arrayList.add(zzgcgVar.zzb(zzfwkVar.zza()));
        if (zzfwkVar.zzj() == 2) {
            arrayList.add(zzgcgVar.zzc(zzfwkVar.zzb().zzv()));
        } else if (zzfwkVar.zzj() == 3) {
            arrayList.add(zzgcgVar.zzc(zzfwkVar.zzb().zzv()));
            arrayList.add(zzgcgVar.zze(zzfwkVar.zzc().zzv()));
        }
        return zzgot.zzk(zzgot.zzl(arrayList), zzgaz.zza, zzgpk.zza());
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.C3393s2;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.common.api.C3553a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzfes implements zzfer {
    private final ConcurrentHashMap zza;
    private final zzfey zzb;
    private final zzfeu zzc = new zzfeu();

    public zzfes(zzfey zzfeyVar) {
        this.zza = new ConcurrentHashMap(zzfeyVar.zzd);
        this.zzb = zzfeyVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfey> creator = zzfey.CREATOR;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzgL)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            zzfey zzfeyVar = this.zzb;
            sb.append(zzfeyVar.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzg());
            int i7 = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i7++;
                sb.append(i7);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzffb) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i8 = 0; i8 < ((zzfeq) entry.getValue()).zzc(); i8++) {
                    sb.append("[O]");
                }
                for (int iZzc = ((zzfeq) entry.getValue()).zzc(); iZzc < zzfeyVar.zzd; iZzc++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfeq) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i7 < zzfeyVar.zzc) {
                i7++;
                sb.append(i7);
                sb.append(".\n");
            }
            String string = sb.toString();
            int i9 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a(string);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfer
    public final synchronized zzffa zza(zzffb zzffbVar) {
        zzffa zzffaVarZzb;
        try {
            zzfeq zzfeqVar = (zzfeq) this.zza.get(zzffbVar);
            if (zzfeqVar != null) {
                zzffaVarZzb = zzfeqVar.zzb();
                if (zzffaVarZzb == null) {
                    this.zzc.zzb();
                }
                zzffo zzffoVarZzh = zzfeqVar.zzh();
                if (zzffaVarZzb != null) {
                    zzbbn.zzb.zzc zzcVarZzs = zzbbn.zzb.zzs();
                    zzbbn.zzb.zza.C7684zza c7684zzaZzs = zzbbn.zzb.zza.zzs();
                    c7684zzaZzs.zzc(zzbbn.zzb.zzd.IN_MEMORY);
                    zzbbn.zzb.zze.zza zzaVarZzq = zzbbn.zzb.zze.zzq();
                    zzaVarZzq.zzc(zzffoVarZzh.zza);
                    zzaVarZzq.zzg(zzffoVarZzh.zzb);
                    c7684zzaZzs.zzh(zzaVarZzq);
                    zzcVarZzs.zzh(c7684zzaZzs);
                    zzffaVarZzb.zza.zza().zzd().zzj(zzcVarZzs.zzbu());
                }
                zzf();
            } else {
                this.zzc.zza();
                zzf();
                zzffaVarZzb = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzffaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfer
    public final synchronized boolean zzb(zzffb zzffbVar, zzffa zzffaVar) {
        boolean zZza;
        try {
            ConcurrentHashMap concurrentHashMap = this.zza;
            zzfeq zzfeqVar = (zzfeq) concurrentHashMap.get(zzffbVar);
            zzffaVar.zzd = C7351t.m32357o().mo18159a();
            if (zzfeqVar == null) {
                zzfey zzfeyVar = this.zzb;
                zzfeq zzfeqVar2 = new zzfeq(zzfeyVar.zzd, zzfeyVar.zze * zzbbn.zzq.zzf);
                if (concurrentHashMap.size() == zzfeyVar.zzc) {
                    int i7 = zzfeyVar.zzg;
                    int i8 = i7 - 1;
                    zzffb zzffbVar2 = null;
                    if (i7 == 0) {
                        throw null;
                    }
                    long jZzd = Long.MAX_VALUE;
                    if (i8 == 0) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((zzfeq) entry.getValue()).zzd() < jZzd) {
                                jZzd = ((zzfeq) entry.getValue()).zzd();
                                zzffbVar2 = (zzffb) entry.getKey();
                            }
                        }
                        if (zzffbVar2 != null) {
                            concurrentHashMap.remove(zzffbVar2);
                        }
                    } else if (i8 == 1) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            if (((zzfeq) entry2.getValue()).zze() < jZzd) {
                                jZzd = ((zzfeq) entry2.getValue()).zze();
                                zzffbVar2 = (zzffb) entry2.getKey();
                            }
                        }
                        if (zzffbVar2 != null) {
                            concurrentHashMap.remove(zzffbVar2);
                        }
                    } else if (i8 == 2) {
                        int iZzf = C3553a.e.API_PRIORITY_OTHER;
                        for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                            if (((zzfeq) entry3.getValue()).zzf() < iZzf) {
                                iZzf = ((zzfeq) entry3.getValue()).zzf();
                                zzffbVar2 = (zzffb) entry3.getKey();
                            }
                        }
                        if (zzffbVar2 != null) {
                            concurrentHashMap.remove(zzffbVar2);
                        }
                    }
                    this.zzc.zzd();
                }
                concurrentHashMap.put(zzffbVar, zzfeqVar2);
                this.zzc.zzc();
                zzfeqVar = zzfeqVar2;
            }
            zZza = zzfeqVar.zza(zzffaVar);
            zzfeu zzfeuVar = this.zzc;
            zzfeuVar.zze();
            zzfet zzfetVarZzf = zzfeuVar.zzf();
            zzffo zzffoVarZzh = zzfeqVar.zzh();
            zzbbn.zzb.zzc zzcVarZzs = zzbbn.zzb.zzs();
            zzbbn.zzb.zza.C7684zza c7684zzaZzs = zzbbn.zzb.zza.zzs();
            c7684zzaZzs.zzc(zzbbn.zzb.zzd.IN_MEMORY);
            zzbbn.zzb.zzg.zza zzaVarZzs = zzbbn.zzb.zzg.zzs();
            zzaVarZzs.zzc(zzfetVarZzf.zza);
            zzaVarZzs.zzg(zzfetVarZzf.zzb);
            zzaVarZzs.zzk(zzffoVarZzh.zzb);
            c7684zzaZzs.zzn(zzaVarZzs);
            zzcVarZzs.zzh(c7684zzaZzs);
            zzffaVar.zza.zza().zzd().zzk(zzcVarZzs.zzbu());
            zzf();
        } catch (Throwable th) {
            throw th;
        }
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfer
    public final synchronized boolean zzc(zzffb zzffbVar) {
        zzfeq zzfeqVar = (zzfeq) this.zza.get(zzffbVar);
        if (zzfeqVar == null) {
            return true;
        }
        return zzfeqVar.zzc() < this.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfer
    @Deprecated
    public final zzffb zzd(C3349h2 c3349h2, String str, C3393s2 c3393s2) {
        zzfey zzfeyVar = this.zzb;
        return new zzffc(c3349h2, str, new zzbuy(zzfeyVar.zza).zza().zzj, zzfeyVar.zzf, c3393s2);
    }

    @Override // com.google.android.gms.internal.ads.zzfer
    public final zzfey zze() {
        return this.zzb;
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.C3393s2;
import java.util.concurrent.Executor;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzezi implements zzfab {
    private final zzfab zza;
    private final zzfab zzb;
    private final zzffn zzc;
    private final String zzd;
    private zzcuz zze;
    private final Executor zzf;

    public zzezi(zzfab zzfabVar, zzfab zzfabVar2, zzffn zzffnVar, String str, Executor executor) {
        this.zza = zzfabVar;
        this.zzb = zzfabVar2;
        this.zzc = zzffnVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final InterfaceFutureC1673e zzg(zzffa zzffaVar, zzfac zzfacVar) {
        zzcuz zzcuzVar = zzffaVar.zza;
        this.zze = zzcuzVar;
        if (zzffaVar.zzc != null) {
            if (zzcuzVar.zzc() != null) {
                zzffaVar.zzc.zzp().zzu(zzffaVar.zza.zzc());
            }
            return zzgot.zza(zzffaVar.zzc);
        }
        zzcuzVar.zza().zzh(zzffaVar.zzb);
        return ((zzezs) this.zza).zzb(zzfacVar, null, zzffaVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfab
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcuz zzd() {
        return this.zze;
    }

    public final synchronized InterfaceFutureC1673e zzb(final zzfac zzfacVar, final zzfaa zzfaaVar, zzcuz zzcuzVar) {
        zzcuy zzcuyVarZza = zzfaaVar.zza(zzfacVar.zzb);
        zzcuyVarZza.zzi(new zzezj(this.zzd));
        final zzcuz zzcuzVar2 = (zzcuz) zzcuyVarZza.zzh();
        zzcuzVar2.zzb();
        zzcuzVar2.zzb();
        C3349h2 c3349h2 = zzcuzVar2.zzb().zzd;
        if (c3349h2.f13939D != null || c3349h2.f13944I != null) {
            this.zze = zzcuzVar2;
            return ((zzezs) this.zza).zzb(zzfacVar, zzfaaVar, zzcuzVar2);
        }
        zzfdc zzfdcVarZzb = zzcuzVar2.zzb();
        C3349h2 c3349h3 = zzfdcVarZzb.zzd;
        String str = zzfdcVarZzb.zzg;
        C3393s2 c3393s2 = zzfdcVarZzb.zzk;
        Executor executor = this.zzf;
        final zzezh zzezhVar = new zzezh(zzfaaVar, zzfacVar, c3349h3, str, executor, c3393s2, null);
        return (zzgol) zzgot.zzj(zzgol.zzw(((zzezo) this.zzb).zza(zzfacVar, zzfaaVar, zzcuzVar2)), new zzgob() { // from class: com.google.android.gms.internal.ads.zzezg
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.zza.zze(zzfacVar, zzezhVar, zzfaaVar, zzcuzVar2, (zzezn) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfab
    public final /* bridge */ /* synthetic */ InterfaceFutureC1673e zzc(zzfac zzfacVar, zzfaa zzfaaVar, Object obj) {
        return zzb(zzfacVar, zzfaaVar, null);
    }

    final /* synthetic */ InterfaceFutureC1673e zze(zzfac zzfacVar, zzezh zzezhVar, zzfaa zzfaaVar, zzcuz zzcuzVar, zzezn zzeznVar) {
        if (zzeznVar != null) {
            zzezh zzezhVar2 = new zzezh(zzezhVar.zza, zzezhVar.zzb, zzezhVar.zzc, zzezhVar.zzd, zzezhVar.zze, zzezhVar.zzf, zzeznVar.zza);
            zzffa zzffaVar = zzeznVar.zzc;
            if (zzffaVar != null) {
                this.zze = null;
                this.zzc.zza(zzezhVar2);
                return zzg(zzffaVar, zzfacVar);
            }
            zzffn zzffnVar = this.zzc;
            InterfaceFutureC1673e interfaceFutureC1673eZzb = zzffnVar.zzb(zzezhVar2);
            if (interfaceFutureC1673eZzb != null) {
                this.zze = null;
                return zzgot.zzj(interfaceFutureC1673eZzb, new zzgob() { // from class: com.google.android.gms.internal.ads.zzezf
                    @Override // com.google.android.gms.internal.ads.zzgob
                    public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                        return this.zza.zzf((zzffj) obj);
                    }
                }, this.zzf);
            }
            zzffnVar.zza(zzezhVar2);
            zzfacVar = new zzfac(zzfacVar.zzb, zzeznVar.zzb);
        }
        InterfaceFutureC1673e interfaceFutureC1673eZzb2 = ((zzezs) this.zza).zzb(zzfacVar, zzfaaVar, zzcuzVar);
        this.zze = zzcuzVar;
        return interfaceFutureC1673eZzb2;
    }

    final /* synthetic */ InterfaceFutureC1673e zzf(zzffj zzffjVar) throws zzdwz {
        zzffa zzffaVar;
        zzffl zzfflVar;
        if (zzffjVar == null || (zzffaVar = zzffjVar.zza) == null || (zzfflVar = zzffjVar.zzb) == null) {
            throw new zzdwz(1, "Empty prefetch");
        }
        zzbbn.zzb.zzc zzcVarZzs = zzbbn.zzb.zzs();
        zzbbn.zzb.zza.C7684zza c7684zzaZzs = zzbbn.zzb.zza.zzs();
        c7684zzaZzs.zzc(zzbbn.zzb.zzd.IN_MEMORY);
        c7684zzaZzs.zzg(zzbbn.zzb.zze.zzs());
        zzcVarZzs.zzh(c7684zzaZzs);
        zzffaVar.zza.zza().zzd().zzl(zzcVarZzs.zzbu());
        return zzg(zzffaVar, ((zzezh) zzfflVar).zzb);
    }
}

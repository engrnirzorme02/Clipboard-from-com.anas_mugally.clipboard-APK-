package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
final class zzcig extends zzevr {
    final zzhqg zza;
    final zzhqg zzb;
    final zzhqg zzc;
    final zzhqg zzd;
    final zzhqg zze;
    final zzhqg zzf;
    final zzhqg zzg;
    final zzhqg zzh;
    final zzhqg zzi;
    final zzhqg zzj;
    final zzhqg zzk;
    final zzhqg zzl;
    final zzhqg zzm;
    final zzhqg zzn;
    final zzhqg zzo;
    final zzhqg zzp;
    final zzhqg zzq;
    final zzhqg zzr;
    final zzhqg zzs;
    final zzhqg zzt;
    final zzhqg zzu;
    final zzhqg zzv;
    final zzhqg zzw;
    final zzhqg zzx;
    private final zzewu zzy;
    private final zzcih zzz;

    zzcig(zzcih zzcihVar, zzewu zzewuVar) {
        this.zzz = zzcihVar;
        this.zzy = zzewuVar;
        this.zza = zzhpw.zza(zzfic.zza(zzcihVar.zzB));
        zzeww zzewwVarZzc = zzeww.zzc(zzewuVar);
        this.zzb = zzewwVarZzc;
        zzewx zzewxVarZzc = zzewx.zzc(zzewuVar);
        this.zzc = zzewxVarZzc;
        zzewy zzewyVarZzc = zzewy.zzc(zzewuVar);
        this.zzd = zzewyVarZzc;
        zzckr zzckrVar = zzckq.zza;
        zzhqg zzhqgVar = zzcihVar.zzf;
        zzhqg zzhqgVar2 = zzcihVar.zzc;
        this.zze = zzevq.zza(zzckrVar, zzhqgVar, zzhqgVar2, zzfgc.zza(), zzewwVarZzc, zzewxVarZzc, zzewyVarZzc);
        this.zzf = zzewe.zza(zzckk.zza, zzfgc.zza(), zzhqgVar);
        zzewv zzewvVarZzc = zzewv.zzc(zzewuVar);
        this.zzg = zzewvVarZzc;
        this.zzh = zzewm.zza(zzckm.zza, zzfgc.zza(), zzewvVarZzc);
        this.zzi = zzewt.zza(zzcko.zza, zzhqgVar2, zzhqgVar);
        this.zzj = zzexl.zza(zzfgc.zza());
        zzexa zzexaVarZzc = zzexa.zzc(zzewuVar);
        this.zzk = zzexaVarZzc;
        zzexb zzexbVarZzc = zzexb.zzc(zzewuVar);
        this.zzl = zzexbVarZzc;
        zzhqg zzhqgVar3 = zzcihVar.zzau;
        this.zzm = zzexh.zza(zzhqgVar3, zzewyVarZzc, zzcks.zza, zzfgc.zza(), zzewvVarZzc, zzhqgVar2, zzexaVarZzc, zzexbVarZzc);
        this.zzn = zzewa.zza(zzewvVarZzc, zzcki.zza, zzhqgVar3, zzhqgVar2, zzfgc.zza());
        zzewz zzewzVarZzc = zzewz.zzc(zzewuVar);
        this.zzo = zzewzVarZzc;
        zzhqg zzhqgVarZza = zzhpw.zza(zzdrg.zza());
        this.zzp = zzhqgVarZza;
        zzhqg zzhqgVarZza2 = zzhpw.zza(zzdre.zza());
        this.zzq = zzhqgVarZza2;
        zzhqg zzhqgVarZza3 = zzhpw.zza(zzdri.zza());
        this.zzr = zzhqgVarZza3;
        zzhqg zzhqgVarZza4 = zzhpw.zza(zzdrk.zza());
        this.zzs = zzhqgVarZza4;
        zzhqa zzhqaVarZzc = zzhqb.zzc(4);
        zzhqaVarZzc.zzb(zzfhb.GMS_SIGNALS, zzhqgVarZza);
        zzhqaVarZzc.zzb(zzfhb.BUILD_URL, zzhqgVarZza2);
        zzhqaVarZzc.zzb(zzfhb.HTTP, zzhqgVarZza3);
        zzhqaVarZzc.zzb(zzfhb.PRE_PROCESS, zzhqgVarZza4);
        zzhqb zzhqbVarZzc = zzhqaVarZzc.zzc();
        this.zzt = zzhqbVarZzc;
        zzhqg zzhqgVarZza5 = zzhpw.zza(zzdrl.zza(zzewzVarZzc, zzcihVar.zzf, zzfgc.zza(), zzhqbVarZzc));
        this.zzu = zzhqgVarZza5;
        zzhqi zzhqiVarZza = zzhqj.zza(0, 1);
        zzhqiVarZza.zzb(zzhqgVarZza5);
        zzhqj zzhqjVarZzc = zzhqiVarZza.zzc();
        this.zzv = zzhqjVarZzc;
        zzfhk zzfhkVarZzc = zzfhk.zzc(zzhqjVarZzc);
        this.zzw = zzfhkVarZzc;
        this.zzx = zzhpw.zza(zzfhj.zza(zzfgc.zza(), zzcihVar.zzc, zzfhkVarZzc));
    }

    final zzewo zza() {
        zzewu zzewuVar = this.zzy;
        zzbbs zzbbsVarZza = zzckg.zza();
        zzgpd zzgpdVarZzc = zzfgc.zzc();
        List listZzd = zzewuVar.zzd();
        zzhqf.zzb(listZzd);
        return new zzewo(zzbbsVarZza, zzgpdVarZzc, listZzd);
    }

    final zzevu zzb() {
        zzewu zzewuVar = this.zzy;
        return new zzevu(zzckr.zza(), zzfgc.zzc(), zzewuVar.zzb(), zzewuVar.zzc(), zzewuVar.zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzevr
    public final zzeus zzc() {
        zzewu zzewuVar = this.zzy;
        zzcih zzcihVar = this.zzz;
        Context contextZzd = zzchd.zzd(zzcihVar.zzG());
        zzgpd zzgpdVarZzc = zzfgc.zzc();
        zzewk zzewkVar = new zzewk(zzckn.zza(), zzfgc.zzc(), zzewv.zzd(zzewuVar));
        zzhqg zzhqgVar = zzcihVar.zzc;
        return new zzeus(contextZzd, zzgpdVarZzc, zzgke.zzm(new zzetb(zzewkVar, 0L, (ScheduledExecutorService) zzhqgVar.zzb()), new zzetb(new zzewr(zzckp.zza(), (ScheduledExecutorService) zzhqgVar.zzb(), zzchd.zzd(zzcihVar.zzG())), ((Long) C3250D.m17200c().zzd(zzbci.zzeH)).longValue(), (ScheduledExecutorService) zzhqgVar.zzb()), new zzetb(zzevq.zzc(zzckr.zza(), zzchd.zzd(zzcihVar.zzG()), (ScheduledExecutorService) zzhqgVar.zzb(), zzfgc.zzc(), zzewuVar.zzf(), zzewx.zzd(zzewuVar), zzewy.zzd(zzewuVar)), 0L, (ScheduledExecutorService) zzhqgVar.zzb()), new zzetb(new zzexj(zzfgc.zzc()), 0L, (ScheduledExecutorService) zzhqgVar.zzb()), new zzewc(zzckl.zza(), zzfgc.zzc(), zzchd.zzd(zzcihVar.zzG())), zza(), zzb(), (zzeup) zzcihVar.zzby.zzb(), zzewa.zzc(zzewv.zzd(zzewuVar), zzckj.zza(), (zzbyv) zzcihVar.zzau.zzb(), (ScheduledExecutorService) zzhqgVar.zzb(), zzfgc.zzc())), (zzfib) this.zza.zzb(), (zzdsm) zzcihVar.zzl.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzevr
    public final zzeus zzd() {
        zzhqg zzhqgVar = this.zza;
        zzhqg zzhqgVar2 = this.zzn;
        zzhqg zzhqgVar3 = this.zzm;
        zzhqg zzhqgVar4 = this.zzj;
        zzhqg zzhqgVar5 = this.zzi;
        zzhqg zzhqgVar6 = this.zzh;
        zzhqg zzhqgVar7 = this.zzf;
        zzhqg zzhqgVar8 = this.zze;
        zzcih zzcihVar = this.zzz;
        return zzexc.zza(zzchd.zzd(zzcihVar.zzG()), zzckn.zza(), zzckt.zza(), zzcihVar.zzby.zzb(), zzb(), zza(), zzhpw.zzc(zzhqgVar8), zzhpw.zzc(zzhqgVar7), zzhpw.zzc(zzhqgVar6), zzhpw.zzc(zzhqgVar5), zzhpw.zzc(zzhqgVar4), zzhpw.zzc(zzhqgVar3), zzhpw.zzc(zzhqgVar2), zzfgc.zzc(), (zzfib) zzhqgVar.zzb(), (zzdsm) zzcihVar.zzl.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzevr
    public final zzfhh zze() {
        return (zzfhh) this.zzx.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzevr
    public final zzfib zzf() {
        return (zzfib) this.zza.zzb();
    }
}

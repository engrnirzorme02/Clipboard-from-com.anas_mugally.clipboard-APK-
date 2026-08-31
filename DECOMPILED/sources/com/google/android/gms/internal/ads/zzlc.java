package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzlc {
    private final zzox zza;
    private final zzlb zze;
    private final zzmd zzh;
    private final zzdl zzi;
    private boolean zzj;
    private zzgy zzk;
    private zzwi zzl = new zzwi(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();
    private final HashMap zzf = new HashMap();
    private final Set zzg = new HashSet();

    public zzlc(zzlb zzlbVar, zzmd zzmdVar, zzdl zzdlVar, zzox zzoxVar) {
        this.zza = zzoxVar;
        this.zze = zzlbVar;
        this.zzh = zzmdVar;
        this.zzi = zzdlVar;
    }

    private final void zzr() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzkz zzkzVar = (zzkz) it.next();
            if (zzkzVar.zzc.isEmpty()) {
                zzs(zzkzVar);
                it.remove();
            }
        }
    }

    private final void zzs(zzkz zzkzVar) {
        zzky zzkyVar = (zzky) this.zzf.get(zzkzVar);
        if (zzkyVar != null) {
            zzkyVar.zza.zzr(zzkyVar.zzb);
        }
    }

    private final void zzt(int i7, int i8) {
        while (true) {
            i8--;
            if (i8 < i7) {
                return;
            }
            zzkz zzkzVar = (zzkz) this.zzb.remove(i8);
            this.zzd.remove(zzkzVar.zzb);
            zzu(i8, -zzkzVar.zza.zzz().zza());
            zzkzVar.zze = true;
            if (this.zzj) {
                zzw(zzkzVar);
            }
        }
    }

    private final void zzu(int i7, int i8) {
        while (true) {
            List list = this.zzb;
            if (i7 >= list.size()) {
                return;
            }
            ((zzkz) list.get(i7)).zzd += i8;
            i7++;
        }
    }

    private final void zzv(zzkz zzkzVar) {
        zzuk zzukVar = zzkzVar.zza;
        zzuq zzuqVar = new zzuq() { // from class: com.google.android.gms.internal.ads.zzla
            @Override // com.google.android.gms.internal.ads.zzuq
            public final /* synthetic */ void zza(zzur zzurVar, zzbe zzbeVar) {
                this.zza.zzh(zzurVar, zzbeVar);
            }
        };
        zzkx zzkxVar = new zzkx(this, zzkzVar);
        this.zzf.put(zzkzVar, new zzky(zzukVar, zzuqVar, zzkxVar));
        zzukVar.zzl(new Handler(zzeo.zze(), null), zzkxVar);
        zzukVar.zzn(new Handler(zzeo.zze(), null), zzkxVar);
        zzukVar.zzp(zzuqVar, this.zzk, this.zza);
    }

    private final void zzw(zzkz zzkzVar) {
        if (zzkzVar.zze && zzkzVar.zzc.isEmpty()) {
            zzky zzkyVar = (zzky) this.zzf.remove(zzkzVar);
            zzkyVar.getClass();
            zzur zzurVar = zzkyVar.zza;
            zzurVar.zzs(zzkyVar.zzb);
            zzkx zzkxVar = zzkyVar.zzc;
            zzurVar.zzm(zzkxVar);
            zzurVar.zzo(zzkxVar);
            this.zzg.remove(zzkzVar);
        }
    }

    public final zzbe zza(int i7, int i8, List list) {
        zzghc.zza(i7 >= 0 && i7 <= i8 && i8 <= zzc());
        zzghc.zza(list.size() == i8 - i7);
        for (int i9 = i7; i9 < i8; i9++) {
            ((zzkz) this.zzb.get(i9)).zza.zzA((zzaj) list.get(i9 - i7));
        }
        return zzg();
    }

    public final boolean zzb() {
        return this.zzj;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    public final void zzd(zzgy zzgyVar) {
        zzghc.zzh(!this.zzj);
        this.zzk = zzgyVar;
        int i7 = 0;
        while (true) {
            List list = this.zzb;
            if (i7 >= list.size()) {
                this.zzj = true;
                return;
            }
            zzkz zzkzVar = (zzkz) list.get(i7);
            zzv(zzkzVar);
            this.zzg.add(zzkzVar);
            i7++;
        }
    }

    public final void zze(zzun zzunVar) {
        IdentityHashMap identityHashMap = this.zzc;
        zzkz zzkzVar = (zzkz) identityHashMap.remove(zzunVar);
        zzkzVar.getClass();
        zzkzVar.zza.zzC(zzunVar);
        zzkzVar.zzc.remove(((zzuh) zzunVar).zza);
        if (!identityHashMap.isEmpty()) {
            zzr();
        }
        zzw(zzkzVar);
    }

    public final void zzf() {
        for (zzky zzkyVar : this.zzf.values()) {
            try {
                zzkyVar.zza.zzs(zzkyVar.zzb);
            } catch (RuntimeException e7) {
                zzds.zzf("MediaSourceList", "Failed to release child source.", e7);
            }
            zzur zzurVar = zzkyVar.zza;
            zzkx zzkxVar = zzkyVar.zzc;
            zzurVar.zzm(zzkxVar);
            zzurVar.zzo(zzkxVar);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final zzbe zzg() {
        List list = this.zzb;
        if (list.isEmpty()) {
            return zzbe.zza;
        }
        int iZza = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            zzkz zzkzVar = (zzkz) list.get(i7);
            zzkzVar.zzd = iZza;
            iZza += zzkzVar.zza.zzz().zza();
        }
        return new zzlj(list, this.zzl);
    }

    final /* synthetic */ void zzh(zzur zzurVar, zzbe zzbeVar) {
        this.zze.zzo();
    }

    final /* synthetic */ zzmd zzi() {
        return this.zzh;
    }

    final /* synthetic */ zzdl zzj() {
        return this.zzi;
    }

    public final zzbe zzk(List list, zzwi zzwiVar) {
        List list2 = this.zzb;
        zzt(0, list2.size());
        return zzl(list2.size(), list, zzwiVar);
    }

    public final zzbe zzl(int i7, List list, zzwi zzwiVar) {
        if (!list.isEmpty()) {
            this.zzl = zzwiVar;
            for (int i8 = i7; i8 < list.size() + i7; i8++) {
                zzkz zzkzVar = (zzkz) list.get(i8 - i7);
                if (i8 > 0) {
                    zzkz zzkzVar2 = (zzkz) this.zzb.get(i8 - 1);
                    zzkzVar.zzc(zzkzVar2.zzd + zzkzVar2.zza.zzz().zza());
                } else {
                    zzkzVar.zzc(0);
                }
                zzu(i8, zzkzVar.zza.zzz().zza());
                this.zzb.add(i8, zzkzVar);
                this.zzd.put(zzkzVar.zzb, zzkzVar);
                if (this.zzj) {
                    zzv(zzkzVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzkzVar);
                    } else {
                        zzs(zzkzVar);
                    }
                }
            }
        }
        return zzg();
    }

    public final zzbe zzm(int i7, int i8, zzwi zzwiVar) {
        boolean z7 = false;
        if (i7 >= 0 && i7 <= i8 && i8 <= zzc()) {
            z7 = true;
        }
        zzghc.zza(z7);
        this.zzl = zzwiVar;
        zzt(i7, i8);
        return zzg();
    }

    public final zzbe zzn(int i7, int i8, int i9, zzwi zzwiVar) {
        zzghc.zza(zzc() >= 0);
        this.zzl = null;
        return zzg();
    }

    public final zzbe zzo(zzwi zzwiVar) {
        int iZzc = zzc();
        if (zzwiVar.zza() != iZzc) {
            zzwiVar = zzwiVar.zzh().zzf(0, iZzc);
        }
        this.zzl = zzwiVar;
        return zzg();
    }

    public final zzun zzp(zzup zzupVar, zzyv zzyvVar, long j7) {
        int i7 = zzlj.zzb;
        Pair pair = (Pair) zzupVar.zza;
        Object obj = pair.first;
        zzup zzupVarZza = zzupVar.zza(pair.second);
        zzkz zzkzVar = (zzkz) this.zzd.get(obj);
        zzkzVar.getClass();
        this.zzg.add(zzkzVar);
        zzky zzkyVar = (zzky) this.zzf.get(zzkzVar);
        if (zzkyVar != null) {
            zzkyVar.zza.zzq(zzkyVar.zzb);
        }
        zzkzVar.zzc.add(zzupVarZza);
        zzuh zzuhVarZzF = zzkzVar.zza.zzG(zzupVarZza, zzyvVar, j7);
        this.zzc.put(zzuhVarZzF, zzkzVar);
        zzr();
        return zzuhVarZzF;
    }

    public final zzwi zzq() {
        return this.zzl;
    }
}

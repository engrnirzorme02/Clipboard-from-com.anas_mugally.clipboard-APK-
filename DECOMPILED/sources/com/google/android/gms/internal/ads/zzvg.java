package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzvg extends zztx {
    private static final zzaj zza;
    private final zzur[] zzb;
    private final List zzc;
    private final zzbe[] zzd;
    private final ArrayList zze;
    private int zzf = -1;
    private long[][] zzg;
    private zzve zzh;
    private final zzua zzi;

    static {
        zzy zzyVar = new zzy();
        zzyVar.zza("MergingMediaSource");
        zza = zzyVar.zzc();
    }

    public zzvg(boolean z7, boolean z8, zzua zzuaVar, zzur... zzurVarArr) {
        this.zzb = zzurVarArr;
        this.zzi = zzuaVar;
        this.zze = new ArrayList(Arrays.asList(zzurVarArr));
        this.zzc = new ArrayList(zzurVarArr.length);
        int i7 = 0;
        while (true) {
            int length = zzurVarArr.length;
            if (i7 >= length) {
                this.zzd = new zzbe[length];
                this.zzg = new long[0][];
                new HashMap();
                zzgle.zzb(8).zzb(2).zza();
                return;
            }
            this.zzc.add(new ArrayList());
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzA(zzaj zzajVar) {
        this.zzb[0].zzA(zzajVar);
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzC(zzun zzunVar) {
        zzvd zzvdVar = (zzvd) zzunVar;
        int i7 = 0;
        while (true) {
            zzur[] zzurVarArr = this.zzb;
            if (i7 >= zzurVarArr.length) {
                return;
            }
            List list = (List) this.zzc.get(i7);
            zzun zzunVarZza = zzvdVar.zza(i7);
            for (int i8 = 0; i8 < list.size(); i8++) {
                if (((zzvf) list.get(i8)).zzb().equals(zzunVarZza)) {
                    list.remove(i8);
                    break;
                }
            }
            zzurVarArr[i7].zzC(zzvdVar.zza(i7));
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final zzun zzG(zzup zzupVar, zzyv zzyvVar, long j7) {
        zzbe[] zzbeVarArr = this.zzd;
        zzur[] zzurVarArr = this.zzb;
        int length = zzurVarArr.length;
        zzun[] zzunVarArr = new zzun[length];
        int iZze = zzbeVarArr[0].zze(zzupVar.zza);
        for (int i7 = 0; i7 < length; i7++) {
            zzup zzupVarZza = zzupVar.zza(zzbeVarArr[i7].zzf(iZze));
            zzunVarArr[i7] = zzurVarArr[i7].zzG(zzupVarZza, zzyvVar, j7 - this.zzg[iZze][i7]);
            ((List) this.zzc.get(i7)).add(new zzvf(zzupVarZza, zzunVarArr[i7], null));
        }
        return new zzvd(this.zzi, this.zzg[iZze], zzunVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final zzaj zzJ() {
        zzur[] zzurVarArr = this.zzb;
        return zzurVarArr.length > 0 ? zzurVarArr[0].zzJ() : zza;
    }

    @Override // com.google.android.gms.internal.ads.zztx, com.google.android.gms.internal.ads.zzto
    protected final void zza(zzgy zzgyVar) {
        super.zza(zzgyVar);
        int i7 = 0;
        while (true) {
            zzur[] zzurVarArr = this.zzb;
            if (i7 >= zzurVarArr.length) {
                return;
            }
            zzv(Integer.valueOf(i7), zzurVarArr[i7]);
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztx, com.google.android.gms.internal.ads.zzto
    protected final void zzd() {
        super.zzd();
        Arrays.fill(this.zzd, (Object) null);
        this.zzf = -1;
        this.zzh = null;
        ArrayList arrayList = this.zze;
        arrayList.clear();
        Collections.addAll(arrayList, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zztx, com.google.android.gms.internal.ads.zzur
    public final void zzt() throws zzve {
        zzve zzveVar = this.zzh;
        if (zzveVar != null) {
            throw zzveVar;
        }
        super.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zztx
    protected final /* bridge */ /* synthetic */ void zzu(Object obj, zzur zzurVar, zzbe zzbeVar) {
        int iZzc;
        Integer num = (Integer) obj;
        if (this.zzh != null) {
            return;
        }
        if (this.zzf == -1) {
            iZzc = zzbeVar.zzc();
            this.zzf = iZzc;
        } else {
            int iZzc2 = zzbeVar.zzc();
            int i7 = this.zzf;
            if (iZzc2 != i7) {
                this.zzh = new zzve(0);
                return;
            }
            iZzc = i7;
        }
        if (this.zzg.length == 0) {
            this.zzg = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iZzc, this.zzd.length);
        }
        ArrayList arrayList = this.zze;
        arrayList.remove(zzurVar);
        zzbe[] zzbeVarArr = this.zzd;
        zzbeVarArr[num.intValue()] = zzbeVar;
        if (arrayList.isEmpty()) {
            zze(zzbeVarArr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztx
    protected final /* bridge */ /* synthetic */ zzup zzx(Object obj, zzup zzupVar) {
        int iIntValue = ((Integer) obj).intValue();
        List list = this.zzc;
        List list2 = (List) list.get(iIntValue);
        for (int i7 = 0; i7 < list2.size(); i7++) {
            if (((zzvf) list2.get(i7)).zza().equals(zzupVar)) {
                return ((zzvf) ((List) list.get(0)).get(i7)).zza();
            }
        }
        return null;
    }
}

package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzlj extends zzhh {
    public static final /* synthetic */ int zzb = 0;
    private final int zzc;
    private final int zzd;
    private final int[] zze;
    private final int[] zzf;
    private final zzbe[] zzg;
    private final Object[] zzh;
    private final HashMap zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzlj(Collection collection, zzwi zzwiVar) {
        zzbe[] zzbeVarArr = new zzbe[collection.size()];
        Iterator it = collection.iterator();
        int i7 = 0;
        int i8 = 0;
        while (it.hasNext()) {
            zzbeVarArr[i8] = ((zzkr) it.next()).zzb();
            i8++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i7] = ((zzkr) it2.next()).zza();
            i7++;
        }
        this(zzbeVarArr, objArr, zzwiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    protected final int zzp(int i7) {
        return zzeo.zzl(this.zze, i7 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    protected final int zzq(int i7) {
        return zzeo.zzl(this.zzf, i7 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    protected final int zzr(Object obj) {
        Integer num = (Integer) this.zzi.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    protected final zzbe zzs(int i7) {
        return this.zzg[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    protected final int zzt(int i7) {
        return this.zze[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    protected final int zzu(int i7) {
        return this.zzf[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    protected final Object zzv(int i7) {
        return this.zzh[i7];
    }

    final List zzw() {
        return Arrays.asList(this.zzg);
    }

    public final zzlj zzx(zzwi zzwiVar) {
        zzbe[] zzbeVarArr = this.zzg;
        zzbe[] zzbeVarArr2 = new zzbe[zzbeVarArr.length];
        for (int i7 = 0; i7 < zzbeVarArr.length; i7++) {
            zzbeVarArr2[i7] = new zzli(this, zzbeVarArr[i7]);
        }
        return new zzlj(zzbeVarArr2, this.zzh, zzwiVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzlj(zzbe[] zzbeVarArr, Object[] objArr, zzwi zzwiVar) {
        super(false, zzwiVar);
        int i7 = 0;
        this.zzg = zzbeVarArr;
        int length = zzbeVarArr.length;
        this.zze = new int[length];
        this.zzf = new int[length];
        this.zzh = objArr;
        this.zzi = new HashMap();
        int iZza = 0;
        int iZzc = 0;
        int i8 = 0;
        while (i7 < zzbeVarArr.length) {
            zzbe zzbeVar = zzbeVarArr[i7];
            this.zzg[i8] = zzbeVar;
            this.zzf[i8] = iZza;
            this.zze[i8] = iZzc;
            iZza += zzbeVar.zza();
            iZzc += this.zzg[i8].zzc();
            this.zzi.put(objArr[i8], Integer.valueOf(i8));
            i7++;
            i8++;
        }
        this.zzc = iZza;
        this.zzd = iZzc;
    }
}

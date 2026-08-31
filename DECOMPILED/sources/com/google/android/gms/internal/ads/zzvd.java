package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzvd implements zzun, zzum {
    private final zzun[] zza;
    private final boolean[] zzb;
    private zzum zzf;
    private zzwq zzg;
    private final ArrayList zzd = new ArrayList();
    private final HashMap zze = new HashMap();
    private zzwh zzi = new zztz(zzgjz.zzi(), zzgjz.zzi());
    private final IdentityHashMap zzc = new IdentityHashMap();
    private zzun[] zzh = new zzun[0];

    public zzvd(zzua zzuaVar, long[] jArr, zzun... zzunVarArr) {
        this.zza = zzunVarArr;
        this.zzb = new boolean[zzunVarArr.length];
        for (int i7 = 0; i7 < zzunVarArr.length; i7++) {
            long j7 = jArr[i7];
            if (j7 != 0) {
                this.zzb[i7] = true;
                this.zza[i7] = new zzwn(zzunVarArr[i7], j7);
            }
        }
    }

    public final zzun zza(int i7) {
        return this.zzb[i7] ? ((zzwn) this.zza[i7]).zza() : this.zza[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzb(zzum zzumVar, long j7) {
        this.zzf = zzumVar;
        ArrayList arrayList = this.zzd;
        zzun[] zzunVarArr = this.zza;
        Collections.addAll(arrayList, zzunVarArr);
        for (zzun zzunVar : zzunVarArr) {
            zzunVar.zzb(this, j7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzc() {
        int i7 = 0;
        while (true) {
            zzun[] zzunVarArr = this.zza;
            if (i7 >= zzunVarArr.length) {
                return;
            }
            zzunVarArr[i7].zzc();
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final zzwq zzd() {
        zzwq zzwqVar = this.zzg;
        zzwqVar.getClass();
        return zzwqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zze(zzyf[] zzyfVarArr, boolean[] zArr, zzwf[] zzwfVarArr, boolean[] zArr2, long j7) {
        int length;
        int length2 = zzyfVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i7 = 0;
        int i8 = 0;
        while (true) {
            length = zzyfVarArr.length;
            if (i8 >= length) {
                break;
            }
            zzwf zzwfVar = zzwfVarArr[i8];
            Integer num = zzwfVar == null ? null : (Integer) this.zzc.get(zzwfVar);
            iArr[i8] = num == null ? -1 : num.intValue();
            zzyf zzyfVar = zzyfVarArr[i8];
            if (zzyfVar != null) {
                String str = zzyfVar.zza().zzb;
                iArr2[i8] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i8] = -1;
            }
            i8++;
        }
        IdentityHashMap identityHashMap = this.zzc;
        identityHashMap.clear();
        zzun[] zzunVarArr = this.zza;
        zzwf[] zzwfVarArr2 = new zzwf[length];
        zzwf[] zzwfVarArr3 = new zzwf[length];
        zzyf[] zzyfVarArr2 = new zzyf[length];
        ArrayList arrayList = new ArrayList(zzunVarArr.length);
        long j8 = j7;
        int i9 = 0;
        while (i9 < zzunVarArr.length) {
            int i10 = i7;
            while (i10 < zzyfVarArr.length) {
                zzwfVarArr3[i10] = iArr[i10] == i9 ? zzwfVarArr[i10] : null;
                if (iArr2[i10] == i9) {
                    zzyf zzyfVar2 = zzyfVarArr[i10];
                    zzyfVar2.getClass();
                    zzbf zzbfVar = (zzbf) this.zze.get(zzyfVar2.zza());
                    zzbfVar.getClass();
                    zzyfVarArr2[i10] = new zzvc(zzyfVar2, zzbfVar);
                } else {
                    zzyfVarArr2[i10] = null;
                }
                i10++;
                iArr2 = iArr2;
            }
            int[] iArr3 = iArr2;
            ArrayList arrayList2 = arrayList;
            int i11 = i9;
            long jZze = zzunVarArr[i9].zze(zzyfVarArr2, zArr, zzwfVarArr3, zArr2, j8);
            if (i11 == 0) {
                j8 = jZze;
            } else if (jZze != j8) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z7 = false;
            for (int i12 = 0; i12 < zzyfVarArr.length; i12++) {
                if (iArr3[i12] == i11) {
                    zzwf zzwfVar2 = zzwfVarArr3[i12];
                    zzwfVar2.getClass();
                    zzwfVarArr2[i12] = zzwfVar2;
                    identityHashMap.put(zzwfVar2, Integer.valueOf(i11));
                    z7 = true;
                } else if (iArr[i12] == i11) {
                    zzghc.zzh(zzwfVarArr3[i12] == null);
                }
            }
            if (z7) {
                arrayList2.add(zzunVarArr[i11]);
            }
            i9 = i11 + 1;
            arrayList = arrayList2;
            iArr2 = iArr3;
            i7 = 0;
        }
        int i13 = i7;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzwfVarArr2, i13, zzwfVarArr, i13, length);
        this.zzh = (zzun[]) arrayList3.toArray(new zzun[i13]);
        this.zzi = new zztz(arrayList3, zzgkp.zzc(arrayList3, zzvb.zza));
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzf(long j7, boolean z7) {
        for (zzun zzunVar : this.zzh) {
            zzunVar.zzf(j7, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final void zzg(long j7) {
        this.zzi.zzg(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzh() {
        long j7 = -9223372036854775807L;
        for (zzun zzunVar : this.zzh) {
            long jZzh = zzunVar.zzh();
            if (jZzh == -9223372036854775807L) {
                if (j7 != -9223372036854775807L && zzunVar.zzj(j7) != j7) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j7 == -9223372036854775807L) {
                for (zzun zzunVar2 : this.zzh) {
                    if (zzunVar2 == zzunVar) {
                        break;
                    }
                    if (zzunVar2.zzj(jZzh) != jZzh) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j7 = jZzh;
            } else if (jZzh != j7) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzi() {
        return this.zzi.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzj(long j7) {
        long jZzj = this.zzh[0].zzj(j7);
        int i7 = 1;
        while (true) {
            zzun[] zzunVarArr = this.zzh;
            if (i7 >= zzunVarArr.length) {
                return jZzj;
            }
            if (zzunVarArr[i7].zzj(jZzj) != jZzj) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzk(long j7, zzlt zzltVar) {
        zzun[] zzunVarArr = this.zzh;
        return (zzunVarArr.length > 0 ? zzunVarArr[0] : this.zza[0]).zzk(j7, zzltVar);
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzl() {
        return this.zzi.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzm(zzkl zzklVar) {
        ArrayList arrayList = this.zzd;
        if (arrayList.isEmpty()) {
            return this.zzi.zzm(zzklVar);
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((zzun) arrayList.get(i7)).zzm(zzklVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzn() {
        return this.zzi.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzum
    public final void zzp(zzun zzunVar) {
        ArrayList arrayList = this.zzd;
        arrayList.remove(zzunVar);
        if (arrayList.isEmpty()) {
            zzun[] zzunVarArr = this.zza;
            int i7 = 0;
            for (zzun zzunVar2 : zzunVarArr) {
                i7 += zzunVar2.zzd().zzb;
            }
            zzbf[] zzbfVarArr = new zzbf[i7];
            int i8 = 0;
            for (int i9 = 0; i9 < zzunVarArr.length; i9++) {
                zzwq zzwqVarZzd = zzunVarArr[i9].zzd();
                int i10 = zzwqVarZzd.zzb;
                int i11 = 0;
                while (i11 < i10) {
                    zzbf zzbfVarZza = zzwqVarZzd.zza(i11);
                    int i12 = zzbfVarZza.zza;
                    zzu[] zzuVarArr = new zzu[i12];
                    int i13 = 0;
                    while (i13 < i12) {
                        zzu zzuVarZza = zzbfVarZza.zza(i13);
                        zzs zzsVarZza = zzuVarZza.zza();
                        String str = zzuVarZza.zza;
                        if (str == null) {
                            str = "";
                        }
                        StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 1 + str.length());
                        sb.append(i9);
                        sb.append(":");
                        sb.append(str);
                        zzsVarZza.zza(sb.toString());
                        zzuVarArr[i13] = zzsVarZza.zzM();
                        i13++;
                        zzunVarArr = zzunVarArr;
                    }
                    zzun[] zzunVarArr2 = zzunVarArr;
                    String str2 = zzbfVarZza.zzb;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i9).length() + 1 + String.valueOf(str2).length());
                    sb2.append(i9);
                    sb2.append(":");
                    sb2.append(str2);
                    zzbf zzbfVar = new zzbf(sb2.toString(), zzuVarArr);
                    this.zze.put(zzbfVar, zzbfVarZza);
                    zzbfVarArr[i8] = zzbfVar;
                    i11++;
                    i8++;
                    zzunVarArr = zzunVarArr2;
                }
            }
            this.zzg = new zzwq(zzbfVarArr);
            zzum zzumVar = this.zzf;
            zzumVar.getClass();
            zzumVar.zzp(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final /* bridge */ /* synthetic */ void zzs(zzwh zzwhVar) {
        zzum zzumVar = this.zzf;
        zzumVar.getClass();
        zzumVar.zzs(this);
    }
}

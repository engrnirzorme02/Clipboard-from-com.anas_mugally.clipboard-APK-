package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzl {
    private static final Comparator zza = zzzk.zza;
    private static final Comparator zzb = zzzj.zza;
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzzi[] zzd = new zzzi[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzzl(int i7) {
    }

    public final void zza() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }

    public final void zzb(int i7, float f7) {
        zzzi zzziVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i8 = this.zzh;
        if (i8 > 0) {
            zzzi[] zzziVarArr = this.zzd;
            int i9 = i8 - 1;
            this.zzh = i9;
            zzziVar = zzziVarArr[i9];
        } else {
            zzziVar = new zzzi(null);
        }
        int i10 = this.zzf;
        this.zzf = i10 + 1;
        zzziVar.zza = i10;
        zzziVar.zzb = i7;
        zzziVar.zzc = f7;
        ArrayList arrayList = this.zzc;
        arrayList.add(zzziVar);
        this.zzg += i7;
        while (true) {
            int i11 = this.zzg;
            if (i11 <= 2000) {
                return;
            }
            int i12 = i11 - 2000;
            zzzi zzziVar2 = (zzzi) arrayList.get(0);
            int i13 = zzziVar2.zzb;
            if (i13 <= i12) {
                this.zzg -= i13;
                arrayList.remove(0);
                int i14 = this.zzh;
                if (i14 < 5) {
                    zzzi[] zzziVarArr2 = this.zzd;
                    this.zzh = i14 + 1;
                    zzziVarArr2[i14] = zzziVar2;
                }
            } else {
                zzziVar2.zzb = i13 - i12;
                this.zzg -= i12;
            }
        }
    }

    public final float zzc(float f7) {
        int i7 = 0;
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f8 = this.zzg;
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.zzc;
            if (i7 >= arrayList.size()) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((zzzi) arrayList.get(arrayList.size() - 1)).zzc;
            }
            float f9 = 0.5f * f8;
            zzzi zzziVar = (zzzi) arrayList.get(i7);
            i8 += zzziVar.zzb;
            if (i8 >= f9) {
                return zzziVar.zzc;
            }
            i7++;
        }
    }
}

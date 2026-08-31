package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgkd extends zzgjt {
    Object[] zzd;
    private int zze;

    public zzgkd() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzgjt, com.google.android.gms.internal.ads.zzgju
    public final /* bridge */ /* synthetic */ zzgju zzd(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzgkd zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int iZzn = zzgke.zzn(this.zzb);
            Object[] objArr = this.zzd;
            if (iZzn <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iZza = zzgjs.zza(iHashCode);
                while (true) {
                    int i7 = iZza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i7];
                    if (obj2 == null) {
                        objArr2[i7] = obj;
                        this.zze += iHashCode;
                        super.zza(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    iZza = i7 + 1;
                }
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }

    public final zzgkd zzg(Object... objArr) {
        if (this.zzd == null) {
            zzb(objArr, 2);
            return this;
        }
        for (int i7 = 0; i7 < 2; i7++) {
            zzf(objArr[i7]);
        }
        return this;
    }

    public final zzgkd zzh(Iterable iterable) {
        iterable.getClass();
        if (this.zzd == null) {
            super.zzc(iterable);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzf(it.next());
        }
        return this;
    }

    public final zzgke zzi() {
        zzgke zzgkeVarZzv;
        int i7 = this.zzb;
        if (i7 == 0) {
            return zzglq.zza;
        }
        if (i7 == 1) {
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzgma(obj);
        }
        if (this.zzd == null || zzgke.zzn(i7) != this.zzd.length) {
            zzgkeVarZzv = zzgke.zzv(this.zzb, this.zza);
            this.zzb = zzgkeVarZzv.size();
        } else {
            int i8 = this.zzb;
            Object[] objArrCopyOf = this.zza;
            if (zzgke.zzw(i8, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i8);
            }
            int i9 = this.zze;
            Object[] objArr = this.zzd;
            zzgkeVarZzv = new zzglq(objArrCopyOf, i9, objArr, objArr.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzgkeVarZzv;
    }

    zzgkd(int i7, boolean z7) {
        super(i7);
        this.zzd = new Object[zzgke.zzn(i7)];
    }
}

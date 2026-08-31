package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
final class zzwl {
    private int zza;
    private final SparseArray zzb;
    private final zzdf zzc;

    public zzwl() {
        this(zzwk.zza);
    }

    public final Object zza(int i7) {
        SparseArray sparseArray;
        if (this.zza == -1) {
            this.zza = 0;
        }
        while (true) {
            int i8 = this.zza;
            if (i8 <= 0 || i7 >= this.zzb.keyAt(i8)) {
                break;
            }
            this.zza--;
        }
        while (true) {
            int i9 = this.zza;
            sparseArray = this.zzb;
            if (i9 >= sparseArray.size() - 1 || i7 < sparseArray.keyAt(this.zza + 1)) {
                break;
            }
            this.zza++;
        }
        return sparseArray.valueAt(this.zza);
    }

    public final void zzb(int i7, Object obj) {
        if (this.zza == -1) {
            zzghc.zzh(this.zzb.size() == 0);
            this.zza = 0;
        }
        SparseArray sparseArray = this.zzb;
        if (sparseArray.size() > 0) {
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            zzghc.zza(i7 >= iKeyAt);
            if (iKeyAt == i7) {
                this.zzc.zza(sparseArray.valueAt(sparseArray.size() - 1));
            }
        }
        sparseArray.append(i7, obj);
    }

    public final Object zzc() {
        SparseArray sparseArray = this.zzb;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public final void zzd(int i7) {
        int i8 = 0;
        while (true) {
            SparseArray sparseArray = this.zzb;
            if (i8 >= sparseArray.size() - 1) {
                return;
            }
            int i9 = i8 + 1;
            if (i7 < sparseArray.keyAt(i9)) {
                return;
            }
            this.zzc.zza(sparseArray.valueAt(i8));
            sparseArray.removeAt(i8);
            int i10 = this.zza;
            if (i10 > 0) {
                this.zza = i10 - 1;
            }
            i8 = i9;
        }
    }

    public final void zze() {
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.zzb;
            if (i7 >= sparseArray.size()) {
                this.zza = -1;
                sparseArray.clear();
                return;
            } else {
                this.zzc.zza(sparseArray.valueAt(i7));
                i7++;
            }
        }
    }

    public final boolean zzf() {
        return this.zzb.size() == 0;
    }

    public zzwl(zzdf zzdfVar) {
        this.zzb = new SparseArray();
        this.zzc = zzdfVar;
        this.zza = -1;
    }
}

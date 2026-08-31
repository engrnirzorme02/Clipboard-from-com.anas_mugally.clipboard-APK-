package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxn extends zzbj {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final SparseArray zzh;
    private final SparseBooleanArray zzi;

    public zzxn() {
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
    }

    final /* synthetic */ boolean zzA() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzB() {
        return this.zzc;
    }

    final /* synthetic */ boolean zzC() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzD() {
        return this.zze;
    }

    final /* synthetic */ boolean zzE() {
        return this.zzf;
    }

    final /* synthetic */ boolean zzF() {
        return this.zzg;
    }

    final /* synthetic */ SparseArray zzG() {
        return this.zzh;
    }

    final /* synthetic */ SparseBooleanArray zzH() {
        return this.zzi;
    }

    protected final zzxn zzx(zzbk zzbkVar) {
        super.zza(zzbkVar);
        return this;
    }

    public final zzxn zzy(int i7, boolean z7) {
        SparseBooleanArray sparseBooleanArray = this.zzi;
        if (sparseBooleanArray.get(i7) == z7) {
            return this;
        }
        if (z7) {
            sparseBooleanArray.put(i7, true);
            return this;
        }
        sparseBooleanArray.delete(i7);
        return this;
    }

    final /* synthetic */ boolean zzz() {
        return this.zza;
    }

    /* synthetic */ zzxn(zzxo zzxoVar, byte[] bArr) {
        super(zzxoVar);
        this.zza = zzxoVar.zzK;
        this.zzb = zzxoVar.zzM;
        this.zzc = zzxoVar.zzO;
        this.zzd = zzxoVar.zzT;
        this.zze = zzxoVar.zzU;
        this.zzf = zzxoVar.zzV;
        this.zzg = zzxoVar.zzX;
        SparseArray sparseArray = new SparseArray();
        int i7 = 0;
        while (true) {
            SparseArray sparseArrayZze = zzxoVar.zze();
            if (i7 < sparseArrayZze.size()) {
                sparseArray.put(sparseArrayZze.keyAt(i7), new HashMap((Map) sparseArrayZze.valueAt(i7)));
                i7++;
            } else {
                this.zzh = sparseArray;
                this.zzi = zzxoVar.zzf().clone();
                return;
            }
        }
    }
}

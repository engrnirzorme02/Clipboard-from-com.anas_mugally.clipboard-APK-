package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxo extends zzbk {
    public static final zzxo zzJ = new zzxo(new zzxn());
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final boolean zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final boolean zzY;
    private final SparseArray zzZ;
    private final SparseBooleanArray zzaa;

    static {
        String str = zzeo.zza;
        Integer.toString(zzbbn.zzq.zzf, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    /* synthetic */ zzxo(zzxn zzxnVar, byte[] bArr) {
        this(zzxnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzxo.class == obj.getClass()) {
            zzxo zzxoVar = (zzxo) obj;
            if (super.equals(zzxoVar) && this.zzK == zzxoVar.zzK && this.zzM == zzxoVar.zzM && this.zzO == zzxoVar.zzO && this.zzT == zzxoVar.zzT && this.zzU == zzxoVar.zzU && this.zzV == zzxoVar.zzV && this.zzX == zzxoVar.zzX) {
                SparseBooleanArray sparseBooleanArray = this.zzaa;
                SparseBooleanArray sparseBooleanArray2 = zzxoVar.zzaa;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    for (int i7 = 0; i7 < size; i7++) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i7)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = this.zzZ;
                    SparseArray sparseArray2 = zzxoVar.zzZ;
                    int size2 = sparseArray.size();
                    if (sparseArray2.size() == size2) {
                        for (int i8 = 0; i8 < size2; i8++) {
                            int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i8));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray.valueAt(i8);
                                Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        zzwq zzwqVar = (zzwq) entry.getKey();
                                        if (!map2.containsKey(zzwqVar) || !Objects.equals(entry.getValue(), map2.get(zzwqVar))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzK ? 1 : 0)) * 961) + (this.zzM ? 1 : 0)) * 961) + (this.zzO ? 1 : 0)) * 28629151) + (this.zzT ? 1 : 0)) * 31) + (this.zzU ? 1 : 0)) * 31) + (this.zzV ? 1 : 0)) * 961) + (this.zzX ? 1 : 0)) * 31;
    }

    public final boolean zza(int i7) {
        return this.zzaa.get(i7);
    }

    @Deprecated
    public final boolean zzb(int i7, zzwq zzwqVar) {
        Map map = (Map) this.zzZ.get(i7);
        return map != null && map.containsKey(zzwqVar);
    }

    @Deprecated
    public final zzxp zzc(int i7, zzwq zzwqVar) {
        Map map = (Map) this.zzZ.get(i7);
        if (map != null) {
            return (zzxp) map.get(zzwqVar);
        }
        return null;
    }

    public final zzxn zzd() {
        return new zzxn(this, null);
    }

    final /* synthetic */ SparseArray zze() {
        return this.zzZ;
    }

    final /* synthetic */ SparseBooleanArray zzf() {
        return this.zzaa;
    }

    private zzxo(zzxn zzxnVar) {
        super(zzxnVar);
        this.zzK = zzxnVar.zzz();
        this.zzL = false;
        this.zzM = zzxnVar.zzA();
        this.zzN = false;
        this.zzO = zzxnVar.zzB();
        this.zzP = false;
        this.zzQ = false;
        this.zzR = false;
        this.zzS = false;
        this.zzT = zzxnVar.zzC();
        this.zzU = zzxnVar.zzD();
        this.zzV = zzxnVar.zzE();
        this.zzW = false;
        this.zzX = zzxnVar.zzF();
        this.zzY = false;
        this.zzZ = zzxnVar.zzG();
        this.zzaa = zzxnVar.zzH();
    }
}

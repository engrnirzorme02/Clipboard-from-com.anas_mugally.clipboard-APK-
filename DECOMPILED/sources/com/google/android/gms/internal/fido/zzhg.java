package com.google.android.gms.internal.fido;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhg extends zzhp {
    private final zzcc zza;
    private final int zzb;

    zzhg(zzcc zzccVar) throws zzhf {
        zzccVar.getClass();
        this.zza = zzccVar;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            zzcc zzccVar2 = this.zza;
            if (i7 >= zzccVar2.size()) {
                break;
            }
            int iZzb = ((zzhp) zzccVar2.get(i7)).zzb();
            if (i8 < iZzb) {
                i8 = iZzb;
            }
            i7++;
        }
        int i9 = i8 + 1;
        this.zzb = i9;
        if (i9 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzhp zzhpVar = (zzhp) obj;
        if (zzhp.zzd((byte) -128) != zzhpVar.zza()) {
            return zzhp.zzd((byte) -128) - zzhpVar.zza();
        }
        zzhg zzhgVar = (zzhg) zzhpVar;
        zzcc zzccVar = this.zza;
        int size = zzccVar.size();
        zzcc zzccVar2 = zzhgVar.zza;
        if (size != zzccVar2.size()) {
            return zzccVar.size() - zzccVar2.size();
        }
        int i7 = 0;
        while (true) {
            zzcc zzccVar3 = this.zza;
            if (i7 >= zzccVar3.size()) {
                return 0;
            }
            int iCompareTo = ((zzhp) zzccVar3.get(i7)).compareTo((zzhp) zzhgVar.zza.get(i7));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            i7++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhg.class == obj.getClass()) {
            return this.zza.equals(((zzhg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.zzd((byte) -128)), this.zza});
    }

    public final String toString() {
        if (this.zza.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        zzcc zzccVar = this.zza;
        int size = zzccVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(((zzhp) zzccVar.get(i7)).toString().replace("\n", "\n  "));
        }
        zzbd zzbdVarZza = zzbd.zza(",\n  ");
        StringBuilder sb = new StringBuilder("[\n  ");
        zzbdVarZza.zzc(sb, arrayList.iterator());
        sb.append("\n]");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    protected final int zza() {
        return zzhp.zzd((byte) -128);
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    protected final int zzb() {
        return this.zzb;
    }
}

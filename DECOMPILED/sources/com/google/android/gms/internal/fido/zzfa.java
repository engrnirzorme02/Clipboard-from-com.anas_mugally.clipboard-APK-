package com.google.android.gms.internal.fido;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class zzfa implements Comparator {
    zzfa() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzfh zzfhVarZza = zzfh.zza(obj);
        zzfh zzfhVarZza2 = zzfh.zza(obj2);
        if (zzfhVarZza != zzfhVarZza2) {
            return zzfhVarZza.compareTo(zzfhVarZza2);
        }
        int iOrdinal = zzfhVarZza.ordinal();
        if (iOrdinal == 0) {
            return ((Boolean) obj).compareTo((Boolean) obj2);
        }
        if (iOrdinal == 1) {
            return ((String) obj).compareTo((String) obj2);
        }
        if (iOrdinal == 2) {
            return ((Long) obj).compareTo((Long) obj2);
        }
        if (iOrdinal == 3) {
            return ((Double) obj).compareTo((Double) obj2);
        }
        throw null;
    }
}

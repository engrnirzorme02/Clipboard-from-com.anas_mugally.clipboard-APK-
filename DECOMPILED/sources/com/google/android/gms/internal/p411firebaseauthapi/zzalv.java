package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzalv implements zzalw {
    zzalv() {
    }

    private static <E> zzalm<E> zzc(Object obj, long j7) {
        return (zzalm) zzanz.zze(obj, j7);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzalw
    public final <L> List<L> zza(Object obj, long j7) {
        zzalm zzalmVarZzc = zzc(obj, j7);
        if (zzalmVarZzc.zzc()) {
            return zzalmVarZzc;
        }
        int size = zzalmVarZzc.size();
        zzalm zzalmVarZza = zzalmVarZzc.zza(size == 0 ? 10 : size << 1);
        zzanz.zza(obj, j7, zzalmVarZza);
        return zzalmVarZza;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzalw
    public final void zzb(Object obj, long j7) {
        zzc(obj, j7).zzb();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzalw
    public final <E> void zza(Object obj, Object obj2, long j7) {
        zzalm zzalmVarZzc = zzc(obj, j7);
        zzalm zzalmVarZzc2 = zzc(obj2, j7);
        int size = zzalmVarZzc.size();
        int size2 = zzalmVarZzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzalmVarZzc.zzc()) {
                zzalmVarZzc = zzalmVarZzc.zza(size2 + size);
            }
            zzalmVarZzc.addAll(zzalmVarZzc2);
        }
        if (size > 0) {
            zzalmVarZzc2 = zzalmVarZzc;
        }
        zzanz.zza(obj, j7, zzalmVarZzc2);
    }
}

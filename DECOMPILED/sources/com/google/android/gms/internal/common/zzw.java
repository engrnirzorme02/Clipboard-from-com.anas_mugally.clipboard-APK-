package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes2.dex */
final class zzw extends zzz {
    final /* synthetic */ zzr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzw(zzx zzxVar, zzaa zzaaVar, CharSequence charSequence, zzr zzrVar) {
        super(zzaaVar, charSequence);
        this.zza = zzrVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    final int zzc(int i7) {
        return i7 + 1;
    }

    @Override // com.google.android.gms.internal.common.zzz
    final int zzd(int i7) {
        CharSequence charSequence = ((zzz) this).zzb;
        int length = charSequence.length();
        zzv.zzb(i7, length, "index");
        while (i7 < length) {
            if (this.zza.zza(charSequence.charAt(i7))) {
                return i7;
            }
            i7++;
        }
        return -1;
    }
}

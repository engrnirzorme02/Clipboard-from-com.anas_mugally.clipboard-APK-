package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzghh extends zzgho {
    final /* synthetic */ zzggo zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzghh(zzghq zzghqVar, CharSequence charSequence, zzggo zzggoVar) {
        super(zzghqVar, charSequence);
        this.zza = zzggoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgho
    final int zzc(int i7) {
        CharSequence charSequence = ((zzgho) this).zzb;
        int length = charSequence.length();
        zzghc.zzn(i7, length, "index");
        while (i7 < length) {
            if (this.zza.zzb(charSequence.charAt(i7))) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgho
    final int zzd(int i7) {
        return i7 + 1;
    }
}

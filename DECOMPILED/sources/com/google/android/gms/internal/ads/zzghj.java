package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzghj extends zzgho {
    zzghj(zzghq zzghqVar, CharSequence charSequence, int i7) {
        super(zzghqVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzgho
    public final int zzc(int i7) {
        int i8 = i7 + 4000;
        if (i8 < ((zzgho) this).zzb.length()) {
            return i8;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgho
    public final int zzd(int i7) {
        return i7;
    }
}

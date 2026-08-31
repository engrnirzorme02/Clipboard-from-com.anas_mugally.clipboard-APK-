package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
final class zzx extends zzaa {
    private final /* synthetic */ zzm zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzx(zzt zztVar, CharSequence charSequence, zzm zzmVar) {
        super(zztVar, charSequence);
        this.zzb = zzmVar;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaa
    public final int zza(int i7) {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaa
    public final int zzb(int i7) {
        if (this.zzb.zza(i7)) {
            return this.zzb.zzb();
        }
        return -1;
    }
}

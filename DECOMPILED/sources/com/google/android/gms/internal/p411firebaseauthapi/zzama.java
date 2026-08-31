package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
final class zzama implements zzane {
    private static final zzamj zza = new zzalz();
    private final zzamj zzb;

    public zzama() {
        this(new zzamb(zzalg.zza(), zza));
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzane
    public final <T> zzanb<T> zza(Class<T> cls) {
        zzand.zza((Class<?>) cls);
        zzamk zzamkVarZza = this.zzb.zza(cls);
        if (zzamkVarZza.zzc()) {
            return zzams.zza(zzand.zza(), zzaky.zza(), zzamkVarZza.zza());
        }
        return zzamq.zza(cls, zzamkVarZza, zzamw.zza(), zzaly.zza(), zzand.zza(), zzamc.zza[zzamkVarZza.zzb().ordinal()] != 1 ? zzaky.zza() : null, zzamh.zza());
    }

    private zzama(zzamj zzamjVar) {
        this.zzb = (zzamj) zzalh.zza(zzamjVar, "messageInfoFactory");
    }
}

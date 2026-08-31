package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zznd implements zzny {
    private static final zznk zzb = new zznb();
    private final zznk zza;

    public zznd() {
        zzma zzmaVarZza = zzma.zza();
        int i7 = zznu.zza;
        zznc zzncVar = new zznc(zzmaVarZza, zzb);
        byte[] bArr = zzmp.zzb;
        this.zza = zzncVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzny
    public final zznx zza(Class cls) {
        int i7 = zznz.zza;
        if (!zzmf.class.isAssignableFrom(cls)) {
            int i8 = zznu.zza;
        }
        zznj zznjVarZzc = this.zza.zzc(cls);
        if (zznjVarZzc.zza()) {
            int i9 = zznu.zza;
            return zznq.zzg(zznz.zzA(), zzlu.zza(), zznjVarZzc.zzb());
        }
        int i10 = zznu.zza;
        return zznp.zzl(cls, zznjVarZzc, zzns.zza(), zzmz.zza(), zznz.zzA(), zznjVarZzc.zzc() + (-1) != 1 ? zzlu.zza() : null, zzni.zza());
    }
}

package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
final class zzgd implements zzgw {
    private static final zzgj zza = new zzgb();
    private final zzgj zzb;

    public zzgd() {
        zzfd zzfdVarZza = zzfd.zza();
        int i7 = zzgs.zza;
        zzgc zzgcVar = new zzgc(zzfdVarZza, zza);
        byte[] bArr = zzfo.zzb;
        this.zzb = zzgcVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgw
    public final zzgv zza(Class cls) {
        int i7 = zzgx.zza;
        if (!zzfi.class.isAssignableFrom(cls)) {
            int i8 = zzgs.zza;
        }
        zzgi zzgiVarZzb = this.zzb.zzb(cls);
        if (zzgiVarZzb.zzb()) {
            int i9 = zzgs.zza;
            return zzgp.zzc(zzgx.zzm(), zzex.zza(), zzgiVarZzb.zza());
        }
        int i10 = zzgs.zza;
        return zzgo.zzl(cls, zzgiVarZzb, zzgr.zza(), zzfz.zza(), zzgx.zzm(), zzgiVarZzb.zzc() + (-1) != 1 ? zzex.zza() : null, zzgh.zza());
    }
}

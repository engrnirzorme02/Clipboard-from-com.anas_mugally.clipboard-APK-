package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgk implements zzgx {
    public static final zzgk zza = new zzgk();

    private zzgk() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i7, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length == 0) {
            throw new zzce(4, 3, null);
        }
        zztf zztfVarZzf = zzti.zzf();
        for (zzue zzueVar : zzueVarArr) {
            Object objZza = zzgdVar.zzc().zza(zzueVar);
            if (objZza == null) {
                throw new zzce(4, 4, null);
            }
            zztg zztgVarZzf = zzth.zzf();
            if (objZza instanceof Integer) {
                zztgVarZzf.zzu(((Number) objZza).intValue());
            } else if (objZza instanceof Short) {
                zztgVarZzf.zzt(((Number) objZza).shortValue());
            } else if (objZza instanceof Byte) {
                zztgVarZzf.zzf(zzle.zzk(new byte[]{((Number) objZza).byteValue()}, 0, 1));
            } else if (objZza instanceof Long) {
                zztgVarZzf.zzv(((Number) objZza).longValue());
            } else if (objZza instanceof Double) {
                zztgVarZzf.zzr(((Number) objZza).doubleValue());
            } else if (objZza instanceof Float) {
                zztgVarZzf.zzs(((Number) objZza).floatValue());
            } else if (objZza instanceof Boolean) {
                zztgVarZzf.zze(((Boolean) objZza).booleanValue());
            } else if (objZza instanceof Character) {
                zztgVarZzf.zzq(String.valueOf(((Character) objZza).charValue()));
            } else if (objZza instanceof String) {
                zztgVarZzf.zzw((String) objZza);
            } else {
                zztgVarZzf.zzw(objZza.toString());
            }
            zztfVarZzf.zzf((zzth) zztgVarZzf.zzk());
        }
        zzge zzgeVarZzc = zzgdVar.zzc();
        byte[] bArrZzd = ((zzti) zztfVarZzf.zzk()).zzd();
        zzgeVarZzc.zze(i7, zzkh.zzh().zzi(bArrZzd, 0, bArrZzd.length));
    }
}

package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgl implements zzgx {
    public static final zzgl zza = new zzgl();

    private zzgl() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i7, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 2) {
            throw new zzce(4, 3, null);
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (objZza instanceof String)) {
            objZza = null;
        }
        String str = (String) objZza;
        if (str == null) {
            throw new zzce(4, 5, null);
        }
        Object objZza2 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (objZza2 == null) {
            throw new zzce(4, 4, null);
        }
        if (!(objZza2 instanceof Integer) && !(objZza2 instanceof Short) && !(objZza2 instanceof Byte) && !(objZza2 instanceof Long) && !(objZza2 instanceof Double) && !(objZza2 instanceof Float) && !(objZza2 instanceof Boolean) && !(objZza2 instanceof Character) && !(objZza2 instanceof String)) {
            throw new zzce(4, 7, null);
        }
        zzgdVar.zzi().zzb(str, objZza2.toString());
    }
}

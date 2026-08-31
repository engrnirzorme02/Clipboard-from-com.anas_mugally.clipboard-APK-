package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhn implements zzgx {
    public static final zzhn zza = new zzhn();

    private zzhn() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i7, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 3) {
            throw new zzce(4, 3, null);
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (objZza instanceof Field)) {
            objZza = null;
        }
        Field field = (Field) objZza;
        if (field == null) {
            throw new zzce(4, 5, null);
        }
        try {
            field.set(zzgdVar.zzc().zza(zzueVarArr[1]), zzgdVar.zzc().zza(zzueVarArr[2]));
        } catch (Exception e7) {
            throw new zzce(6, 11, e7);
        }
    }
}

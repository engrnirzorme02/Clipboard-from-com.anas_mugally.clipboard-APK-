package com.google.android.recaptcha.internal;

import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgt implements zzgx {
    public static final zzgt zza = new zzgt();

    private zzgt() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i7, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        int length = zzueVarArr.length;
        if (length != 4 && length != 5) {
            throw new zzce(4, 3, null);
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (objZza instanceof Integer)) {
            objZza = null;
        }
        Integer num = (Integer) objZza;
        if (num == null) {
            throw new zzce(4, 5, null);
        }
        int iIntValue = num.intValue();
        Object objZza2 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (objZza2 instanceof Integer)) {
            objZza2 = null;
        }
        Integer num2 = (Integer) objZza2;
        if (num2 == null) {
            throw new zzce(4, 5, null);
        }
        int iIntValue2 = num2.intValue();
        Object objZza3 = zzgdVar.zzc().zza(zzueVarArr[2]);
        if (true != (objZza3 instanceof String)) {
            objZza3 = null;
        }
        String str = (String) objZza3;
        if (str == null) {
            throw new zzce(4, 5, null);
        }
        String strZza = zzgdVar.zzh().zza(str);
        Object objZza4 = zzgdVar.zzc().zza(zzueVarArr[3]);
        if (true != (objZza4 instanceof String)) {
            objZza4 = null;
        }
        String str2 = (String) objZza4;
        if (str2 == null) {
            throw new zzce(4, 5, null);
        }
        String strZza2 = zzgdVar.zzh().zza(str2);
        Object objZza5 = length == 5 ? zzgdVar.zzc().zza(zzueVarArr[4]) : null;
        zzfz zzfzVar = new zzfz(iIntValue2);
        try {
            Class clsZza = zzgc.zza(strZza);
            zzgdVar.zzc().zze(iIntValue, Proxy.newProxyInstance(clsZza.getClassLoader(), new Class[]{clsZza}, new zzga(zzfzVar, strZza2, objZza5)));
            zzgdVar.zzc().zze(i7, zzfzVar);
        } catch (Exception e7) {
            throw new zzce(6, 20, e7);
        }
    }
}

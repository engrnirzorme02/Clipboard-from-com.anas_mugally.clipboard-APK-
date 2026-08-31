package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Objects;
import p152T5.AbstractC1631j;
import p152T5.AbstractC1638q;
import p302m6.C6402d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgp implements zzgx {
    public static final zzgp zza = new zzgp();

    private zzgp() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i7, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        String strR;
        String str;
        if (zzueVarArr.length != 1) {
            throw new zzce(4, 3, null);
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzce(4, 5, null);
        }
        if (objZza instanceof int[]) {
            strR = AbstractC1631j.m6719P((int[]) objZza, ",", "[", "]", 0, null, null, 56, null);
        } else {
            if (objZza instanceof byte[]) {
                str = new String((byte[]) objZza, C6402d.f24428b);
            } else if (objZza instanceof long[]) {
                strR = AbstractC1631j.m6720Q((long[]) objZza, ",", "[", "]", 0, null, null, 56, null);
            } else if (objZza instanceof short[]) {
                strR = AbstractC1631j.m6722S((short[]) objZza, ",", "[", "]", 0, null, null, 56, null);
            } else if (objZza instanceof float[]) {
                strR = AbstractC1631j.m6718O((float[]) objZza, ",", "[", "]", 0, null, null, 56, null);
            } else if (objZza instanceof double[]) {
                strR = AbstractC1631j.m6717N((double[]) objZza, ",", "[", "]", 0, null, null, 56, null);
            } else if (objZza instanceof char[]) {
                str = new String((char[]) objZza);
            } else if (objZza instanceof Object[]) {
                strR = AbstractC1631j.m6721R((Object[]) objZza, ",", "[", "]", 0, null, null, 56, null);
            } else {
                if (!(objZza instanceof Collection)) {
                    throw new zzce(4, 5, null);
                }
                strR = AbstractC1638q.m6578R((Iterable) objZza, ",", "[", "]", 0, null, null, 56, null);
            }
            strR = str;
        }
        zzgdVar.zzc().zze(i7, strR);
    }
}

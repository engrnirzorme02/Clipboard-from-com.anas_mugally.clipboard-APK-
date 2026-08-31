package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3748c;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzahx {
    public static long zza(String str) {
        zzahw zzahwVarZzb = zzb(str);
        return zzahwVarZzb.zza().longValue() - zzahwVarZzb.zzb().longValue();
    }

    private static zzahw zzb(String str) {
        AbstractC3718s.m18077f(str);
        List<String> listZza = zzt.zza('.').zza((CharSequence) str);
        if (listZza.size() >= 2) {
            try {
                return zzahw.zza(new String(AbstractC3748c.m18154b(listZza.get(1)), "UTF-8"));
            } catch (UnsupportedEncodingException e7) {
                throw new RuntimeException("Unable to decode token", e7);
            }
        }
        throw new RuntimeException("Invalid idToken " + str);
    }
}

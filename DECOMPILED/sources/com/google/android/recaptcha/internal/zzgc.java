package com.google.android.recaptcha.internal;

import p145S5.AbstractC1430h;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgc {
    public static final Class zza(Object obj) throws zzce {
        Class cls;
        if (obj instanceof Class) {
            return (Class) obj;
        }
        if (!(obj instanceof Integer)) {
            if (!(obj instanceof String)) {
                throw new zzce(4, 5, null);
            }
            try {
                String str = (String) obj;
                Class<?> cls2 = Class.forName(str);
                int i7 = zzav.zza;
                if (((zzfu) AbstractC1430h.m6066b(zzgb.zza).getValue()).zzb(str)) {
                    return cls2;
                }
                throw new zzce(6, 47, null);
            } catch (Exception e7) {
                throw new zzce(6, 8, e7);
            }
        }
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue == 1) {
            cls = Integer.TYPE;
        } else if (iIntValue == 2) {
            cls = Short.TYPE;
        } else if (iIntValue == 3) {
            cls = Byte.TYPE;
        } else if (iIntValue == 4) {
            cls = Long.TYPE;
        } else if (iIntValue == 5) {
            cls = Character.TYPE;
        } else if (iIntValue == 6) {
            cls = Float.TYPE;
        } else if (iIntValue == 7) {
            cls = Double.TYPE;
        } else {
            cls = iIntValue == 8 ? Boolean.TYPE : null;
        }
        if (cls != null) {
            return cls;
        }
        throw new zzce(4, 6, null);
    }
}

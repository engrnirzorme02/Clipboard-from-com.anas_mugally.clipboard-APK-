package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.Map;
import p145S5.AbstractC1440r;
import p152T5.AbstractC1610H;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjb {
    public static final Map zza() {
        Map mapK = AbstractC1610H.m6629k(AbstractC1440r.m6083a(-4, zzba.zzo), AbstractC1440r.m6083a(-12, zzba.zzp), AbstractC1440r.m6083a(-6, zzba.zzk), AbstractC1440r.m6083a(-11, zzba.zzm), AbstractC1440r.m6083a(-13, zzba.zzq), AbstractC1440r.m6083a(-14, zzba.zzr), AbstractC1440r.m6083a(-2, zzba.zzl), AbstractC1440r.m6083a(-7, zzba.zzs), AbstractC1440r.m6083a(-5, zzba.zzt), AbstractC1440r.m6083a(-9, zzba.zzu), AbstractC1440r.m6083a(-8, zzba.zzE), AbstractC1440r.m6083a(-15, zzba.zzn), AbstractC1440r.m6083a(-1, zzba.zzv), AbstractC1440r.m6083a(-3, zzba.zzx), AbstractC1440r.m6083a(-10, zzba.zzy));
        int i7 = Build.VERSION.SDK_INT;
        mapK.put(-16, zzba.zzw);
        if (i7 >= 27) {
            mapK.put(1, zzba.zzA);
            mapK.put(2, zzba.zzB);
            mapK.put(0, zzba.zzC);
            mapK.put(3, zzba.zzD);
        }
        if (i7 >= 29) {
            mapK.put(4, zzba.zzz);
        }
        return mapK;
    }
}

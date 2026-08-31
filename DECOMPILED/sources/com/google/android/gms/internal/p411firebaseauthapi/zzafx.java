package com.google.android.gms.internal.p411firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3746a;
import com.google.android.gms.common.util.AbstractC3755j;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafx {
    private final String zza;
    private final String zzb;

    public zzafx(Context context) {
        this(context, context.getPackageName());
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    private zzafx(Context context, String str) {
        AbstractC3718s.m18083l(context);
        String strM18077f = AbstractC3718s.m18077f(str);
        this.zza = strM18077f;
        try {
            byte[] bArrM18142a = AbstractC3746a.m18142a(context, strM18077f);
            if (bArrM18142a != null) {
                this.zzb = AbstractC3755j.m18184c(bArrM18142a, false);
                return;
            }
            Log.e("FBA-PackageInfo", "single cert required: " + str);
            this.zzb = null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: " + str);
            this.zzb = null;
        }
    }
}

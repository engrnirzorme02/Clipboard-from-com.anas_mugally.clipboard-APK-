package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1638q;
import p302m6.AbstractC6406h;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfu {
    private Set zza;
    private Set zzb;
    private Long zzc;
    private int zzd;

    private static final boolean zzc(String str, Set set) {
        Iterator it = AbstractC6406h.m27573F0(str, new char[]{'.'}, false, 0, 6, null).iterator();
        String strConcat = "";
        while (it.hasNext()) {
            String strConcat2 = strConcat.concat(String.valueOf((String) it.next()));
            if (set.contains(strConcat2)) {
                return true;
            }
            strConcat = strConcat2.concat(".");
        }
        return false;
    }

    public final void zza(zzrv zzrvVar) {
        this.zza = AbstractC1638q.m6598l0(zzrvVar.zzf().zzi());
        this.zzb = AbstractC1638q.m6598l0(zzrvVar.zzg().zzi());
    }

    public final boolean zzb(String str) {
        Set set = this.zza;
        if (set == null || this.zzb == null) {
            if (this.zzc == null) {
                this.zzc = Long.valueOf(System.currentTimeMillis());
            }
            this.zzd++;
            return true;
        }
        AbstractC6118n.m27185c(set, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        if (set.isEmpty()) {
            return true;
        }
        Set set2 = this.zzb;
        AbstractC6118n.m27185c(set2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        if (zzc(str, set2)) {
            return false;
        }
        return zzc(str, set);
    }
}

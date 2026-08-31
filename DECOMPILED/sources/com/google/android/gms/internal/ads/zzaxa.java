package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaxa extends zzaxl {
    public zzaxa(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i7, int i8) {
        super(zzavxVar, "ExKA4wjDRRYdztAsabUEoV5NOADo4vSkAwQNa4IGw0yLC0NQlDOhDdBTfDT5YHOb", "1Gz3ZRhjJNvXJ0g284S9b/dpVAajMMfg8CE3pBcFNFA=", zzarwVar, i7, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    protected final void zza() {
        try {
            boolean zBooleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
            zzarw zzarwVar = this.zzd;
            int i7 = 1;
            if (true == zBooleanValue) {
                i7 = 2;
            }
            zzarwVar.zzah(i7);
        } catch (InvocationTargetException unused) {
            this.zzd.zzah(3);
        }
    }
}

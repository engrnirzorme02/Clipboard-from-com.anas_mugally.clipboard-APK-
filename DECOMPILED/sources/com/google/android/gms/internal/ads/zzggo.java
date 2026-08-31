package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzggo implements zzghd {
    protected zzggo() {
    }

    public static zzggo zzc(char c7) {
        return new zzggl(c7);
    }

    @Override // com.google.android.gms.internal.ads.zzghd
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c7);
}

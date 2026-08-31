package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzccd extends zzaqo {
    static final zzccd zzb = new zzccd();

    zzccd() {
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final zzaqs zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzaqu();
        }
        return "mvhd".equals(str) ? new zzaqv() : new zzaqw(str);
    }
}

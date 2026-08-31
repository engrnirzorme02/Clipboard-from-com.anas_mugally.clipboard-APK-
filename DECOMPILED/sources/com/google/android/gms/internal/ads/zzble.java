package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzble extends zzblb {
    final /* synthetic */ zzbzm zza;

    zzble(zzblf zzblfVar, zzbzm zzbzmVar) {
        this.zza = zzbzmVar;
        Objects.requireNonNull(zzblfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzblc
    public final void zzb(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(parcelFileDescriptor);
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
final class zzhgb extends ThreadLocal {
    final /* synthetic */ zzhgc zza;

    zzhgb(zzhgc zzhgcVar) {
        Objects.requireNonNull(zzhgcVar);
        this.zza = zzhgcVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            zzhfo zzhfoVar = zzhfo.zzb;
            zzhgc zzhgcVar = this.zza;
            Mac mac = (Mac) zzhfoVar.zzb(zzhgcVar.zzb());
            mac.init(zzhgcVar.zzc());
            return mac;
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException(e7);
        }
    }
}

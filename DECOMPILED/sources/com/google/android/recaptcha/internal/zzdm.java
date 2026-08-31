package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.AbstractC6119o;
import p238e6.InterfaceC5356a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdm extends AbstractC6119o implements InterfaceC5356a {
    public static final zzdm zza = new zzdm();

    public zzdm() {
        super(0);
    }

    @Override // p238e6.InterfaceC5356a
    public final Object invoke() throws zzbd {
        int i7 = zzav.zza;
        Object objZzb = zzau.zza().zzb(zzff.class.getName().hashCode());
        if (objZzb != null) {
            return (zzff) objZzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}

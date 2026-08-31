package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.AbstractC6089d;
import p173W5.InterfaceC1875e;

/* JADX INFO: loaded from: classes2.dex */
final class zzcu extends AbstractC6089d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzcv zzb;
    int zzc;
    zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcu(zzcv zzcvVar, InterfaceC1875e interfaceC1875e) {
        super(interfaceC1875e);
        this.zzb = zzcvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzj(null, 0, null, this);
    }
}

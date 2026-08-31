package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.AbstractC6089d;
import p173W5.InterfaceC1875e;

/* JADX INFO: loaded from: classes2.dex */
final class zzak extends AbstractC6089d {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzan zzc;
    int zzd;
    zzan zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzak(zzan zzanVar, InterfaceC1875e interfaceC1875e) {
        super(interfaceC1875e);
        this.zzc = zzanVar;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zze(this);
    }
}

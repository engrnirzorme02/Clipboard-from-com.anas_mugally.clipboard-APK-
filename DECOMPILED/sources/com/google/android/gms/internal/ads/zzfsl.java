package com.google.android.gms.internal.ads;

import kotlin.coroutines.jvm.internal.AbstractC6089d;
import p173W5.InterfaceC1875e;

/* JADX INFO: loaded from: classes2.dex */
final class zzfsl extends AbstractC6089d {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzftd zzc;
    int zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfsl(zzftd zzftdVar, InterfaceC1875e interfaceC1875e) {
        super(interfaceC1875e);
        this.zzc = zzftdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzt(this);
    }
}

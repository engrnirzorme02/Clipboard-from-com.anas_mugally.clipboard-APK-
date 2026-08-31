package com.google.android.gms.internal.ads;

import kotlin.coroutines.jvm.internal.AbstractC6089d;
import p173W5.InterfaceC1875e;

/* JADX INFO: loaded from: classes2.dex */
final class zzfst extends AbstractC6089d {
    long zza;
    Object zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zzftd zzd;
    int zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfst(zzftd zzftdVar, InterfaceC1875e interfaceC1875e) {
        super(interfaceC1875e);
        this.zzd = zzftdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final Object invokeSuspend(Object obj) {
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        return this.zzd.zzn(this);
    }
}

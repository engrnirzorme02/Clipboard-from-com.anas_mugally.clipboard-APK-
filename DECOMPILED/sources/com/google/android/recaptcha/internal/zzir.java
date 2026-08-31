package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.AbstractC6089d;
import p145S5.C1436n;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;

/* JADX INFO: loaded from: classes2.dex */
final class zzir extends AbstractC6089d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzja zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzir(zzja zzjaVar, InterfaceC1875e interfaceC1875e) {
        super(interfaceC1875e);
        this.zzb = zzjaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzh = this.zzb.zzh(null, this);
        return objZzh == AbstractC2005b.m8369e() ? objZzh : C1436n.m6072a(objZzh);
    }
}

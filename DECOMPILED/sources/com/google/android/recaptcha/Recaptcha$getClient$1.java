package com.google.android.recaptcha;

import kotlin.coroutines.jvm.internal.AbstractC6089d;
import p145S5.C1436n;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;

/* JADX INFO: loaded from: classes2.dex */
final class Recaptcha$getClient$1 extends AbstractC6089d {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recaptcha$getClient$1(Recaptcha recaptcha, InterfaceC1875e interfaceC1875e) {
        super(interfaceC1875e);
        this.zzb = recaptcha;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objM33398getClientBWLJW6A = this.zzb.m33398getClientBWLJW6A(null, null, 0L, this);
        return objM33398getClientBWLJW6A == AbstractC2005b.m8369e() ? objM33398getClientBWLJW6A : C1436n.m6072a(objM33398getClientBWLJW6A);
    }
}

package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.AbstractC6089d;
import p145S5.C1436n;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;

/* JADX INFO: loaded from: classes2.dex */
final class zzc extends AbstractC6089d {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zze zzc;
    int zzd;
    zzen zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzc(zze zzeVar, InterfaceC1875e interfaceC1875e) {
        super(interfaceC1875e);
        this.zzc = zzeVar;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        Object objZze = this.zzc.zze(0L, null, this);
        return objZze == AbstractC2005b.m8369e() ? objZze : C1436n.m6072a(objZze);
    }
}

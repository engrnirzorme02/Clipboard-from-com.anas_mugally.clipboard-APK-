package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.AbstractC6097l;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5367l;
import p318o6.AbstractC6644X0;

/* JADX INFO: loaded from: classes2.dex */
final class zzdy extends AbstractC6097l implements InterfaceC5367l {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzec zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdy(long j7, zzec zzecVar, InterfaceC1875e interfaceC1875e) {
        super(1, interfaceC1875e);
        this.zzb = j7;
        this.zzc = zzecVar;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final InterfaceC1875e create(InterfaceC1875e interfaceC1875e) {
        return new zzdy(this.zzb, this.zzc, interfaceC1875e);
    }

    @Override // p238e6.InterfaceC5367l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzdy) create((InterfaceC1875e) obj)).invokeSuspend(C1444v.f4971a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final Object invokeSuspend(Object obj) {
        Object objE = AbstractC2005b.m8369e();
        int i7 = this.zza;
        AbstractC1437o.m6082b(obj);
        if (i7 == 0) {
            long j7 = this.zzb;
            zzdx zzdxVar = new zzdx(this.zzc, null);
            this.zza = 1;
            if (AbstractC6644X0.m28136c(j7, zzdxVar, this) == objE) {
                return objE;
            }
        }
        return C1444v.f4971a;
    }
}

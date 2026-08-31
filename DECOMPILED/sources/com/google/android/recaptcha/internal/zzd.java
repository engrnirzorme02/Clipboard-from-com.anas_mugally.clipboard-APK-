package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.AbstractC6097l;
import p145S5.AbstractC1437o;
import p145S5.C1436n;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p318o6.InterfaceC6624N;

/* JADX INFO: loaded from: classes2.dex */
final class zzd extends AbstractC6097l implements InterfaceC5371p {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ zzsc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzd(zze zzeVar, zzsc zzscVar, InterfaceC1875e interfaceC1875e) {
        super(2, interfaceC1875e);
        this.zzb = zzeVar;
        this.zzc = zzscVar;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
        return new zzd(this.zzb, this.zzc, interfaceC1875e);
    }

    @Override // p238e6.InterfaceC5371p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzd) create((InterfaceC6624N) obj, (InterfaceC1875e) obj2)).invokeSuspend(C1444v.f4971a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final Object invokeSuspend(Object obj) {
        Object objZzh;
        Object objE = AbstractC2005b.m8369e();
        int i7 = this.zza;
        AbstractC1437o.m6082b(obj);
        if (i7 != 0) {
            objZzh = ((C1436n) obj).m6080i();
        } else {
            zze zzeVar = this.zzb;
            zzsc zzscVar = this.zzc;
            this.zza = 1;
            objZzh = zzeVar.zzh(zzscVar, this);
            if (objZzh == objE) {
                return objE;
            }
        }
        return C1436n.m6072a(objZzh);
    }
}

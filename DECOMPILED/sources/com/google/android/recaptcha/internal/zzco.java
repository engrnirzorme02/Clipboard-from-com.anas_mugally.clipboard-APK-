package com.google.android.recaptcha.internal;

import android.app.Application;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p318o6.InterfaceC6624N;

/* JADX INFO: loaded from: classes2.dex */
final class zzco extends AbstractC6097l implements InterfaceC5371p {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzco(Application application, String str, long j7, InterfaceC1875e interfaceC1875e) {
        super(2, interfaceC1875e);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j7;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
        return new zzco(this.zzb, this.zzc, this.zzd, interfaceC1875e);
    }

    @Override // p238e6.InterfaceC5371p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzco) create((InterfaceC6624N) obj, (InterfaceC1875e) obj2)).invokeSuspend(C1444v.f4971a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final Object invokeSuspend(Object obj) {
        Object objE = AbstractC2005b.m8369e();
        int i7 = this.zza;
        AbstractC1437o.m6082b(obj);
        if (i7 != 0) {
            return obj;
        }
        Application application = this.zzb;
        String str = this.zzc;
        long j7 = this.zzd;
        this.zza = 1;
        Object objZzb = zzcq.zzb(application, str, j7, this);
        return objZzb == objE ? objE : objZzb;
    }
}

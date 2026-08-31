package com.google.android.gms.internal.ads;

import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;

/* JADX INFO: loaded from: classes2.dex */
final class zzfsm extends AbstractC6097l implements InterfaceC5371p {
    zzfsm(InterfaceC1875e interfaceC1875e) {
        super(2, interfaceC1875e);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
        return new zzfsm(interfaceC1875e);
    }

    @Override // p238e6.InterfaceC5371p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfsm) create((zzfrz) obj, (InterfaceC1875e) obj2)).invokeSuspend(C1444v.f4971a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final Object invokeSuspend(Object obj) {
        AbstractC2005b.m8369e();
        AbstractC1437o.m6082b(obj);
        zzfrz zzfrzVarZzd = zzfrz.zzd();
        AbstractC6118n.m27186d(zzfrzVarZzd, "getDefaultInstance(...)");
        return zzfrzVarZzd;
    }
}

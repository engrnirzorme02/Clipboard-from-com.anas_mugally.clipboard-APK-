package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p318o6.InterfaceC6624N;

/* JADX INFO: loaded from: classes2.dex */
final class zzfv extends AbstractC6097l implements InterfaceC5371p {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzfw zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfv(String[] strArr, zzfw zzfwVar, String str, InterfaceC1875e interfaceC1875e) {
        super(2, interfaceC1875e);
        this.zza = strArr;
        this.zzb = zzfwVar;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
        return new zzfv(this.zza, this.zzb, this.zzc, interfaceC1875e);
    }

    @Override // p238e6.InterfaceC5371p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfv) create((InterfaceC6624N) obj, (InterfaceC1875e) obj2)).invokeSuspend(C1444v.f4971a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final Object invokeSuspend(Object obj) {
        AbstractC2005b.m8369e();
        AbstractC1437o.m6082b(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        this.zzb.zza.evaluateJavascript(this.zzc + "(" + AbstractC1638q.m6578R(arrayList, ",", null, null, 0, null, null, 62, null) + ")", null);
        return C1444v.f4971a;
    }
}

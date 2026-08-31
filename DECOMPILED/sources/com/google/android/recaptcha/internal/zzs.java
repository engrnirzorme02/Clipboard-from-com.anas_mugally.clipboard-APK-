package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import p145S5.AbstractC1437o;
import p145S5.C1436n;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p318o6.AbstractC6662f;
import p318o6.AbstractC6672k;
import p318o6.InterfaceC6624N;
import p318o6.InterfaceC6701y0;

/* JADX INFO: loaded from: classes2.dex */
final class zzs extends AbstractC6097l implements InterfaceC5371p {
    int zza;
    final /* synthetic */ zzv zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzs(zzv zzvVar, String str, InterfaceC1875e interfaceC1875e) {
        super(2, interfaceC1875e);
        this.zzb = zzvVar;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
        zzs zzsVar = new zzs(this.zzb, this.zzc, interfaceC1875e);
        zzsVar.zzd = obj;
        return zzsVar;
    }

    @Override // p238e6.InterfaceC5371p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((InterfaceC6624N) obj, (InterfaceC1875e) obj2)).invokeSuspend(C1444v.f4971a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final Object invokeSuspend(Object obj) {
        Object objE = AbstractC2005b.m8369e();
        int i7 = this.zza;
        AbstractC1437o.m6082b(obj);
        if (i7 == 0) {
            InterfaceC6624N interfaceC6624N = (InterfaceC6624N) this.zzd;
            ArrayList arrayList = new ArrayList();
            zzv zzvVar = this.zzb;
            zzvVar.zzo().put(this.zzc, arrayList);
            ArrayList arrayList2 = new ArrayList();
            List list = this.zzb.zzb;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzy) obj2).zzf()) {
                    arrayList3.add(obj2);
                }
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(AbstractC6672k.m28227d(interfaceC6624N, null, null, new zzr((zzy) it.next(), this.zzc, arrayList, null), 3, null));
            }
            InterfaceC6701y0[] interfaceC6701y0Arr = (InterfaceC6701y0[]) arrayList2.toArray(new InterfaceC6701y0[0]);
            InterfaceC6701y0[] interfaceC6701y0Arr2 = (InterfaceC6701y0[]) Arrays.copyOf(interfaceC6701y0Arr, interfaceC6701y0Arr.length);
            this.zza = 1;
            if (AbstractC6662f.m28178c(interfaceC6701y0Arr2, this) == objE) {
                return objE;
            }
        }
        C1436n.a aVar = C1436n.f4958b;
        return C1436n.m6072a(C1436n.m6073b(this.zzb.zzq(this.zzc)));
    }
}

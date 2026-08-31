package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p318o6.InterfaceC6624N;

/* JADX INFO: loaded from: classes2.dex */
final class zzin extends AbstractC6097l implements InterfaceC5371p {
    int zza;
    final /* synthetic */ zzja zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzin(zzja zzjaVar, String str, InterfaceC1875e interfaceC1875e) {
        super(2, interfaceC1875e);
        this.zzb = zzjaVar;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
        return new zzin(this.zzb, this.zzc, interfaceC1875e);
    }

    @Override // p238e6.InterfaceC5371p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzin) create((InterfaceC6624N) obj, (InterfaceC1875e) obj2)).invokeSuspend(C1444v.f4971a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r4.zzF(r1, r3) == r0) goto L13;
     */
    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objE = AbstractC2005b.m8369e();
        int i7 = this.zza;
        AbstractC1437o.m6082b(obj);
        if (i7 != 0) {
            if (i7 == 1) {
            }
            return C1444v.f4971a;
        }
        zzja zzjaVar = this.zzb;
        this.zza = 1;
        obj = zzjaVar.zzw(this);
        if (obj != objE) {
        }
        return objE;
        ((WebView) obj).clearCache(true);
        zzja zzjaVar2 = this.zzb;
        String str = this.zzc;
        this.zza = 2;
    }
}

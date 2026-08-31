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
final class zzil extends AbstractC6097l implements InterfaceC5371p {
    Object zza;
    int zzb;
    final /* synthetic */ zzja zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzil(zzja zzjaVar, InterfaceC1875e interfaceC1875e) {
        super(2, interfaceC1875e);
        this.zzc = zzjaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
        return new zzil(this.zzc, interfaceC1875e);
    }

    @Override // p238e6.InterfaceC5371p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzil) create((InterfaceC6624N) obj, (InterfaceC1875e) obj2)).invokeSuspend(C1444v.f4971a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0057 A[PHI: r7
      0x0057: PHI (r7v15 java.lang.Object) = (r7v11 java.lang.Object), (r7v0 java.lang.Object) binds: [B:16:0x0055, B:7:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (r7 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objE = AbstractC2005b.m8369e();
        int i7 = this.zzb;
        if (i7 == 0) {
            AbstractC1437o.m6082b(obj);
            zzja zzjaVar = this.zzc;
            this.zzb = 1;
            obj = zzjaVar.zzw(this);
            if (obj != objE) {
            }
            return objE;
        }
        if (i7 == 1) {
            AbstractC1437o.m6082b(obj);
        } else {
            if (i7 == 2) {
                AbstractC1437o.m6082b(obj);
                ((WebView) obj).getSettings().setJavaScriptEnabled(true);
                zzja zzjaVar2 = this.zzc;
                this.zza = null;
                this.zzb = 3;
                obj = zzjaVar2.zzw(this);
                if (obj != objE) {
                    ((WebView) obj).addJavascriptInterface(this.zzc.zzq(), "RN");
                    zzja zzjaVar3 = this.zzc;
                    this.zzb = 4;
                    obj = zzjaVar3.zzw(this);
                }
                return objE;
            }
            AbstractC1437o.m6082b(obj);
            if (i7 == 3) {
                ((WebView) obj).addJavascriptInterface(this.zzc.zzq(), "RN");
                zzja zzjaVar4 = this.zzc;
                this.zzb = 4;
                obj = zzjaVar4.zzw(this);
            }
        }
        ((WebView) obj).setWebViewClient(new zzik(this.zzc));
        return C1444v.f4971a;
        ((WebView) obj).removeJavascriptInterface("RN");
        zzja zzjaVar5 = this.zzc;
        this.zza = zzjaVar5;
        this.zzb = 2;
        obj = zzjaVar5.zzw(this);
        if (obj != objE) {
            ((WebView) obj).getSettings().setJavaScriptEnabled(true);
            zzja zzjaVar6 = this.zzc;
            this.zza = null;
            this.zzb = 3;
            obj = zzjaVar6.zzw(this);
            if (obj != objE) {
                ((WebView) obj).addJavascriptInterface(this.zzc.zzq(), "RN");
                zzja zzjaVar7 = this.zzc;
                this.zzb = 4;
                obj = zzjaVar7.zzw(this);
            }
        }
        return objE;
    }
}

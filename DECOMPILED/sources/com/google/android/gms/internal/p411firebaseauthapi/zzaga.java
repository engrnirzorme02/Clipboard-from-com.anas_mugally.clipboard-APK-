package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.firebase.auth.AbstractC4825I;
import com.google.firebase.auth.C4823G;
import com.google.firebase.auth.C4824H;
import p164V3.C1768m;

/* JADX INFO: loaded from: classes2.dex */
final class zzaga extends AbstractC4825I {
    private final /* synthetic */ AbstractC4825I zza;
    private final /* synthetic */ String zzb;

    zzaga(AbstractC4825I abstractC4825I, String str) {
        this.zza = abstractC4825I;
        this.zzb = str;
    }

    @Override // com.google.firebase.auth.AbstractC4825I
    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzagb.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // com.google.firebase.auth.AbstractC4825I
    public final void onCodeSent(String str, C4824H c4824h) {
        this.zza.onCodeSent(str, c4824h);
    }

    @Override // com.google.firebase.auth.AbstractC4825I
    public final void onVerificationCompleted(C4823G c4823g) {
        zzagb.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(c4823g);
    }

    @Override // com.google.firebase.auth.AbstractC4825I
    public final void onVerificationFailed(C1768m c1768m) {
        zzagb.zza.remove(this.zzb);
        this.zza.onVerificationFailed(c1768m);
    }
}

package com.google.android.gms.internal.ads;

import androidx.privacysandbox.ads.adservices.topics.C2706h;
import com.google.android.gms.ads.internal.client.C3250D;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzclg implements zzgob {
    static final /* synthetic */ zzclg zza = new zzclg();

    private /* synthetic */ zzclg() {
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
        Throwable th = (Throwable) obj;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlk)).booleanValue()) {
            C7351t.m32354l().zzi(th, "GetTopicsApiWithRecordObservationActionHandlerUnsampled");
        } else {
            C7351t.m32354l().zzh(th, "GetTopicsApiWithRecordObservationActionHandler");
        }
        return zzgot.zza(new C2706h(zzgjz.zzi()));
    }
}

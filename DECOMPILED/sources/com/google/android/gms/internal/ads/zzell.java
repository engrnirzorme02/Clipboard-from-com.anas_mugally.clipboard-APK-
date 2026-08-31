package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3377o2;
import com.google.android.gms.ads.internal.client.InterfaceC3301U0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzell implements zzcyj {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(InterfaceC3301U0 interfaceC3301U0) {
        this.zza.set(interfaceC3301U0);
    }

    @Override // com.google.android.gms.internal.ads.zzcyj
    public final void zzm(final C3377o2 c3377o2) {
        zzezq.zza(this.zza, new zzezp() { // from class: com.google.android.gms.internal.ads.zzelk
            @Override // com.google.android.gms.internal.ads.zzezp
            public final /* synthetic */ void zza(Object obj) {
                ((InterfaceC3301U0) obj).mo17215j0(c3377o2);
            }
        });
    }
}

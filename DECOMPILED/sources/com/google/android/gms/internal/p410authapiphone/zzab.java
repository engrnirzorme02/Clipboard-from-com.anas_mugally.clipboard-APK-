package com.google.android.gms.internal.p410authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC3632w;
import com.google.android.gms.common.api.internal.InterfaceC3622r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p121P2.AbstractC1195b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzab extends AbstractC1195b {
    public zzab(Activity activity) {
        super(activity);
    }

    @Override // p121P2.AbstractC1195b
    public final Task<Void> startSmsRetriever() {
        return doWrite(AbstractC3632w.m17942a().m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth-api-phone.zzx
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzg(new zzz(this.zza, (TaskCompletionSource) obj2));
            }
        }).m17950d(zzac.zzc).m17951e(1567).m17947a());
    }

    public final Task<Void> startSmsUserConsent(final String str) {
        return doWrite(AbstractC3632w.m17942a().m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth-api-phone.zzy
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzh(str, new zzaa(this.zza, (TaskCompletionSource) obj2));
            }
        }).m17950d(zzac.zzd).m17951e(1568).m17947a());
    }

    public zzab(Context context) {
        super(context);
    }
}

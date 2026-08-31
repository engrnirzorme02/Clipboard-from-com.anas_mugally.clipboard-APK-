package com.google.android.gms.internal.auth;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.AbstractC3559g;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.api.internal.AbstractC3632w;
import com.google.android.gms.common.api.internal.InterfaceC3622r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p100M2.AbstractC0887b;
import p100M2.C0888c;
import p128Q2.C1255b;
import p128Q2.C1256c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbo extends AbstractC3559g {
    public zzbo(Activity activity, C0888c c0888c) {
        super(activity, AbstractC0887b.f3484a, (C3553a.d) (c0888c == null ? C0888c.f3488b : c0888c), AbstractC3559g.a.f14540c);
    }

    public final Task<String> getSpatulaHeader() {
        return doRead(AbstractC3632w.m17942a().m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth.zzbk
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final void accept(Object obj, Object obj2) {
                ((zzbh) ((zzbe) obj).getService()).zzd(new zzbn(this.zza, (TaskCompletionSource) obj2));
            }
        }).m17951e(1520).m17947a());
    }

    public final Task<C1256c> performProxyRequest(final C1255b c1255b) {
        return doWrite(AbstractC3632w.m17942a().m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth.zzbl
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final void accept(Object obj, Object obj2) {
                zzbo zzboVar = this.zza;
                C1255b c1255b2 = c1255b;
                ((zzbh) ((zzbe) obj).getService()).zze(new zzbm(zzboVar, (TaskCompletionSource) obj2), c1255b2);
            }
        }).m17951e(1518).m17947a());
    }

    public zzbo(Context context, C0888c c0888c) {
        super(context, AbstractC0887b.f3484a, c0888c == null ? C0888c.f3488b : c0888c, AbstractC3559g.a.f14540c);
    }
}
